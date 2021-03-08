package chapter4;

import java.util.Scanner;

/*
Chapter 4d - Nested Loops
Find the average of each student's test scores
 */
public class AverageTestScores {

    public static void main(String[] args){
        // Initialize what we know
        int numberOfStudents = 24;
        int numberOfTests = 4;

        Scanner scanner = new Scanner(System.in);

        // Process all students
        for(int id = 1; id <= numberOfStudents; id++){
            System.out.println("For student #: " + id);
            double totalTestScores = 0;
            for(int x = 1; x <= numberOfTests; x++){
                System.out.println("Enter in your score for test #" + x);
                totalTestScores = totalTestScores + scanner.nextDouble();
            }
            double averageTestScore = totalTestScores / numberOfTests;
            System.out.println("The average score for student id#" + id + " is " + averageTestScore);
        }
        scanner.close();
    }
}
