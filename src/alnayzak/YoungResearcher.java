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
import javax.persistence.ManyToOne;
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
@Table(name = "YOUNG_RESEARCHER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "YoungResearcher.findAll", query = "SELECT y FROM YoungResearcher y"),
    @NamedQuery(name = "YoungResearcher.findByProjectnumber", query = "SELECT y FROM YoungResearcher y WHERE y.projectnumber = :projectnumber"),
    @NamedQuery(name = "YoungResearcher.findByYoungyear", query = "SELECT y FROM YoungResearcher y WHERE y.youngyear = :youngyear")})
public class YoungResearcher implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "PROJECTNUMBER")
    private BigDecimal projectnumber;
    @Column(name = "YOUNGYEAR")
    private BigInteger youngyear;
    @JoinColumn(name = "MANEGERID", referencedColumnName = "EMPLOYEEID")
    @ManyToOne
    private Employee manegerid;
    @JoinColumn(name = "PROJECTNUMBER", referencedColumnName = "PROJECTNUMBER", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Projects projects;

    public YoungResearcher() {
    }

    public YoungResearcher(BigDecimal projectnumber) {
        this.projectnumber = projectnumber;
    }

    public BigDecimal getProjectnumber() {
        return projectnumber;
    }

    public void setProjectnumber(BigDecimal projectnumber) {
        this.projectnumber = projectnumber;
    }

    public BigInteger getYoungyear() {
        return youngyear;
    }

    public void setYoungyear(BigInteger youngyear) {
        this.youngyear = youngyear;
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
        if (!(object instanceof YoungResearcher)) {
            return false;
        }
        YoungResearcher other = (YoungResearcher) object;
        if ((this.projectnumber == null && other.projectnumber != null) || (this.projectnumber != null && !this.projectnumber.equals(other.projectnumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alnayzak.YoungResearcher[ projectnumber=" + projectnumber + " ]";
    }
    
}
