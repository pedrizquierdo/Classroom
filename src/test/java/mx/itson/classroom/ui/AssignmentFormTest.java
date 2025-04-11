/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.classroom.ui;

import mx.itson.classroom.entities.Assignment;
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
public class AssignmentFormTest {
    
    public AssignmentFormTest() {
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
     * Test of loadAssignment method, of class AssignmentForm.
     */
    @Test
    public void testLoadAssignment() {
        System.out.println("loadAssignment");
        Assignment a = null;
        AssignmentForm instance = null;
        instance.loadAssignment(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method of class AssignmentForm.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AssignmentForm.main(args);
        
    }
    
}