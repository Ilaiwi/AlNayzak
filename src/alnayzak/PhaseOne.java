/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alnayzak;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ahmad Ilaiwi
 */
@Entity
@Table(name = "PHASE_ONE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PhaseOne.findAll", query = "SELECT p FROM PhaseOne p"),
    @NamedQuery(name = "PhaseOne.findByPhasenumber", query = "SELECT p FROM PhaseOne p WHERE p.phasenumber = :phasenumber")})
public class PhaseOne implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "PHASENUMBER")
    private BigDecimal phasenumber;
    @JoinColumn(name = "PHASENUMBER", referencedColumnName = "PHASENUMBER", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Phases phases;

    public PhaseOne() {
    }

    public PhaseOne(BigDecimal phasenumber) {
        this.phasenumber = phasenumber;
    }

    public BigDecimal getPhasenumber() {
        return phasenumber;
    }

    public void setPhasenumber(BigDecimal phasenumber) {
        this.phasenumber = phasenumber;
    }

    public Phases getPhases() {
        return phases;
    }

    public void setPhases(Phases phases) {
        this.phases = phases;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (phasenumber != null ? phasenumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PhaseOne)) {
            return false;
        }
        PhaseOne other = (PhaseOne) object;
        if ((this.phasenumber == null && other.phasenumber != null) || (this.phasenumber != null && !this.phasenumber.equals(other.phasenumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alnayzak.PhaseOne[ phasenumber=" + phasenumber + " ]";
    }
    
}
