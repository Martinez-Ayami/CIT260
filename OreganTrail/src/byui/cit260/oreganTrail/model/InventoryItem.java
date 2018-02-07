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
 * @author Randy Beckford
 */
public class InventoryItem implements Serializable{
    private String inventoryType;
    private double quantityStock;
    private double requiredAmount;
    private Game game;
    private ArrayList<ResourcesScene> resourcesScenes = new ArrayList<ResourcesScene>();

    public InventoryItem() {
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public double getQuantityStock() {
        return quantityStock;
    }

    public void setQuantityStock(double quantityStock) {
        this.quantityStock = quantityStock;
    }

    public double getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(double requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public ArrayList<ResourcesScene> getResourcesScenes() {
        return resourcesScenes;
    }

    public void setResourcesScenes(ArrayList<ResourcesScene> resourcesScenes) {
        this.resourcesScenes = resourcesScenes;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.inventoryType);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.quantityStock) ^ (Double.doubleToLongBits(this.quantityStock) >>> 32));
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.requiredAmount) ^ (Double.doubleToLongBits(this.requiredAmount) >>> 32));
        hash = 11 * hash + Objects.hashCode(this.game);
        hash = 11 * hash + Objects.hashCode(this.resourcesScenes);
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
        final InventoryItem other = (InventoryItem) obj;
        if (Double.doubleToLongBits(this.quantityStock) != Double.doubleToLongBits(other.quantityStock)) {
            return false;
        }
        if (Double.doubleToLongBits(this.requiredAmount) != Double.doubleToLongBits(other.requiredAmount)) {
            return false;
        }
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        if (!Objects.equals(this.game, other.game)) {
            return false;
        }
        if (!Objects.equals(this.resourcesScenes, other.resourcesScenes)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "inventoryType=" + inventoryType + ", quantityStock=" + quantityStock + ", requiredAmount=" + requiredAmount + ", game=" + game + ", resourcesScenes=" + resourcesScenes + '}';
    }

    
        

    }
