/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oreganTrail.control;

/**
 *
 * @author ayami
 */
public class RiverControl {
    public static double calcCrossRiverSuccess (double riverDepth, double riverLength){
            if (riverDepth * riverLength >= 100)
            return -1;
    }
}
