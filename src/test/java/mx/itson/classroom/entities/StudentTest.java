/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.classroom.entities;

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
public class StudentTest {
    
    public StudentTest() {
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
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Student instance = new Student();
        String expResult = null;
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getId method, of class Student.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Student instance = new Student();
        instance.setId(1);
        int expResult = 1;
        int result = instance.getId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId method, of class Student.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 1;
        Student instance = new Student();
        instance.setId(id);
        
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = new Student();
        instance.setName("Pedro");
        String expResult = "Pedro";
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Pedro";
        Student instance = new Student();
        instance.setName(name);
        
    }

    /**
     * Test of getEmail method, of class Student.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Student instance = new Student();
        instance.setEmail("pedro1234@potros.edu.mx");
        String expResult = "pedro1234@potros.edu.mx";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setEmail method, of class Student.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "pedro1234@potros.edu.mx";
        Student instance = new Student();
        instance.setEmail(email);
        
    }

    /**
     * Test of getId_colt method, of class Student.
     */
    @Test
    public void testGetId_colt() {
        System.out.println("getId_colt");
        Student instance = new Student();
        instance.setId_colt(1);
        int expResult = 1;
        int result = instance.getId_colt();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId_colt method, of class Student.
     */
    @Test
    public void testSetId_colt() {
        System.out.println("setId_colt");
        int id_colt = 1;
        Student instance = new Student();
        instance.setId_colt(id_colt);
        
    }
    
}
