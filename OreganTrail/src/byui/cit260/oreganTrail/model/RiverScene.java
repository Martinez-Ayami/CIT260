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
    private String riverDepth;
    private String riverLength;
    private double attribute;

    public RiverScene() {
    }

    
    
    public String getRiverDepth() {
        return riverDepth;
    }

    public void setRiverDepth(String riverDepth) {
        this.riverDepth = riverDepth;
    }

    public String getRiverLength() {
        return riverLength;
    }

    public void setRiverLength(String riverLength) {
        this.riverLength = riverLength;
    }

    public double getAttribute() {
        return attribute;
    }

    public void setAttribute(double attribute) {
        this.attribute = attribute;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.riverDepth);
        hash = 29 * hash + Objects.hashCode(this.riverLength);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.attribute) ^ (Double.doubleToLongBits(this.attribute) >>> 32));
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
        if (Double.doubleToLongBits(this.attribute) != Double.doubleToLongBits(other.attribute)) {
            return false;
        }
        if (!Objects.equals(this.riverDepth, other.riverDepth)) {
            return false;
        }
        if (!Objects.equals(this.riverLength, other.riverLength)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RiverScene{" + "riverDepth=" + riverDepth + ", riverLength=" + riverLength + ", attribute=" + attribute + '}';
    }
    
   
    
    
}
