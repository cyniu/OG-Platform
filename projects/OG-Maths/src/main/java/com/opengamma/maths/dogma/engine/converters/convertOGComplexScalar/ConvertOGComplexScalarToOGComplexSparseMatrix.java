/**
 * Copyright (C) 2012 - present by OpenGamma Inc. and the OpenGamma group of companies
 * 
 * Please see distribution for license.
 */
package com.opengamma.maths.dogma.engine.converters.convertOGComplexScalar;

import com.opengamma.maths.commonapi.numbers.ComplexType;
import com.opengamma.maths.dogma.engine.DOGMAConverterHook;
import com.opengamma.maths.dogma.engine.converters.Converter;
import com.opengamma.maths.highlevelapi.datatypes.primitive.OGArray;
import com.opengamma.maths.highlevelapi.datatypes.primitive.OGComplexScalar;
import com.opengamma.maths.highlevelapi.datatypes.primitive.OGComplexSparseMatrix;

/**
 * 
 */
@DOGMAConverterHook(provides = Converter.class)
public final class ConvertOGComplexScalarToOGComplexSparseMatrix implements Converter<OGComplexScalar> {
  @Override
  public OGArray<? extends Number> convert(OGComplexScalar array1) {
    return new OGComplexSparseMatrix(new ComplexType[][] {{new ComplexType(array1.getData()[0], array1.getData()[1]) } });
  }
}
