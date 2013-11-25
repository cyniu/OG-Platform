/**
 * Copyright (C) 2013 - present by OpenGamma Inc. and the OpenGamma group of companies
 *
 * Please see distribution for license.
 */
package com.opengamma.analytics.financial.obligor;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

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

import com.opengamma.util.i18n.Country;

/**
 *
 */
@BeanDefinition
public class Obligor extends DirectBean implements Serializable {

  /** Serialization version */
  private static final long serialVersionUID = 1L;

  /**
   * The ticker
   */
  @PropertyDefinition(validate = "notNull")
  private String _ticker;

  /**
   * The short name
   */
  @PropertyDefinition(validate = "notNull")
  private String _shortName;

  /**
   * A set of credit ratings from various agencies.
   */
  @PropertyDefinition(validate = "notNull")
  private Set<CreditRating> _creditRatings;

  /**
   * The sector.
   */
  @PropertyDefinition(validate = "notNull")
  private Sector _sector;

  /**
   * The region.
   */
  @PropertyDefinition(validate = "notNull")
  private Region _region;

  /**
   * The country.
   */
  @PropertyDefinition(validate = "notNull")
  private Country _country;

  /**
   * For the builder.
   */
  /* package */ Obligor() {
  }

  /**
   * @param ticker The ticker, not null
   * @param shortName The short name, not null
   * @param creditRatings The set of credit ratings, not null
   * @param sector The sector, not null
   * @param region The region, not null
   * @param country The country, not null
   */
  public Obligor(final String ticker, final String shortName, final Set<CreditRating> creditRatings, final Sector sector,
      final Region region, final Country country) {
    setTicker(ticker);
    setShortName(shortName);
    setCreditRatings(creditRatings);
    setSector(sector);
    setRegion(region);
    setCountry(country);
  }

  //------------------------- AUTOGENERATED START -------------------------
  ///CLOVER:OFF
  /**
   * The meta-bean for {@code Obligor}.
   * @return the meta-bean, not null
   */
  public static Obligor.Meta meta() {
    return Obligor.Meta.INSTANCE;
  }

  static {
    JodaBeanUtils.registerMetaBean(Obligor.Meta.INSTANCE);
  }

