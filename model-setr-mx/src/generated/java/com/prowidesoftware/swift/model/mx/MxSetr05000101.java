
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
 * Class for setr.050.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sbcptBlkOrdrConfAmdmntV01"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:setr.050.001.01")
public class MxSetr05000101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SbcptBlkOrdrConfAmdmntV01", required = true)
    protected SubscriptionBulkOrderConfirmationAmendmentV01 sbcptBlkOrdrConfAmdmntV01;
    public final static transient String BUSINESS_PROCESS = "setr";
    public final static transient int FUNCTIONALITY = 50;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account7 .class, AccountIdentification1 .class, AccountIdentificationAndName3 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, BICIdentification1 .class, BestExecution1Code.class, BranchData.class, CancellationRight1Code.class, CardType1Code.class, CashAccountIdentification1Choice.class, Charge18 .class, ChargeType11Code.class, Cheque3 .class, ClearingSystemMemberIdentificationChoice.class, Commission10 .class, CommissionType6Code.class, CommissionWaiver3 .class, CopyInformation2 .class, CountryAndResidentialStatusType1 .class, CreditTransfer6 .class, DateAndDateTimeChoice.class, DeliveringPartiesAndAccount3 .class, DeliveryParameters3 .class, DeliveryReceiptType2Code.class, DirectDebitMandate4 .class, DistributionPolicy1Code.class, EUCapitalGain2Code.class, EUDividendStatus1Code.class, Equalisation1 .class, Extension1 .class, FinancialAdvice1Code.class, FinancialInstitutionIdentification3Choice.class, FinancialInstrument10 .class, FinancialInstrumentQuantity1 .class, ForeignExchangeTerms7 .class, FormOfSecurity1Code.class, FundCashAccount2Code.class, FundOrderType3 .class, FundOrderType4Code.class, FundOrderType5Code.class, FundSettlementParameters3 .class, GenericIdentification1 .class, GenericIdentification11 .class, IncomePreference1Code.class, IndividualPerson12 .class, Intermediary9 .class, InvestmentAccount20 .class, InvestmentAccount21 .class, InvestmentFundRole2Code.class, InvestmentFundsOrderBreakdown1 .class, LateReport1Code.class, MessageIdentification1 .class, MxSetr05000101 .class, NameAndAddress4 .class, NameAndAddress5 .class, NegotiatedTrade1Code.class, OrderOriginatorEligibility1Code.class, PartyIdentification2Choice.class, PartyIdentificationAndAccount3 .class, PaymentCard2 .class, PaymentInstrument12Choice.class, PaymentTransaction24 .class, PersonIdentificationType2Code.class, PlaceOfTradeIdentification1Choice.class, PostalAddress1 .class, PriceMethod1Code.class, PriceValue1 .class, ProfitAndLoss1Choice.class, ReceivingPartiesAndAccount3 .class, ResidentialStatus1Code.class, RoundingDirection2Code.class, SecurityIdentification3Choice.class, SimpleIdentificationInformation.class, SubAccount1 .class, SubscriptionBulkExecution3 .class, SubscriptionBulkOrderConfirmationAmendmentV01 .class, SubscriptionExecution5 .class, Tax14 .class, TaxCalculationInformation6 .class, TaxType11Code.class, TaxableIncomePerShareCalculated2Code.class, TaxationBasis2Code.class, TaxationBasis4Code.class, TotalCharges3 .class, TotalCommissions3 .class, TotalTaxes3 .class, TradingCapacity2Code.class, TypeOfPrice10Code.class, UnitPrice10 .class, WaivingInstruction1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:setr.050.001.01";

    public MxSetr05000101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr05000101(final String xml) {
        this();
        MxSetr05000101 tmp = parse(xml);
        sbcptBlkOrdrConfAmdmntV01 = tmp.getSbcptBlkOrdrConfAmdmntV01();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr05000101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sbcptBlkOrdrConfAmdmntV01 property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionBulkOrderConfirmationAmendmentV01 }
     *     
     */
    public SubscriptionBulkOrderConfirmationAmendmentV01 getSbcptBlkOrdrConfAmdmntV01() {
        return sbcptBlkOrdrConfAmdmntV01;
    }

    /**
     * Sets the value of the sbcptBlkOrdrConfAmdmntV01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionBulkOrderConfirmationAmendmentV01 }
     *     
     */
    public MxSetr05000101 setSbcptBlkOrdrConfAmdmntV01(SubscriptionBulkOrderConfirmationAmendmentV01 value) {
        this.sbcptBlkOrdrConfAmdmntV01 = value;
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
    public static MxSetr05000101 parse(String xml) {
        return ((MxSetr05000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr05000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr05000101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr05000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSetr05000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr05000101 parse(String xml, MxRead parserImpl) {
        return ((MxSetr05000101) parserImpl.read(MxSetr05000101 .class, xml, _classes));
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
     * Creates an MxSetr05000101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr05000101 message
     * @return
     *     a new instance of MxSetr05000101
     */
    public final static MxSetr05000101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSetr05000101 .class);
    }

}
