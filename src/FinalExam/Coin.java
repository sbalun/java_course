package FinalExam;

import java.util.Random;

public class Coin {
    private int heads = 0;
    private int tails = 1;
    public int side = heads;

    private int flip(){
        Random rand = new Random();
        int myVar = rand.nextInt();
        if (myVar % 2 == 0){
            side = tails;
        }
        return side;
    }
}
