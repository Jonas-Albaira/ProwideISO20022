
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
 * Class for fxtr.016.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fxTradInstrCxl"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:fxtr.016.001.01")
public class MxFxtr01600101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FXTradInstrCxl", required = true)
    protected ForeignExchangeTradeInstructionCancellationV01 fxTradInstrCxl;
    public final static transient String BUSINESS_PROCESS = "fxtr";
    public final static transient int FUNCTIONALITY = 16;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AgreedRate1 .class, AmountsAndValueDate1 .class, ContactInformation1 .class, ForeignExchangeTradeInstructionCancellationV01 .class, FundIdentification2 .class, GeneralInformation1 .class, MxFxtr01600101 .class, NameAndAddress8 .class, PartyIdentification22 .class, PartyIdentification8Choice.class, PostalAddress1 .class, SettlementParties1 .class, TradeAgreement4 .class, TradePartyIdentification3 .class, Trading1MethodCode.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:fxtr.016.001.01";

    public MxFxtr01600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxFxtr01600101(final String xml) {
        this();
        MxFxtr01600101 tmp = parse(xml);
        fxTradInstrCxl = tmp.getFXTradInstrCxl();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxFxtr01600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fxTradInstrCxl property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTradeInstructionCancellationV01 }
     *     
     */
    public ForeignExchangeTradeInstructionCancellationV01 getFXTradInstrCxl() {
        return fxTradInstrCxl;
    }

    /**
     * Sets the value of the fxTradInstrCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTradeInstructionCancellationV01 }
     *     
     */
    public MxFxtr01600101 setFXTradInstrCxl(ForeignExchangeTradeInstructionCancellationV01 value) {
        this.fxTradInstrCxl = value;
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
    public static MxFxtr01600101 parse(String xml) {
        return ((MxFxtr01600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr01600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxFxtr01600101 parse(String xml, MxReadConfiguration conf) {
        return ((MxFxtr01600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxFxtr01600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxFxtr01600101 parse(String xml, MxRead parserImpl) {
        return ((MxFxtr01600101) parserImpl.read(MxFxtr01600101 .class, xml, _classes));
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
     * Creates an MxFxtr01600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxFxtr01600101 message
     * @return
     *     a new instance of MxFxtr01600101
     */
    public final static MxFxtr01600101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxFxtr01600101 .class);
    }

}
