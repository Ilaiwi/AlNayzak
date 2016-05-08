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
@Table(name = "PARTICIPANT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Participant.findAll", query = "SELECT p FROM Participant p"),
    @NamedQuery(name = "Participant.findByGroupnumber", query = "SELECT p FROM Participant p WHERE p.groupnumber = :groupnumber")})
public class Participant implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "GROUPNUMBER")
    private BigDecimal groupnumber;
    @JoinColumn(name = "GROUPNUMBER", referencedColumnName = "GROUPNUMBER", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Pgroup pgroup;
    @JoinColumn(name = "STUDENTID", referencedColumnName = "STUDENTID")
    @ManyToOne
    private Student studentid;

    public Participant() {
    }

    public Participant(BigDecimal groupnumber) {
        this.groupnumber = groupnumber;
    }

    public BigDecimal getGroupnumber() {
        return groupnumber;
    }

    public void setGroupnumber(BigDecimal groupnumber) {
        this.groupnumber = groupnumber;
    }

    public Pgroup getPgroup() {
        return pgroup;
    }

    public void setPgroup(Pgroup pgroup) {
        this.pgroup = pgroup;
    }

    public Student getStudentid() {
        return studentid;
    }

    public void setStudentid(Student studentid) {
        this.studentid = studentid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (groupnumber != null ? groupnumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Participant)) {
            return false;
        }
        Participant other = (Participant) object;
        if ((this.groupnumber == null && other.groupnumber != null) || (this.groupnumber != null && !this.groupnumber.equals(other.groupnumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alnayzak.Participant[ groupnumber=" + groupnumber + " ]";
    }
    
}
