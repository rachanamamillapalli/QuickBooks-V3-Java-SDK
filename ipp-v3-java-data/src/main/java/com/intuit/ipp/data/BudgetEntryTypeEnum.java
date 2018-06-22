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
 * <p>Java class for BudgetEntryTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BudgetEntryTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Yearly"/>
 *     &lt;enumeration value="Quarterly"/>
 *     &lt;enumeration value="Monthly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BudgetEntryTypeEnum")
@XmlEnum
public enum BudgetEntryTypeEnum {

    @XmlEnumValue("Yearly")
    YEARLY("Yearly"),
    @XmlEnumValue("Quarterly")
    QUARTERLY("Quarterly"),
    @XmlEnumValue("Monthly")
    MONTHLY("Monthly");
    private final String value;

    BudgetEntryTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BudgetEntryTypeEnum fromValue(String v) {
        for (BudgetEntryTypeEnum c: BudgetEntryTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
