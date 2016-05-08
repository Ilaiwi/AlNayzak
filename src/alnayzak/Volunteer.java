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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
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
@Table(name = "VOLUNTEER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Volunteer.findAll", query = "SELECT v FROM Volunteer v"),
    @NamedQuery(name = "Volunteer.findByVolunteerid", query = "SELECT v FROM Volunteer v WHERE v.volunteerid = :volunteerid"),
    @NamedQuery(name = "Volunteer.findBySocialnumber", query = "SELECT v FROM Volunteer v WHERE v.socialnumber = :socialnumber")})
public class Volunteer implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "VOLUNTEERID")
    private BigDecimal volunteerid;
    @Column(name = "SOCIALNUMBER")
    private BigInteger socialnumber;
    @ManyToMany(mappedBy = "volunteerCollection")
    private Collection<Projects> projectsCollection;
    @OneToMany(mappedBy = "volunteerid")
    private Collection<Certifications> certificationsCollection;
    @JoinColumn(name = "VOLUNTEERID", referencedColumnName = "PEOPLEID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private People people;
    @JoinColumn(name = "PROJECTNUMBER", referencedColumnName = "PROJECTNUMBER")
    @ManyToOne
    private Projects projectnumber;

    public Volunteer() {
    }

    public Volunteer(BigDecimal volunteerid) {
        this.volunteerid = volunteerid;
    }

    public BigDecimal getVolunteerid() {
        return volunteerid;
    }

    public void setVolunteerid(BigDecimal volunteerid) {
        this.volunteerid = volunteerid;
    }

    public BigInteger getSocialnumber() {
        return socialnumber;
    }

    public void setSocialnumber(BigInteger socialnumber) {
        this.socialnumber = socialnumber;
    }

    @XmlTransient
    public Collection<Projects> getProjectsCollection() {
        return projectsCollection;
    }

    public void setProjectsCollection(Collection<Projects> projectsCollection) {
        this.projectsCollection = projectsCollection;
    }

    @XmlTransient
    public Collection<Certifications> getCertificationsCollection() {
        return certificationsCollection;
    }

    public void setCertificationsCollection(Collection<Certifications> certificationsCollection) {
        this.certificationsCollection = certificationsCollection;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
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
        hash += (volunteerid != null ? volunteerid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Volunteer)) {
            return false;
        }
        Volunteer other = (Volunteer) object;
        if ((this.volunteerid == null && other.volunteerid != null) || (this.volunteerid != null && !this.volunteerid.equals(other.volunteerid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alnayzak.Volunteer[ volunteerid=" + volunteerid + " ]";
    }
    
}
