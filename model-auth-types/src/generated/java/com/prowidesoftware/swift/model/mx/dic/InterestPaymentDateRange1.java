
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
 * Specifies an expected date and a due date for the interest payment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestPaymentDateRange1", propOrder = {
    "intrstSchdlId",
    "xpctdDt",
    "dueDt"
})
public class InterestPaymentDateRange1 {

    @XmlElement(name = "IntrstSchdlId")
    protected String intrstSchdlId;
    @XmlElement(name = "XpctdDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpctdDt;
    @XmlElement(name = "DueDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDt;

    /**
     * Gets the value of the intrstSchdlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrstSchdlId() {
        return intrstSchdlId;
    }

    /**
     * Sets the value of the intrstSchdlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InterestPaymentDateRange1 setIntrstSchdlId(String value) {
        this.intrstSchdlId = value;
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
    public InterestPaymentDateRange1 setXpctdDt(XMLGregorianCalendar value) {
        this.xpctdDt = value;
        return this;
    }

    /**
     * Gets the value of the dueDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getDueDt() {
        return dueDt;
    }

    /**
     * Sets the value of the dueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InterestPaymentDateRange1 setDueDt(XMLGregorianCalendar value) {
        this.dueDt = value;
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
