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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
@Table(name = "OFFICE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Office.findAll", query = "SELECT o FROM Office o"),
    @NamedQuery(name = "Office.findByOfficenumber", query = "SELECT o FROM Office o WHERE o.officenumber = :officenumber"),
    @NamedQuery(name = "Office.findByOfficename", query = "SELECT o FROM Office o WHERE o.officename = :officename")})
public class Office implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "OFFICENUMBER")
    private BigDecimal officenumber;
    @Column(name = "OFFICENAME")
    private String officename;
    @ManyToMany(mappedBy = "officeCollection")
    private Collection<Tool> toolCollection;
    @ManyToMany(mappedBy = "officeCollection")
    private Collection<Projects> projectsCollection;
    @JoinColumn(name = "MANEGERID", referencedColumnName = "EMPLOYEEID")
    @ManyToOne
    private Employee manegerid;
    @JoinColumn(name = "LOCATIONNUMBER", referencedColumnName = "LOCATIONNUMBER")
    @ManyToOne
    private Locations locationnumber;
    @OneToMany(mappedBy = "officenumber")
    private Collection<Tool> toolCollection1;

    public Office() {
    }

    public Office(BigDecimal officenumber) {
        this.officenumber = officenumber;
    }

    public BigDecimal getOfficenumber() {
        return officenumber;
    }

    public void setOfficenumber(BigDecimal officenumber) {
        this.officenumber = officenumber;
    }

    public String getOfficename() {
        return officename;
    }

    public void setOfficename(String officename) {
        this.officename = officename;
    }

    @XmlTransient
    public Collection<Tool> getToolCollection() {
        return toolCollection;
    }

    public void setToolCollection(Collection<Tool> toolCollection) {
        this.toolCollection = toolCollection;
    }

    @XmlTransient
    public Collection<Projects> getProjectsCollection() {
        return projectsCollection;
    }

    public void setProjectsCollection(Collection<Projects> projectsCollection) {
        this.projectsCollection = projectsCollection;
    }

    public Employee getManegerid() {
        return manegerid;
    }

    public void setManegerid(Employee manegerid) {
        this.manegerid = manegerid;
    }

    public Locations getLocationnumber() {
        return locationnumber;
    }

    public void setLocationnumber(Locations locationnumber) {
        this.locationnumber = locationnumber;
    }

    @XmlTransient
    public Collection<Tool> getToolCollection1() {
        return toolCollection1;
    }

    public void setToolCollection1(Collection<Tool> toolCollection1) {
        this.toolCollection1 = toolCollection1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (officenumber != null ? officenumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Office)) {
            return false;
        }
        Office other = (Office) object;
        if ((this.officenumber == null && other.officenumber != null) || (this.officenumber != null && !this.officenumber.equals(other.officenumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alnayzak.Office[ officenumber=" + officenumber + " ]";
    }
    
}
