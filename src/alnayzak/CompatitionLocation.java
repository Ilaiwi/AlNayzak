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
 * @author BaRa' DwEiKaT
 */
@Entity
@Table(name = "COMPATITION_LOCATION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompatitionLocation.findAll", query = "SELECT c FROM CompatitionLocation c"),
    @NamedQuery(name = "CompatitionLocation.findByCompatitionnumber", query = "SELECT c FROM CompatitionLocation c WHERE c.compatitionnumber = :compatitionnumber"),
    @NamedQuery(name = "CompatitionLocation.findByCity", query = "SELECT c FROM CompatitionLocation c WHERE c.city = :city"),
    @NamedQuery(name = "CompatitionLocation.findByStreet", query = "SELECT c FROM CompatitionLocation c WHERE c.street = :street"),
    @NamedQuery(name = "CompatitionLocation.findByPlace", query = "SELECT c FROM CompatitionLocation c WHERE c.place = :place")})
public class CompatitionLocation implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "COMPATITIONNUMBER")
    private BigDecimal compatitionnumber;
    @Column(name = "CITY")
    private String city;
    @Column(name = "STREET")
    private String street;
    @Column(name = "PLACE")
    private String place;
    @JoinColumn(name = "COMPATITIONNUMBER", referencedColumnName = "COMPATITIONNUMBER", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Compatition compatition;

    public CompatitionLocation() {
    }

    public CompatitionLocation(BigDecimal compatitionnumber) {
        this.compatitionnumber = compatitionnumber;
    }

    public BigDecimal getCompatitionnumber() {
        return compatitionnumber;
    }

    public void setCompatitionnumber(BigDecimal compatitionnumber) {
        this.compatitionnumber = compatitionnumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Compatition getCompatition() {
        return compatition;
    }

    public void setCompatition(Compatition compatition) {
        this.compatition = compatition;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (compatitionnumber != null ? compatitionnumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompatitionLocation)) {
            return false;
        }
        CompatitionLocation other = (CompatitionLocation) object;
        if ((this.compatitionnumber == null && other.compatitionnumber != null) || (this.compatitionnumber != null && !this.compatitionnumber.equals(other.compatitionnumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alnayzak.CompatitionLocation[ compatitionnumber=" + compatitionnumber + " ]";
    }
    
}
