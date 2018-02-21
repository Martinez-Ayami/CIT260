/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oreganTrail.control;

import byui.cit260.oreganTrail.model.InventoryItem;

/**
 *
 * @author ayami
 */
public class InventoryControl {
    
  public static double addInventoryItem(double itemPrice, double amount)
  {
      //InventoryItem
      
      if (amount > 9 ){
          
            return -1 ;
       }   
      if ( itemPrice > 99){
          
          return -1;
      }
      double total = itemPrice * amount;
      
      return total;
  }          
}

