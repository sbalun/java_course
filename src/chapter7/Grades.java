package chapter7;

import java.util.Scanner;

/* Create a new program that allows a user to enter any
 * number of grades and provides them with their
 * average score, highest score and lowest score
 */
public class Grades {

    private static int grades[];
    private static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("How many grades you wanna enter, homey?");
        grades = new int[myScanner.nextInt()];

        getGrades();

        public static void getGrades(){
            // TBD
        }



    }
}
