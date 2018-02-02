/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oreganTrail.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author ayami
 */
public class Map implements Serializable{
    //class instance variables
    private String description;
    private double positionCount;
    private double currentPosition;
    private ArrayList<Game> games = new ArrayList<Game>();

    public Map() {
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPositionCount() {
        return positionCount;
    }

    public void setPositionCount(double positionCount) {
        this.positionCount = positionCount;
    }

    public double getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(double currentPosition) {
        this.currentPosition = currentPosition;
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.description);
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.positionCount) ^ (Double.doubleToLongBits(this.positionCount) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.currentPosition) ^ (Double.doubleToLongBits(this.currentPosition) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "description=" + description + ", positionCount=" + positionCount + ", currentPosition=" + currentPosition + '}';
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
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.positionCount) != Double.doubleToLongBits(other.positionCount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.currentPosition) != Double.doubleToLongBits(other.currentPosition)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
    
    
}
