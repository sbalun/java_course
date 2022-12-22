package FinalExam;

import java.util.Scanner;

public class CoinTossGame {
    public static void main(String[] args) {

        Player player1 = new Player("Scott");
        Player player2 = new Player("Brooke");

        Scanner scanner = new Scanner(System.in);
        System.out.println(player1.getName() + ", what is your guess? Heads or Tails? ");
        player1.setGuess(scanner.next());
        System.out.println(player1.getName() + " chose " + player1.getGuess());

        if(player1.getGuess().equals("Heads")){
            player2.setGuess("Tails");
        }else{
            player2.setGuess("Heads");
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
