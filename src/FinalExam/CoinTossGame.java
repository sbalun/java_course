package FinalExam;

import java.util.Scanner;

public class CoinTossGame {
    public static void main(String[] args) {

        Player player1 = new Player("Scott");
        Player player2 = new Player("Brooke");

        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println(player1.getName() + ", what is your guess? heads or tails? ");
            player1.setGuess(scanner.next());
        } while (!player1.getGuess().equals("heads") && (!player1.getGuess().equals("tails")));

        System.out.println(player1.getName() + " picked " + player1.getGuess());

        if(player1.getGuess().equals("heads")){
            player2.setGuess("tails");
        }else{
            player2.setGuess("heads");
        }
        System.out.println(player2.getName() + " gets " + player2.getGuess());

        Coin coin = new Coin();
        String result = coin.flip();
        System.out.println("The result of the coin flip is " + result);
        if(player1.getGuess().equals(result)){
            System.out.println(player1.getName() + " is the winner");
        }else{
            System.out.println(player2.getName() + " is the winner");
        }
    }
}
