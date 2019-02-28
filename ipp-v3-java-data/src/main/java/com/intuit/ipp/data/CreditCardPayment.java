//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.28 at 11:02:57 AM PST 
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
 * 				Description: Information about a
 * 				payment received by credit card.
 * 			
 * 
 * <p>Java class for CreditCardPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCardPayment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditChargeInfo" type="{http://schema.intuit.com/finance/v3}CreditChargeInfo" minOccurs="0"/>
 *         &lt;element name="CreditChargeResponse" type="{http://schema.intuit.com/finance/v3}CreditChargeResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCardPayment", propOrder = {
    "creditChargeInfo",
    "creditChargeResponse"
})
public class CreditCardPayment implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CreditChargeInfo")
    protected CreditChargeInfo creditChargeInfo;
    @XmlElement(name = "CreditChargeResponse")
    protected CreditChargeResponse creditChargeResponse;

    /**
     * Gets the value of the creditChargeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CreditChargeInfo }
     *     
     */
    public CreditChargeInfo getCreditChargeInfo() {
        return creditChargeInfo;
    }

    /**
     * Sets the value of the creditChargeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditChargeInfo }
     *     
     */
    public void setCreditChargeInfo(CreditChargeInfo value) {
        this.creditChargeInfo = value;
    }

    /**
     * Gets the value of the creditChargeResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CreditChargeResponse }
     *     
     */
    public CreditChargeResponse getCreditChargeResponse() {
        return creditChargeResponse;
    }

    /**
     * Sets the value of the creditChargeResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditChargeResponse }
     *     
     */
    public void setCreditChargeResponse(CreditChargeResponse value) {
        this.creditChargeResponse = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CreditCardPayment that = ((CreditCardPayment) object);
        {
            CreditChargeInfo lhsCreditChargeInfo;
            lhsCreditChargeInfo = this.getCreditChargeInfo();
            CreditChargeInfo rhsCreditChargeInfo;
            rhsCreditChargeInfo = that.getCreditChargeInfo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "creditChargeInfo", lhsCreditChargeInfo), LocatorUtils.property(thatLocator, "creditChargeInfo", rhsCreditChargeInfo), lhsCreditChargeInfo, rhsCreditChargeInfo, (this.creditChargeInfo!= null), (that.creditChargeInfo!= null))) {
                return false;
            }
        }
        {
            CreditChargeResponse lhsCreditChargeResponse;
            lhsCreditChargeResponse = this.getCreditChargeResponse();
            CreditChargeResponse rhsCreditChargeResponse;
            rhsCreditChargeResponse = that.getCreditChargeResponse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "creditChargeResponse", lhsCreditChargeResponse), LocatorUtils.property(thatLocator, "creditChargeResponse", rhsCreditChargeResponse), lhsCreditChargeResponse, rhsCreditChargeResponse, (this.creditChargeResponse!= null), (that.creditChargeResponse!= null))) {
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
            CreditChargeInfo theCreditChargeInfo;
            theCreditChargeInfo = this.getCreditChargeInfo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "creditChargeInfo", theCreditChargeInfo), currentHashCode, theCreditChargeInfo, (this.creditChargeInfo!= null));
        }
        {
            CreditChargeResponse theCreditChargeResponse;
            theCreditChargeResponse = this.getCreditChargeResponse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "creditChargeResponse", theCreditChargeResponse), currentHashCode, theCreditChargeResponse, (this.creditChargeResponse!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
