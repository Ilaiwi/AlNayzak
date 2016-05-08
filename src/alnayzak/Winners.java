/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alnayzak;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ahmad Ilaiwi
 */
@Entity
@Table(name = "WINNERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Winners.findAll", query = "SELECT w FROM Winners w"),
    @NamedQuery(name = "Winners.findByCompatitionnumber", query = "SELECT w FROM Winners w WHERE w.winnersPK.compatitionnumber = :compatitionnumber"),
    @NamedQuery(name = "Winners.findByGroupnumber", query = "SELECT w FROM Winners w WHERE w.winnersPK.groupnumber = :groupnumber"),
    @NamedQuery(name = "Winners.findByPrize", query = "SELECT w FROM Winners w WHERE w.prize = :prize"),
    @NamedQuery(name = "Winners.findByRank", query = "SELECT w FROM Winners w WHERE w.rank = :rank")})
public class Winners implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WinnersPK winnersPK;
    @Column(name = "PRIZE")
    private String prize;
    @Column(name = "RANK")
    private BigInteger rank;
    @JoinColumn(name = "COMPATITIONNUMBER", referencedColumnName = "COMPATITIONNUMBER", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Compatition compatition;
    @JoinColumn(name = "GROUPNUMBER", referencedColumnName = "GROUPNUMBER", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Pgroup pgroup;

    public Winners() {
    }

    public Winners(WinnersPK winnersPK) {
        this.winnersPK = winnersPK;
    }

    public Winners(BigInteger compatitionnumber, BigInteger groupnumber) {
        this.winnersPK = new WinnersPK(compatitionnumber, groupnumber);
    }

    public WinnersPK getWinnersPK() {
        return winnersPK;
    }

    public void setWinnersPK(WinnersPK winnersPK) {
        this.winnersPK = winnersPK;
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

    public BigInteger getRank() {
        return rank;
    }

    public void setRank(BigInteger rank) {
        this.rank = rank;
    }

    public Compatition getCompatition() {
        return compatition;
    }

    public void setCompatition(Compatition compatition) {
        this.compatition = compatition;
    }

    public Pgroup getPgroup() {
        return pgroup;
    }

    public void setPgroup(Pgroup pgroup) {
        this.pgroup = pgroup;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (winnersPK != null ? winnersPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Winners)) {
            return false;
        }
        Winners other = (Winners) object;
        if ((this.winnersPK == null && other.winnersPK != null) || (this.winnersPK != null && !this.winnersPK.equals(other.winnersPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alnayzak.Winners[ winnersPK=" + winnersPK + " ]";
    }
    
}
