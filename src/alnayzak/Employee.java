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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
@Table(name = "EMPLOYEE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e"),
    @NamedQuery(name = "Employee.findByEmployeeid", query = "SELECT e FROM Employee e WHERE e.employeeid = :employeeid"),
    @NamedQuery(name = "Employee.findByEducation", query = "SELECT e FROM Employee e WHERE e.education = :education"),
    @NamedQuery(name = "Employee.findByPastjob", query = "SELECT e FROM Employee e WHERE e.pastjob = :pastjob"),
    @NamedQuery(name = "Employee.findByExperience", query = "SELECT e FROM Employee e WHERE e.experience = :experience"),
    @NamedQuery(name = "Employee.findBySocialnumber", query = "SELECT e FROM Employee e WHERE e.socialnumber = :socialnumber")})
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "EMPLOYEEID")
    private BigDecimal employeeid;
    @Column(name = "EDUCATION")
    private String education;
    @Column(name = "PASTJOB")
    private String pastjob;
    @Column(name = "EXPERIENCE")
    private String experience;
    @Column(name = "SOCIALNUMBER")
    private BigInteger socialnumber;
    @ManyToMany(mappedBy = "employeeCollection")
    private Collection<Projects> projectsCollection;
    @JoinTable(name = "WORKS_ON_DPROJECT", joinColumns = {
        @JoinColumn(name = "EMPLOYEEID", referencedColumnName = "EMPLOYEEID")}, inverseJoinColumns = {
        @JoinColumn(name = "DPROJECTNUMBER", referencedColumnName = "DPROJECTNUMBER")})
    @ManyToMany
    private Collection<Dprojects> dprojectsCollection;
    @ManyToMany(mappedBy = "employeeCollection")
    private Collection<Department> departmentCollection;
    @OneToMany(mappedBy = "pSupervisour")
    private Collection<Phases> phasesCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "employee")
    private Parttime parttime;
    @OneToMany(mappedBy = "manegerid")
    private Collection<Bader> baderCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "employee")
    private Fulltime fulltime;
    @OneToMany(mappedBy = "manegerid")
    private Collection<YoungResearcher> youngResearcherCollection;
    @OneToMany(mappedBy = "manegerid")
    private Collection<MadeInPalestine> madeInPalestineCollection;
    @OneToMany(mappedBy = "employeeid")
    private Collection<Certifications> certificationsCollection;
    @JoinColumn(name = "DEPARTMENTNUMBER", referencedColumnName = "DEPARTMENTNUMBER")
    @ManyToOne
    private Department departmentnumber;
    @JoinColumn(name = "EMPLOYEEID", referencedColumnName = "PEOPLEID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private People people;
    @OneToMany(mappedBy = "departmentmaneger")
    private Collection<Department> departmentCollection1;
    @OneToMany(mappedBy = "manegerid")
    private Collection<Step> stepCollection;
    @OneToMany(mappedBy = "managernumber")
    private Collection<Dprojects> dprojectsCollection1;
    @OneToMany(mappedBy = "manegerid")
    private Collection<Office> officeCollection;

    public Employee() {
    }

    public Employee(BigDecimal employeeid) {
        this.employeeid = employeeid;
    }

    public BigDecimal getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(BigDecimal employeeid) {
        this.employeeid = employeeid;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getPastjob() {
        return pastjob;
    }

    public void setPastjob(String pastjob) {
        this.pastjob = pastjob;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
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
    public Collection<Dprojects> getDprojectsCollection() {
        return dprojectsCollection;
    }

    public void setDprojectsCollection(Collection<Dprojects> dprojectsCollection) {
        this.dprojectsCollection = dprojectsCollection;
    }

    @XmlTransient
    public Collection<Department> getDepartmentCollection() {
        return departmentCollection;
    }

    public void setDepartmentCollection(Collection<Department> departmentCollection) {
        this.departmentCollection = departmentCollection;
    }

    @XmlTransient
    public Collection<Phases> getPhasesCollection() {
        return phasesCollection;
    }

    public void setPhasesCollection(Collection<Phases> phasesCollection) {
        this.phasesCollection = phasesCollection;
    }

    public Parttime getParttime() {
        return parttime;
    }

    public void setParttime(Parttime parttime) {
        this.parttime = parttime;
    }

    @XmlTransient
    public Collection<Bader> getBaderCollection() {
        return baderCollection;
    }

    public void setBaderCollection(Collection<Bader> baderCollection) {
        this.baderCollection = baderCollection;
    }

    public Fulltime getFulltime() {
        return fulltime;
    }

    public void setFulltime(Fulltime fulltime) {
        this.fulltime = fulltime;
    }

    @XmlTransient
    public Collection<YoungResearcher> getYoungResearcherCollection() {
        return youngResearcherCollection;
    }

    public void setYoungResearcherCollection(Collection<YoungResearcher> youngResearcherCollection) {
        this.youngResearcherCollection = youngResearcherCollection;
    }

    @XmlTransient
    public Collection<MadeInPalestine> getMadeInPalestineCollection() {
        return madeInPalestineCollection;
    }

    public void setMadeInPalestineCollection(Collection<MadeInPalestine> madeInPalestineCollection) {
        this.madeInPalestineCollection = madeInPalestineCollection;
    }

    @XmlTransient
    public Collection<Certifications> getCertificationsCollection() {
        return certificationsCollection;
    }

    public void setCertificationsCollection(Collection<Certifications> certificationsCollection) {
        this.certificationsCollection = certificationsCollection;
    }

    public Department getDepartmentnumber() {
        return departmentnumber;
    }

    public void setDepartmentnumber(Department departmentnumber) {
        this.departmentnumber = departmentnumber;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    @XmlTransient
    public Collection<Department> getDepartmentCollection1() {
        return departmentCollection1;
    }

    public void setDepartmentCollection1(Collection<Department> departmentCollection1) {
        this.departmentCollection1 = departmentCollection1;
    }

    @XmlTransient
    public Collection<Step> getStepCollection() {
        return stepCollection;
    }

    public void setStepCollection(Collection<Step> stepCollection) {
        this.stepCollection = stepCollection;
    }

    @XmlTransient
    public Collection<Dprojects> getDprojectsCollection1() {
        return dprojectsCollection1;
    }

    public void setDprojectsCollection1(Collection<Dprojects> dprojectsCollection1) {
        this.dprojectsCollection1 = dprojectsCollection1;
    }

    @XmlTransient
    public Collection<Office> getOfficeCollection() {
        return officeCollection;
    }

    public void setOfficeCollection(Collection<Office> officeCollection) {
        this.officeCollection = officeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeeid != null ? employeeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.employeeid == null && other.employeeid != null) || (this.employeeid != null && !this.employeeid.equals(other.employeeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alnayzak.Employee[ employeeid=" + employeeid + " ]";
    }
    
}
