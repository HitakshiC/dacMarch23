import java.util.Scanner;



class ElectricityBill{
    String customerName;
    double unitsConsumed;
    double billAmount;

    ElectricityBill(String customerName,double unitsConsumed){
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
    }
    public  double calculateBillAmount(){
        if(this.unitsConsumed <=100){
            this.billAmount = this.unitsConsumed*5;
        }
    else if((this.unitsConsumed>100) && (this.unitsConsumed<=200)){
        this.billAmount = this.unitsConsumed*7;
       }
       else{
        this.billAmount = this.unitsConsumed*10;
       }
       return billAmount;
    }
  
    public void display(){
        System.out.println("Customer Name :"+ this.customerName);
        System.out.println("Units Consumed :"+ this.unitsConsumed);
        System.out.println("Bill Amount :Rs. "+calculateBillAmount());

    }
}
public class q4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Electricity Bill");
        System.out.println("Enter the name and units:");
        ElectricityBill e1 = new ElectricityBill(sc.next(),sc.nextDouble());
        e1.display();
    }
    
}