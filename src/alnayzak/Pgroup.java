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
@Table(name = "PGROUP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pgroup.findAll", query = "SELECT p FROM Pgroup p"),
    @NamedQuery(name = "Pgroup.findByGroupnumber", query = "SELECT p FROM Pgroup p WHERE p.groupnumber = :groupnumber"),
    @NamedQuery(name = "Pgroup.findByGroupname", query = "SELECT p FROM Pgroup p WHERE p.groupname = :groupname"),
    @NamedQuery(name = "Pgroup.findByResult", query = "SELECT p FROM Pgroup p WHERE p.result = :result")})
public class Pgroup implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "GROUPNUMBER")
    private BigDecimal groupnumber;
    @Column(name = "GROUPNAME")
    private String groupname;
    @Column(name = "RESULT")
    private Serializable result;
    @ManyToMany(mappedBy = "pgroupCollection")
    private Collection<Training> trainingCollection;
    @JoinTable(name = "STUDENT_GROUP_AS", joinColumns = {
        @JoinColumn(name = "GROUPNUMBER", referencedColumnName = "GROUPNUMBER")}, inverseJoinColumns = {
        @JoinColumn(name = "STUDENTID", referencedColumnName = "STUDENTID")})
    @ManyToMany
    private Collection<Student> studentCollection;
    @JoinTable(name = "NEEDED_BY", joinColumns = {
        @JoinColumn(name = "GROUPNUMBER", referencedColumnName = "GROUPNUMBER")}, inverseJoinColumns = {
        @JoinColumn(name = "TOOLSN", referencedColumnName = "TOOLSN")})
    @ManyToMany
    private Collection<Tool> toolCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "pgroup")
    private Participant participant;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pgroup")
    private Collection<Winners> winnersCollection;
    @JoinColumn(name = "LOCATIONNUMBER", referencedColumnName = "LOCATIONNUMBER")
    @ManyToOne
    private Locations locationnumber;
    @JoinColumn(name = "SUPERVISORID", referencedColumnName = "PEOPLEID")
    @ManyToOne
    private People supervisorid;
    @OneToMany(mappedBy = "subgroupnumber")
    private Collection<Pgroup> pgroupCollection;
    @JoinColumn(name = "SUBGROUPNUMBER", referencedColumnName = "GROUPNUMBER")
    @ManyToOne
    private Pgroup subgroupnumber;
    @JoinColumn(name = "PHASENUMBER", referencedColumnName = "PHASENUMBER")
    @ManyToOne
    private Phases phasenumber;
    @JoinColumn(name = "PROJECTNUMBER", referencedColumnName = "PROJECTNUMBER")
    @ManyToOne
    private Projects projectnumber;

    public Pgroup() {
    }

    public Pgroup(BigDecimal groupnumber) {
        this.groupnumber = groupnumber;
    }

    public BigDecimal getGroupnumber() {
        return groupnumber;
    }

    public void setGroupnumber(BigDecimal groupnumber) {
        this.groupnumber = groupnumber;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public Serializable getResult() {
        return result;
    }

    public void setResult(Serializable result) {
        this.result = result;
    }

    @XmlTransient
    public Collection<Training> getTrainingCollection() {
        return trainingCollection;
    }

    public void setTrainingCollection(Collection<Training> trainingCollection) {
        this.trainingCollection = trainingCollection;
    }

    @XmlTransient
    public Collection<Student> getStudentCollection() {
        return studentCollection;
    }

    public void setStudentCollection(Collection<Student> studentCollection) {
        this.studentCollection = studentCollection;
    }

    @XmlTransient
    public Collection<Tool> getToolCollection() {
        return toolCollection;
    }

    public void setToolCollection(Collection<Tool> toolCollection) {
        this.toolCollection = toolCollection;
    }

    public Participant getParticipant() {
        return participant;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

    @XmlTransient
    public Collection<Winners> getWinnersCollection() {
        return winnersCollection;
    }

    public void setWinnersCollection(Collection<Winners> winnersCollection) {
        this.winnersCollection = winnersCollection;
    }

    public Locations getLocationnumber() {
        return locationnumber;
    }

    public void setLocationnumber(Locations locationnumber) {
        this.locationnumber = locationnumber;
    }

    public People getSupervisorid() {
        return supervisorid;
    }

    public void setSupervisorid(People supervisorid) {
        this.supervisorid = supervisorid;
    }

    @XmlTransient
    public Collection<Pgroup> getPgroupCollection() {
        return pgroupCollection;
    }

    public void setPgroupCollection(Collection<Pgroup> pgroupCollection) {
        this.pgroupCollection = pgroupCollection;
    }

    public Pgroup getSubgroupnumber() {
        return subgroupnumber;
    }

    public void setSubgroupnumber(Pgroup subgroupnumber) {
        this.subgroupnumber = subgroupnumber;
    }

    public Phases getPhasenumber() {
        return phasenumber;
    }

    public void setPhasenumber(Phases phasenumber) {
        this.phasenumber = phasenumber;
    }

    public Projects getProjectnumber() {
        return projectnumber;
    }

    public void setProjectnumber(Projects projectnumber) {
        this.projectnumber = projectnumber;
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
        if (!(object instanceof Pgroup)) {
            return false;
        }
        Pgroup other = (Pgroup) object;
        if ((this.groupnumber == null && other.groupnumber != null) || (this.groupnumber != null && !this.groupnumber.equals(other.groupnumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alnayzak.Pgroup[ groupnumber=" + groupnumber + " ]";
    }
    
}
