
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
 * Class for semt.018.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesTxPdgRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.018.001.07")
public class MxSemt01800107
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesTxPdgRpt", required = true)
    protected SecuritiesTransactionPendingReportV07 sctiesTxPdgRpt;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 18;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus21Choice.class, AcknowledgementReason12Choice.class, AcknowledgementReason5Code.class, AcknowledgementReason9 .class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AmountAndDirection51 .class, BeneficialOwnership4Choice.class, BlockTrade1Code.class, BlockTrade4Choice.class, CancellationReason19Choice.class, CancellationReason9 .class, CancellationStatus14Choice.class, CancelledStatusReason13Code.class, CashSettlementSystem2Code.class, CashSettlementSystem4Choice.class, CentralCounterPartyEligibility4Choice.class, CorporateActionEventType19Code.class, CorporateActionEventType30Choice.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DateType3Code.class, DateType4Code.class, DeliveryReceiptType2Code.class, EventFrequency4Code.class, FailingReason2Code.class, FailingReason8 .class, FailingReason8Choice.class, FailingStatus10Choice.class, FinancialInstrumentQuantity1Choice.class, Frequency25Choice.class, GeneratedReason3Code.class, GeneratedReason5 .class, GeneratedReasons5Choice.class, GeneratedStatus7Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, HoldIndicator6 .class, IdentificationSource3Choice.class, InstructionProcessingStatus22Choice.class, LetterOfGuarantee4Choice.class, MarketClientSide4Choice.class, MarketClientSideCode.class, MarketIdentification1Choice.class, MarketIdentification84 .class, MarketType2Code.class, MarketType8Choice.class, MatchingStatus24Choice.class, MxSemt01800107 .class, NameAndAddress5 .class, NettingEligibility4Choice.class, NoReasonCode.class, Number3Choice.class, OriginalAndCurrentQuantities1 .class, OtherIdentification1 .class, OwnershipLegalRestrictions1Code.class, Pagination.class, PartyIdentification44Choice.class, PartyIdentification71Choice.class, PartyIdentification91 .class, PartyIdentification92Choice.class, PartyIdentification98 .class, PartyIdentificationAndAccount117 .class, PendingProcessingReason10Choice.class, PendingProcessingReason2Code.class, PendingProcessingReason8 .class, PendingProcessingStatus11Choice.class, PendingReason15 .class, PendingReason16 .class, PendingReason27Choice.class, PendingReason28Choice.class, PendingReason2Code.class, PendingReason6Code.class, PendingStatus37Choice.class, PendingStatus38Choice.class, PlaceOfClearingIdentification1 .class, PlaceOfTradeIdentification1 .class, PostalAddress1 .class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, Quantity6Choice.class, ReceiveDelivery1Code.class, Registration10Choice.class, Registration1Code.class, Registration2Code.class, Registration9Choice.class, RegistrationReason5 .class, RepairReason10Choice.class, RepairReason4Code.class, RepairReason8 .class, RepairStatus12Choice.class, RepurchaseType12Choice.class, RepurchaseType3Code.class, Restriction5Choice.class, SafeKeepingPlace1 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat10Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText8 .class, SecuritiesAccount19 .class, SecuritiesAccount24 .class, SecuritiesRTGS4Choice.class, SecuritiesTransactionPendingReportV07 .class, SecuritiesTransactionType16Code.class, SecuritiesTransactionType19Choice.class, SecurityIdentification19 .class, SettlementDate10Choice.class, SettlementDateCode8Choice.class, SettlementDetails92 .class, SettlementOrCorporateActionEvent14Choice.class, SettlementParties40 .class, SettlementStatus17Choice.class, SettlementSystemMethod1Code.class, SettlementSystemMethod4Choice.class, SettlementTransactionCondition10Code.class, SettlementTransactionCondition16Choice.class, SettlementTransactionCondition5Code.class, SettlingCapacity2Code.class, SettlingCapacity7Choice.class, Statement41 .class, StatementStructure1Code.class, StatementUpdateType1Code.class, Status18Choice.class, StatusAndReason27 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxCapacityParty4Choice.class, TaxLiability1Code.class, TradeDate5Choice.class, TradeDateCode3Choice.class, Transaction45 .class, Transaction47 .class, TransactionActivity1Code.class, TransactionActivity3Choice.class, TransactionDetails75 .class, UnmatchedReason11Code.class, UnmatchedReason15 .class, UnmatchedReason21Choice.class, UnmatchedStatus16Choice.class, UpdateType15Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.018.001.07";

    public MxSemt01800107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01800107(final String xml) {
        this();
        MxSemt01800107 tmp = parse(xml);
        sctiesTxPdgRpt = tmp.getSctiesTxPdgRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01800107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesTxPdgRpt property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPendingReportV07 }
     *     
     */
    public SecuritiesTransactionPendingReportV07 getSctiesTxPdgRpt() {
        return sctiesTxPdgRpt;
    }

    /**
     * Sets the value of the sctiesTxPdgRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPendingReportV07 }
     *     
     */
    public MxSemt01800107 setSctiesTxPdgRpt(SecuritiesTransactionPendingReportV07 value) {
        this.sctiesTxPdgRpt = value;
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
    public static MxSemt01800107 parse(String xml) {
        return ((MxSemt01800107) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01800107 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt01800107 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt01800107) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt01800107 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01800107 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01800107) parserImpl.read(MxSemt01800107 .class, xml, _classes));
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
     * Creates an MxSemt01800107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01800107 message
     * @return
     *     a new instance of MxSemt01800107
     */
    public final static MxSemt01800107 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt01800107 .class);
    }

}
