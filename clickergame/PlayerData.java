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

    //returns score as string so it can go on button
    float getScore() {
        return this.score;
    }

    //i realize as im writing this that this isn't a good way to handle the score because clickmod being at something like 1.1 would do absolutely nothing for the calculations
    //ill fix that in the morning im really tired
    //this SHOULD update score to the correct value per click
    void click(){
        this.score+=this.clickMod*this.clickValue;
    }

    void passiveScoreTick(){
        this.score+=this.passiveValue*this.passiveMod;
    }

    void openScoreMenu(){
        JFrame scoreWindow = new JFrame("Upgrades");
        JButton upgrade = new JButton("placeholder");
        upgrade.addActionListener((ActionEvent i) -> this.clickValue+=1);
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
