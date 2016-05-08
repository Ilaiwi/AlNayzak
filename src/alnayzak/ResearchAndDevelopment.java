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
@Table(name = "RESEARCH_AND_DEVELOPMENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ResearchAndDevelopment.findAll", query = "SELECT r FROM ResearchAndDevelopment r"),
    @NamedQuery(name = "ResearchAndDevelopment.findByDepartmentnumber", query = "SELECT r FROM ResearchAndDevelopment r WHERE r.departmentnumber = :departmentnumber")})
public class ResearchAndDevelopment implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "DEPARTMENTNUMBER")
    private BigDecimal departmentnumber;
    @JoinColumn(name = "DEPARTMENTNUMBER", referencedColumnName = "DEPARTMENTNUMBER", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Department department;

    public ResearchAndDevelopment() {
    }

    public ResearchAndDevelopment(BigDecimal departmentnumber) {
        this.departmentnumber = departmentnumber;
    }

    public BigDecimal getDepartmentnumber() {
        return departmentnumber;
    }

    public void setDepartmentnumber(BigDecimal departmentnumber) {
        this.departmentnumber = departmentnumber;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (departmentnumber != null ? departmentnumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ResearchAndDevelopment)) {
            return false;
        }
        ResearchAndDevelopment other = (ResearchAndDevelopment) object;
        if ((this.departmentnumber == null && other.departmentnumber != null) || (this.departmentnumber != null && !this.departmentnumber.equals(other.departmentnumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alnayzak.ResearchAndDevelopment[ departmentnumber=" + departmentnumber + " ]";
    }
    
}
