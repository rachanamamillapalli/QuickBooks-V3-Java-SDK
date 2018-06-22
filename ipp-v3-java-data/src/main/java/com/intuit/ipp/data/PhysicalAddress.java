//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.03 at 09:17:43 PM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * 
 * 				Product: ALL
 * 				Description: Physical (or postal) address type, this entity is always manipulated in context of another parent entity like Person, Organization etc.
 * 			
 * 
 * <p>Java class for PhysicalAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicalAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://schema.intuit.com/finance/v3}id" minOccurs="0"/>
 *         &lt;element name="Line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Line2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Line3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Line4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Line5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountrySubDivisionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCodeSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Lat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Long" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalAddress", propOrder = {
    "id",
    "line1",
    "line2",
    "line3",
    "line4",
    "line5",
    "city",
    "country",
    "countryCode",
    "countrySubDivisionCode",
    "postalCode",
    "postalCodeSuffix",
    "lat",
    "_long",
    "tag",
    "note"
})
public class PhysicalAddress implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Line1")
    protected String line1;
    @XmlElement(name = "Line2")
    protected String line2;
    @XmlElement(name = "Line3")
    protected String line3;
    @XmlElement(name = "Line4")
    protected String line4;
    @XmlElement(name = "Line5")
    protected String line5;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "CountryCode")
    protected String countryCode;
    @XmlElement(name = "CountrySubDivisionCode")
    protected String countrySubDivisionCode;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "PostalCodeSuffix")
    protected String postalCodeSuffix;
    @XmlElement(name = "Lat")
    protected String lat;
    @XmlElement(name = "Long")
    protected String _long;
    @XmlElement(name = "Tag")
    protected String tag;
    @XmlElement(name = "Note")
    protected String note;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the line1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine1() {
        return line1;
    }

    /**
     * Sets the value of the line1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine1(String value) {
        this.line1 = value;
    }

    /**
     * Gets the value of the line2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine2() {
        return line2;
    }

    /**
     * Sets the value of the line2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine2(String value) {
        this.line2 = value;
    }

    /**
     * Gets the value of the line3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine3() {
        return line3;
    }

    /**
     * Sets the value of the line3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine3(String value) {
        this.line3 = value;
    }

    /**
     * Gets the value of the line4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine4() {
        return line4;
    }

    /**
     * Sets the value of the line4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine4(String value) {
        this.line4 = value;
    }

    /**
     * Gets the value of the line5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine5() {
        return line5;
    }

    /**
     * Sets the value of the line5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine5(String value) {
        this.line5 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the countrySubDivisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountrySubDivisionCode() {
        return countrySubDivisionCode;
    }

    /**
     * Sets the value of the countrySubDivisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountrySubDivisionCode(String value) {
        this.countrySubDivisionCode = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the postalCodeSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCodeSuffix() {
        return postalCodeSuffix;
    }

    /**
     * Sets the value of the postalCodeSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCodeSuffix(String value) {
        this.postalCodeSuffix = value;
    }

    /**
     * Gets the value of the lat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLat() {
        return lat;
    }

    /**
     * Sets the value of the lat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLat(String value) {
        this.lat = value;
    }

    /**
     * Gets the value of the long property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLong() {
        return _long;
    }

    /**
     * Sets the value of the long property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLong(String value) {
        this._long = value;
    }

    /**
     * Gets the value of the tag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag(String value) {
        this.tag = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PhysicalAddress that = ((PhysicalAddress) object);
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId, (this.id!= null), (that.id!= null))) {
                return false;
            }
        }
        {
            String lhsLine1;
            lhsLine1 = this.getLine1();
            String rhsLine1;
            rhsLine1 = that.getLine1();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "line1", lhsLine1), LocatorUtils.property(thatLocator, "line1", rhsLine1), lhsLine1, rhsLine1, (this.line1 != null), (that.line1 != null))) {
                return false;
            }
        }
        {
            String lhsLine2;
            lhsLine2 = this.getLine2();
            String rhsLine2;
            rhsLine2 = that.getLine2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "line2", lhsLine2), LocatorUtils.property(thatLocator, "line2", rhsLine2), lhsLine2, rhsLine2, (this.line2 != null), (that.line2 != null))) {
                return false;
            }
        }
        {
            String lhsLine3;
            lhsLine3 = this.getLine3();
            String rhsLine3;
            rhsLine3 = that.getLine3();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "line3", lhsLine3), LocatorUtils.property(thatLocator, "line3", rhsLine3), lhsLine3, rhsLine3, (this.line3 != null), (that.line3 != null))) {
                return false;
            }
        }
        {
            String lhsLine4;
            lhsLine4 = this.getLine4();
            String rhsLine4;
            rhsLine4 = that.getLine4();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "line4", lhsLine4), LocatorUtils.property(thatLocator, "line4", rhsLine4), lhsLine4, rhsLine4, (this.line4 != null), (that.line4 != null))) {
                return false;
            }
        }
        {
            String lhsLine5;
            lhsLine5 = this.getLine5();
            String rhsLine5;
            rhsLine5 = that.getLine5();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "line5", lhsLine5), LocatorUtils.property(thatLocator, "line5", rhsLine5), lhsLine5, rhsLine5, (this.line5 != null), (that.line5 != null))) {
                return false;
            }
        }
        {
            String lhsCity;
            lhsCity = this.getCity();
            String rhsCity;
            rhsCity = that.getCity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "city", lhsCity), LocatorUtils.property(thatLocator, "city", rhsCity), lhsCity, rhsCity, (this.city!= null), (that.city!= null))) {
                return false;
            }
        }
        {
            String lhsCountry;
            lhsCountry = this.getCountry();
            String rhsCountry;
            rhsCountry = that.getCountry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "country", lhsCountry), LocatorUtils.property(thatLocator, "country", rhsCountry), lhsCountry, rhsCountry, (this.country!= null), (that.country!= null))) {
                return false;
            }
        }
        {
            String lhsCountryCode;
            lhsCountryCode = this.getCountryCode();
            String rhsCountryCode;
            rhsCountryCode = that.getCountryCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "countryCode", lhsCountryCode), LocatorUtils.property(thatLocator, "countryCode", rhsCountryCode), lhsCountryCode, rhsCountryCode, (this.countryCode!= null), (that.countryCode!= null))) {
                return false;
            }
        }
        {
            String lhsCountrySubDivisionCode;
            lhsCountrySubDivisionCode = this.getCountrySubDivisionCode();
            String rhsCountrySubDivisionCode;
            rhsCountrySubDivisionCode = that.getCountrySubDivisionCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "countrySubDivisionCode", lhsCountrySubDivisionCode), LocatorUtils.property(thatLocator, "countrySubDivisionCode", rhsCountrySubDivisionCode), lhsCountrySubDivisionCode, rhsCountrySubDivisionCode, (this.countrySubDivisionCode!= null), (that.countrySubDivisionCode!= null))) {
                return false;
            }
        }
        {
            String lhsPostalCode;
            lhsPostalCode = this.getPostalCode();
            String rhsPostalCode;
            rhsPostalCode = that.getPostalCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postalCode", lhsPostalCode), LocatorUtils.property(thatLocator, "postalCode", rhsPostalCode), lhsPostalCode, rhsPostalCode, (this.postalCode!= null), (that.postalCode!= null))) {
                return false;
            }
        }
        {
            String lhsPostalCodeSuffix;
            lhsPostalCodeSuffix = this.getPostalCodeSuffix();
            String rhsPostalCodeSuffix;
            rhsPostalCodeSuffix = that.getPostalCodeSuffix();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postalCodeSuffix", lhsPostalCodeSuffix), LocatorUtils.property(thatLocator, "postalCodeSuffix", rhsPostalCodeSuffix), lhsPostalCodeSuffix, rhsPostalCodeSuffix, (this.postalCodeSuffix!= null), (that.postalCodeSuffix!= null))) {
                return false;
            }
        }
        {
            String lhsLat;
            lhsLat = this.getLat();
            String rhsLat;
            rhsLat = that.getLat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lat", lhsLat), LocatorUtils.property(thatLocator, "lat", rhsLat), lhsLat, rhsLat, (this.lat!= null), (that.lat!= null))) {
                return false;
            }
        }
        {
            String lhsLong;
            lhsLong = this.getLong();
            String rhsLong;
            rhsLong = that.getLong();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "_long", lhsLong), LocatorUtils.property(thatLocator, "_long", rhsLong), lhsLong, rhsLong, (this._long!= null), (that._long!= null))) {
                return false;
            }
        }
        {
            String lhsTag;
            lhsTag = this.getTag();
            String rhsTag;
            rhsTag = that.getTag();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tag", lhsTag), LocatorUtils.property(thatLocator, "tag", rhsTag), lhsTag, rhsTag, (this.tag!= null), (that.tag!= null))) {
                return false;
            }
        }
        {
            String lhsNote;
            lhsNote = this.getNote();
            String rhsNote;
            rhsNote = that.getNote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "note", lhsNote), LocatorUtils.property(thatLocator, "note", rhsNote), lhsNote, rhsNote, (this.note!= null), (that.note!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId, (this.id!= null));
        }
        {
            String theLine1;
            theLine1 = this.getLine1();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "line1", theLine1), currentHashCode, theLine1, (this.line1 != null));
        }
        {
            String theLine2;
            theLine2 = this.getLine2();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "line2", theLine2), currentHashCode, theLine2, (this.line2 != null));
        }
        {
            String theLine3;
            theLine3 = this.getLine3();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "line3", theLine3), currentHashCode, theLine3, (this.line3 != null));
        }
        {
            String theLine4;
            theLine4 = this.getLine4();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "line4", theLine4), currentHashCode, theLine4, (this.line4 != null));
        }
        {
            String theLine5;
            theLine5 = this.getLine5();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "line5", theLine5), currentHashCode, theLine5, (this.line5 != null));
        }
        {
            String theCity;
            theCity = this.getCity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "city", theCity), currentHashCode, theCity, (this.city!= null));
        }
        {
            String theCountry;
            theCountry = this.getCountry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "country", theCountry), currentHashCode, theCountry, (this.country!= null));
        }
        {
            String theCountryCode;
            theCountryCode = this.getCountryCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "countryCode", theCountryCode), currentHashCode, theCountryCode, (this.countryCode!= null));
        }
        {
            String theCountrySubDivisionCode;
            theCountrySubDivisionCode = this.getCountrySubDivisionCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "countrySubDivisionCode", theCountrySubDivisionCode), currentHashCode, theCountrySubDivisionCode, (this.countrySubDivisionCode!= null));
        }
        {
            String thePostalCode;
            thePostalCode = this.getPostalCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "postalCode", thePostalCode), currentHashCode, thePostalCode, (this.postalCode!= null));
        }
        {
            String thePostalCodeSuffix;
            thePostalCodeSuffix = this.getPostalCodeSuffix();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "postalCodeSuffix", thePostalCodeSuffix), currentHashCode, thePostalCodeSuffix, (this.postalCodeSuffix!= null));
        }
        {
            String theLat;
            theLat = this.getLat();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lat", theLat), currentHashCode, theLat, (this.lat!= null));
        }
        {
            String theLong;
            theLong = this.getLong();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_long", theLong), currentHashCode, theLong, (this._long!= null));
        }
        {
            String theTag;
            theTag = this.getTag();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tag", theTag), currentHashCode, theTag, (this.tag!= null));
        }
        {
            String theNote;
            theNote = this.getNote();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "note", theNote), currentHashCode, theNote, (this.note!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
