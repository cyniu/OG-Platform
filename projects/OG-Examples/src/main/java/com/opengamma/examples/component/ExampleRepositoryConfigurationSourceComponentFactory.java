/**
 * Copyright (C) 2009 - present by OpenGamma Inc. and the OpenGamma group of companies
 *
 * Please see distribution for license.
 */
package com.opengamma.examples.component;

import java.util.List;
import java.util.Map;

import org.joda.beans.BeanBuilder;
import org.joda.beans.BeanDefinition;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

import com.opengamma.component.factory.source.RepositoryConfigurationSourceComponentFactory;
import com.opengamma.engine.function.config.RepositoryConfigurationSource;
import com.opengamma.examples.function.ExampleCubeFunctionConfiguration;
import com.opengamma.examples.function.ExampleStandardFunctionConfiguration;
import com.opengamma.examples.function.ExampleSurfaceFunctionConfiguration;
import com.opengamma.examples.tutorial.TutorialFunctions;

/**
 * Component factory for the function configuration source.
 */
@BeanDefinition
public class ExampleRepositoryConfigurationSourceComponentFactory extends RepositoryConfigurationSourceComponentFactory {

  @Override
  protected RepositoryConfigurationSource standardConfiguration() {
    return ExampleStandardFunctionConfiguration.instance();
  }

  @Override
  protected RepositoryConfigurationSource surfaceConfiguration() {
    final ExampleSurfaceFunctionConfiguration factory = new ExampleSurfaceFunctionConfiguration();
    factory.setConfigMaster(getConfigMaster());
    return factory.constructRepositoryConfigurationSource();
  }

  protected RepositoryConfigurationSource cubeConfiguration() {
    final ExampleCubeFunctionConfiguration factory = new ExampleCubeFunctionConfiguration();
    return factory.constructRepositoryConfigurationSource();
  }

  protected RepositoryConfigurationSource tutorialConfiguration() {
    return TutorialFunctions.instance();
  }

  @Override
  protected List<RepositoryConfigurationSource> initSources() {
    final List<RepositoryConfigurationSource> sources = super.initSources();
    // sources.add(tutorialConfiguration());
    return sources;
  }

  //------------------------- AUTOGENERATED START -------------------------
  ///CLOVER:OFF
  /**
   * The meta-bean for {@code ExampleRepositoryConfigurationSourceComponentFactory}.
   * @return the meta-bean, not null
   */
  public static ExampleRepositoryConfigurationSourceComponentFactory.Meta meta() {
    return ExampleRepositoryConfigurationSourceComponentFactory.Meta.INSTANCE;
  }
  static {
    JodaBeanUtils.registerMetaBean(ExampleRepositoryConfigurationSourceComponentFactory.Meta.INSTANCE);
  }

  @Override
  public ExampleRepositoryConfigurationSourceComponentFactory.Meta metaBean() {
    return ExampleRepositoryConfigurationSourceComponentFactory.Meta.INSTANCE;
  }

  @Override
  protected Object propertyGet(final String propertyName, final boolean quiet) {
    return super.propertyGet(propertyName, quiet);
  }

  @Override
  protected void propertySet(final String propertyName, final Object newValue, final boolean quiet) {
    super.propertySet(propertyName, newValue, quiet);
  }

  @Override
  public boolean equals(final Object obj) {
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
    final int hash = 7;
    return hash ^ super.hashCode();
  }

  //-----------------------------------------------------------------------
  /**
   * The meta-bean for {@code ExampleRepositoryConfigurationSourceComponentFactory}.
   */
  public static class Meta extends RepositoryConfigurationSourceComponentFactory.Meta {
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
    public BeanBuilder<? extends ExampleRepositoryConfigurationSourceComponentFactory> builder() {
      return new DirectBeanBuilder<ExampleRepositoryConfigurationSourceComponentFactory>(new ExampleRepositoryConfigurationSourceComponentFactory());
    }

    @Override
    public Class<? extends ExampleRepositoryConfigurationSourceComponentFactory> beanType() {
      return ExampleRepositoryConfigurationSourceComponentFactory.class;
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
