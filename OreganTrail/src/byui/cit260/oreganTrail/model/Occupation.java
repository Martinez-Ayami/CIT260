/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oreganTrail.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author ayami
 */
public class Occupation implements Serializable{
    //class instance variables
    private String occupationName;
    private double startingMoney;
    private double bonus;

    public Occupation() {
    }
    
    

    public String getOccupationName() {
        return occupationName;
    }

    public void setOccupationName(String occupationName) {
        this.occupationName = occupationName;
    }

    public double getStartingMoney() {
        return startingMoney;
    }

    public void setStartingMoney(double startingMoney) {
        this.startingMoney = startingMoney;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.occupationName);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.startingMoney) ^ (Double.doubleToLongBits(this.startingMoney) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.bonus) ^ (Double.doubleToLongBits(this.bonus) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Occupation{" + "occupationName=" + occupationName + ", startingMoney=" + startingMoney + ", bonus=" + bonus + '}';
    }

    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Occupation other = (Occupation) obj;
        if (Double.doubleToLongBits(this.startingMoney) != Double.doubleToLongBits(other.startingMoney)) {
            return false;
        }
        if (Double.doubleToLongBits(this.bonus) != Double.doubleToLongBits(other.bonus)) {
            return false;
        }
        if (!Objects.equals(this.occupationName, other.occupationName)) {
            return false;
        }
        return true;
    }
    
    
    
}
