
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Determines how the voting instructions are specified.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vote16Choice", propOrder = {
    "voteInstr",
    "gblVoteInstr"
})
public class Vote16Choice {

    @XmlElement(name = "VoteInstr")
    protected List<Vote14> voteInstr;
    @XmlElement(name = "GblVoteInstr")
    protected List<Vote15> gblVoteInstr;

    /**
     * Gets the value of the voteInstr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voteInstr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoteInstr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vote14 }
     * 
     * 
     */
    public List<Vote14> getVoteInstr() {
        if (voteInstr == null) {
            voteInstr = new ArrayList<Vote14>();
        }
        return this.voteInstr;
    }

    /**
     * Gets the value of the gblVoteInstr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gblVoteInstr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGblVoteInstr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vote15 }
     * 
     * 
     */
    public List<Vote15> getGblVoteInstr() {
        if (gblVoteInstr == null) {
            gblVoteInstr = new ArrayList<Vote15>();
        }
        return this.gblVoteInstr;
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

    /**
     * Adds a new item to the voteInstr list.
     * @see #getVoteInstr()
     * 
     */
    public Vote16Choice addVoteInstr(Vote14 voteInstr) {
        getVoteInstr().add(voteInstr);
        return this;
    }

    /**
     * Adds a new item to the gblVoteInstr list.
     * @see #getGblVoteInstr()
     * 
     */
    public Vote16Choice addGblVoteInstr(Vote15 gblVoteInstr) {
        getGblVoteInstr().add(gblVoteInstr);
        return this;
    }

}
