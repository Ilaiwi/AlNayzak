/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alnayzak;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
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
 * @author Ahmad Ilaiwi
 */
@Entity
@Table(name = "MADE_IN_PALESTINE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MadeInPalestine.findAll", query = "SELECT m FROM MadeInPalestine m"),
    @NamedQuery(name = "MadeInPalestine.findByProjectnumber", query = "SELECT m FROM MadeInPalestine m WHERE m.projectnumber = :projectnumber"),
    @NamedQuery(name = "MadeInPalestine.findByYears", query = "SELECT m FROM MadeInPalestine m WHERE m.years = :years"),
    @NamedQuery(name = "MadeInPalestine.findByMaterial", query = "SELECT m FROM MadeInPalestine m WHERE m.material = :material")})
public class MadeInPalestine implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "PROJECTNUMBER")
    private BigDecimal projectnumber;
    @Column(name = "YEARS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date years;
    @Column(name = "MATERIAL")
    private Serializable material;
    @JoinColumn(name = "MANEGERID", referencedColumnName = "EMPLOYEEID")
    @ManyToOne
    private Employee manegerid;
    @JoinColumn(name = "PROJECTNUMBER", referencedColumnName = "PROJECTNUMBER", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Projects projects;

    public MadeInPalestine() {
    }

    public MadeInPalestine(BigDecimal projectnumber) {
        this.projectnumber = projectnumber;
    }

    public BigDecimal getProjectnumber() {
        return projectnumber;
    }

    public void setProjectnumber(BigDecimal projectnumber) {
        this.projectnumber = projectnumber;
    }

    public Date getYears() {
        return years;
    }

    public void setYears(Date years) {
        this.years = years;
    }

    public Serializable getMaterial() {
        return material;
    }

    public void setMaterial(Serializable material) {
        this.material = material;
    }

    public Employee getManegerid() {
        return manegerid;
    }

    public void setManegerid(Employee manegerid) {
        this.manegerid = manegerid;
    }

    public Projects getProjects() {
        return projects;
    }

    public void setProjects(Projects projects) {
        this.projects = projects;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (projectnumber != null ? projectnumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MadeInPalestine)) {
            return false;
        }
        MadeInPalestine other = (MadeInPalestine) object;
        if ((this.projectnumber == null && other.projectnumber != null) || (this.projectnumber != null && !this.projectnumber.equals(other.projectnumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alnayzak.MadeInPalestine[ projectnumber=" + projectnumber + " ]";
    }
    
}
