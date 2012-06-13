/**
 * Copyright (C) 2012 - present by OpenGamma Inc. and the OpenGamma group of companies
 *
 * Please see distribution for license.
 */
package com.opengamma.web.server.push.analytics;

import com.opengamma.engine.view.ViewComputationResultModel;

/**
 *
 */
/* package */ class AnalyticsViewport {

  // TODO list of rows
  // TODO list of columns

  /* package */ AnalyticsViewport(AnalyticsGridStructure gridStructure,
                                  ViewportRequest viewportRequest,
                                  ViewComputationResultModel latestResults,
                                  AnalyticsHistory history) {
  }

  /**
   * @return An empty viewport with no rows or columns
   */
  /* package */ static AnalyticsViewport empty() {
    // TODO implement AnalyticsViewport.empty()
    throw new UnsupportedOperationException("empty not implemented");
  }

  /* package */ AnalyticsViewport updateResults(ViewComputationResultModel fullResult, AnalyticsHistory history) {
    /*
    get the target for each row in the viewport from the grid structure
    query the results for the results for the target
    for each value get the column index from the grid structure
    if the column is in the viewport update the results
    */
    throw new UnsupportedOperationException("updateResults not implemented");
  }

  /* package */ AnalyticsResults getData() {
    throw new UnsupportedOperationException("getData not implemented");
  }

  public void update(ViewportRequest viewportRequest) {
    // TODO implement AnalyticsViewport.update()
    throw new UnsupportedOperationException("update not implemented");
  }
}
