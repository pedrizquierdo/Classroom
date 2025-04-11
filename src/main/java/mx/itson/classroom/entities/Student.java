/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.classroom.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Class that represents a student in the system.
 * Contains personal information such as name and email.
 * 
 * @author pedrizquierdo
 */

@Entity
public class Student {
    
@Override
    public String toString() {
        return this.name;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private int id_colt;
    
    /**
     * @return the id of the student
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id of the student to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name of the student
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name of the student to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email of the student
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email of the student to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the id_colt of the student
     */
    public int getId_colt() {
        return id_colt;
    }

    /**
     * @param id_colt the id_colt of the student to set
     */
    public void setId_colt(int id_colt) {
        this.id_colt = id_colt;
    }
    
}
