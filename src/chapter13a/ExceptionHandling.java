package chapter13a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

        //createNewFile();
        numbersExceptionHandling();
    }

    public static void numbersExceptionHandling(){
        File file = new File("resources/numbers.txt");
        Scanner fileReader = null;
        try{
            fileReader = new Scanner(file);

            while(fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        }catch(FileNotFoundException | InputMismatchException e){
            e.printStackTrace();
            //Even if you finish everything in the try,
            //even if no exceptions are thrown, anything
            //placed inside finally will execute no matter what
        }finally{
            fileReader.close();
        }
    }

    private static void createNewFile() {

        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
            // - Use the Exception object in the catch block as it is the super class
            // of all the other exceptions which inherit from Exception so you can
            // use the superclass object, Exeption, as a catch-all
            //
            // - When an exception is caught it provides a substack trace as well
        } catch (Exception e) {
            System.out.println("Directory does not exist homey");
            e.printStackTrace();
        }
    }

}
