/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.classroom.persistence;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import mx.itson.classroom.entities.Assignment;
import mx.itson.classroom.entities.Submission;
import mx.itson.classroom.utils.HibernateUtil;
import org.hibernate.Session;

/**
 * Data Access Object (DAO) class for managing operations related to 
 * the Submission entity in the database.
 * 
 * @author pedrizquierdo
 */
public class SubmissionDAO {
    
    /**
     * Retrieves all submissions from the database.
     *
     * @return a list of all Submission objects.
     */
    public static List<Submission> getAll(){
        List<Submission> submissions = new ArrayList<>();
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            CriteriaQuery<Submission> criteriaQuery =
                    session.getCriteriaBuilder().createQuery(Submission.class);
            criteriaQuery.from(Submission.class);
            
            submissions = session.createQuery(criteriaQuery).getResultList();
        }catch(Exception ex){
            System.err.println("Ocurrio un error" + ex.getMessage());
            
        }
        return submissions;
    }
    
    /**
     * Saves a new submission to the database.
     *
     * @param s the Submission object to save.
     * @return true if the submission was successfully saved, false otherwise.
     */
    public static boolean save(Submission s) {
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
     * Deletes a submission from the database.
     *
     * @param s the Submission object to delete.
     * @return true if the deletion was successful, false otherwise.
     */
    public static boolean delete(Submission s) {
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
     * Updates an existing submission in the database.
     *
     * @param s the Submission object with updated data.
     * @return true if the update was successful, false otherwise.
     */
    public static boolean edit(Submission s) {
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

    
    /**
     * Counts the number of submissions for a given assignment.
     *
     * @param assignmentId the ID of the assignment.
     * @return the number of submissions for the specified assignment.
     */
    public static int countByAssignment(int assignmentId) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    Long count = session.createQuery(
        "SELECT COUNT(s) FROM Submission s WHERE s.assignment.id = :assignmentId", Long.class)
        .setParameter("assignmentId", assignmentId)
        .uniqueResult();
    session.close();
    return count.intValue();
}
    
    /**
     * Checks whether a specific student has submitted an assignment.
     *
     * @param studentId the ID of the student.
     * @param assignmentId the ID of the assignment.
     * @return true if the student has submitted, false otherwise.
     */
    public static boolean hasStudentSubmitted(int studentId, int assignmentId) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    Long count = session.createQuery(
        "SELECT COUNT(s) FROM Submission s WHERE s.student.id = :studentId AND s.assignment.id = :assignmentId", Long.class)
        .setParameter("studentId", studentId)
        .setParameter("assignmentId", assignmentId)
        .uniqueResult();
    session.close();
    return count > 0;
}
    
    /**
     * Retrieves the names of students who have submitted a specific assignment.
     *
     * @param assignmentId the ID of the assignment.
     * @return a list of unique student names who submitted the assignment.
     */
    public static List<String> getStudentNamesByAssignment(int assignmentId) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    List<String> names = session.createQuery(
        "SELECT DISTINCT s.student.name FROM Submission s WHERE s.assignment.id = :id", String.class)
        .setParameter("id", assignmentId)
        .getResultList();
    session.close();
    return names;
}
    
    /**
     * Retrieves all submissions by a specific student.
     *
     * @param studentId the ID of the student.
     * @return a list of objects containing assignment title and submitted file name.
     */
    public static List<Object[]> getSubmissionsByStudent(int studentId) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    List<Object[]> submissions = session.createQuery(
            "SELECT s.assignment.title, s.file_name FROM Submission s WHERE s.student.id = :studentId", Object[].class)
            .setParameter("studentId", studentId)
            .getResultList();
    session.close();
    return submissions;
}
    
    /**
     * Retrieves the assignment associated with a given submission.
     *
     * @param submissionId the ID of the submission.
     * @return the Assignment object linked to the submission.
     */
    public static Assignment getAssignmentBySubmission(int submissionId) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    Assignment assignment = (Assignment) session.createQuery(
            "SELECT s.assignment FROM Submission s WHERE s.id = :submissionId")
            .setParameter("submissionId", submissionId)
            .uniqueResult();
    session.close();
    return assignment;
}

    
}
