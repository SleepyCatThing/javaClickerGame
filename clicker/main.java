import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;  

public class main{
    public static void main(String[] args) {
        playerData playerPlaying = new playerData();
        
        JFrame window = new JFrame("game!");
        window.setBounds(50, 50, 100, 100);
        
        JButton scoreClick = new JButton(playerPlaying.getScore());
        scoreClick.setBounds(5, 5, 10, 10);
        scoreClick.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent i){
                playerPlaying.click();
                scoreClick.setText(Integer.toString(playerPlaying.score));
                scoreClick.repaint();
            }
        });
        
        window.add(scoreClick);
        window.setSize(100,100);  
        window.setVisible(true); 
            
        
    }

}
