package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    // Constants.  Variables that Don't change, use final keyword
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args){
        int [] myTicket;
        myTicket = generateNumbers();
        Arrays.sort(myTicket);
        printTicket(myTicket);
    }

    public static int[] generateNumbers(){
        int [] ticket = new int[LENGTH];
        Random random = new Random();
        for(int i = 0; i < LENGTH; i++){

            int randomNumber;

            /* Do Generate a random number then search to make sure it doesn't
               already exist in the array.  If it do, regenerate and search again
             */

            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            } while (search(ticket, randomNumber));
            // randomNumber is unique if we get here. Add it to the array.
            ticket[i] = randomNumber;
        }
        return ticket;
    }

    /**
     * Does a sequential search on the array to find a value
     * @param array Array to search through
     * @param numberToSearchFor Value to search for
     * @return true if found, else false
     */
    private static boolean search(int[] array, int numberToSearchFor) {
        // This is called an advanced loop
        // - It iterates thru 'array' and each time
        // - assigns the current element to 'value'
        for (int value : array){
            if (value == numberToSearchFor){
                return true;
            }
        }
        // If we get to this point the entire array
        // was searched and the value was not found
        return false;
    }

    /**
     * Does a binary search on the array to find a value
     * @param array is the array to search
     * @param numberToSearchFor is the number your are searching for
     */
    public static boolean binarySearch(int[] array, int numberToSearchFor){

        // Array must be sorted first
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, numberToSearchFor);
        if (index > 0){
            return true;
        }else{
            return false;
        }
    }
    public static void printTicket(int [] ticket){
        for(int i = 0; i < LENGTH; i++){
            System.out.print(ticket[i] + " | ");
        }
    }
}
