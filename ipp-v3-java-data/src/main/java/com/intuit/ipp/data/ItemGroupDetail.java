//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.03 at 09:17:43 PM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
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
 * 				Description: Contains the details of a
 * 				group item.
 * 			
 * 
 * <p>Java class for ItemGroupDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemGroupDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemGroupLine" type="{http://schema.intuit.com/finance/v3}ItemComponentLine" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemGroupDetail", propOrder = {
    "itemGroupLine"
})
public class ItemGroupDetail implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ItemGroupLine")
    protected List<ItemComponentLine> itemGroupLine;

    /**
     * Gets the value of the itemGroupLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemGroupLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemGroupLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemComponentLine }
     * 
     * 
     */
    public List<ItemComponentLine> getItemGroupLine() {
        if (itemGroupLine == null) {
            itemGroupLine = new ArrayList<ItemComponentLine>();
        }
        return this.itemGroupLine;
    }

    /**
     * Sets the value of the itemGroupLine property.
     * 
     * @param itemGroupLine
     *     allowed object is
     *     {@link ItemComponentLine }
     *     
     */
    public void setItemGroupLine(List<ItemComponentLine> itemGroupLine) {
        this.itemGroupLine = itemGroupLine;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ItemGroupDetail that = ((ItemGroupDetail) object);
        {
            List<ItemComponentLine> lhsItemGroupLine;
            lhsItemGroupLine = (((this.itemGroupLine!= null)&&(!this.itemGroupLine.isEmpty()))?this.getItemGroupLine():null);
            List<ItemComponentLine> rhsItemGroupLine;
            rhsItemGroupLine = (((that.itemGroupLine!= null)&&(!that.itemGroupLine.isEmpty()))?that.getItemGroupLine():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemGroupLine", lhsItemGroupLine), LocatorUtils.property(thatLocator, "itemGroupLine", rhsItemGroupLine), lhsItemGroupLine, rhsItemGroupLine, ((this.itemGroupLine!= null)&&(!this.itemGroupLine.isEmpty())), ((that.itemGroupLine!= null)&&(!that.itemGroupLine.isEmpty())))) {
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
            List<ItemComponentLine> theItemGroupLine;
            theItemGroupLine = (((this.itemGroupLine!= null)&&(!this.itemGroupLine.isEmpty()))?this.getItemGroupLine():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemGroupLine", theItemGroupLine), currentHashCode, theItemGroupLine, ((this.itemGroupLine!= null)&&(!this.itemGroupLine.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
