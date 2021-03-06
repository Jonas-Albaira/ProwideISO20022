
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Frequency7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Frequency7Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="YEAR"/&gt;
 *     &lt;enumeration value="DAIL"/&gt;
 *     &lt;enumeration value="MNTH"/&gt;
 *     &lt;enumeration value="QURT"/&gt;
 *     &lt;enumeration value="MIAN"/&gt;
 *     &lt;enumeration value="TEND"/&gt;
 *     &lt;enumeration value="MOVE"/&gt;
 *     &lt;enumeration value="WEEK"/&gt;
 *     &lt;enumeration value="INDA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Frequency7Code")
@XmlEnum
public enum Frequency7Code {


    /**
     * Event takes place every year or once a year.
     * 
     */
    YEAR,

    /**
     * Event takes place every day.
     * 
     */
    DAIL,

    /**
     * Event takes place every month or once a month.
     * 
     */
    MNTH,

    /**
     * Event takes place every three months or four times a year.
     * 
     */
    QURT,

    /**
     * Event takes place every six months or two times a year.
     * 
     */
    MIAN,

    /**
     * Event takes place every ten business days.
     * 
     */
    TEND,

    /**
     * Event takes place at the end of the day if there was a movement on the account, otherwise nothing is sent that day.
     * 
     */
    MOVE,

    /**
     * Event takes place once a week.
     * 
     */
    WEEK,

    /**
     * Event takes place several times a day.
     * 
     */
    INDA;

    public String value() {
        return name();
    }

    public static Frequency7Code fromValue(String v) {
        return valueOf(v);
    }

}
