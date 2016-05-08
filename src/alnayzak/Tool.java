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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ahmad Ilaiwi
 */
@Entity
@Table(name = "TOOL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tool.findAll", query = "SELECT t FROM Tool t"),
    @NamedQuery(name = "Tool.findByToolsn", query = "SELECT t FROM Tool t WHERE t.toolsn = :toolsn"),
    @NamedQuery(name = "Tool.findByToolname", query = "SELECT t FROM Tool t WHERE t.toolname = :toolname"),
    @NamedQuery(name = "Tool.findByQuantity", query = "SELECT t FROM Tool t WHERE t.quantity = :quantity"),
    @NamedQuery(name = "Tool.findByPrice", query = "SELECT t FROM Tool t WHERE t.price = :price"),
    @NamedQuery(name = "Tool.findByBoughtfrom", query = "SELECT t FROM Tool t WHERE t.boughtfrom = :boughtfrom")})
public class Tool implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "TOOLSN")
    private BigDecimal toolsn;
    @Column(name = "TOOLNAME")
    private String toolname;
    @Column(name = "QUANTITY")
    private BigInteger quantity;
    @Column(name = "PRICE")
    private BigInteger price;
    @Column(name = "BOUGHTFROM")
    private String boughtfrom;
    @JoinTable(name = "OFFICE_NEEDS", joinColumns = {
        @JoinColumn(name = "TOOLSN", referencedColumnName = "TOOLSN")}, inverseJoinColumns = {
        @JoinColumn(name = "OFFICENUMBER", referencedColumnName = "OFFICENUMBER")})
    @ManyToMany
    private Collection<Office> officeCollection;
    @ManyToMany(mappedBy = "toolCollection")
    private Collection<Pgroup> pgroupCollection;
    @JoinColumn(name = "OFFICENUMBER", referencedColumnName = "OFFICENUMBER")
    @ManyToOne
    private Office officenumber;

    public Tool() {
    }

    public Tool(BigDecimal toolsn) {
        this.toolsn = toolsn;
    }

    public BigDecimal getToolsn() {
        return toolsn;
    }

    public void setToolsn(BigDecimal toolsn) {
        this.toolsn = toolsn;
    }

    public String getToolname() {
        return toolname;
    }

    public void setToolname(String toolname) {
        this.toolname = toolname;
    }

    public BigInteger getQuantity() {
        return quantity;
    }

    public void setQuantity(BigInteger quantity) {
        this.quantity = quantity;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    public String getBoughtfrom() {
        return boughtfrom;
    }

    public void setBoughtfrom(String boughtfrom) {
        this.boughtfrom = boughtfrom;
    }

    @XmlTransient
    public Collection<Office> getOfficeCollection() {
        return officeCollection;
    }

    public void setOfficeCollection(Collection<Office> officeCollection) {
        this.officeCollection = officeCollection;
    }

    @XmlTransient
    public Collection<Pgroup> getPgroupCollection() {
        return pgroupCollection;
    }

    public void setPgroupCollection(Collection<Pgroup> pgroupCollection) {
        this.pgroupCollection = pgroupCollection;
    }

    public Office getOfficenumber() {
        return officenumber;
    }

    public void setOfficenumber(Office officenumber) {
        this.officenumber = officenumber;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (toolsn != null ? toolsn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tool)) {
            return false;
        }
        Tool other = (Tool) object;
        if ((this.toolsn == null && other.toolsn != null) || (this.toolsn != null && !this.toolsn.equals(other.toolsn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alnayzak.Tool[ toolsn=" + toolsn + " ]";
    }
    
}
