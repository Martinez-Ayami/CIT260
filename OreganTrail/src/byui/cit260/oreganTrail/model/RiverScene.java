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
 * @author Randy Beckford
 */
public class RiverScene implements Serializable{
    private double riverDepth;
    private double riverLength;

    public RiverScene() {
    }

    public double getRiverDepth() {
        return riverDepth;
    }

    public void setRiverDepth(double riverDepth) {
        this.riverDepth = riverDepth;
    }

    public double getRiverLength() {
        return riverLength;
    }

    public void setRiverLength(double riverLength) {
        this.riverLength = riverLength;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.riverDepth) ^ (Double.doubleToLongBits(this.riverDepth) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.riverLength) ^ (Double.doubleToLongBits(this.riverLength) >>> 32));
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
        final RiverScene other = (RiverScene) obj;
        if (Double.doubleToLongBits(this.riverDepth) != Double.doubleToLongBits(other.riverDepth)) {
            return false;
        }
        if (Double.doubleToLongBits(this.riverLength) != Double.doubleToLongBits(other.riverLength)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RiverScene{" + "riverDepth=" + riverDepth + ", riverLength=" + riverLength + '}';
    }

    
    
}
