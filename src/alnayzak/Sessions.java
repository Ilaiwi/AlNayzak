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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "SESSIONS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sessions.findAll", query = "SELECT s FROM Sessions s"),
    @NamedQuery(name = "Sessions.findBySessionnumber", query = "SELECT s FROM Sessions s WHERE s.sessionnumber = :sessionnumber"),
    @NamedQuery(name = "Sessions.findByLocationname", query = "SELECT s FROM Sessions s WHERE s.locationname = :locationname"),
    @NamedQuery(name = "Sessions.findByDates", query = "SELECT s FROM Sessions s WHERE s.dates = :dates"),
    @NamedQuery(name = "Sessions.findByDurations", query = "SELECT s FROM Sessions s WHERE s.durations = :durations")})
public class Sessions implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "SESSIONNUMBER")
    private BigDecimal sessionnumber;
    @Column(name = "LOCATIONNAME")
    private String locationname;
    @Column(name = "DATES")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dates;
    @Column(name = "DURATIONS")
    private BigInteger durations;
    @ManyToMany(mappedBy = "sessionsCollection")
    private Collection<Student> studentCollection;
    @JoinColumn(name = "LOCATIONNUMBER", referencedColumnName = "LOCATIONNUMBER")
    @ManyToOne
    private Locations locationnumber;
    @JoinColumn(name = "TRAINERID", referencedColumnName = "PEOPLEID")
    @ManyToOne
    private People trainerid;
    @JoinColumn(name = "TRAININGNUMBER", referencedColumnName = "TRAININGNUMBER")
    @ManyToOne
    private Training trainingnumber;

    public Sessions() {
    }

    public Sessions(BigDecimal sessionnumber) {
        this.sessionnumber = sessionnumber;
    }

    public BigDecimal getSessionnumber() {
        return sessionnumber;
    }

    public void setSessionnumber(BigDecimal sessionnumber) {
        this.sessionnumber = sessionnumber;
    }

    public String getLocationname() {
        return locationname;
    }

    public void setLocationname(String locationname) {
        this.locationname = locationname;
    }

    public Date getDates() {
        return dates;
    }

    public void setDates(Date dates) {
        this.dates = dates;
    }

    public BigInteger getDurations() {
        return durations;
    }

    public void setDurations(BigInteger durations) {
        this.durations = durations;
    }

    @XmlTransient
    public Collection<Student> getStudentCollection() {
        return studentCollection;
    }

    public void setStudentCollection(Collection<Student> studentCollection) {
        this.studentCollection = studentCollection;
    }

    public Locations getLocationnumber() {
        return locationnumber;
    }

    public void setLocationnumber(Locations locationnumber) {
        this.locationnumber = locationnumber;
    }

    public People getTrainerid() {
        return trainerid;
    }

    public void setTrainerid(People trainerid) {
        this.trainerid = trainerid;
    }

    public Training getTrainingnumber() {
        return trainingnumber;
    }

    public void setTrainingnumber(Training trainingnumber) {
        this.trainingnumber = trainingnumber;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sessionnumber != null ? sessionnumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sessions)) {
            return false;
        }
        Sessions other = (Sessions) object;
        if ((this.sessionnumber == null && other.sessionnumber != null) || (this.sessionnumber != null && !this.sessionnumber.equals(other.sessionnumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alnayzak.Sessions[ sessionnumber=" + sessionnumber + " ]";
    }
    
}
