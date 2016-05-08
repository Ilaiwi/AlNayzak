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
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "PEOPLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "People.findAll", query = "SELECT p FROM People p"),
    @NamedQuery(name = "People.findByPeopleid", query = "SELECT p FROM People p WHERE p.peopleid = :peopleid"),
    @NamedQuery(name = "People.findByFname", query = "SELECT p FROM People p WHERE p.fname = :fname"),
    @NamedQuery(name = "People.findByMinname", query = "SELECT p FROM People p WHERE p.minname = :minname"),
    @NamedQuery(name = "People.findByLname", query = "SELECT p FROM People p WHERE p.lname = :lname"),
    @NamedQuery(name = "People.findByBirthdate", query = "SELECT p FROM People p WHERE p.birthdate = :birthdate"),
    @NamedQuery(name = "People.findByAdress", query = "SELECT p FROM People p WHERE p.adress = :adress"),
    @NamedQuery(name = "People.findByEmail", query = "SELECT p FROM People p WHERE p.email = :email"),
    @NamedQuery(name = "People.findByJoindate", query = "SELECT p FROM People p WHERE p.joindate = :joindate"),
    @NamedQuery(name = "People.findByLeavedate", query = "SELECT p FROM People p WHERE p.leavedate = :leavedate"),
    @NamedQuery(name = "People.findByPhonenumber", query = "SELECT p FROM People p WHERE p.phonenumber = :phonenumber"),
    @NamedQuery(name = "People.findBySex", query = "SELECT p FROM People p WHERE p.sex = :sex")})
public class People implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "PEOPLEID")
    private BigDecimal peopleid;
    @Column(name = "FNAME")
    private String fname;
    @Column(name = "MINNAME")
    private String minname;
    @Column(name = "LNAME")
    private String lname;
    @Column(name = "BIRTHDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthdate;
    @Column(name = "ADRESS")
    private String adress;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "JOINDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date joindate;
    @Column(name = "LEAVEDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date leavedate;
    @Column(name = "PHONENUMBER")
    private BigInteger phonenumber;
    @Column(name = "SEX")
    private String sex;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "people")
    private Student student;
    @OneToMany(mappedBy = "supervisorid")
    private Collection<Pgroup> pgroupCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "people")
    private Employee employee;
    @OneToMany(mappedBy = "trainerid")
    private Collection<Training> trainingCollection;
    @OneToMany(mappedBy = "trainerid")
    private Collection<Sessions> sessionsCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "people")
    private Volunteer volunteer;

    public People() {
    }

    public People(BigDecimal peopleid) {
        this.peopleid = peopleid;
    }

    public BigDecimal getPeopleid() {
        return peopleid;
    }

    public void setPeopleid(BigDecimal peopleid) {
        this.peopleid = peopleid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMinname() {
        return minname;
    }

    public void setMinname(String minname) {
        this.minname = minname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getJoindate() {
        return joindate;
    }

    public void setJoindate(Date joindate) {
        this.joindate = joindate;
    }

    public Date getLeavedate() {
        return leavedate;
    }

    public void setLeavedate(Date leavedate) {
        this.leavedate = leavedate;
    }

    public BigInteger getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(BigInteger phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @XmlTransient
    public Collection<Pgroup> getPgroupCollection() {
        return pgroupCollection;
    }

    public void setPgroupCollection(Collection<Pgroup> pgroupCollection) {
        this.pgroupCollection = pgroupCollection;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @XmlTransient
    public Collection<Training> getTrainingCollection() {
        return trainingCollection;
    }

    public void setTrainingCollection(Collection<Training> trainingCollection) {
        this.trainingCollection = trainingCollection;
    }

    @XmlTransient
    public Collection<Sessions> getSessionsCollection() {
        return sessionsCollection;
    }

    public void setSessionsCollection(Collection<Sessions> sessionsCollection) {
        this.sessionsCollection = sessionsCollection;
    }

    public Volunteer getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(Volunteer volunteer) {
        this.volunteer = volunteer;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (peopleid != null ? peopleid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof People)) {
            return false;
        }
        People other = (People) object;
        if ((this.peopleid == null && other.peopleid != null) || (this.peopleid != null && !this.peopleid.equals(other.peopleid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "alnayzak.People[ peopleid=" + peopleid + " ]";
    }
    
}
