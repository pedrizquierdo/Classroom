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
public class AssignmentDAO {
    
    public static List<Assignment> getAll(){
        List<Assignment> assignments = new ArrayList<>();
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            CriteriaQuery<Assignment> criteriaQuery =
                    session.getCriteriaBuilder().createQuery(Assignment.class);
            criteriaQuery.from(Assignment.class);
            
            assignments = session.createQuery(criteriaQuery).getResultList();
        }catch(Exception ex){
            System.err.println("Ocurrio un error" + ex.getMessage());
            
        }
        return assignments;
    }
    
    public static boolean save(Assignment a) {
        boolean result = false;
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            
            session.save(a);
            session.getTransaction().commit();
            result = a.getId()!= 0;
            
        }catch(Exception ex){
            System.err.println("Ocurrio un error" + ex.getMessage());
        }
        return result;
    }
}
