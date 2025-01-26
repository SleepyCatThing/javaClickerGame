


public class playerData{
    int clickValue = 1;
    double clickMod = 1;
    int score = 0;
    
    public String getScore() {
        return Integer.toString(score);
    }

    public void click(){
        score+=(int)clickMod*clickValue;
    }


}
