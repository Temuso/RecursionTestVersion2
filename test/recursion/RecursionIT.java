/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package recursion;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MAKHURANET
 */
public class RecursionIT {
    
    public RecursionIT() {
    }
    
    @Test
    public void testFact() {
        System.out.println("fact");
        int n = 5;
        int expResult = 120;
        int result = Recursion.fact(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Recursion.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Recursion.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
