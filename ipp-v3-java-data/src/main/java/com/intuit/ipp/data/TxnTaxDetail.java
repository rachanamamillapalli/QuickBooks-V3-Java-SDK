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
 * 				Product: ALL
 * 				Description: Details of taxes charged
 * 				on the transaction as a whole. For US versions of QuickBooks, tax
 * 				rates used in the detail section must not be used in any tax line
 * 				appearing in the main transaction body. For international versions
 * 				of QuickBooks, the TxnTaxDetail should provide the details of all
 * 				taxes (sales or purchase) calculated for the transaction based on
 * 				the tax codes referenced by the transaction. This can be calculated
 * 				by QuickBooks business logic or you may supply it when adding a
 * 				transaction. For US versions of QuickBooks you need only supply the
 * 				tax code for the customer and the tax code (in the case of multiple
 * 				rates) or tax rate (for a single rate) to apply for the transaction
 * 				as a whole.[br]See [a
 * 				href="http://ipp.developer.intuit.com/0010_Intuit_Partner_Platform/0060_Financial_Management_Services_(v3)/01100_Global_Tax_Model"]Global
 * 				Tax Model[/a].
 * 			
 * 
 * <p>Java class for TxnTaxDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TxnTaxDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DefaultTaxCodeRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="TxnTaxCodeRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="TotalTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TaxLine" type="{http://schema.intuit.com/finance/v3}Line" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TxnTaxDetail", propOrder = {
    "defaultTaxCodeRef",
    "txnTaxCodeRef",
    "totalTax",
    "taxLine"
})
public class TxnTaxDetail implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DefaultTaxCodeRef")
    protected ReferenceType defaultTaxCodeRef;
    @XmlElement(name = "TxnTaxCodeRef")
    protected ReferenceType txnTaxCodeRef;
    @XmlElement(name = "TotalTax")
    protected BigDecimal totalTax;
    @XmlElement(name = "TaxLine")
    protected List<Line> taxLine;

    /**
     * Gets the value of the defaultTaxCodeRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getDefaultTaxCodeRef() {
        return defaultTaxCodeRef;
    }

    /**
     * Sets the value of the defaultTaxCodeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setDefaultTaxCodeRef(ReferenceType value) {
        this.defaultTaxCodeRef = value;
    }

    /**
     * Gets the value of the txnTaxCodeRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getTxnTaxCodeRef() {
        return txnTaxCodeRef;
    }

    /**
     * Sets the value of the txnTaxCodeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setTxnTaxCodeRef(ReferenceType value) {
        this.txnTaxCodeRef = value;
    }

    /**
     * Gets the value of the totalTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalTax() {
        return totalTax;
    }

    /**
     * Sets the value of the totalTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalTax(BigDecimal value) {
        this.totalTax = value;
    }

    /**
     * Gets the value of the taxLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Line }
     * 
     * 
     */
    public List<Line> getTaxLine() {
        if (taxLine == null) {
            taxLine = new ArrayList<Line>();
        }
        return this.taxLine;
    }

    /**
     * Sets the value of the taxLine property.
     * 
     * @param taxLine
     *     allowed object is
     *     {@link Line }
     *     
     */
    public void setTaxLine(List<Line> taxLine) {
        this.taxLine = taxLine;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TxnTaxDetail that = ((TxnTaxDetail) object);
        {
            ReferenceType lhsDefaultTaxCodeRef;
            lhsDefaultTaxCodeRef = this.getDefaultTaxCodeRef();
            ReferenceType rhsDefaultTaxCodeRef;
            rhsDefaultTaxCodeRef = that.getDefaultTaxCodeRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultTaxCodeRef", lhsDefaultTaxCodeRef), LocatorUtils.property(thatLocator, "defaultTaxCodeRef", rhsDefaultTaxCodeRef), lhsDefaultTaxCodeRef, rhsDefaultTaxCodeRef, (this.defaultTaxCodeRef!= null), (that.defaultTaxCodeRef!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsTxnTaxCodeRef;
            lhsTxnTaxCodeRef = this.getTxnTaxCodeRef();
            ReferenceType rhsTxnTaxCodeRef;
            rhsTxnTaxCodeRef = that.getTxnTaxCodeRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "txnTaxCodeRef", lhsTxnTaxCodeRef), LocatorUtils.property(thatLocator, "txnTaxCodeRef", rhsTxnTaxCodeRef), lhsTxnTaxCodeRef, rhsTxnTaxCodeRef, (this.txnTaxCodeRef!= null), (that.txnTaxCodeRef!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsTotalTax;
            lhsTotalTax = this.getTotalTax();
            BigDecimal rhsTotalTax;
            rhsTotalTax = that.getTotalTax();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalTax", lhsTotalTax), LocatorUtils.property(thatLocator, "totalTax", rhsTotalTax), lhsTotalTax, rhsTotalTax, (this.totalTax!= null), (that.totalTax!= null))) {
                return false;
            }
        }
        {
            List<Line> lhsTaxLine;
            lhsTaxLine = (((this.taxLine!= null)&&(!this.taxLine.isEmpty()))?this.getTaxLine():null);
            List<Line> rhsTaxLine;
            rhsTaxLine = (((that.taxLine!= null)&&(!that.taxLine.isEmpty()))?that.getTaxLine():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxLine", lhsTaxLine), LocatorUtils.property(thatLocator, "taxLine", rhsTaxLine), lhsTaxLine, rhsTaxLine, ((this.taxLine!= null)&&(!this.taxLine.isEmpty())), ((that.taxLine!= null)&&(!that.taxLine.isEmpty())))) {
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
            ReferenceType theDefaultTaxCodeRef;
            theDefaultTaxCodeRef = this.getDefaultTaxCodeRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultTaxCodeRef", theDefaultTaxCodeRef), currentHashCode, theDefaultTaxCodeRef, (this.defaultTaxCodeRef!= null));
        }
        {
            ReferenceType theTxnTaxCodeRef;
            theTxnTaxCodeRef = this.getTxnTaxCodeRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txnTaxCodeRef", theTxnTaxCodeRef), currentHashCode, theTxnTaxCodeRef, (this.txnTaxCodeRef!= null));
        }
        {
            BigDecimal theTotalTax;
            theTotalTax = this.getTotalTax();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalTax", theTotalTax), currentHashCode, theTotalTax, (this.totalTax!= null));
        }
        {
            List<Line> theTaxLine;
            theTaxLine = (((this.taxLine!= null)&&(!this.taxLine.isEmpty()))?this.getTaxLine():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxLine", theTaxLine), currentHashCode, theTaxLine, ((this.taxLine!= null)&&(!this.taxLine.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
