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
public class AssignmentTest {
    
    public AssignmentTest() {
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
     * Test of toString method, of class Assignment.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Assignment instance = new Assignment();
        String expResult = null;
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getId method, of class Assignment.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Assignment instance = new Assignment();
        instance.setId(1);
        int expResult = 1;
        int result = instance.getId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId method, of class Assignment.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 1;
        Assignment instance = new Assignment();
        instance.setId(id);
        
    }

    /**
     * Test of getTitle method, of class Assignment.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Assignment instance = new Assignment();
        instance.setTitle("Ejercicio 1");
        String expResult = ("Ejercicio 1");
        String result = instance.getTitle();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setTitle method, of class Assignment.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "Ejercicio 1";
        Assignment instance = new Assignment();
        instance.setTitle(title);
        
    }

    /**
     * Test of getDescription method, of class Assignment.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Assignment instance = new Assignment();
        instance.setDescription("Hacer la tarea de la pag 12");
        String expResult = "Hacer la tarea de la pag 12";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setDescription method, of class Assignment.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "Hacer la tarea de la pag 12";
        Assignment instance = new Assignment();
        instance.setDescription(description);
        
    }

    /**
     * Test of getDue_date method, of class Assignment.
     */
    @Test
    public void testGetDue_date() {
        System.out.println("getDue_date");
        Assignment instance = new Assignment();
        Date expResult = null;
        Date result = instance.getDue_date();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setDue_date method, of class Assignment.
     */
    @Test
    public void testSetDue_date() {
        System.out.println("setDue_date");
        Date due_date = null;
        Assignment instance = new Assignment();
        instance.setDue_date(due_date);
        
    }
    
}
