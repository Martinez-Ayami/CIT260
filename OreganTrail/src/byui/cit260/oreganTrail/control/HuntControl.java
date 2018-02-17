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
    
    
    
    public static double calcHuntScene (String textBang){
        int food = 0;
        int max = 100;
        int min = 0;
        Random randomNum = new Random();
        String[] animalList = {"Rabbit", "Fox", "Wolf", "Buffalo"};
        
        String animal = animalList[randomNum.nextInt(animalList.length)];
        
        if ("Rabbit".equals(animal) && "BANG!".equals(textBang) && randomNum.nextInt(max-min) + 90 >= 100){
            food = +10;
        }
        
        else if ("Fox".equals(animal) && "BANG!".equals(textBang) && randomNum.nextInt(max-min) + 80 >= 100){
            food = +20;
        }
        
        else if ("Wolf".equals(animal) && "BANG!".equals(textBang) && randomNum.nextInt(max-min) + 30 >= 100){
            food = +40;
        }
        
        else if ("Buffalo".equals(animal) && "BANG!".equals(textBang) && randomNum.nextInt(max-min) + 50 >= 100){
            food = +70;
        }
        
        else return -1;
        return food;
    }

    
}
