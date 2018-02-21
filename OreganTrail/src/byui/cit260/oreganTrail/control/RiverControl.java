/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oreganTrail.control;
import byui.cit260.oreganTrail.model.RiverScene;
/**
 *
 * @author ayami
 */
public class RiverControl {
    public static double calcCrossRiverSuccess (double riverDepth, double riverLength){
            if (riverDepth < 1){
            return -1;
            }
            if (riverLength < 1){
            return -1;
            }
            
            double crossRiverSuccess = riverDepth * riverLength  ;
            return crossRiverSuccess;
    }
}
