package chapter6;

public class PhoneBillItemizer {

    public static void main(String[] args) {
        PhoneBill phoneBill1 = new PhoneBill(882122, 125, 100, 95);
        System.out.println(phoneBill1.printBill());
    }
}
