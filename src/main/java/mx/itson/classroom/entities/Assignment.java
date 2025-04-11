/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.classroom.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Class that represents an assignment given to students.
 * Contains information such as title, description, and due date.
 * 
 * @author pedrizquierdo
 */
@Entity
public class Assignment {
    
    @Override
    public String toString() {
        return this.title;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;
    private Date due_date;
    
    
    /**
     * @return the id of the assignment
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id of the assignment to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the title of the assignment
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title of the assignment to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the description of the assignment
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description of the assignment to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the due_date of the assignment
     */
    public Date getDue_date() {
        return due_date;
    }

    /**
     * @param due_date the due_date of the assignment to set
     */
    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }
    
}
