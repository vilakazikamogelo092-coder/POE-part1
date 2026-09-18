/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.appregistration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class AppLoginTest {
    
    public AppLoginTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
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
     * Test of checkuserNameComplexity method, of class AppLogin.
     */
    @org.junit.jupiter.api.Test
    public void testCheckuserNameComplexity() {
        System.out.println("checkuserNameComplexity");
        String username = "Kamo_pee";
        AppLogin instance = new AppLogin();
        boolean expResult = true;
        boolean result = instance.checkuserNameComplexity(username);
        assertEquals(expResult, result);
        ;
    }

    /**
     * Test of checkPasswordComplexity method, of class AppLogin.
     */
    @org.junit.jupiter.api.Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "Ol3gom@k";
        AppLogin instance = new AppLogin();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of checkCellphone method, of class AppLogin.
     */
    @org.junit.jupiter.api.Test
    public void testCheckCellphone() {
        System.out.println("checkCellphone");
        String phone = "+27751725382";
        AppLogin instance = new AppLogin();
        boolean expResult = false;
        boolean result = instance.checkCellphone(phone);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of loginUser method, of class AppLogin.
     */
    @org.junit.jupiter.api.Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String storedUsername = "Kamo_pee";
        String storedPassword = "Ol3gom@k";
        String enteredUsername = "Kamo_pee";
        String enteredPassword = "Ol3gom@k";
        AppLogin instance = new AppLogin();
        boolean expResult = false;
        boolean result = instance.loginUser(storedUsername, storedPassword, enteredUsername, enteredPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginStatus method, of class AppLogin.
     */
    @org.junit.jupiter.api.Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        boolean loginStatus = false;
        String firstName = "";
        String lastName = "";
        AppLogin instance = new AppLogin();
        String expResult = "";
        String result = instance.returnLoginStatus(loginStatus, firstName, lastName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
