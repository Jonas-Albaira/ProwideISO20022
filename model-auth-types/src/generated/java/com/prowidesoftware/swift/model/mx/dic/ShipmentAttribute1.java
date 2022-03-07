
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Further details on the shipment conditions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentAttribute1", propOrder = {
    "conds",
    "xpctdDt",
    "ctryOfCntrPty"
})
public class ShipmentAttribute1 {

    @XmlElement(name = "Conds")
    protected String conds;
    @XmlElement(name = "XpctdDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpctdDt;
    @XmlElement(name = "CtryOfCntrPty", required = true)
    protected String ctryOfCntrPty;

    /**
     * Gets the value of the conds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConds() {
        return conds;
    }

    /**
     * Sets the value of the conds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ShipmentAttribute1 setConds(String value) {
        this.conds = value;
        return this;
    }

    /**
     * Gets the value of the xpctdDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getXpctdDt() {
        return xpctdDt;
    }

    /**
     * Sets the value of the xpctdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ShipmentAttribute1 setXpctdDt(XMLGregorianCalendar value) {
        this.xpctdDt = value;
        return this;
    }

    /**
     * Gets the value of the ctryOfCntrPty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfCntrPty() {
        return ctryOfCntrPty;
    }

    /**
     * Sets the value of the ctryOfCntrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ShipmentAttribute1 setCtryOfCntrPty(String value) {
        this.ctryOfCntrPty = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
