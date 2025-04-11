/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.classroom.persistence;

import java.util.List;
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
public class StudentDAOTest {
    
    public StudentDAOTest() {
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
     * Test of getAll method, of class StudentDAO.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        List<Student> expResult = null;
        List<Student> result = StudentDAO.getAll();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of save method, of class StudentDAO.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Student s = null;
        boolean expResult = false;
        boolean result = StudentDAO.save(s);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of delete method, of class StudentDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Student s = null;
        boolean expResult = false;
        boolean result = StudentDAO.delete(s);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of edit method, of class StudentDAO.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        Student s = null;
        boolean expResult = false;
        boolean result = StudentDAO.edit(s);
        assertEquals(expResult, result);
        
    }
    
}
