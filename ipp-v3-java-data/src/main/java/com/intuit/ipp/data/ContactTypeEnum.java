//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.28 at 11:02:57 AM PST 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TelephoneNumber"/>
 *     &lt;enumeration value="EmailAddress"/>
 *     &lt;enumeration value="WebSiteAddress"/>
 *     &lt;enumeration value="GenericContactType"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContactTypeEnum")
@XmlEnum
public enum ContactTypeEnum {

    @XmlEnumValue("TelephoneNumber")
    TELEPHONE_NUMBER("TelephoneNumber"),
    @XmlEnumValue("EmailAddress")
    EMAIL_ADDRESS("EmailAddress"),
    @XmlEnumValue("WebSiteAddress")
    WEB_SITE_ADDRESS("WebSiteAddress"),
    @XmlEnumValue("GenericContactType")
    GENERIC_CONTACT_TYPE("GenericContactType");
    private final String value;

    ContactTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactTypeEnum fromValue(String v) {
        for (ContactTypeEnum c: ContactTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
