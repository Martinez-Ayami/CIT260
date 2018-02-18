/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oreganTrail.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Randy ther Master
 */
public class RiverControlTest {
    
    public RiverControlTest() {
    }

    /**
     * Test of calcCrossRiverSuccess method, of class RiverControl.
     */
    @Test
    public void testCalcCrossRiverSuccess() {
        System.out.println("calcCrossRiverSuccess");
        double riverDepth = 0.0;
        double riverLength = 0.0;
        double expResult = 0.0;
        double result = RiverControl.calcCrossRiverSuccess(riverDepth, riverLength);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
