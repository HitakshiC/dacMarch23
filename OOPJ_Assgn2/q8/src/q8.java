import java.util.Scanner;
class Rational{
    private double numerator1;
    private double numerator2;
    private double denominator1;
    private double denominator2;

    Rational( ) {
        this.numerator1 = 0.0;
        this.numerator2 = 0.0;
        this.denominator1 = 0.0;
        this.denominator2 = 0.0;
    }
    Scanner sc = new Scanner(System.in);
    public void getNumber( ) {
        System.out.println("Enter the first rational number :");
        this.numerator1 = sc.nextDouble();
        System.out.println("Numerator:"+this.numerator1);
        this.denominator1 = sc.nextDouble();
        System.out.println("Denominator:"+this.denominator1);
        System.out.println("Enter the second rational number :");
        this.numerator2 = sc.nextDouble();
        System.out.println("Numerator:"+this.numerator2);
        this.denominator2 = sc.nextDouble();
        System.out.println("Denominator:"+this.denominator2);  
    }
    public int setOperation( ) {
        System.out.println("Enter the arithmetic operation :0.Exit 1. for(+), 2. for(-), 3. for(*), 4. for(/)");
        int choice = sc.nextInt();
        return choice;
    }
    void calculateAddition( ) {
        double add = (this.numerator1 / this.denominator1) + (this.numerator2 / this.denominator2);
        System.out.println("Addition = "+add);
    }
    void calculateSubstraction( ) {
        double sub = (this.numerator1 / this.denominator1) - (this.numerator2 / this.denominator2);
        System.out.println("Substraction = "+sub);
    }
    void calculateMultiplication( ) {
        double multi = (this.numerator1 / this.denominator1) * (this.numerator2 / this.denominator2);
        System.out.println("Multiplicationtion = "+multi);
    }
    void calculateDivsion( ) {
        double divsion = (this.numerator1 / this.denominator1) / (this.numerator2 / this.denominator2);
        System.out.println("Divsion = "+divsion);
    }
}

public class q8 {
    public static void main(String[] args) {
        Rational num = new Rational();
        num.getNumber();
        int choice = num.setOperation(); 
        while(choice!=0){
        switch(choice) {
            case 1: num.calculateAddition();
            break;
        case 2: num.calculateSubstraction();
            break;
        case 3: num.calculateMultiplication();
            break; 
        case 4: num.calculateDivsion();
            break; 
        }
        }   
    }
    
}
