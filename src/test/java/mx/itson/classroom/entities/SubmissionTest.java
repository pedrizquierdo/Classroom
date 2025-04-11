/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.classroom.entities;

import java.util.Date;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alang
 */
public class SubmissionTest {
    
    public SubmissionTest() {
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
     * Test of getId method, of class Submission.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Submission instance = new Submission();
        instance.setId(1);
        int expResult = 1;
        int result = instance.getId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId method, of class Submission.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 1;
        Submission instance = new Submission();
        instance.setId(id);
        
    }

    /**
     * Test of getDate method, of class Submission.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Submission instance = new Submission();
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setDate method, of class Submission.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date date = null;
        Submission instance = new Submission();
        instance.setDate(date);
        
    }

    /**
     * Test of getFile_name method, of class Submission.
     */
    @Test
    public void testGetFile_name() {
        System.out.println("getFile_name");
        Submission instance = new Submission();
        instance.setFile_name("Ejercicio 1");
        String expResult = "Ejercicio 1";
        String result = instance.getFile_name();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setFile_name method, of class Submission.
     */
    @Test
    public void testSetFile_name() {
        System.out.println("setFile_name");
        String file_name = "Ejercicio 1";
        Submission instance = new Submission();
        instance.setFile_name(file_name);
        
    }

    /**
     * Test of getStudent method, of class Submission.
     */
    @Test
    public void testGetStudent() {
        System.out.println("getStudent");
        Submission instance = new Submission();
        Student expResult = null;
        Student result = instance.getStudent();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setStudent method, of class Submission.
     */
    @Test
    public void testSetStudent() {
        System.out.println("setStudent");
        Student student = null;
        Submission instance = new Submission();
        instance.setStudent(student);
        
    }

    /**
     * Test of getAssignment method, of class Submission.
     */
    @Test
    public void testGetAssignment() {
        System.out.println("getAssignment");
        Submission instance = new Submission();
        Assignment expResult = null;
        Assignment result = instance.getAssignment();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setAssignment method, of class Submission.
     */
    @Test
    public void testSetAssignment() {
        System.out.println("setAssignment");
        Assignment assignment = null;
        Submission instance = new Submission();
        instance.setAssignment(assignment);
        
    }
    
}
