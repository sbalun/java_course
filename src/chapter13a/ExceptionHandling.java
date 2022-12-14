package chapter13a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

        //createNewFile();
        numbersExceptionHandling();
    }

    private static void numbersExceptionHandling() {

        File file = new File("resources/nonexistent.txt");
        try{
            Scanner fileReader = new Scanner(file);

            while(fileReader.hasNext()){
                double num = 
            }
        }catch(fileNotFoundException e) {
            System.out.println();
        }
    }

    private static void createNewFile() {

        File file = new File("resources/nonexistent.txt");
        try{
            file.createNewFile();
        }catch (Exception e){
            System.out.println("Directory does not exist homey");
            e.printStackTrace();
        }
    }

}
