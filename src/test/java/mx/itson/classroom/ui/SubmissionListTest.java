/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.classroom.ui;

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
public class SubmissionListTest {
    
    public SubmissionListTest() {
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
     * test the method for loading the submissions table of class SubmissionList.
     */
    @Test
    public void testLoadSubmissions() {
        System.out.println("loadSubmissions");
        SubmissionList instance = new SubmissionList();
        instance.loadSubmissions();
        
    }

    /**
     * Test the Main method of the SubmissionList
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SubmissionList.main(args);
        
    }
    
}