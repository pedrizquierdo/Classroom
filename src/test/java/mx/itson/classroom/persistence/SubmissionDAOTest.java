/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.classroom.persistence;

import java.util.List;
import mx.itson.classroom.entities.Assignment;
import mx.itson.classroom.entities.Submission;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author pedrizquierdo
 */
public class SubmissionDAOTest {
    
    public SubmissionDAOTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getAll method, of class SubmissionDAO.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        List<Submission> expResult = null;
        List<Submission> result = SubmissionDAO.getAll();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of save method, of class SubmissionDAO.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Submission s = null;
        boolean expResult = false;
        boolean result = SubmissionDAO.save(s);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of delete method, of class SubmissionDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Submission s = null;
        boolean expResult = false;
        boolean result = SubmissionDAO.delete(s);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of edit method, of class SubmissionDAO.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        Submission s = null;
        boolean expResult = false;
        boolean result = SubmissionDAO.edit(s);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of countByAssignment method, of class SubmissionDAO.
     */
    @Test
    public void testCountByAssignment() {
        System.out.println("countByAssignment");
        int assignmentId = 1;
        int expResult = 1;
        int result = SubmissionDAO.countByAssignment(assignmentId);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of hasStudentSubmitted method, of class SubmissionDAO.
     */
    @Test
    public void testHasStudentSubmitted() {
        System.out.println("hasStudentSubmitted");
        int studentId = 1;
        int assignmentId = 1;
        boolean expResult = true;
        boolean result = SubmissionDAO.hasStudentSubmitted(studentId, assignmentId);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getStudentNamesByAssignment method, of class SubmissionDAO.
     */
    @Test
    public void testGetStudentNamesByAssignment() {
        System.out.println("getStudentNamesByAssignment");
        int assignmentId = 1;
        List<String> expResult = null;
        List<String> result = SubmissionDAO.getStudentNamesByAssignment(assignmentId);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getSubmissionsByStudent method, of class SubmissionDAO.
     */
    @Test
    public void testGetSubmissionsByStudent() {
        System.out.println("getSubmissionsByStudent");
        int studentId = 1;
        List expResult = null;
        List result = SubmissionDAO.getSubmissionsByStudent(studentId);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getAssignmentBySubmission method, of class SubmissionDAO.
     */
    @Test
    public void testGetAssignmentBySubmission() {
        System.out.println("getAssignmentBySubmission");
        int submissionId = 1;
        Assignment expResult = null;
        Assignment result = SubmissionDAO.getAssignmentBySubmission(submissionId);
        assertEquals(expResult, result);
        
    }
    
}
