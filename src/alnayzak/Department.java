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
@Table(name = "DEPARTMENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Department.findAll", query = "SELECT d FROM Department d"),
    @NamedQuery(name = "Department.findByDepartmentnumber", query = "SELECT d FROM Department d WHERE d.departmentnumber = :departmentnumber"),
    @NamedQuery(name = "Department.findByDepartnentname", query = "SELECT d FROM Department d WHERE d.departnentname = :departnentname")})
public class Department implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "DEPARTMENTNUMBER")
    private BigDecimal departmentnumber;
    @Column(name = "DEPARTNENTNAME")
    private String departnentname;
    @JoinTable(name = "EMPLOYEE_BELONGS_TO", joinColumns = {
        @JoinColumn(name = "DEPARTMENTNUMBER", referencedColumnName = "DEPARTMENTNUMBER")}, inverseJoinColumns = {
        @JoinColumn(name = "EMPLOYEEID", referencedColumnName = "EMPLOYEEID")})
    @ManyToMany
    private Collection<Employee> employeeCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "department")
    private ResearchAndDevelopment researchAndDevelopment;
    @OneToMany(mappedBy = "departmentnumber")
    private Collection<Employee> employeeCollection1;
    @JoinColumn(name = "DEPARTMENTMANEGER", referencedColumnName = "EMPLOYEEID")
    @ManyToOne
    private Employee departmentmaneger;
    @OneToMany(mappedBy = "departmentnumber")
    private Collection<Dprojects> dprojectsCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "department")
    private Projectdepartment projectdepartment;

    public Department() {
    }

    public Department(BigDecimal departmentnumber) {
        this.departmentnumber = departmentnumber;
    }

    public BigDecimal getDepartmentnumber() {
        return departmentnumber;
    }

    public void setDepartmentnumber(BigDecimal departmentnumber) {
        this.departmentnumber = departmentnumber;
    }

    public String getDepartnentname() {
        return departnentname;
    }

    public void setDepartnentname(String departnentname) {
        this.departnentname = departnentname;
    }

    @XmlTransient
    public Collection<Employee> getEmployeeCollection() {
        return employeeCollection;
    }

    public void setEmployeeCollection(Collection<Employee> employeeCollection) {
        this.employeeCollection = employeeCollection;
    }

    public ResearchAndDevelopment getResearchAndDevelopment() {
        return researchAndDevelopment;
    }

    public void setResearchAndDevelopment(ResearchAndDevelopment researchAndDevelopment) {
        this.researchAndDevelopment = researchAndDevelopment;
    }

    @XmlTransient
    public Collection<Employee> getEmployeeCollection1() {
        return employeeCollection1;
    }

    public void setEmployeeCollection1(Collection<Employee> employeeCollection1) {
        this.employeeCollection1 = employeeCollection1;
    }

    public Employee getDepartmentmaneger() {
        return departmentmaneger;
    }

    public void setDepartmentmaneger(Employee departmentmaneger) {
        this.departmentmaneger = departmentmaneger;
    }

    @XmlTransient
    public Collection<Dprojects> getDprojectsCollection() {
        return dprojectsCollection;
    }

    public void setDprojectsCollection(Collection<Dprojects> dprojectsCollection) {
        this.dprojectsCollection = dprojectsCollection;
    }

    public Projectdepartment getProjectdepartment() {
        return projectdepartment;
    }

    public void setProjectdepartment(Projectdepartment projectdepartment) {
        this.projectdepartment = projectdepartment;
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
        if (!(object instanceof Department)) {
            return false;
        }
        Department other = (Department) object;
        if ((this.departmentnumber == null && other.departmentnumber != null) || (this.departmentnumber != null && !this.departmentnumber.equals(other.departmentnumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alnayzak.Department[ departmentnumber=" + departmentnumber + " ]";
    }
    
}
