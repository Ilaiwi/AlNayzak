/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alnayzak;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ahmad Ilaiwi
 */
@Entity
@Table(name = "PHASES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Phases.findAll", query = "SELECT p FROM Phases p"),
    @NamedQuery(name = "Phases.findByPhasenumber", query = "SELECT p FROM Phases p WHERE p.phasenumber = :phasenumber"),
    @NamedQuery(name = "Phases.findByPhasename", query = "SELECT p FROM Phases p WHERE p.phasename = :phasename"),
    @NamedQuery(name = "Phases.findByYears", query = "SELECT p FROM Phases p WHERE p.years = :years")})
public class Phases implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "PHASENUMBER")
    private BigDecimal phasenumber;
    @Column(name = "PHASENAME")
    private String phasename;
    @Column(name = "YEARS")
    private BigInteger years;
    @JoinColumn(name = "P_SUPERVISOUR", referencedColumnName = "EMPLOYEEID")
    @ManyToOne
    private Employee pSupervisour;
    @JoinColumn(name = "PROJECTNUMBER", referencedColumnName = "PROJECTNUMBER")
    @ManyToOne
    private Projects projectnumber;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "phases")
    private PhaseTwo phaseTwo;
    @OneToMany(mappedBy = "phasenumber")
    private Collection<Pgroup> pgroupCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "phases")
    private PhaseOne phaseOne;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "phases")
    private PhaseThree phaseThree;

    public Phases() {
    }

    public Phases(BigDecimal phasenumber) {
        this.phasenumber = phasenumber;
    }

    public BigDecimal getPhasenumber() {
        return phasenumber;
    }

    public void setPhasenumber(BigDecimal phasenumber) {
        this.phasenumber = phasenumber;
    }

    public String getPhasename() {
        return phasename;
    }

    public void setPhasename(String phasename) {
        this.phasename = phasename;
    }

    public BigInteger getYears() {
        return years;
    }

    public void setYears(BigInteger years) {
        this.years = years;
    }

    public Employee getPSupervisour() {
        return pSupervisour;
    }

    public void setPSupervisour(Employee pSupervisour) {
        this.pSupervisour = pSupervisour;
    }

    public Projects getProjectnumber() {
        return projectnumber;
    }

    public void setProjectnumber(Projects projectnumber) {
        this.projectnumber = projectnumber;
    }

    public PhaseTwo getPhaseTwo() {
        return phaseTwo;
    }

    public void setPhaseTwo(PhaseTwo phaseTwo) {
        this.phaseTwo = phaseTwo;
    }

    @XmlTransient
    public Collection<Pgroup> getPgroupCollection() {
        return pgroupCollection;
    }

    public void setPgroupCollection(Collection<Pgroup> pgroupCollection) {
        this.pgroupCollection = pgroupCollection;
    }

    public PhaseOne getPhaseOne() {
        return phaseOne;
    }

    public void setPhaseOne(PhaseOne phaseOne) {
        this.phaseOne = phaseOne;
    }

    public PhaseThree getPhaseThree() {
        return phaseThree;
    }

    public void setPhaseThree(PhaseThree phaseThree) {
        this.phaseThree = phaseThree;
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
        if (!(object instanceof Phases)) {
            return false;
        }
        Phases other = (Phases) object;
        if ((this.phasenumber == null && other.phasenumber != null) || (this.phasenumber != null && !this.phasenumber.equals(other.phasenumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alnayzak.Phases[ phasenumber=" + phasenumber + " ]";
    }
    
}
