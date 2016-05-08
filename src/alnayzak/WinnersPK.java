/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alnayzak;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Ahmad Ilaiwi
 */
@Embeddable
public class WinnersPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "COMPATITIONNUMBER")
    private BigInteger compatitionnumber;
    @Basic(optional = false)
    @Column(name = "GROUPNUMBER")
    private BigInteger groupnumber;

    public WinnersPK() {
    }

    public WinnersPK(BigInteger compatitionnumber, BigInteger groupnumber) {
        this.compatitionnumber = compatitionnumber;
        this.groupnumber = groupnumber;
    }

    public BigInteger getCompatitionnumber() {
        return compatitionnumber;
    }

    public void setCompatitionnumber(BigInteger compatitionnumber) {
        this.compatitionnumber = compatitionnumber;
    }

    public BigInteger getGroupnumber() {
        return groupnumber;
    }

    public void setGroupnumber(BigInteger groupnumber) {
        this.groupnumber = groupnumber;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (compatitionnumber != null ? compatitionnumber.hashCode() : 0);
        hash += (groupnumber != null ? groupnumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WinnersPK)) {
            return false;
        }
        WinnersPK other = (WinnersPK) object;
        if ((this.compatitionnumber == null && other.compatitionnumber != null) || (this.compatitionnumber != null && !this.compatitionnumber.equals(other.compatitionnumber))) {
            return false;
        }
        if ((this.groupnumber == null && other.groupnumber != null) || (this.groupnumber != null && !this.groupnumber.equals(other.groupnumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alnayzak.WinnersPK[ compatitionnumber=" + compatitionnumber + ", groupnumber=" + groupnumber + " ]";
    }
    
}
