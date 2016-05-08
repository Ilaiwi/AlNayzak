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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ahmad Ilaiwi
 */
@Entity
@Table(name = "SCHOOL_HAS_A")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SchoolHasA.findAll", query = "SELECT s FROM SchoolHasA s"),
    @NamedQuery(name = "SchoolHasA.findBySchoolnumber", query = "SELECT s FROM SchoolHasA s WHERE s.schoolHasAPK.schoolnumber = :schoolnumber"),
    @NamedQuery(name = "SchoolHasA.findByGroupnumber", query = "SELECT s FROM SchoolHasA s WHERE s.schoolHasAPK.groupnumber = :groupnumber"),
    @NamedQuery(name = "SchoolHasA.findByClass1", query = "SELECT s FROM SchoolHasA s WHERE s.class1 = :class1")})
public class SchoolHasA implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SchoolHasAPK schoolHasAPK;
    @Column(name = "CLASS")
    private String class1;

    public SchoolHasA() {
    }

    public SchoolHasA(SchoolHasAPK schoolHasAPK) {
        this.schoolHasAPK = schoolHasAPK;
    }

    public SchoolHasA(BigInteger schoolnumber, BigInteger groupnumber) {
        this.schoolHasAPK = new SchoolHasAPK(schoolnumber, groupnumber);
    }

    public SchoolHasAPK getSchoolHasAPK() {
        return schoolHasAPK;
    }

    public void setSchoolHasAPK(SchoolHasAPK schoolHasAPK) {
        this.schoolHasAPK = schoolHasAPK;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (schoolHasAPK != null ? schoolHasAPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SchoolHasA)) {
            return false;
        }
        SchoolHasA other = (SchoolHasA) object;
        if ((this.schoolHasAPK == null && other.schoolHasAPK != null) || (this.schoolHasAPK != null && !this.schoolHasAPK.equals(other.schoolHasAPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alnayzak.SchoolHasA[ schoolHasAPK=" + schoolHasAPK + " ]";
    }
    
}
