//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.28 at 11:02:57 AM PST 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxReturnStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxReturnStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FILED"/>
 *     &lt;enumeration value="FILING_FAILED"/>
 *     &lt;enumeration value="FILING_FAILED_WRONG_AGENCY_CREDENTIALS"/>
 *     &lt;enumeration value="AGENCY_PAYMENT_INITIATED"/>
 *     &lt;enumeration value="AGENCY_PAYMENT_COMPLETED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxReturnStatusEnum")
@XmlEnum
public enum TaxReturnStatusEnum {

    FILED,
    FILING_FAILED,
    FILING_FAILED_WRONG_AGENCY_CREDENTIALS,
    AGENCY_PAYMENT_INITIATED,
    AGENCY_PAYMENT_COMPLETED;

    public String value() {
        return name();
    }

    public static TaxReturnStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
