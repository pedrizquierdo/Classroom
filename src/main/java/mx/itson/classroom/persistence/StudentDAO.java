/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.classroom.persistence;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import mx.itson.classroom.entities.Assignment;
import mx.itson.classroom.entities.Student;
import mx.itson.classroom.utils.HibernateUtil;
import org.hibernate.Session;

/**
 * Data Access Object (DAO) class for managing operations related to 
 * the Student entity in the database.
 * 
 * @author pedrizquierdo
 */
public class StudentDAO {
    
    
    /**
     * Retrieves all students from the database.
     *
     * @return a list of all Student objects found in the database;
     *         returns an empty list if none are found or if an error occurs.
     */
    public static List<Student> getAll(){
        List<Student> students = new ArrayList<>();
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            CriteriaQuery<Student> criteriaQuery =
                    session.getCriteriaBuilder().createQuery(Student.class);
            criteriaQuery.from(Student.class);
            
            students = session.createQuery(criteriaQuery).getResultList();
        }catch(Exception ex){
            System.err.println("Ocurrio un error" + ex.getMessage());
            
        }
        return students;
    }
    
    /**
     * Saves a new student to the database.
     *
     * @param s the Student object to save.
     * @return true if the operation was successful (i.e., the student's ID is not 0 after saving),
     *         false otherwise.
     */
    public static boolean save(Student s) {
        boolean result = false;
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            
            session.save(s);
            session.getTransaction().commit();
            result = s.getId()!= 0;
            
        }catch(Exception ex){
            System.err.println("Ocurrio un error" + ex.getMessage());
        }
        return result;
    }
    
    /**
     * Deletes an existing student from the database.
     *
     * @param s the Student object to delete.
     * @return true if the deletion was successful, false otherwise.
     */
    public static boolean delete(Student s) {
    boolean result = false;
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        session.delete(s);
        session.getTransaction().commit();
        result = true;

    } catch (Exception ex) {
        System.err.println("Ocurrió un error al eliminar: " + ex.getMessage());
    }
    return result;
}

    /**
     * Updates the data of an existing student in the database.
     *
     * @param s the Student object with updated information.
     * @return true if the update was successful, false otherwise.
     */
    public static boolean edit(Student s) {
    boolean result = false;
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        session.update(s);
        session.getTransaction().commit();
        result = true;

    } catch (Exception ex) {
        System.err.println("Ocurrió un error al actualizar: " + ex.getMessage());
    }
    return result;
}
    
}
