package propertyreader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import propertyreader.MBoxProps;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Администратор
 */
public class MBoxPropsTest {
    
    public MBoxPropsTest() {
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

//    @Test
//    public void testSomeMethod() {
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
    @Test
//    public void testMBoxProps {
    public void getSmtpPort(){
        String smtpport = "25";   
        System.out.println("getSmtpPort");
        String expResult = "25";
//        String result = 25;
        String result = MBoxProps.getSmtpPort();
        assertEquals(expResult, result);
    }
}
    
//}
