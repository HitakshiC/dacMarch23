import java.util.Scanner;
class Bank {
     String accountHolderName;
     int accountNumber;
     double accountBalance;

    Bank( ) {
        this.accountHolderName = "Hrishikesh Dhormare";
        this.accountNumber = 123456;
        this.accountBalance = 200000.564;
    }    
    Scanner sc = new Scanner(System.in);
    public int getChoice( ) {
      System.out.println("0. Exit");
        System.out.println("1. Create a new account");
        System.out.println("2. Deposit money into an account");
        System.out.println("3. Withdraw money from an account");
        System.out.println("4. Display the account balance");
        System.out.println("5. Display the account holder's information");
        System.out.println("Select the option for operation");
        int choice = sc.nextInt();
        return  choice;
    }
    public void createAccount( ) {
        System.out.println("Enter the account holder's name : "); 
        this.accountHolderName = sc.next();
        this.accountNumber  = 123456;
        this.accountBalance = 0.0;
        System.out.println("Account Holder Name :"+this.accountHolderName+" Account number: "+this.accountNumber+" Acoount balance: "+this.accountBalance);    
    }
    public void depoistMoney( ) {
        System.out.println("Enter the account number : "); 
        int valid = sc.nextInt();
        System.out.println(valid);
        if(this.accountNumber == valid) {
            System.out.println("Enter the amount to be depoist : ");
            int amt = sc.nextInt();
            this.accountBalance = this.accountBalance + amt ;
            System.out.println("Account Balance : "+this.accountBalance);
        }
        else System.out.println("Error wrong Account number !!!");
    } 
    public void withdrawMoney( ) {
        System.out.println("Enter the account number : "); 
        int validcheck = sc.nextInt();
        System.out.println("Enter the amount to be withdraw : ");
        int amtwtd = sc.nextInt();
        if((this.accountNumber == validcheck) && (this.accountBalance >= amtwtd)) {
            this.accountBalance = this.accountBalance - amtwtd ;
            System.out.println("Account Balance : "+this.accountBalance);
        }
        else System.out.println("Error wrong Account number or Insufficient Balance !!!");
    }
    public void displayAccountBalance( ) {
        System.out.println("Enter the account number : "); 
        int valid1 = sc.nextInt();
        if(this.accountNumber==valid1) System.out.println("Account Balance : "+this.accountBalance);
        else System.out.println("Error wrong Account number or Insufficient Balance !!!");    
    }
    public void accountInformation( ) {
        System.out.println("Enter the account number : "); 
        int valid2 = sc.nextInt();
        if(this.accountNumber==valid2) System.out.println("Account Holder Name : "+this.accountHolderName+" Account Balance : "+this.accountBalance);
        else System.out.println("Error wrong Account number or Insufficient Balance !!!");        
    }
    }     
    



public class q6 {
    public static void main(String[] args) {
    Bank bank =  new Bank();
    int choice = bank.getChoice();
    while(choice!=0){
    switch(choice) {
        case 1: bank.createAccount();
            break;
        case 2: bank.depoistMoney();
            break;
        case 3: bank.withdrawMoney();
            break; 
        case 4: bank.displayAccountBalance();
            break; 
        case 5: bank.accountInformation();
            break;           

    }}
    }
    
}
