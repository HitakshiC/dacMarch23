/*You are required to write a Java program to calculate the telephone bill for a given
customer based on their usage. The program should take the following inputs from
the user:
a. Customer name
b. Phone number
c. Number of calls made
d. Duration of calls (in minutes)
The program should then calculate the bill for the customer based on the following
criteria:
a. The first 100 calls are charged at a rate of 50 cents per call.
b. Calls beyond the first 100 are charged at a rate of 25 cents per call.
c. All calls are subject to a minimum duration of 1 minute.
d. Calls with a duration less than 1 minute are rounded up to 1 minute.
e. There is a flat rate of $10 per month for all customers.
6. */
import java.util.Scanner;
class TelephoneBill{
    static  Scanner sc = new Scanner(System.in);
String customerName;
String phoneNumber;
int noOfCalls;
float duration;


public TelephoneBill(){
    System.out.print("Telephone Bill");
    System.out.print("Enter the Customer name: ");
    this.customerName =sc.next();
    System.out.print("Enter the Phone number: ");
    this.phoneNumber=sc.next();
    System.out.print("Enter the Number of Calls: ");
    this.noOfCalls =sc.nextInt();
    System.out.print("Enter the duration: ");
    this.duration=sc.nextFloat();
   
}

public double calculateBill(){
    float flat =10;
    
    double bill=1;
    if(this.noOfCalls<=100){
        bill = this.noOfCalls*this.duration*0.5*flat;
    }
    else{
        bill=(50+(this.noOfCalls-100))*duration*flat;
    }
   return bill;
}

public void printRecord(){
   
    System.out.println("Name: "+this.customerName);
    System.out.println("Phone: "+this.phoneNumber);
    System.out.println("TelephoneBill: Rs."+calculateBill());
}

}


public class q5 {
    public static void main (String[]args){
       
        TelephoneBill t1= new TelephoneBill();
        t1.printRecord();
        }
     



    }
