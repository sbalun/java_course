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
    private double taxRate = .15;
    private double planFee;
    private int overageMinutes = 0;
    private int identifer;
    private int allocattedMinutes;
    private int usedMinutes;

    // Constructors
    public PhoneBill(){
        this.identifer = 999999;
        this.planFee = 0.00;
        this.overageMinutes = 0;
        this.allocattedMinutes = 0;
        this.usedMinutes = 0;
    }

    public PhoneBill(int identifier){
        this.identifer = identifier;
        this.planFee = 0.00;
        this.overageMinutes = 0;
        this.allocattedMinutes = 0;
        this.usedMinutes = 0;
    }

    public PhoneBill(int identifier, double planFee, int allocatedMinutes, int usedMinutes){
        this.identifer = identifier;
        this.planFee = planFee;
        this.allocattedMinutes = allocatedMinutes;
        this.usedMinutes = usedMinutes;
    }

    // calculateTax method
    public double calculateTax(){
        return this.planFee * taxRate;
    }

    // calculateOverageFees method
    public double calculateOverageFees(){
        return this.getOverageMinutes() * overageRate;
    }

    // getBillTotal method
    public double getTotalBill(){
        return this.planFee + calculateOverageFees() + calculateTax();
    }

    // printBill method
    public String printBill(){
        return "Your total bill is $" + getTotalBill() + "\n"
                + "Your plan fee is $" + planFee + "0"  + "\n"
                + "You have " + getOverageMinutes() + "0" + " overage minutes" + "\n"
                + "Your tax is $" + calculateTax() + "\n"
                + "Your overage fee is $" + calculateOverageFees() + "0";
    }

    public void setPlanFee(double planFee){
        this.planFee = planFee;
    }
    public double getPlanFee(){
        return this.planFee;
    }
    public double getOverageMinutes(){
        this.overageMinutes = 0;
        if(usedMinutes > allocattedMinutes){
            this.overageMinutes = usedMinutes - allocattedMinutes;
        }
        return overageMinutes;
    }
}
