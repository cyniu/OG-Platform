/**
 * Copyright (C) 2013 - present by OpenGamma Inc. and the OpenGamma group of companies
 *
 * Please see distribution for license.
 */
package com.opengamma.util.result;

import java.util.Arrays;
import java.util.List;

import com.google.common.collect.Lists;

/**
 * Factory class for {@link FunctionResult} objects.
 *
 * <p/>
 * <h3>Typical usage pattern:</h3>
 * <pre>
 *
 * import static com.opengamma.util.result.FunctionResultGenerator.failure;
 * import static com.opengamma.util.result.FunctionResultGenerator.propagateFailure;
 * import static com.opengamma.util.result.FunctionResultGenerator.success;
 * import static com.opengamma.util.result.FailureStatus.CALCULATION_FAILED;
 *
 * public class Calculations {
 *
 *   public FunctionResult<CalculatedValue> calculate() {
 *
 *     FunctionResult<InterimValue> interimResult = doInitialCalculation();
 *     if (interimResult.isResultAvailable()) {
 *       InterimValue value = interimResult.getResult();
 *       Calculator calculator = getCalculator()
 *
 *       if (calculator.isCalculationPossible(value)) {
 *         return calculator.doComplexCalculation(value);
 *       } else {
 *         return failure(CALCULATION_FAILED,
 *             "Cannot calculate as value {} is incompatible with calculator {}", value, calculator);
 *       }
 *     } else {
 *       return propagateFailure(interimResult);
 *     }
 *   }
 * }
 *
 * </pre>
 */
public class FunctionResultGenerator {

  /**
   * Generate a result object indicating that a function completed successfully
   * with the supplied value as the result.
   *
   * @param value the value that the invoked function returned
   * @param <T> the type of the value to be returned
   * @return a result object wrapping the actual function invocation result
   */
  public static <T> FunctionResult<T> success(T value) {
    return new SuccessFunctionResult<>(value);
  }

  /**
   * Generate a result object indicating that a function did not complete
   * successfully.
   *
   * @param status an indication of why the invocation failed
   * @param message a detailed parameterized message indicating why the function
   * invocation failed. Uses SLF4J placeholders for parameters.
   * @param messageArgs the arguments to be used for the formatted message
   * @param <T> the type of the value which would have been returned if successful
   * @return a result object wrapping the failure details
   */
  public static <T> FunctionResult<T> failure(FailureStatus status, String message, Object... messageArgs) {
    return new FailureFunctionResult<>(status, message, messageArgs);
  }

  /**
   * Propagate a failure result, ensuring that its generic type signature
   * matches the one required.
   *
   * @param functionResult the failure to be propagated
   * @param <T> the required type of the new result object
   * @return the new function result object
   */
  public static <T> FunctionResult<T> propagateFailure(FunctionResult functionResult) {
    // todo remove the cast
    FailureFunctionResult failureFunctionResult = (FailureFunctionResult) functionResult;
    return new FailureFunctionResult<>(failureFunctionResult.getStatus(), failureFunctionResult.getErrorMessage());
  }

  /**
   * Check a set of results to see if there are any failures.
   *
   * @param results the set of results to be checked
   * @return true if the set of results contains at least one failure
   */
  public static boolean anyFailures(FunctionResult<?>... results) {
    for (FunctionResult<?> result : results) {
      if (!result.isResultAvailable()) {
        return true;
      }
    }
    return false;
  }

  /**
   * Propagate a set of results as a failure such that multiple failure reasons
   * can be recorded. Any successes included in the set are ignored. If there
   * are no failures in the set then an exception will be thrown.
   *
   * @param result1 result to be included in the combined result, not null
   * @param result2 result to be included in the combined result, not null
   * @param results results to be included in the combined result, not null
   * @param <T> the required type of the new result object
   * @return the new function result object
   * @throws IllegalArgumentException if there are no failures in the results set
   */
  // results can include successes which are ignored
  public static <T> FunctionResult<T> propagateFailures(FunctionResult<?> result1,
                                                        FunctionResult<?> result2,
                                                        FunctionResult<?>... results) {

    // todo - what if one of the results was itself a MultipleFailureFunctionResult?
    List<FunctionResult<?>> resultList = Lists.newArrayListWithCapacity(results.length + 2);
    resultList.add(result1);
    resultList.add(result2);
    resultList.addAll(Arrays.asList(results));
    List<FunctionResult<?>> failures = Lists.newArrayList();
    for (FunctionResult<?> result : resultList) {
      if (result instanceof FailureFunctionResult) {
        failures.add((FailureFunctionResult) result);
      }
    }
    if (failures.isEmpty()) {
      throw new IllegalArgumentException("No failures found in " + failures);
    }
    return new MultipleFailureFunctionResult<>(failures);
  }
}