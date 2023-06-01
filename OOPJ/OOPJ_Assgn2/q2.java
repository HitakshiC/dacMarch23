import java.util.Scanner;
class BMI{
    private double height;
    private double weight;
    private double bmi; 
    BMI(){
        this.height=0.0;
        this.weight= 0.0;
    }

    public void setheight(double height){
        this.height= height;
    }
   public  void setweight(double weight){
        this.weight= weight;
    }

   public double getheight(){
        return this.height;
    }

   public double getweight(){
        return this.weight;
    }

   public double calcBMI(){
    bmi =weight/(height*height);
    return bmi;
   }

}





public class q2 {
   public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Height(meters): ");
    double height = sc.nextDouble();
    System.out.print("Enter the Weight(kg): ");
    double weight = sc.nextDouble();

    BMI b=new BMI();
    b.setheight(height);
    b.setweight(weight);
    System.out.print("BMI :"+b.calcBMI());
   } 
}
