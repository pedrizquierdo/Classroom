/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.classroom.entities;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * Class that represents a submission made by a student for a specific assignment.
 * Includes the associated assignment, student, submission date, etc.
 * 
 * @author pedrizquierdo
 */

@Entity
public class Submission {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date date;
    private String file_name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_student")
    private Student student;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_assignment")
    private Assignment assignment;
    
    /**
     * @return the id of the submission
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id of the submission to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the date of the submission
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date of the submission to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the file_name of the submission
     */
    public String getFile_name() {
        return file_name;
    }

    /**
     * @param file_name the file_name of the submission to set
     */
    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    /**
     * @return the student of the submission
     */
    public Student getStudent() {
        return student;
    }

    /**
     * @param student the student of the submission to set
     */
    public void setStudent(Student student) {
        this.student = student;
    }

    /**
     * @return the assignment of the submission
     */
    public Assignment getAssignment() {
        return assignment;
    }

    /**
     * @param assignment the assignment of the submission to set
     */
    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }
    
}
