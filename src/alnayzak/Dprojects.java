/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alnayzak;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ahmad Ilaiwi
 */
@Entity
@Table(name = "DPROJECTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dprojects.findAll", query = "SELECT d FROM Dprojects d"),
    @NamedQuery(name = "Dprojects.findByDprojectnumber", query = "SELECT d FROM Dprojects d WHERE d.dprojectnumber = :dprojectnumber"),
    @NamedQuery(name = "Dprojects.findByDprojectname", query = "SELECT d FROM Dprojects d WHERE d.dprojectname = :dprojectname"),
    @NamedQuery(name = "Dprojects.findByStartdate", query = "SELECT d FROM Dprojects d WHERE d.startdate = :startdate"),
    @NamedQuery(name = "Dprojects.findByEnddate", query = "SELECT d FROM Dprojects d WHERE d.enddate = :enddate"),
    @NamedQuery(name = "Dprojects.findByResults", query = "SELECT d FROM Dprojects d WHERE d.results = :results")})
public class Dprojects implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "DPROJECTNUMBER")
    private BigDecimal dprojectnumber;
    @Column(name = "DPROJECTNAME")
    private String dprojectname;
    @Column(name = "STARTDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startdate;
    @Column(name = "ENDDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date enddate;
    @Column(name = "RESULTS")
    private String results;
    @ManyToMany(mappedBy = "dprojectsCollection")
    private Collection<Employee> employeeCollection;
    @JoinTable(name = "GIVEN_TO_DPROJECT", joinColumns = {
        @JoinColumn(name = "DPROJECTNUMBER", referencedColumnName = "DPROJECTNUMBER")}, inverseJoinColumns = {
        @JoinColumn(name = "TRAININGNUMBER", referencedColumnName = "TRAININGNUMBER")})
    @ManyToMany
    private Collection<Training> trainingCollection;
    @JoinColumn(name = "DEPARTMENTNUMBER", referencedColumnName = "DEPARTMENTNUMBER")
    @ManyToOne
    private Department departmentnumber;
    @JoinColumn(name = "MANAGERNUMBER", referencedColumnName = "EMPLOYEEID")
    @ManyToOne
    private Employee managernumber;

    public Dprojects() {
    }

    public Dprojects(BigDecimal dprojectnumber) {
        this.dprojectnumber = dprojectnumber;
    }

    public BigDecimal getDprojectnumber() {
        return dprojectnumber;
    }

    public void setDprojectnumber(BigDecimal dprojectnumber) {
        this.dprojectnumber = dprojectnumber;
    }

    public String getDprojectname() {
        return dprojectname;
    }

    public void setDprojectname(String dprojectname) {
        this.dprojectname = dprojectname;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    @XmlTransient
    public Collection<Employee> getEmployeeCollection() {
        return employeeCollection;
    }

    public void setEmployeeCollection(Collection<Employee> employeeCollection) {
        this.employeeCollection = employeeCollection;
    }

    @XmlTransient
    public Collection<Training> getTrainingCollection() {
        return trainingCollection;
    }

    public void setTrainingCollection(Collection<Training> trainingCollection) {
        this.trainingCollection = trainingCollection;
    }

    public Department getDepartmentnumber() {
        return departmentnumber;
    }

    public void setDepartmentnumber(Department departmentnumber) {
        this.departmentnumber = departmentnumber;
    }

    public Employee getManagernumber() {
        return managernumber;
    }

    public void setManagernumber(Employee managernumber) {
        this.managernumber = managernumber;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dprojectnumber != null ? dprojectnumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dprojects)) {
            return false;
        }
        Dprojects other = (Dprojects) object;
        if ((this.dprojectnumber == null && other.dprojectnumber != null) || (this.dprojectnumber != null && !this.dprojectnumber.equals(other.dprojectnumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alnayzak.Dprojects[ dprojectnumber=" + dprojectnumber + " ]";
    }
    
}
