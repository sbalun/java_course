package chapter6;
/*
* a phone bill should have:
*   an ID,
*   a base class,
*   a number of allotted minutes
*   and a number of minutes used.
* And then, it should also be able to
*   calculate the overage,
*   calculate the tax, and
*   calculate the total.
* It should also be able to print an itemized bill.
* You should also include three constructors
*   a default one
*   one that accepts the ID only
*   one that accepts all fields
* Now no matter which of these constructors you use, all fields should be set eventually.
* Then you can also create a different class that instantiates the PhoneBill and
* prints out an itemized bill.
*/
public class PhoneBill {

    // Global Variables
    private double overageRate = .25;
    private double planFee;
    private int overageMinutes = 0;
    private int id;
    private int allocattedMinutes;
    private int usedMinutes;

    // Constructors
    public PhoneBill(){
        id = 999999;
        planFee = 79.99;
        overageMinutes = 0;
        allocattedMinutes = 500;
        usedMinutes = 0;
    }

    public PhoneBill(int id){
        this.id = id;
        planFee = 79.99;
        overageMinutes = 0;
        allocattedMinutes = 500;
        usedMinutes = 0;
    }

    public PhoneBill(int identifier, double planFee, int allocatedMinutes, int usedMinutes){
        this.id = identifier;
        this.planFee = planFee;
        this.allocattedMinutes = allocatedMinutes;
        this.usedMinutes = usedMinutes;
    }

    // Getters and Setters
    public int getID(){
        return id;
    }

    public void setID(int id){
        this.id = id;
    }

    public double getPlanFee(){
        return planFee;
    }

    public void setPlanFee(double planFee){
        this.planFee = planFee;
    }

    public int getAllocattedMinutes(){
        return allocattedMinutes;
    }

    public void setAllocattedMinutes(int minutes){
        allocattedMinutes = minutes;
    }

    public int getUsedMinutes(){
        return usedMinutes;
    }

    public void setUsedMinutes(int minutes){
        usedMinutes = minutes;
    }

    // calculateTax method
    public double calculateTax(){
        double taxRate = .15;
        return taxRate * (planFee + calculateOverageFees());
    }

    // calculateOverageFees method
    public double calculateOverageFees(){
        return calculateOverageMinutes() * overageRate;
    }

    // getBillTotal method
    public double getTotalBill(){
        return planFee + calculateOverageFees() + calculateTax();
    }

    // printBill method
    public String printBill(){
        return "Your total bill is $" + getTotalBill() + "\n"
                + "Your plan fee is $" + planFee + "0"  + "\n"
                + "You have " + calculateOverageMinutes() + "0" + " overage minutes" + "\n"
                + "Your tax is $" + calculateTax() + "\n"
                + "Your overage fee is $" + calculateOverageFees() + "0";
    }

    //
    public double calculateOverageMinutes(){
        overageMinutes = 0;
        if(usedMinutes > allocattedMinutes){
            overageMinutes = usedMinutes - allocattedMinutes;
        }
        return overageMinutes;
    }
}
