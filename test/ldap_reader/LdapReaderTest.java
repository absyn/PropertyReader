package ldap_reader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ldap_reader.LdapReader;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author a.belovol
 */
public class LdapReaderTest {
    
    public LdapReaderTest() {
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
     * Test of LdapReader method, of class LdapReader.
     */
    @Test
    public void testLdapReader() {
        System.out.println("LdapReader");
        String request = "";
        String expResult = "";
        String result = LdapReader.LdapReader(request);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserMail method, of class LdapReader.
     */
    @Test
    public void testGetUserMail() {
        System.out.println("getUserMail");
        String user = "";
        String expResult = "";
        String result = LdapReader.getUserMail(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
