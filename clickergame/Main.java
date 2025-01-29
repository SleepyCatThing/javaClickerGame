package clickergame;

import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;  
import javax.swing.Timer;

public class Main{
    public static void main(String[] args) {
        PlayerData player = new PlayerData();

        // Make the window i think
        JFrame window = new JFrame("game!");
        //I don't actually know how the bounds work i just put random numbers in
        //saw that they were used in... one of the swing hello world programs i looked at
        window.setBounds(50, 50, 100, 100);

        //button.
        JButton scoreClick = new JButton(String.valueOf(player.getScore()));
        scoreClick.setBounds(5, 5, 10, 10);
        //I don't know how long this took me but i hate it 
        scoreClick.addActionListener((ActionEvent i) -> {
            player.click();
            scoreClick.setText(String.valueOf(player.getScore()));
            scoreClick.repaint();
        } //WHY ARE THERE SO MANY CURLY BRACKETS IM JUST MAKING A BUTTON LIKE, DO SOMETHING
        );

        int timer = 1000;
        ActionListener timeEventHandler = (ActionEvent i) -> {
            player.passiveScoreTick();
            scoreClick.setText(String.valueOf(player.getScore()));
            scoreClick.repaint();
        };
        new Timer(timer, timeEventHandler).start();



        //make the window appear
        window.add(scoreClick);
        window.setSize(100,100);  
        window.setVisible(true); 
            
        
    }

}
