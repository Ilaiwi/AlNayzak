/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alnayzak;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Ahmad Ilaiwi
 */
@Embeddable
public class SchoolHasAPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SCHOOLNUMBER")
    private BigInteger schoolnumber;
    @Basic(optional = false)
    @Column(name = "GROUPNUMBER")
    private BigInteger groupnumber;

    public SchoolHasAPK() {
    }

    public SchoolHasAPK(BigInteger schoolnumber, BigInteger groupnumber) {
        this.schoolnumber = schoolnumber;
        this.groupnumber = groupnumber;
    }

    public BigInteger getSchoolnumber() {
        return schoolnumber;
    }

    public void setSchoolnumber(BigInteger schoolnumber) {
        this.schoolnumber = schoolnumber;
    }

    public BigInteger getGroupnumber() {
        return groupnumber;
    }

    public void setGroupnumber(BigInteger groupnumber) {
        this.groupnumber = groupnumber;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (schoolnumber != null ? schoolnumber.hashCode() : 0);
        hash += (groupnumber != null ? groupnumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SchoolHasAPK)) {
            return false;
        }
        SchoolHasAPK other = (SchoolHasAPK) object;
        if ((this.schoolnumber == null && other.schoolnumber != null) || (this.schoolnumber != null && !this.schoolnumber.equals(other.schoolnumber))) {
            return false;
        }
        if ((this.groupnumber == null && other.groupnumber != null) || (this.groupnumber != null && !this.groupnumber.equals(other.groupnumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alnayzak.SchoolHasAPK[ schoolnumber=" + schoolnumber + ", groupnumber=" + groupnumber + " ]";
    }
    
}
