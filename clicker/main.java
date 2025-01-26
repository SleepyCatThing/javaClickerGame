import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;  

public class main{
    public static void main(String[] args) {
        playerData playerPlaying = new playerData();

        // Make the window i think
        JFrame window = new JFrame("game!");
        //I don't actually know how the bounds work i just put random numbers in
        //saw that they were used in... one of the swing hello world programs i looked at
        window.setBounds(50, 50, 100, 100);

        //button.
        JButton scoreClick = new JButton(playerPlaying.getScore());
        scoreClick.setBounds(5, 5, 10, 10);
        //I don't know how long this took me but i hate it 
        scoreClick.addActionListener(new ActionListener(){
            //WHY ARE THERE SO MANY CURLY BRACKETS IM JUST MAKING A BUTTON LIKE, DO SOMETHING
            public void actionPerformed(ActionEvent i){
                playerPlaying.click();
                scoreClick.setText(Integer.toString(playerPlaying.score));
                scoreClick.repaint();
            }
        });

        //make the window appear
        window.add(scoreClick);
        window.setSize(100,100);  
        window.setVisible(true); 
            
        
    }

}
