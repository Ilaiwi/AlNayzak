/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alnayzak;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "PARTTIME")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parttime.findAll", query = "SELECT p FROM Parttime p"),
    @NamedQuery(name = "Parttime.findByEmployeeid", query = "SELECT p FROM Parttime p WHERE p.employeeid = :employeeid"),
    @NamedQuery(name = "Parttime.findBySalaryperhoure", query = "SELECT p FROM Parttime p WHERE p.salaryperhoure = :salaryperhoure"),
    @NamedQuery(name = "Parttime.findByHoures", query = "SELECT p FROM Parttime p WHERE p.houres = :houres")})
public class Parttime implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "EMPLOYEEID")
    private BigDecimal employeeid;
    @Column(name = "SALARYPERHOURE")
    private BigDecimal salaryperhoure;
    @Column(name = "HOURES")
    private BigInteger houres;
    @JoinColumn(name = "EMPLOYEEID", referencedColumnName = "EMPLOYEEID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Employee employee;

    public Parttime() {
    }

    public Parttime(BigDecimal employeeid) {
        this.employeeid = employeeid;
    }

    public BigDecimal getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(BigDecimal employeeid) {
        this.employeeid = employeeid;
    }

    public BigDecimal getSalaryperhoure() {
        return salaryperhoure;
    }

    public void setSalaryperhoure(BigDecimal salaryperhoure) {
        this.salaryperhoure = salaryperhoure;
    }

    public BigInteger getHoures() {
        return houres;
    }

    public void setHoures(BigInteger houres) {
        this.houres = houres;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
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
        if (!(object instanceof Parttime)) {
            return false;
        }
        Parttime other = (Parttime) object;
        if ((this.employeeid == null && other.employeeid != null) || (this.employeeid != null && !this.employeeid.equals(other.employeeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alnayzak.Parttime[ employeeid=" + employeeid + " ]";
    }
    
}
