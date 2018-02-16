/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oreganTrail.control;
import java.util.Random;

/**
 *
 * @author ayami
 */
public class HuntControl {
    public static double calcHuntScene (String animal, StringtextBang){
        int max = 100;
        int min = 1;
        Random randomNum = new Random();
        if (animal == Rabbit || text = "BANG!"){
            success = randomNum.nextInt(max) + 90;
        }
        if (success => 100) {
            calcHuntScene = TRUE;
            food = +10
        }
        
        if (animal == Fox || text = "BANG!"){
            success = randomNum.nextInt(max) + 80;
        }
        if (success => 100) {
            calcHuntScene = TRUE;
            food = +20
        }
        
        if (animal == Wolf || text = "BANG!"){
            success = randomNum.nextInt(max) + 30;
        }
        if (success => 100) {
            calcHuntScene = TRUE;
            food = +40
        }
        
        if (animal == Buffalo || text = "BANG!"){
            success = randomNum.nextInt(max) + 50;
        }
        if (success => 100) {
            calcHuntScene = TRUE;
            food = +70
        }

        
    }
}
