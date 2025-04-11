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
 *
 * @author pedrizquierdo
 */
public class SubmissionDAO {
    
    public static List<Submission> getAll(){
        List<Submission> animales = new ArrayList<>();
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            CriteriaQuery<Submission> criteriaQuery =
                    session.getCriteriaBuilder().createQuery(Submission.class);
            criteriaQuery.from(Submission.class);
            
            animales = session.createQuery(criteriaQuery).getResultList();
        }catch(Exception ex){
            System.err.println("Ocurrio un error" + ex.getMessage());
            
        }
        return animales;
    }
    
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
    
    public static int countByAssignment(int assignmentId) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    Long count = session.createQuery(
        "SELECT COUNT(s) FROM Submission s WHERE s.assignment.id = :assignmentId", Long.class)
        .setParameter("assignmentId", assignmentId)
        .uniqueResult();
    session.close();
    return count.intValue();
}
    
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
    
    public static List<String> getStudentNamesByAssignment(int assignmentId) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    List<String> names = session.createQuery(
        "SELECT DISTINCT s.student.name FROM Submission s WHERE s.assignment.id = :id", String.class)
        .setParameter("id", assignmentId)
        .getResultList();
    session.close();
    return names;
}
    
    public static List<Object[]> getSubmissionsByStudent(int studentId) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    List<Object[]> submissions = session.createQuery(
            "SELECT s.assignment.title, s.file_name FROM Submission s WHERE s.student.id = :studentId", Object[].class)
            .setParameter("studentId", studentId)
            .getResultList();
    session.close();
    return submissions;
}
    
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
