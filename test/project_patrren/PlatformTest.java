/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_patrren;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alwle
 */
public class PlatformTest {
    
    public PlatformTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addCourse method, of class Platform.
     */
    @Test
    public void testAddCourse() {
        System.out.println("addCourse");
        Course course = null;
        Platform instance = new Platform();
        instance.addCourse(course);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addUser method, of class Platform.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        User user = null;
        Platform instance = new Platform();
        instance.addUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addEnrollment method, of class Platform.
     */
    @Test
    public void testAddEnrollment() {
        System.out.println("addEnrollment");
        Enrollment enrollment = null;
        Platform instance = new Platform();
        instance.addEnrollment(enrollment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCourses method, of class Platform.
     */
    @Test
    public void testGetAllCourses() {
        System.out.println("getAllCourses");
        Platform instance = new Platform();
        List<Course> expResult = null;
        List<Course> result = instance.getAllCourses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
