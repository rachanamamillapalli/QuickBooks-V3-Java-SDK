//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.17 at 05:00:20 PM PDT 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomFieldTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomFieldTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="StringType"/&gt;
 *     &lt;enumeration value="BooleanType"/&gt;
 *     &lt;enumeration value="NumberType"/&gt;
 *     &lt;enumeration value="DateType"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomFieldTypeEnum")
@XmlEnum
public enum CustomFieldTypeEnum {

    @XmlEnumValue("StringType")
    STRING_TYPE("StringType"),
    @XmlEnumValue("BooleanType")
    BOOLEAN_TYPE("BooleanType"),
    @XmlEnumValue("NumberType")
    NUMBER_TYPE("NumberType"),
    @XmlEnumValue("DateType")
    DATE_TYPE("DateType");
    private final String value;

    CustomFieldTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomFieldTypeEnum fromValue(String v) {
        for (CustomFieldTypeEnum c: CustomFieldTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
