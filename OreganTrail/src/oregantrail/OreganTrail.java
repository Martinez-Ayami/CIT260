/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregantrail;

import byui.cit260.oreganTrail.model.Player;
import byui.cit260.oreganTrail.model.Game;
import byui.cit260.oreganTrail.model.SavedGame;
import byui.cit260.oreganTrail.model.Actor;
import byui.cit260.oreganTrail.model.Occupation;
import byui.cit260.oreganTrail.model.Map;
import byui.cit260.oreganTrail.model.Location;
import byui.cit260.oreganTrail.model.InventoryItem;
import byui.cit260.oreganTrail.model.RegularSceneType;
import byui.cit260.oreganTrail.model.ResourcesScene;
import byui.cit260.oreganTrail.model.HuntScene;
import byui.cit260.oreganTrail.model.RiverScene;
import byui.cit260.oreganTrail.model.QuestionScene;
import byui.cit260.oreganTrail.model.Question;
/**
 *
 * @author Randy ther Master
 */
public class OreganTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player playerOne = new Player();
        playerOne.setName("Ayami Martinez");
        playerOne.setBestTime(7.00);
        
        Game gameOne = new Game();
        gameOne.setTotalTime("34:00");
        gameOne.setNoPeople(5);
        
        SavedGame savedOne = new SavedGame();
        savedOne.setDate("Feb 6");
        
        Actor actorOne = new Actor();
        actorOne.setName("John Johns");
        actorOne.setDescription("The fastest of them all.");
        actorOne.setHealth(100);
        
        Occupation occupationOne = new Occupation();
        occupationOne.setOccupationName("Farmer");
        occupationOne.setStartingMoney(1500);
        occupationOne.setBonus(3);
        
        Map mapOne = new Map();
        mapOne.setDescription("A map of the country.");
        mapOne.setPositionCount(12);
        mapOne.setCurrentPosition(03);
        
        Location locationOne = new Location();
        locationOne.setPosition(8);
        locationOne.setVisited(8);
        locationOne.setAmountRemaining(5);
        
        InventoryItem inventoryItemOne = new InventoryItem();
        inventoryItemOne.setInventoryType("Food");
        inventoryItemOne.setQuantityStock(8);
        inventoryItemOne.setRequiredAmount(5);
        
        RegularSceneType regularSceneTypeOne = new RegularSceneType();
        regularSceneTypeOne.setDescription("The city of the wanderers");
        regularSceneTypeOne.setBlocked("Welcome to the city.");
        regularSceneTypeOne.setSymbol(5);
        
        ResourcesScene resourcesSceneOne = new ResourcesScene();
        resourcesSceneOne.setAmount(4);
        
        HuntScene huntSceneOne = new HuntScene();
        huntSceneOne.setTime(2);
        huntSceneOne.setAnimal("Bear");
        huntSceneOne.setProbability(60);
        huntSceneOne.setFood(80);
        
        RiverScene riverSceneOne = new RiverScene();
        riverSceneOne.setRiverDepth(10);
        riverSceneOne.setRiverLength(45);
        
        QuestionScene questionSceneOne = new QuestionScene();
        questionSceneOne.setNoToAnswer("Answer number one");
        questionSceneOne.setBonus(45);
        
        Question questionOne = new Question();
        questionOne.setQuestion("This is a question");
        questionOne.setAnswer("This is an answer");
        
        System.out.println(playerOne);
        System.out.println(gameOne);
        System.out.println(savedOne);
        System.out.println(actorOne);
        System.out.println(occupationOne);
        System.out.println(mapOne);
        System.out.println(locationOne);
        System.out.println(inventoryItemOne);
        System.out.println(regularSceneTypeOne);
        System.out.println(resourcesSceneOne);
        System.out.println(huntSceneOne);
        System.out.println(riverSceneOne);
        System.out.println(questionSceneOne);
        System.out.println(questionOne);
        
    }
    
}
