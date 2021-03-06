
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VotingParticipationMethod2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VotingParticipationMethod2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PHNV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VotingParticipationMethod2Code")
@XmlEnum
public enum VotingParticipationMethod2Code {


    /**
     * Participation to the meeting is in person but the person is not voting.
     * 
     */
    PHNV;

    public String value() {
        return name();
    }

    public static VotingParticipationMethod2Code fromValue(String v) {
        return valueOf(v);
    }

}
