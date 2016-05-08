/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alnayzak;

import java.io.Serializable;
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
 * @author BaRa' DwEiKaT
 */
@Entity
@Table(name = "DEGREES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Degrees.findAll", query = "SELECT d FROM Degrees d"),
    @NamedQuery(name = "Degrees.findByCertificationsname", query = "SELECT d FROM Degrees d WHERE d.certificationsname = :certificationsname"),
    @NamedQuery(name = "Degrees.findByPhpMaster", query = "SELECT d FROM Degrees d WHERE d.phpMaster = :phpMaster"),
    @NamedQuery(name = "Degrees.findBySchooldegree", query = "SELECT d FROM Degrees d WHERE d.schooldegree = :schooldegree"),
    @NamedQuery(name = "Degrees.findByCollegedegree", query = "SELECT d FROM Degrees d WHERE d.collegedegree = :collegedegree")})
public class Degrees implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CERTIFICATIONSNAME")
    private String certificationsname;
    @Column(name = "PHP_MASTER")
    private String phpMaster;
    @Column(name = "SCHOOLDEGREE")
    private String schooldegree;
    @Column(name = "COLLEGEDEGREE")
    private String collegedegree;
    @JoinColumn(name = "CERTIFICATIONSNAME", referencedColumnName = "CERTIFICATIONSNAME", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Certifications certifications;

    public Degrees() {
    }

    public Degrees(String certificationsname) {
        this.certificationsname = certificationsname;
    }

    public String getCertificationsname() {
        return certificationsname;
    }

    public void setCertificationsname(String certificationsname) {
        this.certificationsname = certificationsname;
    }

    public String getPhpMaster() {
        return phpMaster;
    }

    public void setPhpMaster(String phpMaster) {
        this.phpMaster = phpMaster;
    }

    public String getSchooldegree() {
        return schooldegree;
    }

    public void setSchooldegree(String schooldegree) {
        this.schooldegree = schooldegree;
    }

    public String getCollegedegree() {
        return collegedegree;
    }

    public void setCollegedegree(String collegedegree) {
        this.collegedegree = collegedegree;
    }

    public Certifications getCertifications() {
        return certifications;
    }

    public void setCertifications(Certifications certifications) {
        this.certifications = certifications;
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
        if (!(object instanceof Degrees)) {
            return false;
        }
        Degrees other = (Degrees) object;
        if ((this.certificationsname == null && other.certificationsname != null) || (this.certificationsname != null && !this.certificationsname.equals(other.certificationsname))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alnayzak.Degrees[ certificationsname=" + certificationsname + " ]";
    }
    
}
