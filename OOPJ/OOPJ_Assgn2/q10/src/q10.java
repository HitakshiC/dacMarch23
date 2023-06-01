import java.util.Scanner;
class CreditScoreCalculator {
    private int creditHistory;
    private double creditUtilization;
    private boolean paymentHistory;
    CreditScoreCalculator( ) {
        this.creditHistory = 0;
        this.creditUtilization =0.0;
        this.paymentHistory = false; 
    }
    Scanner sc = new Scanner(System.in);
    public void getDetails( ) {
        System.out.println("Enter credit History :");
        this.creditHistory = sc.nextInt();
        System.out.println("Enter credit Utilization :");
        this.creditUtilization = sc.nextDouble();
        System.out.println("Enter (true) for Good payment History and (false) for Bad   :");
        this.paymentHistory = sc.nextBoolean();

    }
    public int calculateCreditScore( ) {
        if (this.paymentHistory) {
            int  creditScore = (this.creditHistory * 15) + (int)(this.creditUtilization * 30) + 55;
            return creditScore;
        }
        else {
            int  creditScore = (this.creditHistory * 15) + (int)(this.creditUtilization * 30) + 35;
            return creditScore;
        }      
    } 
}
public class q10 {
    public static void main(String[] args) {
       CreditScoreCalculator cal = new CreditScoreCalculator ();
       cal.getDetails();
       System.out.println("Credit Score = "+cal.calculateCreditScore());

    }
    
}
