/**
 * Copyright (C) 2013 - present by OpenGamma Inc. and the OpenGamma group of companies
 * 
 * Please see distribution for license.
 */
package com.opengamma.financial.convention;

import java.util.Map;

import org.joda.beans.BeanBuilder;
import org.joda.beans.BeanDefinition;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

import com.opengamma.id.ExternalId;
import com.opengamma.id.ExternalIdBundle;
import com.opengamma.util.time.Tenor;

/**
 * Temporary convention to contain information about the tenor associated with a ticker until there is
 * a mechanism for storing these pieces of information in a convention master.
 */
@BeanDefinition
public class SpotTickerConvention extends Convention {

  /** Serialization version */
  private static final long serialVersionUID = 1L;

  /**
   * The id of the underlying convention.
   */
  @PropertyDefinition(validate = "notNull")
  private ExternalId _underlyingConvention;

  /**
   * The tenor associated with this convention.
   */
  @PropertyDefinition(validate = "notNull")
  private Tenor _tenor;

  /* package */SpotTickerConvention() {
  }

  public SpotTickerConvention(final String name, final ExternalIdBundle externalIdBundle, final ExternalId underlyingConvention, final Tenor tenor) {
    super(name, externalIdBundle);
    setUnderlyingConvention(underlyingConvention);
    setTenor(tenor);
  }
  //------------------------- AUTOGENERATED START -------------------------
  ///CLOVER:OFF
  /**
   * The meta-bean for {@code SpotTickerConvention}.
   * @return the meta-bean, not null
   */
  public static SpotTickerConvention.Meta meta() {
    return SpotTickerConvention.Meta.INSTANCE;
  }
  static {
    JodaBeanUtils.registerMetaBean(SpotTickerConvention.Meta.INSTANCE);
  }

  @Override
  public SpotTickerConvention.Meta metaBean() {
    return SpotTickerConvention.Meta.INSTANCE;
  }

  @Override
  protected Object propertyGet(String propertyName, boolean quiet) {
    switch (propertyName.hashCode()) {
      case -268325202:  // underlyingConvention
        return getUnderlyingConvention();
      case 110246592:  // tenor
        return getTenor();
    }
    return super.propertyGet(propertyName, quiet);
  }

  @Override
  protected void propertySet(String propertyName, Object newValue, boolean quiet) {
    switch (propertyName.hashCode()) {
      case -268325202:  // underlyingConvention
        setUnderlyingConvention((ExternalId) newValue);
        return;
      case 110246592:  // tenor
        setTenor((Tenor) newValue);
        return;
    }
    super.propertySet(propertyName, newValue, quiet);
  }

  @Override
  protected void validate() {
    JodaBeanUtils.notNull(_underlyingConvention, "underlyingConvention");
    JodaBeanUtils.notNull(_tenor, "tenor");
    super.validate();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj != null && obj.getClass() == this.getClass()) {
      SpotTickerConvention other = (SpotTickerConvention) obj;
      return JodaBeanUtils.equal(getUnderlyingConvention(), other.getUnderlyingConvention()) &&
          JodaBeanUtils.equal(getTenor(), other.getTenor()) &&
          super.equals(obj);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash += hash * 31 + JodaBeanUtils.hashCode(getUnderlyingConvention());
    hash += hash * 31 + JodaBeanUtils.hashCode(getTenor());
    return hash ^ super.hashCode();
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the id of the underlying convention.
   * @return the value of the property, not null
   */
  public ExternalId getUnderlyingConvention() {
    return _underlyingConvention;
  }

  /**
   * Sets the id of the underlying convention.
   * @param underlyingConvention  the new value of the property, not null
   */
  public void setUnderlyingConvention(ExternalId underlyingConvention) {
    JodaBeanUtils.notNull(underlyingConvention, "underlyingConvention");
    this._underlyingConvention = underlyingConvention;
  }

  /**
   * Gets the the {@code underlyingConvention} property.
   * @return the property, not null
   */
  public final Property<ExternalId> underlyingConvention() {
    return metaBean().underlyingConvention().createProperty(this);
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the tenor associated with this convention.
   * @return the value of the property, not null
   */
  public Tenor getTenor() {
    return _tenor;
  }

  /**
   * Sets the tenor associated with this convention.
   * @param tenor  the new value of the property, not null
   */
  public void setTenor(Tenor tenor) {
    JodaBeanUtils.notNull(tenor, "tenor");
    this._tenor = tenor;
  }

  /**
   * Gets the the {@code tenor} property.
   * @return the property, not null
   */
  public final Property<Tenor> tenor() {
    return metaBean().tenor().createProperty(this);
  }

  //-----------------------------------------------------------------------
  /**
   * The meta-bean for {@code SpotTickerConvention}.
   */
  public static class Meta extends Convention.Meta {
    /**
     * The singleton instance of the meta-bean.
     */
    static final Meta INSTANCE = new Meta();

    /**
     * The meta-property for the {@code underlyingConvention} property.
     */
    private final MetaProperty<ExternalId> _underlyingConvention = DirectMetaProperty.ofReadWrite(
        this, "underlyingConvention", SpotTickerConvention.class, ExternalId.class);
    /**
     * The meta-property for the {@code tenor} property.
     */
    private final MetaProperty<Tenor> _tenor = DirectMetaProperty.ofReadWrite(
        this, "tenor", SpotTickerConvention.class, Tenor.class);
    /**
     * The meta-properties.
     */
    private final Map<String, MetaProperty<?>> _metaPropertyMap$ = new DirectMetaPropertyMap(
        this, (DirectMetaPropertyMap) super.metaPropertyMap(),
        "underlyingConvention",
        "tenor");

    /**
     * Restricted constructor.
     */
    protected Meta() {
    }

    @Override
    protected MetaProperty<?> metaPropertyGet(String propertyName) {
      switch (propertyName.hashCode()) {
        case -268325202:  // underlyingConvention
          return _underlyingConvention;
        case 110246592:  // tenor
          return _tenor;
      }
      return super.metaPropertyGet(propertyName);
    }

    @Override
    public BeanBuilder<? extends SpotTickerConvention> builder() {
      return new DirectBeanBuilder<SpotTickerConvention>(new SpotTickerConvention());
    }

    @Override
    public Class<? extends SpotTickerConvention> beanType() {
      return SpotTickerConvention.class;
    }

    @Override
    public Map<String, MetaProperty<?>> metaPropertyMap() {
      return _metaPropertyMap$;
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-property for the {@code underlyingConvention} property.
     * @return the meta-property, not null
     */
    public final MetaProperty<ExternalId> underlyingConvention() {
      return _underlyingConvention;
    }

    /**
     * The meta-property for the {@code tenor} property.
     * @return the meta-property, not null
     */
    public final MetaProperty<Tenor> tenor() {
      return _tenor;
    }

  }

  ///CLOVER:ON
  //-------------------------- AUTOGENERATED END --------------------------
}