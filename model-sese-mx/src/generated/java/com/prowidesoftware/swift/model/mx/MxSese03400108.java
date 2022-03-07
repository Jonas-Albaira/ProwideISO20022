
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
 * Class for sese.034.001.08 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.034.001.08")
public class MxSese03400108
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesFincgStsAdvc", required = true)
    protected SecuritiesFinancingStatusAdviceV08 sctiesFincgStsAdvc;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 34;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 8;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus21Choice.class, AcknowledgedAcceptedStatus22Choice.class, AcknowledgementReason10 .class, AcknowledgementReason12Choice.class, AcknowledgementReason13Choice.class, AcknowledgementReason5Code.class, AcknowledgementReason9 .class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AlternatePartyIdentification7 .class, AmountAndDirection21 .class, AmountAndDirection51 .class, BeneficialOwnership4Choice.class, BlockTrade1Code.class, BlockTrade4Choice.class, CancellationReason12 .class, CancellationReason23Choice.class, CancellationStatus16Choice.class, CancelledStatusReason9Code.class, CashSettlementSystem2Code.class, CashSettlementSystem4Choice.class, CentralCounterPartyEligibility4Choice.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateCode18Choice.class, DateType3Code.class, DateType4Code.class, DateType5Code.class, DeliveryReceiptType2Code.class, DeniedReason12 .class, DeniedReason17Choice.class, DeniedReason3Code.class, DeniedStatus17Choice.class, FailingReason2Code.class, FailingReason8 .class, FailingReason8Choice.class, FailingStatus10Choice.class, FinancialInstrumentQuantity1Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, IdentificationSource3Choice.class, IdentificationType42Choice.class, MarketClientSide1Code.class, MarketClientSide6Choice.class, MarketIdentification1Choice.class, MarketIdentification84 .class, MarketType2Code.class, MarketType8Choice.class, MatchingStatus26Choice.class, MxSese03400108 .class, NameAndAddress5 .class, NettingEligibility4Choice.class, NoReasonCode.class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, OwnershipLegalRestrictions1Code.class, PartyIdentification120Choice.class, PartyIdentification122Choice.class, PartyIdentification127Choice.class, PartyIdentification134Choice.class, PartyIdentification144 .class, PartyIdentification146 .class, PartyIdentification149 .class, PartyIdentificationAndAccount169 .class, PartyTextInformation1 .class, PendingProcessingReason11Choice.class, PendingProcessingReason1Code.class, PendingProcessingReason9 .class, PendingProcessingStatus12Choice.class, PendingReason16 .class, PendingReason18 .class, PendingReason1Code.class, PendingReason28Choice.class, PendingReason31Choice.class, PendingReason6Code.class, PendingStatus38Choice.class, PendingStatus40Choice.class, PlaceOfTradeIdentification1 .class, PostalAddress1 .class, ProcessingStatus51Choice.class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, Quantity6Choice.class, Rate2 .class, RateName1 .class, RateOrName1Choice.class, RateType1Code.class, RateType35Choice.class, ReceiveDelivery1Code.class, RejectionReason26Choice.class, RejectionReason28 .class, RejectionReason38Code.class, RejectionStatus19Choice.class, RepairReason10 .class, RepairReason12Choice.class, RepairReason5Code.class, RepairStatus14Choice.class, RepoCallAcknowledgementReason2Code.class, RepoCallRequestStatus7Choice.class, Restriction5Choice.class, SafeKeepingPlace3 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat29Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText8 .class, SecuritiesAccount19 .class, SecuritiesAccount22 .class, SecuritiesFinancingStatusAdviceV08 .class, SecuritiesFinancingTransactionDetails44 .class, SecuritiesFinancingTransactionType2Code.class, SecuritiesRTGS4Choice.class, SecurityIdentification19 .class, SettlementDate19Choice.class, SettlementDateCode8Choice.class, SettlementDetails170 .class, SettlementParties77 .class, SettlementStatus18Choice.class, SettlementSystemMethod1Code.class, SettlementSystemMethod4Choice.class, SettlementTransactionCondition18Choice.class, SettlementTransactionCondition5Code.class, SettlementTransactionCondition6Code.class, SettlingCapacity2Code.class, SettlingCapacity7Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty4Choice.class, TaxLiability1Code.class, TerminationDate6Choice.class, TradeDate8Choice.class, TradeDateCode3Choice.class, TransactionIdentifications32 .class, TypeOfIdentification1Code.class, UnmatchedReason13Code.class, UnmatchedReason17 .class, UnmatchedReason24Choice.class, UnmatchedStatus18Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.034.001.08";

    public MxSese03400108() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese03400108(final String xml) {
        this();
        MxSese03400108 tmp = parse(xml);
        sctiesFincgStsAdvc = tmp.getSctiesFincgStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese03400108(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingStatusAdviceV08 }
     *     
     */
    public SecuritiesFinancingStatusAdviceV08 getSctiesFincgStsAdvc() {
        return sctiesFincgStsAdvc;
    }

    /**
     * Sets the value of the sctiesFincgStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingStatusAdviceV08 }
     *     
     */
    public MxSese03400108 setSctiesFincgStsAdvc(SecuritiesFinancingStatusAdviceV08 value) {
        this.sctiesFincgStsAdvc = value;
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
    public static MxSese03400108 parse(String xml) {
        return ((MxSese03400108) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03400108 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese03400108 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese03400108) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese03400108 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese03400108 parse(String xml, MxRead parserImpl) {
        return ((MxSese03400108) parserImpl.read(MxSese03400108 .class, xml, _classes));
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
     * Creates an MxSese03400108 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese03400108 message
     * @return
     *     a new instance of MxSese03400108
     */
    public final static MxSese03400108 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese03400108 .class);
    }

}
