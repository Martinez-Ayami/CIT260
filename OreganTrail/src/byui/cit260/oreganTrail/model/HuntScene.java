/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oreganTrail.model;

import java.io.Serializable;
import java.sql.Time;
import java.util.Objects;

/**
 *
 * @author Randy Beckford
 */
public class HuntScene implements Serializable{
    private double time;
    private String animal;
    private double probability;
    private double food;

    public HuntScene() {
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }

    public double getFood() {
        return food;
    }

    public void setFood(double food) {
        this.food = food;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.time) ^ (Double.doubleToLongBits(this.time) >>> 32));
        hash = 83 * hash + Objects.hashCode(this.animal);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.probability) ^ (Double.doubleToLongBits(this.probability) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.food) ^ (Double.doubleToLongBits(this.food) >>> 32));
        return hash;
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
        final HuntScene other = (HuntScene) obj;
        if (Double.doubleToLongBits(this.time) != Double.doubleToLongBits(other.time)) {
            return false;
        }
        if (Double.doubleToLongBits(this.probability) != Double.doubleToLongBits(other.probability)) {
            return false;
        }
        if (Double.doubleToLongBits(this.food) != Double.doubleToLongBits(other.food)) {
            return false;
        }
        if (!Objects.equals(this.animal, other.animal)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HuntScene{" + "time=" + time + ", animal=" + animal + ", probability=" + probability + ", food=" + food + '}';
    }
    
    
     
}
