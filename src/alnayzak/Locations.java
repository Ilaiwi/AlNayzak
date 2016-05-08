/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alnayzak;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ahmad Ilaiwi
 */
@Entity
@Table(name = "LOCATIONS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Locations.findAll", query = "SELECT l FROM Locations l"),
    @NamedQuery(name = "Locations.findByLocationnumber", query = "SELECT l FROM Locations l WHERE l.locationnumber = :locationnumber"),
    @NamedQuery(name = "Locations.findByLocationname", query = "SELECT l FROM Locations l WHERE l.locationname = :locationname")})
public class Locations implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "LOCATIONNUMBER")
    private BigDecimal locationnumber;
    @Column(name = "LOCATIONNAME")
    private String locationname;
    @OneToMany(mappedBy = "locationnumber")
    private Collection<Pgroup> pgroupCollection;
    @OneToMany(mappedBy = "locationid")
    private Collection<Training> trainingCollection;
    @OneToMany(mappedBy = "locationnumber")
    private Collection<Office> officeCollection;
    @OneToMany(mappedBy = "locationnumber")
    private Collection<Sessions> sessionsCollection;

    public Locations() {
    }

    public Locations(BigDecimal locationnumber) {
        this.locationnumber = locationnumber;
    }

    public BigDecimal getLocationnumber() {
        return locationnumber;
    }

    public void setLocationnumber(BigDecimal locationnumber) {
        this.locationnumber = locationnumber;
    }

    public String getLocationname() {
        return locationname;
    }

    public void setLocationname(String locationname) {
        this.locationname = locationname;
    }

    @XmlTransient
    public Collection<Pgroup> getPgroupCollection() {
        return pgroupCollection;
    }

    public void setPgroupCollection(Collection<Pgroup> pgroupCollection) {
        this.pgroupCollection = pgroupCollection;
    }

    @XmlTransient
    public Collection<Training> getTrainingCollection() {
        return trainingCollection;
    }

    public void setTrainingCollection(Collection<Training> trainingCollection) {
        this.trainingCollection = trainingCollection;
    }

    @XmlTransient
    public Collection<Office> getOfficeCollection() {
        return officeCollection;
    }

    public void setOfficeCollection(Collection<Office> officeCollection) {
        this.officeCollection = officeCollection;
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
        hash += (locationnumber != null ? locationnumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Locations)) {
            return false;
        }
        Locations other = (Locations) object;
        if ((this.locationnumber == null && other.locationnumber != null) || (this.locationnumber != null && !this.locationnumber.equals(other.locationnumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alnayzak.Locations[ locationnumber=" + locationnumber + " ]";
    }
    
}
