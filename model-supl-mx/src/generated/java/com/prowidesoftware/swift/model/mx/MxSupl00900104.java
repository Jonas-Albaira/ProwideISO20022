
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for supl.009.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dtcccapasd1"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:supl.009.001.04")
public class MxSupl00900104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DTCCCAPASD1", required = true)
    protected DTCCCAPASD1V04 dtcccapasd1;
    public final static transient String BUSINESS_PROCESS = "supl";
    public final static transient int FUNCTIONALITY = 9;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {CorporateActionBalanceSD1 .class, CorporateActionGeneralInformationSD21 .class, CorporateActionMovementCashMovementDetailsSD3 .class, CorporateActionMovementSecuritiesMovementDetailsSD4 .class, CorporateActionSD8 .class, CreditDebitCode.class, DTCAdjustmentPaymentSubReason1Code.class, DTCAdjustmentPaymentType2Code.class, DTCCCAPASD1V04 .class, DTCCPayoutType3Code.class, DTCCPayoutType4Code.class, DTCCSubEventType4Code.class, DateAndDateTimeChoice.class, DateFormat28Choice.class, DateType8Code.class, EventGroup1Code.class, ExtendedEventType3Code.class, FinancialInstrumentAttributesSD9 .class, FinancialInstrumentQuantity15Choice.class, IdentificationSource4Choice.class, MxSupl00900104 .class, OtherIdentification2 .class, RestrictedFINActiveCurrencyAndAmount.class, ShortLong1Code.class, SignedQuantityFormat4 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:supl.009.001.04";

    public MxSupl00900104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl00900104(final String xml) {
        this();
        MxSupl00900104 tmp = parse(xml);
        dtcccapasd1 = tmp.getDTCCCAPASD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl00900104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dtcccapasd1 property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCCAPASD1V04 }
     *     
     */
    public DTCCCAPASD1V04 getDTCCCAPASD1() {
        return dtcccapasd1;
    }

    /**
     * Sets the value of the dtcccapasd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCCAPASD1V04 }
     *     
     */
    public MxSupl00900104 setDTCCCAPASD1(DTCCCAPASD1V04 value) {
        this.dtcccapasd1 = value;
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

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxSupl00900104 parse(String xml) {
        return ((MxSupl00900104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl00900104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSupl00900104 parse(String xml, MxReadConfiguration conf) {
        return ((MxSupl00900104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl00900104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl00900104 parse(String xml, MxRead parserImpl) {
        return ((MxSupl00900104) parserImpl.read(MxSupl00900104 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxSupl00900104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl00900104 message
     * @return
     *     a new instance of MxSupl00900104
     */
    public final static MxSupl00900104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSupl00900104 .class);
    }

}
