/**
 * Copyright (C) 2014 - present by OpenGamma Inc. and the OpenGamma group of companies
 * 
 * Please see distribution for license.
 */
package com.opengamma.financial.security.index;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Map;

import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.BeanDefinition;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectBean;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

import com.opengamma.id.ExternalIdBundle;

/**
 * Class representing a member of a bond index.
 */
@BeanDefinition
public class BondIndexComponent extends DirectBean implements Serializable {

  /** Serialization version */
  private static final long serialVersionUID = 1L;

  /**
   * The bond identifier.
   */
  @PropertyDefinition(validate = "notNull")
  private ExternalIdBundle _bondIdentifier;

  /**
   * The weight.
   */
  @PropertyDefinition(validate = "notNull")
  private BigDecimal _weight;

  /**
   * For the builder.
   */
  /* package */ BondIndexComponent() {
    super();
  }

  /**
   * @param bondIdentifier The bond identifier bundle, not null
   * @param weight The weight, not null
   */
  public BondIndexComponent(final ExternalIdBundle bondIdentifier, final BigDecimal weight) {
    setBondIdentifier(bondIdentifier);
    setWeight(weight);
  }

  //------------------------- AUTOGENERATED START -------------------------
  ///CLOVER:OFF
  /**
   * The meta-bean for {@code BondIndexComponent}.
   * @return the meta-bean, not null
   */
  public static BondIndexComponent.Meta meta() {
    return BondIndexComponent.Meta.INSTANCE;
  }

  static {
    JodaBeanUtils.registerMetaBean(BondIndexComponent.Meta.INSTANCE);
  }

