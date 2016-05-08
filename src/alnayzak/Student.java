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
@Table(name = "STUDENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s"),
    @NamedQuery(name = "Student.findByStudentid", query = "SELECT s FROM Student s WHERE s.studentid = :studentid"),
    @NamedQuery(name = "Student.findBySchoolnumber", query = "SELECT s FROM Student s WHERE s.schoolnumber = :schoolnumber"),
    @NamedQuery(name = "Student.findBySchoolname", query = "SELECT s FROM Student s WHERE s.schoolname = :schoolname"),
    @NamedQuery(name = "Student.findBySocialnumber", query = "SELECT s FROM Student s WHERE s.socialnumber = :socialnumber")})
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "STUDENTID")
    private BigDecimal studentid;
    @Column(name = "SCHOOLNUMBER")
    private BigInteger schoolnumber;
    @Column(name = "SCHOOLNAME")
    private String schoolname;
    @Column(name = "SOCIALNUMBER")
    private BigInteger socialnumber;
    @JoinTable(name = "SESSION_GIVEN_TO", joinColumns = {
        @JoinColumn(name = "STUDENTID", referencedColumnName = "STUDENTID")}, inverseJoinColumns = {
        @JoinColumn(name = "SESSIONNUMBER", referencedColumnName = "SESSIONNUMBER")})
    @ManyToMany
    private Collection<Sessions> sessionsCollection;
    @ManyToMany(mappedBy = "studentCollection")
    private Collection<Pgroup> pgroupCollection;
    @OneToMany(mappedBy = "studentid")
    private Collection<Participant> participantCollection;
    @JoinColumn(name = "STUDENTID", referencedColumnName = "PEOPLEID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private People people;

    public Student() {
    }

    public Student(BigDecimal studentid) {
        this.studentid = studentid;
    }

    public BigDecimal getStudentid() {
        return studentid;
    }

    public void setStudentid(BigDecimal studentid) {
        this.studentid = studentid;
    }

    public BigInteger getSchoolnumber() {
        return schoolnumber;
    }

    public void setSchoolnumber(BigInteger schoolnumber) {
        this.schoolnumber = schoolnumber;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public BigInteger getSocialnumber() {
        return socialnumber;
    }

    public void setSocialnumber(BigInteger socialnumber) {
        this.socialnumber = socialnumber;
    }

    @XmlTransient
    public Collection<Sessions> getSessionsCollection() {
        return sessionsCollection;
    }

    public void setSessionsCollection(Collection<Sessions> sessionsCollection) {
        this.sessionsCollection = sessionsCollection;
    }

    @XmlTransient
    public Collection<Pgroup> getPgroupCollection() {
        return pgroupCollection;
    }

    public void setPgroupCollection(Collection<Pgroup> pgroupCollection) {
        this.pgroupCollection = pgroupCollection;
    }

    @XmlTransient
    public Collection<Participant> getParticipantCollection() {
        return participantCollection;
    }

    public void setParticipantCollection(Collection<Participant> participantCollection) {
        this.participantCollection = participantCollection;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentid != null ? studentid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.studentid == null && other.studentid != null) || (this.studentid != null && !this.studentid.equals(other.studentid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alnayzak.Student[ studentid=" + studentid + " ]";
    }
    
}
