/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alnayzak;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author BaRa' DwEiKaT
 */
@Entity
@Table(name = "COMPATITION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Compatition.findAll", query = "SELECT c FROM Compatition c"),
    @NamedQuery(name = "Compatition.findByCompatitionnumber", query = "SELECT c FROM Compatition c WHERE c.compatitionnumber = :compatitionnumber"),
    @NamedQuery(name = "Compatition.findByEventdate", query = "SELECT c FROM Compatition c WHERE c.eventdate = :eventdate")})
public class Compatition implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "compatition")
    private Collection<Winners> winnersCollection;
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "COMPATITIONNUMBER")
    private BigDecimal compatitionnumber;
    @Column(name = "EVENTDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date eventdate;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "compatition")
    private CompatitionLocation compatitionLocation;
    @JoinColumn(name = "PROJECTNUMBER", referencedColumnName = "PROJECTNUMBER")
    @ManyToOne
    private Projects projectnumber;

    public Compatition() {
    }

    public Compatition(BigDecimal compatitionnumber) {
        this.compatitionnumber = compatitionnumber;
    }

    public BigDecimal getCompatitionnumber() {
        return compatitionnumber;
    }

    public void setCompatitionnumber(BigDecimal compatitionnumber) {
        this.compatitionnumber = compatitionnumber;
    }

    public Date getEventdate() {
        return eventdate;
    }

    public void setEventdate(Date eventdate) {
        this.eventdate = eventdate;
    }

    public CompatitionLocation getCompatitionLocation() {
        return compatitionLocation;
    }

    public void setCompatitionLocation(CompatitionLocation compatitionLocation) {
        this.compatitionLocation = compatitionLocation;
    }

    public Projects getProjectnumber() {
        return projectnumber;
    }

    public void setProjectnumber(Projects projectnumber) {
        this.projectnumber = projectnumber;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (compatitionnumber != null ? compatitionnumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compatition)) {
            return false;
        }
        Compatition other = (Compatition) object;
        if ((this.compatitionnumber == null && other.compatitionnumber != null) || (this.compatitionnumber != null && !this.compatitionnumber.equals(other.compatitionnumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alnayzak.Compatition[ compatitionnumber=" + compatitionnumber + " ]";
    }

    @XmlTransient
    public Collection<Winners> getWinnersCollection() {
        return winnersCollection;
    }

    public void setWinnersCollection(Collection<Winners> winnersCollection) {
        this.winnersCollection = winnersCollection;
    }
    
}
