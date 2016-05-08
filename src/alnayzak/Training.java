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
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ahmad Ilaiwi
 */
@Entity
@Table(name = "TRAINING")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Training.findAll", query = "SELECT t FROM Training t"),
    @NamedQuery(name = "Training.findByTrainingnumber", query = "SELECT t FROM Training t WHERE t.trainingnumber = :trainingnumber"),
    @NamedQuery(name = "Training.findByTrainingname", query = "SELECT t FROM Training t WHERE t.trainingname = :trainingname"),
    @NamedQuery(name = "Training.findByMaterial", query = "SELECT t FROM Training t WHERE t.material = :material"),
    @NamedQuery(name = "Training.findByStartdate", query = "SELECT t FROM Training t WHERE t.startdate = :startdate"),
    @NamedQuery(name = "Training.findByEnddate", query = "SELECT t FROM Training t WHERE t.enddate = :enddate"),
    @NamedQuery(name = "Training.findByHours", query = "SELECT t FROM Training t WHERE t.hours = :hours"),
    @NamedQuery(name = "Training.findByNumberofsessions", query = "SELECT t FROM Training t WHERE t.numberofsessions = :numberofsessions")})
public class Training implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "TRAININGNUMBER")
    private BigDecimal trainingnumber;
    @Column(name = "TRAININGNAME")
    private String trainingname;
    @Column(name = "MATERIAL")
    private Serializable material;
    @Column(name = "STARTDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startdate;
    @Column(name = "ENDDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date enddate;
    @Column(name = "HOURS")
    private BigInteger hours;
    @Column(name = "NUMBEROFSESSIONS")
    private BigInteger numberofsessions;
    @ManyToMany(mappedBy = "trainingCollection")
    private Collection<Dprojects> dprojectsCollection;
    @JoinTable(name = "TRAINING_GIVEN_TO", joinColumns = {
        @JoinColumn(name = "TRAININGNUMBER", referencedColumnName = "TRAININGNUMBER")}, inverseJoinColumns = {
        @JoinColumn(name = "GROUPNUMBER", referencedColumnName = "GROUPNUMBER")})
    @ManyToMany
    private Collection<Pgroup> pgroupCollection;
    @JoinColumn(name = "LOCATIONID", referencedColumnName = "LOCATIONNUMBER")
    @ManyToOne
    private Locations locationid;
    @JoinColumn(name = "TRAINERID", referencedColumnName = "PEOPLEID")
    @ManyToOne
    private People trainerid;
    @OneToMany(mappedBy = "trainingnumber")
    private Collection<Sessions> sessionsCollection;

    public Training() {
    }

    public Training(BigDecimal trainingnumber) {
        this.trainingnumber = trainingnumber;
    }

    public BigDecimal getTrainingnumber() {
        return trainingnumber;
    }

    public void setTrainingnumber(BigDecimal trainingnumber) {
        this.trainingnumber = trainingnumber;
    }

    public String getTrainingname() {
        return trainingname;
    }

    public void setTrainingname(String trainingname) {
        this.trainingname = trainingname;
    }

    public Serializable getMaterial() {
        return material;
    }

    public void setMaterial(Serializable material) {
        this.material = material;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public BigInteger getHours() {
        return hours;
    }

    public void setHours(BigInteger hours) {
        this.hours = hours;
    }

    public BigInteger getNumberofsessions() {
        return numberofsessions;
    }

    public void setNumberofsessions(BigInteger numberofsessions) {
        this.numberofsessions = numberofsessions;
    }

    @XmlTransient
    public Collection<Dprojects> getDprojectsCollection() {
        return dprojectsCollection;
    }

    public void setDprojectsCollection(Collection<Dprojects> dprojectsCollection) {
        this.dprojectsCollection = dprojectsCollection;
    }

    @XmlTransient
    public Collection<Pgroup> getPgroupCollection() {
        return pgroupCollection;
    }

    public void setPgroupCollection(Collection<Pgroup> pgroupCollection) {
        this.pgroupCollection = pgroupCollection;
    }

    public Locations getLocationid() {
        return locationid;
    }

    public void setLocationid(Locations locationid) {
        this.locationid = locationid;
    }

    public People getTrainerid() {
        return trainerid;
    }

    public void setTrainerid(People trainerid) {
        this.trainerid = trainerid;
    }

    @XmlTransient
    public Collection<Sessions> getSessionsCollection() {
        return sessionsCollection;
    }

    public void setSessionsCollection(Collection<Sessions> sessionsCollection) {
        this.sessionsCollection = sessionsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trainingnumber != null ? trainingnumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Training)) {
            return false;
        }
        Training other = (Training) object;
        if ((this.trainingnumber == null && other.trainingnumber != null) || (this.trainingnumber != null && !this.trainingnumber.equals(other.trainingnumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alnayzak.Training[ trainingnumber=" + trainingnumber + " ]";
    }
    
}
