//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.03 at 09:17:43 PM PDT 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxTypeApplicablityEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxTypeApplicablityEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TaxOnAmount"/>
 *     &lt;enumeration value="TaxOnAmountPlusTax"/>
 *     &lt;enumeration value="TaxOnTax"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxTypeApplicablityEnum")
@XmlEnum
public enum TaxTypeApplicablityEnum {

    @XmlEnumValue("TaxOnAmount")
    TAX_ON_AMOUNT("TaxOnAmount"),
    @XmlEnumValue("TaxOnAmountPlusTax")
    TAX_ON_AMOUNT_PLUS_TAX("TaxOnAmountPlusTax"),
    @XmlEnumValue("TaxOnTax")
    TAX_ON_TAX("TaxOnTax");
    private final String value;

    TaxTypeApplicablityEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxTypeApplicablityEnum fromValue(String v) {
        for (TaxTypeApplicablityEnum c: TaxTypeApplicablityEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
