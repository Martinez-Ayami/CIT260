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
public class HuntControlTest {
    
    public HuntControlTest() {
    }

    /**
     * Test of calcHuntScene method, of class HuntControl.
     */
    @Test
    public void testCalcHuntScene() {
        System.out.println("calcHuntScene");
        //Test Case 1
        System.out.println("\tTest case 1");
        String textBang = "";
        double expResult = 80.0;
        double result = HuntControl.calcHuntScene(textBang);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
