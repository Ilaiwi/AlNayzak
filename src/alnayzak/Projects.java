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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "PROJECTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Projects.findAll", query = "SELECT p FROM Projects p"),
    @NamedQuery(name = "Projects.findByProjectnumber", query = "SELECT p FROM Projects p WHERE p.projectnumber = :projectnumber"),
    @NamedQuery(name = "Projects.findByProjectname", query = "SELECT p FROM Projects p WHERE p.projectname = :projectname")})
public class Projects implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "PROJECTNUMBER")
    private BigDecimal projectnumber;
    @Column(name = "PROJECTNAME")
    private String projectname;
    @JoinTable(name = "EMPLOYEE_WORKS_ON", joinColumns = {
        @JoinColumn(name = "PROJECTNUMBER", referencedColumnName = "PROJECTNUMBER")}, inverseJoinColumns = {
        @JoinColumn(name = "EMPLOYEEID", referencedColumnName = "EMPLOYEEID")})
    @ManyToMany
    private Collection<Employee> employeeCollection;
    @JoinTable(name = "VOLUNTEERS_AT", joinColumns = {
        @JoinColumn(name = "PROJECTNUMBER", referencedColumnName = "PROJECTNUMBER")}, inverseJoinColumns = {
        @JoinColumn(name = "VOLUNTEERID", referencedColumnName = "VOLUNTEERID")})
    @ManyToMany
    private Collection<Volunteer> volunteerCollection;
    @JoinTable(name = "OFFICE_SUPERVISE_PROJECT", joinColumns = {
        @JoinColumn(name = "PROJECTNUMBER", referencedColumnName = "PROJECTNUMBER")}, inverseJoinColumns = {
        @JoinColumn(name = "OFFICENUMBER", referencedColumnName = "OFFICENUMBER")})
    @ManyToMany
    private Collection<Office> officeCollection;
    @OneToMany(mappedBy = "projectnumber")
    private Collection<Phases> phasesCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "projects")
    private Bader bader;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "projects")
    private YoungResearcher youngResearcher;
    @OneToMany(mappedBy = "projectnumber")
    private Collection<Pgroup> pgroupCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "projects")
    private MadeInPalestine madeInPalestine;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "projects")
    private Step step;
    @OneToMany(mappedBy = "projectnumber")
    private Collection<Compatition> compatitionCollection;
    @OneToMany(mappedBy = "projectnumber")
    private Collection<Volunteer> volunteerCollection1;

    public Projects() {
    }

    public Projects(BigDecimal projectnumber) {
        this.projectnumber = projectnumber;
    }

    public BigDecimal getProjectnumber() {
        return projectnumber;
    }

    public void setProjectnumber(BigDecimal projectnumber) {
        this.projectnumber = projectnumber;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    @XmlTransient
    public Collection<Employee> getEmployeeCollection() {
        return employeeCollection;
    }

    public void setEmployeeCollection(Collection<Employee> employeeCollection) {
        this.employeeCollection = employeeCollection;
    }

    @XmlTransient
    public Collection<Volunteer> getVolunteerCollection() {
        return volunteerCollection;
    }

    public void setVolunteerCollection(Collection<Volunteer> volunteerCollection) {
        this.volunteerCollection = volunteerCollection;
    }

    @XmlTransient
    public Collection<Office> getOfficeCollection() {
        return officeCollection;
    }

    public void setOfficeCollection(Collection<Office> officeCollection) {
        this.officeCollection = officeCollection;
    }

    @XmlTransient
    public Collection<Phases> getPhasesCollection() {
        return phasesCollection;
    }

    public void setPhasesCollection(Collection<Phases> phasesCollection) {
        this.phasesCollection = phasesCollection;
    }

    public Bader getBader() {
        return bader;
    }

    public void setBader(Bader bader) {
        this.bader = bader;
    }

    public YoungResearcher getYoungResearcher() {
        return youngResearcher;
    }

    public void setYoungResearcher(YoungResearcher youngResearcher) {
        this.youngResearcher = youngResearcher;
    }

    @XmlTransient
    public Collection<Pgroup> getPgroupCollection() {
        return pgroupCollection;
    }

    public void setPgroupCollection(Collection<Pgroup> pgroupCollection) {
        this.pgroupCollection = pgroupCollection;
    }

    public MadeInPalestine getMadeInPalestine() {
        return madeInPalestine;
    }

    public void setMadeInPalestine(MadeInPalestine madeInPalestine) {
        this.madeInPalestine = madeInPalestine;
    }

    public Step getStep() {
        return step;
    }

    public void setStep(Step step) {
        this.step = step;
    }

    @XmlTransient
    public Collection<Compatition> getCompatitionCollection() {
        return compatitionCollection;
    }

    public void setCompatitionCollection(Collection<Compatition> compatitionCollection) {
        this.compatitionCollection = compatitionCollection;
    }

    @XmlTransient
    public Collection<Volunteer> getVolunteerCollection1() {
        return volunteerCollection1;
    }

    public void setVolunteerCollection1(Collection<Volunteer> volunteerCollection1) {
        this.volunteerCollection1 = volunteerCollection1;
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
        if (!(object instanceof Projects)) {
            return false;
        }
        Projects other = (Projects) object;
        if ((this.projectnumber == null && other.projectnumber != null) || (this.projectnumber != null && !this.projectnumber.equals(other.projectnumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alnayzak.Projects[ projectnumber=" + projectnumber + " ]";
    }
    
}
