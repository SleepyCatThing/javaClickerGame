package clickergame;
import javax.swing.*;
import java.awt.event.ActionEvent;

class PlayerData{
    //Setting the starting values of all of the silly important variables
    //in the future, these will be saved to a different file periodically and the values on opening the program will be pulled from there
    //manual saves only will be supported but autosaving is probably default- after important actions and every minute or so
    //there will also be... a lot more! 
    int clickValue = 1;
    float clickMod = 1;
    float passiveValue = 1;
    float passiveMod = 1;
    float score = 0;

    //get methods
    float getScore() {
        return this.score;
    }
    int getClickValue() {
        return clickValue;
    }
    float getClickMod() {
        return clickMod;
    }
    float getPassiveMod() {
        return passiveMod;
    }
    float getPassiveValue() {
        return passiveValue;
    }

    //the clicker part of the clicker game
    void click(){
        this.score+=this.clickMod*this.clickValue;
    }

    //probably moves out of class, most of the stuff surrounding this should leave main
    void passiveScoreTick(){
        this.score+=this.passiveValue*this.passiveMod;
    }


    //move to another class probably since this isn't part of the player's data
    void openScoreMenu(){
        JFrame scoreWindow = new JFrame("Upgrades");
        JButton upgrade = new JButton("placeholder");
        upgrade.addActionListener((ActionEvent i) -> this.clickValue+=1);

        scoreWindow.add(upgrade);
        scoreWindow.setSize(100,100);
        scoreWindow.setVisible(true);
    }



    //methods im planning to do (off the top of my head, not a full list)
    //get click value to display how much you earn per click
    //passive income
    //display for that similarly
    //upgrade button
    //gui that pops up w upgrades
    //settings
    //save button
    //button hidden somewhere that sends you to the bulbapedia entry for skarmory

}
