/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alnayzak;

import java.io.Serializable;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author BaRa' DwEiKaT
 */
@Entity
@Table(name = "CERTIFICATIONS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Certifications.findAll", query = "SELECT c FROM Certifications c"),
    @NamedQuery(name = "Certifications.findByCertificationsname", query = "SELECT c FROM Certifications c WHERE c.certificationsname = :certificationsname"),
    @NamedQuery(name = "Certifications.findByMajor", query = "SELECT c FROM Certifications c WHERE c.major = :major"),
    @NamedQuery(name = "Certifications.findByUniversity", query = "SELECT c FROM Certifications c WHERE c.university = :university"),
    @NamedQuery(name = "Certifications.findByTrainingfrom", query = "SELECT c FROM Certifications c WHERE c.trainingfrom = :trainingfrom"),
    @NamedQuery(name = "Certifications.findByTrainingname", query = "SELECT c FROM Certifications c WHERE c.trainingname = :trainingname"),
    @NamedQuery(name = "Certifications.findByTrainingyear", query = "SELECT c FROM Certifications c WHERE c.trainingyear = :trainingyear"),
    @NamedQuery(name = "Certifications.findByGraduateyear", query = "SELECT c FROM Certifications c WHERE c.graduateyear = :graduateyear")})
public class Certifications implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CERTIFICATIONSNAME")
    private String certificationsname;
    @Column(name = "MAJOR")
    private String major;
    @Column(name = "UNIVERSITY")
    private String university;
    @Column(name = "TRAININGFROM")
    private String trainingfrom;
    @Column(name = "TRAININGNAME")
    private String trainingname;
    @Column(name = "TRAININGYEAR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date trainingyear;
    @Column(name = "GRADUATEYEAR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date graduateyear;
    @JoinColumn(name = "EMPLOYEEID", referencedColumnName = "EMPLOYEEID")
    @ManyToOne
    private Employee employeeid;
    @JoinColumn(name = "VOLUNTEERID", referencedColumnName = "VOLUNTEERID")
    @ManyToOne
    private Volunteer volunteerid;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "certifications")
    private Degrees degrees;

    public Certifications() {
    }

    public Certifications(String certificationsname) {
        this.certificationsname = certificationsname;
    }

    public String getCertificationsname() {
        return certificationsname;
    }

    public void setCertificationsname(String certificationsname) {
        this.certificationsname = certificationsname;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getTrainingfrom() {
        return trainingfrom;
    }

    public void setTrainingfrom(String trainingfrom) {
        this.trainingfrom = trainingfrom;
    }

    public String getTrainingname() {
        return trainingname;
    }

    public void setTrainingname(String trainingname) {
        this.trainingname = trainingname;
    }

    public Date getTrainingyear() {
        return trainingyear;
    }

    public void setTrainingyear(Date trainingyear) {
        this.trainingyear = trainingyear;
    }

    public Date getGraduateyear() {
        return graduateyear;
    }

    public void setGraduateyear(Date graduateyear) {
        this.graduateyear = graduateyear;
    }

    public Employee getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Employee employeeid) {
        this.employeeid = employeeid;
    }

    public Volunteer getVolunteerid() {
        return volunteerid;
    }

    public void setVolunteerid(Volunteer volunteerid) {
        this.volunteerid = volunteerid;
    }

    public Degrees getDegrees() {
        return degrees;
    }

    public void setDegrees(Degrees degrees) {
        this.degrees = degrees;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (certificationsname != null ? certificationsname.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Certifications)) {
            return false;
        }
        Certifications other = (Certifications) object;
        if ((this.certificationsname == null && other.certificationsname != null) || (this.certificationsname != null && !this.certificationsname.equals(other.certificationsname))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alnayzak.Certifications[ certificationsname=" + certificationsname + " ]";
    }
    
}
