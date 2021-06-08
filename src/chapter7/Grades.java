package chapter7;

import java.util.Scanner;

/* Create a new program that allows a user to enter any
 * number of grades and provides them with their
 * average score, highest score and lowest score
 */
public class Grades {

    // We need an array in which to store our grades
    private static int grades[];
    // We need a scanner to get user input
    private static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("How many grades you wanna enter, homey? ");
        grades = new int[myScanner.nextInt()];
        getGrades();
        System.out.println("Average: " + String.format("%.2f", calculateAverage()));
        System.out.println("Highest: " + String.format("%.2f", getHighest()));
        System.out.println("Lowest: " + String.format("%.2f", getlowest()));

    }
    public static void getGrades(){
        for(int i = 0; i < grades.length; i++){
            System.out.println("Please enter grade #"+ (i+1) + ":");
            // We declared the array grades as a class variable so we can use it here
            grades[i] = myScanner.nextInt();
        }
    }

    public static int calculateSum(){
        int sum = 0;
        for(int grade : grades){
            sum = sum + grade;
        }
        return sum;
    }

    public static double calculateAverage(){
        return calculateSum()/grades.length;
    }

    public static double getHighest(){
        int highest = grades[0];
        for(int grade : grades){
            if(grade > highest){
                highest = grade;
            }
        }
        return highest;
    }

    public static double getlowest(){
        int lowest = grades[0];
        for(int grade : grades){
            if(grade < lowest){
                lowest = grade;
            }
        }
        return lowest;
    }

}
