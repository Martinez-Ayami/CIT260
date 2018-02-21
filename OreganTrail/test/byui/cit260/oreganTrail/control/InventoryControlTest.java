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
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of addInventoryItem method, of class InventoryControl.
     */
    @Test
    
       public void testAddInventoryItem() {
        System.out.println("addInventoryItem");
               //----Test Case 1 -----
        System.out.println("\tTest case 1");
        double itemPrice = 5.0;
        double amount = 3.0;
        double expResult = 15.0;
        double result = InventoryControl.addInventoryItem(itemPrice, amount);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
      

    System.out.println("\tTest case 2");
         itemPrice = 2.0;
         amount = 0.0;
         expResult = 0.0;
         result = InventoryControl.addInventoryItem(itemPrice, amount);
        assertEquals(expResult, result, 0.0001);
 

        
        System.out.println("\tTest case 3");
         itemPrice = 2.0;
         amount = 0-3.0;
         expResult = -6.0;
         result = InventoryControl.addInventoryItem(itemPrice, amount);
        assertEquals(expResult, result, 0.0001);
 
       }
}