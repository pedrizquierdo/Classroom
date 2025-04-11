/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.classroom.ui;

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
public class SubmissionFormTest {
    
    public SubmissionFormTest() {
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
     * test of the method for loading the student table of class submissionForm
     */
    @Test
    public void testLoadStudents() {
        System.out.println("loadStudents");
        SubmissionForm instance = null;
        instance.loadStudents();
        
    }

    /**
     * test of the method for loading the assignment table of class submissionForm
     */
    @Test
    public void testLoadAssignments() {
        System.out.println("loadAssignments");
        SubmissionForm instance = null;
        instance.loadAssignments();
        
    }

    /**
     * test the method for loading the submissions table of class SubmissionForm.
     */
    @Test
    public void testLoadSubmission() {
        System.out.println("loadSubmission");
        Submission s = null;
        SubmissionForm instance = null;
        instance.loadSubmission(s);
        
    }

    /**
     * Test the Main method of the SubmissionForm
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SubmissionForm.main(args);
        
    }
    
}