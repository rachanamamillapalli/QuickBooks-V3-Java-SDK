//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.28 at 11:02:57 AM PST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
 * 				Product: QBW
 * 				Description: You can use price levels
 * 				to specify custom pricing for specific customers. Once you create a
 * 				price level for a customer, QuickBooks will automatically use the
 * 				custom price in new invoices, sales receipts, sales orders or credit
 * 				memos for that customer. You can override this automatic feature,
 * 				however, when you create the invoices, sales receipts, etc. The user
 * 				can now specify a price level on line items in the following
 * 				supported sales transactions: invoices, sales receipts, credit
 * 				memos, and sales orders. Notice that the response data for the
 * 				affected sales transaction does not list the price level that was
 * 				used. The response simply lists the Rate for the item, which was set
 * 				using the price level.
 * 			
 * 
 * <p>Java class for PriceLevel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceLevel">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}IntuitEntity">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PriceLevelType" type="{http://schema.intuit.com/finance/v3}PriceLevelTypeEnum"/>
 *         &lt;choice>
 *           &lt;element name="FixedPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *           &lt;element name="PriceLevelPerItem" type="{http://schema.intuit.com/finance/v3}PriceLevelPerItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="CurrencyRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="PriceLevelEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceLevel", propOrder = {
    "name",
    "active",
    "priceLevelType",
    "fixedPercentage",
    "priceLevelPerItem",
    "currencyRef",
    "priceLevelEx"
})
public class PriceLevel
    extends IntuitEntity
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Name", required = true)
    protected Object name;
    @XmlElement(name = "Active")
    protected boolean active;
    @XmlElement(name = "PriceLevelType", required = true)
    protected PriceLevelTypeEnum priceLevelType;
    @XmlElement(name = "FixedPercentage")
    protected BigDecimal fixedPercentage;
    @XmlElement(name = "PriceLevelPerItem")
    protected List<PriceLevelPerItem> priceLevelPerItem;
    @XmlElement(name = "CurrencyRef")
    protected ReferenceType currencyRef;
    @XmlElement(name = "PriceLevelEx")
    protected IntuitAnyType priceLevelEx;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setName(Object value) {
        this.name = value;
    }

    /**
     * Gets the value of the active property.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the priceLevelType property.
     * 
     * @return
     *     possible object is
     *     {@link PriceLevelTypeEnum }
     *     
     */
    public PriceLevelTypeEnum getPriceLevelType() {
        return priceLevelType;
    }

    /**
     * Sets the value of the priceLevelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceLevelTypeEnum }
     *     
     */
    public void setPriceLevelType(PriceLevelTypeEnum value) {
        this.priceLevelType = value;
    }

    /**
     * Gets the value of the fixedPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFixedPercentage() {
        return fixedPercentage;
    }

    /**
     * Sets the value of the fixedPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFixedPercentage(BigDecimal value) {
        this.fixedPercentage = value;
    }

    /**
     * Gets the value of the priceLevelPerItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceLevelPerItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceLevelPerItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceLevelPerItem }
     * 
     * 
     */
    public List<PriceLevelPerItem> getPriceLevelPerItem() {
        if (priceLevelPerItem == null) {
            priceLevelPerItem = new ArrayList<PriceLevelPerItem>();
        }
        return this.priceLevelPerItem;
    }

    /**
     * Gets the value of the currencyRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getCurrencyRef() {
        return currencyRef;
    }

    /**
     * Sets the value of the currencyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setCurrencyRef(ReferenceType value) {
        this.currencyRef = value;
    }

    /**
     * Gets the value of the priceLevelEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getPriceLevelEx() {
        return priceLevelEx;
    }

    /**
     * Sets the value of the priceLevelEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setPriceLevelEx(IntuitAnyType value) {
        this.priceLevelEx = value;
    }

    /**
     * Sets the value of the priceLevelPerItem property.
     * 
     * @param priceLevelPerItem
     *     allowed object is
     *     {@link PriceLevelPerItem }
     *     
     */
    public void setPriceLevelPerItem(List<PriceLevelPerItem> priceLevelPerItem) {
        this.priceLevelPerItem = priceLevelPerItem;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final PriceLevel that = ((PriceLevel) object);
        {
            Object lhsName;
            lhsName = this.getName();
            Object rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
        {
            boolean lhsActive;
            lhsActive = this.isActive();
            boolean rhsActive;
            rhsActive = that.isActive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "active", lhsActive), LocatorUtils.property(thatLocator, "active", rhsActive), lhsActive, rhsActive, true, true)) {
                return false;
            }
        }
        {
            PriceLevelTypeEnum lhsPriceLevelType;
            lhsPriceLevelType = this.getPriceLevelType();
            PriceLevelTypeEnum rhsPriceLevelType;
            rhsPriceLevelType = that.getPriceLevelType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priceLevelType", lhsPriceLevelType), LocatorUtils.property(thatLocator, "priceLevelType", rhsPriceLevelType), lhsPriceLevelType, rhsPriceLevelType, (this.priceLevelType!= null), (that.priceLevelType!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsFixedPercentage;
            lhsFixedPercentage = this.getFixedPercentage();
            BigDecimal rhsFixedPercentage;
            rhsFixedPercentage = that.getFixedPercentage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fixedPercentage", lhsFixedPercentage), LocatorUtils.property(thatLocator, "fixedPercentage", rhsFixedPercentage), lhsFixedPercentage, rhsFixedPercentage, (this.fixedPercentage!= null), (that.fixedPercentage!= null))) {
                return false;
            }
        }
        {
            List<PriceLevelPerItem> lhsPriceLevelPerItem;
            lhsPriceLevelPerItem = (((this.priceLevelPerItem!= null)&&(!this.priceLevelPerItem.isEmpty()))?this.getPriceLevelPerItem():null);
            List<PriceLevelPerItem> rhsPriceLevelPerItem;
            rhsPriceLevelPerItem = (((that.priceLevelPerItem!= null)&&(!that.priceLevelPerItem.isEmpty()))?that.getPriceLevelPerItem():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priceLevelPerItem", lhsPriceLevelPerItem), LocatorUtils.property(thatLocator, "priceLevelPerItem", rhsPriceLevelPerItem), lhsPriceLevelPerItem, rhsPriceLevelPerItem, ((this.priceLevelPerItem!= null)&&(!this.priceLevelPerItem.isEmpty())), ((that.priceLevelPerItem!= null)&&(!that.priceLevelPerItem.isEmpty())))) {
                return false;
            }
        }
        {
            ReferenceType lhsCurrencyRef;
            lhsCurrencyRef = this.getCurrencyRef();
            ReferenceType rhsCurrencyRef;
            rhsCurrencyRef = that.getCurrencyRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "currencyRef", lhsCurrencyRef), LocatorUtils.property(thatLocator, "currencyRef", rhsCurrencyRef), lhsCurrencyRef, rhsCurrencyRef, (this.currencyRef!= null), (that.currencyRef!= null))) {
                return false;
            }
        }
        {
            IntuitAnyType lhsPriceLevelEx;
            lhsPriceLevelEx = this.getPriceLevelEx();
            IntuitAnyType rhsPriceLevelEx;
            rhsPriceLevelEx = that.getPriceLevelEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priceLevelEx", lhsPriceLevelEx), LocatorUtils.property(thatLocator, "priceLevelEx", rhsPriceLevelEx), lhsPriceLevelEx, rhsPriceLevelEx, (this.priceLevelEx!= null), (that.priceLevelEx!= null))) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            Object theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            boolean theActive;
            theActive = this.isActive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "active", theActive), currentHashCode, theActive, true);
        }
        {
            PriceLevelTypeEnum thePriceLevelType;
            thePriceLevelType = this.getPriceLevelType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "priceLevelType", thePriceLevelType), currentHashCode, thePriceLevelType, (this.priceLevelType!= null));
        }
        {
            BigDecimal theFixedPercentage;
            theFixedPercentage = this.getFixedPercentage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fixedPercentage", theFixedPercentage), currentHashCode, theFixedPercentage, (this.fixedPercentage!= null));
        }
        {
            List<PriceLevelPerItem> thePriceLevelPerItem;
            thePriceLevelPerItem = (((this.priceLevelPerItem!= null)&&(!this.priceLevelPerItem.isEmpty()))?this.getPriceLevelPerItem():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "priceLevelPerItem", thePriceLevelPerItem), currentHashCode, thePriceLevelPerItem, ((this.priceLevelPerItem!= null)&&(!this.priceLevelPerItem.isEmpty())));
        }
        {
            ReferenceType theCurrencyRef;
            theCurrencyRef = this.getCurrencyRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "currencyRef", theCurrencyRef), currentHashCode, theCurrencyRef, (this.currencyRef!= null));
        }
        {
            IntuitAnyType thePriceLevelEx;
            thePriceLevelEx = this.getPriceLevelEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "priceLevelEx", thePriceLevelEx), currentHashCode, thePriceLevelEx, (this.priceLevelEx!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