  @Override
  public BondIndexComponent.Meta metaBean() {
    return BondIndexComponent.Meta.INSTANCE;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the bond identifier.
   * @return the value of the property, not null
   */
  public ExternalIdBundle getBondIdentifier() {
    return _bondIdentifier;
  }

  /**
   * Sets the bond identifier.
   * @param bondIdentifier  the new value of the property, not null
   */
  public void setBondIdentifier(ExternalIdBundle bondIdentifier) {
    JodaBeanUtils.notNull(bondIdentifier, "bondIdentifier");
    this._bondIdentifier = bondIdentifier;
  }

  /**
   * Gets the the {@code bondIdentifier} property.
   * @return the property, not null
   */
  public final Property<ExternalIdBundle> bondIdentifier() {
    return metaBean().bondIdentifier().createProperty(this);
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the weight.
   * @return the value of the property, not null
   */
  public BigDecimal getWeight() {
    return _weight;
  }

  /**
   * Sets the weight.
   * @param weight  the new value of the property, not null
   */
  public void setWeight(BigDecimal weight) {
    JodaBeanUtils.notNull(weight, "weight");
    this._weight = weight;
  }

  /**
   * Gets the the {@code weight} property.
   * @return the property, not null
   */
  public final Property<BigDecimal> weight() {
    return metaBean().weight().createProperty(this);
  }

  //-----------------------------------------------------------------------
  @Override
  public BondIndexComponent clone() {
    BeanBuilder<? extends BondIndexComponent> builder = metaBean().builder();
    for (MetaProperty<?> mp : metaBean().metaPropertyIterable()) {
      if (mp.style().isBuildable()) {
        Object value = mp.get(this);
        if (value instanceof Bean) {
          value = ((Bean) value).clone();
        }
        builder.set(mp.name(), value);
      }
    }
    return builder.build();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj != null && obj.getClass() == this.getClass()) {
      BondIndexComponent other = (BondIndexComponent) obj;
      return JodaBeanUtils.equal(getBondIdentifier(), other.getBondIdentifier()) &&
          JodaBeanUtils.equal(getWeight(), other.getWeight());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int hash = getClass().hashCode();
    hash += hash * 31 + JodaBeanUtils.hashCode(getBondIdentifier());
    hash += hash * 31 + JodaBeanUtils.hashCode(getWeight());
    return hash;
  }

  @Override
  public String toString() {
    StringBuilder buf = new StringBuilder(96);
    buf.append("BondIndexComponent{");
    int len = buf.length();
    toString(buf);
    if (buf.length() > len) {
      buf.setLength(buf.length() - 2);
    }
    buf.append('}');
    return buf.toString();
  }

  protected void toString(StringBuilder buf) {
    buf.append("bondIdentifier").append('=').append(JodaBeanUtils.toString(getBondIdentifier())).append(',').append(' ');
    buf.append("weight").append('=').append(JodaBeanUtils.toString(getWeight())).append(',').append(' ');
  }

  //-----------------------------------------------------------------------
  /**
   * The meta-bean for {@code BondIndexComponent}.
   */
  public static class Meta extends DirectMetaBean {
    /**
     * The singleton instance of the meta-bean.
     */
    static final Meta INSTANCE = new Meta();

    /**
     * The meta-property for the {@code bondIdentifier} property.
     */
    private final MetaProperty<ExternalIdBundle> _bondIdentifier = DirectMetaProperty.ofReadWrite(
        this, "bondIdentifier", BondIndexComponent.class, ExternalIdBundle.class);
    /**
     * The meta-property for the {@code weight} property.
     */
    private final MetaProperty<BigDecimal> _weight = DirectMetaProperty.ofReadWrite(
        this, "weight", BondIndexComponent.class, BigDecimal.class);
    /**
     * The meta-properties.
     */
    private final Map<String, MetaProperty<?>> _metaPropertyMap$ = new DirectMetaPropertyMap(
        this, null,
        "bondIdentifier",
        "weight");

    /**
     * Restricted constructor.
     */
    protected Meta() {
    }

    @Override
    protected MetaProperty<?> metaPropertyGet(String propertyName) {
      switch (propertyName.hashCode()) {
        case 1874619340:  // bondIdentifier
          return _bondIdentifier;
        case -791592328:  // weight
          return _weight;
      }
      return super.metaPropertyGet(propertyName);
    }

    @Override
    public BeanBuilder<? extends BondIndexComponent> builder() {
      return new DirectBeanBuilder<BondIndexComponent>(new BondIndexComponent());
    }

    @Override
    public Class<? extends BondIndexComponent> beanType() {
      return BondIndexComponent.class;
    }

    @Override
    public Map<String, MetaProperty<?>> metaPropertyMap() {
      return _metaPropertyMap$;
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-property for the {@code bondIdentifier} property.
     * @return the meta-property, not null
     */
    public final MetaProperty<ExternalIdBundle> bondIdentifier() {
      return _bondIdentifier;
    }

    /**
     * The meta-property for the {@code weight} property.
     * @return the meta-property, not null
     */
    public final MetaProperty<BigDecimal> weight() {
      return _weight;
    }

    //-----------------------------------------------------------------------
    @Override
    protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
      switch (propertyName.hashCode()) {
        case 1874619340:  // bondIdentifier
          return ((BondIndexComponent) bean).getBondIdentifier();
        case -791592328:  // weight
          return ((BondIndexComponent) bean).getWeight();
      }
      return super.propertyGet(bean, propertyName, quiet);
    }

    @Override
    protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
      switch (propertyName.hashCode()) {
        case 1874619340:  // bondIdentifier
          ((BondIndexComponent) bean).setBondIdentifier((ExternalIdBundle) newValue);
          return;
        case -791592328:  // weight
          ((BondIndexComponent) bean).setWeight((BigDecimal) newValue);
          return;
      }
      super.propertySet(bean, propertyName, newValue, quiet);
    }

    @Override
    protected void validate(Bean bean) {
      JodaBeanUtils.notNull(((BondIndexComponent) bean)._bondIdentifier, "bondIdentifier");
      JodaBeanUtils.notNull(((BondIndexComponent) bean)._weight, "weight");
    }

  }

  ///CLOVER:ON
  //-------------------------- AUTOGENERATED END --------------------------
}
