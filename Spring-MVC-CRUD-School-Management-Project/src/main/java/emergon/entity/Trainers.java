/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emergon.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kkats
 */
@Entity
@Table(name = "trainers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trainers.findAll", query = "SELECT t FROM Trainers t")
    , @NamedQuery(name = "Trainers.findByTrainerID", query = "SELECT t FROM Trainers t WHERE t.trainerID = :trainerID")
    , @NamedQuery(name = "Trainers.findByTFirstName", query = "SELECT t FROM Trainers t WHERE t.tFirstName = :tFirstName")
    , @NamedQuery(name = "Trainers.findByTLastName", query = "SELECT t FROM Trainers t WHERE t.tLastName = :tLastName")
    , @NamedQuery(name = "Trainers.findByTSubject", query = "SELECT t FROM Trainers t WHERE t.tSubject = :tSubject")
    , @NamedQuery(name = "Trainers.findByTCourseTitle", query = "SELECT t FROM Trainers t WHERE t.tCourseTitle = :tCourseTitle")})
public class Trainers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "trainerID")
    private Integer trainerID;
    @Size(max = 30)
    @Column(name = "tFirstName")
    private String tFirstName;
    @Size(max = 45)
    @Column(name = "tLastName")
    private String tLastName;
    @Size(max = 45)
    @Column(name = "tSubject")
    private String tSubject;
    @Size(max = 10)
    @Column(name = "tCourseTitle")
    private String tCourseTitle;

    public Trainers() {
    }

    public Trainers(Integer trainerID) {
        this.trainerID = trainerID;
    }

    public Integer gettrainerID() {
        return trainerID;
    }

    public void settrainerID(Integer trainerID) {
        this.trainerID = trainerID;
    }

    public String gettFirstName() {
        return tFirstName;
    }

    public void settFirstName(String tFirstName) {
        this.tFirstName = tFirstName;
    }

    public String gettLastName() {
        return tLastName;
    }

    public void settLastName(String tLastName) {
        this.tLastName = tLastName;
    }

    public String gettSubject() {
        return tSubject;
    }

    public void settSubject(String tSubject) {
        this.tSubject = tSubject;
    }

    public String gettCourseTitle() {
        return tCourseTitle;
    }

    public void settCourseTitle(String tCourseTitle) {
        this.tCourseTitle = tCourseTitle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trainerID != null ? trainerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trainers)) {
            return false;
        }
        Trainers other = (Trainers) object;
        if ((this.trainerID == null && other.trainerID != null) || (this.trainerID != null && !this.trainerID.equals(other.trainerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "emergon.entity.Trainers[ trainerID=" + trainerID + " ]";
    }
    
}
