/**
 * Copyright (C) 2009 - present by OpenGamma Inc. and the OpenGamma group of companies
 *
 * Please see distribution for license.
 */
package com.opengamma.examples.simulated.component;

import java.util.Map;

import org.joda.beans.BeanBuilder;
import org.joda.beans.BeanDefinition;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

import com.opengamma.component.ComponentRepository;
import com.opengamma.component.factory.loader.AbstractHistoricalTimeSeriesLoaderComponentFactory;
import com.opengamma.examples.simulated.historical.MockTimeSeriesLoader;
import com.opengamma.master.historicaltimeseries.HistoricalTimeSeriesLoader;

/**
 * Component factory providing the {@code HistoricalTimeSeriesLoader}.
 * <p>
 * This provides a mock implementation indicating that loading is not provided.
 */
@BeanDefinition
public class ExampleHistoricalTimeSeriesLoaderComponentFactory extends AbstractHistoricalTimeSeriesLoaderComponentFactory {

  @Override
  protected HistoricalTimeSeriesLoader createHistoricalTimeSeriesLoader(ComponentRepository repo) {
    return new MockTimeSeriesLoader();
  }

  //------------------------- AUTOGENERATED START -------------------------
  ///CLOVER:OFF
  /**
   * The meta-bean for {@code ExampleHistoricalTimeSeriesLoaderComponentFactory}.
   * @return the meta-bean, not null
   */
  public static ExampleHistoricalTimeSeriesLoaderComponentFactory.Meta meta() {
    return ExampleHistoricalTimeSeriesLoaderComponentFactory.Meta.INSTANCE;
  }
  static {
    JodaBeanUtils.registerMetaBean(ExampleHistoricalTimeSeriesLoaderComponentFactory.Meta.INSTANCE);
  }

  @Override
  public ExampleHistoricalTimeSeriesLoaderComponentFactory.Meta metaBean() {
    return ExampleHistoricalTimeSeriesLoaderComponentFactory.Meta.INSTANCE;
  }

  @Override
  protected Object propertyGet(String propertyName, boolean quiet) {
    return super.propertyGet(propertyName, quiet);
  }

  @Override
  protected void propertySet(String propertyName, Object newValue, boolean quiet) {
    super.propertySet(propertyName, newValue, quiet);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj != null && obj.getClass() == this.getClass()) {
      return super.equals(obj);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    return hash ^ super.hashCode();
  }

  //-----------------------------------------------------------------------
  /**
   * The meta-bean for {@code ExampleHistoricalTimeSeriesLoaderComponentFactory}.
   */
  public static class Meta extends AbstractHistoricalTimeSeriesLoaderComponentFactory.Meta {
    /**
     * The singleton instance of the meta-bean.
     */
    static final Meta INSTANCE = new Meta();

    /**
     * The meta-properties.
     */
    private final Map<String, MetaProperty<?>> _metaPropertyMap$ = new DirectMetaPropertyMap(
        this, (DirectMetaPropertyMap) super.metaPropertyMap());

    /**
     * Restricted constructor.
     */
    protected Meta() {
    }

    @Override
    public BeanBuilder<? extends ExampleHistoricalTimeSeriesLoaderComponentFactory> builder() {
      return new DirectBeanBuilder<ExampleHistoricalTimeSeriesLoaderComponentFactory>(new ExampleHistoricalTimeSeriesLoaderComponentFactory());
    }

    @Override
    public Class<? extends ExampleHistoricalTimeSeriesLoaderComponentFactory> beanType() {
      return ExampleHistoricalTimeSeriesLoaderComponentFactory.class;
    }

    @Override
    public Map<String, MetaProperty<?>> metaPropertyMap() {
      return _metaPropertyMap$;
    }

    //-----------------------------------------------------------------------
  }

  ///CLOVER:ON
  //-------------------------- AUTOGENERATED END --------------------------
}