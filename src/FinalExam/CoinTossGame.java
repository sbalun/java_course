package FinalExam;

import java.util.Scanner;

public class CoinTossGame {

    public static void main(String[] args) {
        Player player1 = new Player("Scott");
        Player player2 = new Player("Brooke");

        Scanner scanner = new Scanner(System.in);
        System.out.println(player1.getName() + ", what is your guess? Heads or Tails? ");
        player1.setGuess(scanner.next());
        System.out.println("Your guess is " + player1.getGuess());
    }
}
