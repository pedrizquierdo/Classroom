/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.classroom.persistence;

import java.util.List;
import mx.itson.classroom.entities.Assignment;
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
public class AssignmentDAOTest {
    
    public AssignmentDAOTest() {
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
     * Test of getAll method, of class AssignmentDAO.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        List<Assignment> expResult = null;
        List<Assignment> result = AssignmentDAO.getAll();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of save method, of class AssignmentDAO.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Assignment a = null;
        boolean expResult = false;
        boolean result = AssignmentDAO.save(a);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of delete method, of class AssignmentDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Assignment a = null;
        boolean expResult = false;
        boolean result = AssignmentDAO.delete(a);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of edit method, of class AssignmentDAO.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        Assignment a = null;
        boolean expResult = false;
        boolean result = AssignmentDAO.edit(a);
        assertEquals(expResult, result);
        
    }
    
}
