/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregantrail;

import byui.cit260.oreganTrail.model.Player;

/**
 *
 * @author Randy ther Master
 */
public class OreganTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player playerOne = new Player();
        playerOne.setName("Ayami Martinez");
        playerOne.setBestTime(7.00);
        
        
        System.out.println(playerOne);
    }
    
}