  @Override
  public Obligor.Meta metaBean() {
    return Obligor.Meta.INSTANCE;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the ticker
   * @return the value of the property, not null
   */
  public String getTicker() {
    return _ticker;
  }

  /**
   * Sets the ticker
   * @param ticker  the new value of the property, not null
   */
  public void setTicker(String ticker) {
    JodaBeanUtils.notNull(ticker, "ticker");
    this._ticker = ticker;
  }

  /**
   * Gets the the {@code ticker} property.
   * @return the property, not null
   */
  public final Property<String> ticker() {
    return metaBean().ticker().createProperty(this);
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the short name
   * @return the value of the property, not null
   */
  public String getShortName() {
    return _shortName;
  }

  /**
   * Sets the short name
   * @param shortName  the new value of the property, not null
   */
  public void setShortName(String shortName) {
    JodaBeanUtils.notNull(shortName, "shortName");
    this._shortName = shortName;
  }

  /**
   * Gets the the {@code shortName} property.
   * @return the property, not null
   */
  public final Property<String> shortName() {
    return metaBean().shortName().createProperty(this);
  }

  //-----------------------------------------------------------------------
  /**
   * Gets a set of credit ratings from various agencies.
   * @return the value of the property, not null
   */
  public Set<CreditRating> getCreditRatings() {
    return _creditRatings;
  }

  /**
   * Sets a set of credit ratings from various agencies.
   * @param creditRatings  the new value of the property, not null
   */
  public void setCreditRatings(Set<CreditRating> creditRatings) {
    JodaBeanUtils.notNull(creditRatings, "creditRatings");
    this._creditRatings = creditRatings;
  }

  /**
   * Gets the the {@code creditRatings} property.
   * @return the property, not null
   */
  public final Property<Set<CreditRating>> creditRatings() {
    return metaBean().creditRatings().createProperty(this);
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the sector.
   * @return the value of the property, not null
   */
  public Sector getSector() {
    return _sector;
  }

  /**
   * Sets the sector.
   * @param sector  the new value of the property, not null
   */
  public void setSector(Sector sector) {
    JodaBeanUtils.notNull(sector, "sector");
    this._sector = sector;
  }

  /**
   * Gets the the {@code sector} property.
   * @return the property, not null
   */
  public final Property<Sector> sector() {
    return metaBean().sector().createProperty(this);
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the region.
   * @return the value of the property, not null
   */
  public Region getRegion() {
    return _region;
  }

  /**
   * Sets the region.
   * @param region  the new value of the property, not null
   */
  public void setRegion(Region region) {
    JodaBeanUtils.notNull(region, "region");
    this._region = region;
  }

  /**
   * Gets the the {@code region} property.
   * @return the property, not null
   */
  public final Property<Region> region() {
    return metaBean().region().createProperty(this);
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the country.
   * @return the value of the property, not null
   */
  public Country getCountry() {
    return _country;
  }

  /**
   * Sets the country.
   * @param country  the new value of the property, not null
   */
  public void setCountry(Country country) {
    JodaBeanUtils.notNull(country, "country");
    this._country = country;
  }

  /**
   * Gets the the {@code country} property.
   * @return the property, not null
   */
  public final Property<Country> country() {
    return metaBean().country().createProperty(this);
  }

  //-----------------------------------------------------------------------
  @Override
  public Obligor clone() {
    BeanBuilder<? extends Obligor> builder = metaBean().builder();
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
      Obligor other = (Obligor) obj;
      return JodaBeanUtils.equal(getTicker(), other.getTicker()) &&
          JodaBeanUtils.equal(getShortName(), other.getShortName()) &&
          JodaBeanUtils.equal(getCreditRatings(), other.getCreditRatings()) &&
          JodaBeanUtils.equal(getSector(), other.getSector()) &&
          JodaBeanUtils.equal(getRegion(), other.getRegion()) &&
          JodaBeanUtils.equal(getCountry(), other.getCountry());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int hash = getClass().hashCode();
    hash += hash * 31 + JodaBeanUtils.hashCode(getTicker());
    hash += hash * 31 + JodaBeanUtils.hashCode(getShortName());
    hash += hash * 31 + JodaBeanUtils.hashCode(getCreditRatings());
    hash += hash * 31 + JodaBeanUtils.hashCode(getSector());
    hash += hash * 31 + JodaBeanUtils.hashCode(getRegion());
    hash += hash * 31 + JodaBeanUtils.hashCode(getCountry());
    return hash;
  }

  @Override
  public String toString() {
    StringBuilder buf = new StringBuilder(224);
    buf.append("Obligor{");
    int len = buf.length();
    toString(buf);
    if (buf.length() > len) {
      buf.setLength(buf.length() - 2);
    }
    buf.append('}');
    return buf.toString();
  }

  protected void toString(StringBuilder buf) {
    buf.append("ticker").append('=').append(JodaBeanUtils.toString(getTicker())).append(',').append(' ');
    buf.append("shortName").append('=').append(JodaBeanUtils.toString(getShortName())).append(',').append(' ');
    buf.append("creditRatings").append('=').append(JodaBeanUtils.toString(getCreditRatings())).append(',').append(' ');
    buf.append("sector").append('=').append(JodaBeanUtils.toString(getSector())).append(',').append(' ');
    buf.append("region").append('=').append(JodaBeanUtils.toString(getRegion())).append(',').append(' ');
    buf.append("country").append('=').append(JodaBeanUtils.toString(getCountry())).append(',').append(' ');
  }

  //-----------------------------------------------------------------------
  /**
   * The meta-bean for {@code Obligor}.
   */
  public static class Meta extends DirectMetaBean {
    /**
     * The singleton instance of the meta-bean.
     */
    static final Meta INSTANCE = new Meta();

    /**
     * The meta-property for the {@code ticker} property.
     */
    private final MetaProperty<String> _ticker = DirectMetaProperty.ofReadWrite(
        this, "ticker", Obligor.class, String.class);
    /**
     * The meta-property for the {@code shortName} property.
     */
    private final MetaProperty<String> _shortName = DirectMetaProperty.ofReadWrite(
        this, "shortName", Obligor.class, String.class);
    /**
     * The meta-property for the {@code creditRatings} property.
     */
    @SuppressWarnings({"unchecked", "rawtypes" })
    private final MetaProperty<Set<CreditRating>> _creditRatings = DirectMetaProperty.ofReadWrite(
        this, "creditRatings", Obligor.class, (Class) Set.class);
    /**
     * The meta-property for the {@code sector} property.
     */
    private final MetaProperty<Sector> _sector = DirectMetaProperty.ofReadWrite(
        this, "sector", Obligor.class, Sector.class);
    /**
     * The meta-property for the {@code region} property.
     */
    private final MetaProperty<Region> _region = DirectMetaProperty.ofReadWrite(
        this, "region", Obligor.class, Region.class);
    /**
     * The meta-property for the {@code country} property.
     */
    private final MetaProperty<Country> _country = DirectMetaProperty.ofReadWrite(
        this, "country", Obligor.class, Country.class);
    /**
     * The meta-properties.
     */
    private final Map<String, MetaProperty<?>> _metaPropertyMap$ = new DirectMetaPropertyMap(
        this, null,
        "ticker",
        "shortName",
        "creditRatings",
        "sector",
        "region",
        "country");

    /**
     * Restricted constructor.
     */
    protected Meta() {
    }

    @Override
    protected MetaProperty<?> metaPropertyGet(String propertyName) {
      switch (propertyName.hashCode()) {
        case -873960694:  // ticker
          return _ticker;
        case -2028219097:  // shortName
          return _shortName;
        case 1420088637:  // creditRatings
          return _creditRatings;
        case -906274970:  // sector
          return _sector;
        case -934795532:  // region
          return _region;
        case 957831062:  // country
          return _country;
      }
      return super.metaPropertyGet(propertyName);
    }

    @Override
    public BeanBuilder<? extends Obligor> builder() {
      return new DirectBeanBuilder<Obligor>(new Obligor());
    }

    @Override
    public Class<? extends Obligor> beanType() {
      return Obligor.class;
    }

    @Override
    public Map<String, MetaProperty<?>> metaPropertyMap() {
      return _metaPropertyMap$;
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-property for the {@code ticker} property.
     * @return the meta-property, not null
     */
    public final MetaProperty<String> ticker() {
      return _ticker;
    }

    /**
     * The meta-property for the {@code shortName} property.
     * @return the meta-property, not null
     */
    public final MetaProperty<String> shortName() {
      return _shortName;
    }

    /**
     * The meta-property for the {@code creditRatings} property.
     * @return the meta-property, not null
     */
    public final MetaProperty<Set<CreditRating>> creditRatings() {
      return _creditRatings;
    }

    /**
     * The meta-property for the {@code sector} property.
     * @return the meta-property, not null
     */
    public final MetaProperty<Sector> sector() {
      return _sector;
    }

    /**
     * The meta-property for the {@code region} property.
     * @return the meta-property, not null
     */
    public final MetaProperty<Region> region() {
      return _region;
    }

    /**
     * The meta-property for the {@code country} property.
     * @return the meta-property, not null
     */
    public final MetaProperty<Country> country() {
      return _country;
    }

    //-----------------------------------------------------------------------
    @Override
    protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
      switch (propertyName.hashCode()) {
        case -873960694:  // ticker
          return ((Obligor) bean).getTicker();
        case -2028219097:  // shortName
          return ((Obligor) bean).getShortName();
        case 1420088637:  // creditRatings
          return ((Obligor) bean).getCreditRatings();
        case -906274970:  // sector
          return ((Obligor) bean).getSector();
        case -934795532:  // region
          return ((Obligor) bean).getRegion();
        case 957831062:  // country
          return ((Obligor) bean).getCountry();
      }
      return super.propertyGet(bean, propertyName, quiet);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
      switch (propertyName.hashCode()) {
        case -873960694:  // ticker
          ((Obligor) bean).setTicker((String) newValue);
          return;
        case -2028219097:  // shortName
          ((Obligor) bean).setShortName((String) newValue);
          return;
        case 1420088637:  // creditRatings
          ((Obligor) bean).setCreditRatings((Set<CreditRating>) newValue);
          return;
        case -906274970:  // sector
          ((Obligor) bean).setSector((Sector) newValue);
          return;
        case -934795532:  // region
          ((Obligor) bean).setRegion((Region) newValue);
          return;
        case 957831062:  // country
          ((Obligor) bean).setCountry((Country) newValue);
          return;
      }
      super.propertySet(bean, propertyName, newValue, quiet);
    }

    @Override
    protected void validate(Bean bean) {
      JodaBeanUtils.notNull(((Obligor) bean)._ticker, "ticker");
      JodaBeanUtils.notNull(((Obligor) bean)._shortName, "shortName");
      JodaBeanUtils.notNull(((Obligor) bean)._creditRatings, "creditRatings");
      JodaBeanUtils.notNull(((Obligor) bean)._sector, "sector");
      JodaBeanUtils.notNull(((Obligor) bean)._region, "region");
      JodaBeanUtils.notNull(((Obligor) bean)._country, "country");
    }

  }

  ///CLOVER:ON
  //-------------------------- AUTOGENERATED END --------------------------
}
