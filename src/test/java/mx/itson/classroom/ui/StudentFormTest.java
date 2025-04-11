/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.classroom.ui;

import mx.itson.classroom.entities.Student;
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
public class StudentFormTest {
    
    public StudentFormTest() {
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
     * Test of loadStudent method, of class StudentForm.
     */
    @Test
    public void testLoadStudent() {
        System.out.println("loadStudent");
        Student s = null;
        StudentForm instance = null;
        instance.loadStudent(s);
        
    }

    /**
     * Test of main method, of class StudentForm.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        StudentForm.main(args);
        
    }
    
}
