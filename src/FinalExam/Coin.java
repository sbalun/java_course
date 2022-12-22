package FinalExam;

import java.util.Random;

public class Coin {
    private String heads;
    private String tails;

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    private String side = "heads";

    public String flip(){
        Random rand = new Random();
        int randomNumber = rand.nextInt();
        if (randomNumber % 2 == 0){
            side = "tails";
        }
        return side;
    }
}
