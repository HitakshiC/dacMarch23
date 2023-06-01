import java.util.*;
/*Pass integer, float and double value from command line.
 Parse it appropriately and perform arithmetic operations (+,-,*,/) on it. 
 Here you can you switch case. */
class q33 {
    public static void main(String args[]){
        int a = Integer.parseInt(args[0]);
        float b = Float.parseFloat(args[1]);
        double c= Double.parseDouble(args[2]);
        Scanner sc = new Scanner(System.in);
       char ch = sc.next().charAt(0);
        switch(ch){
            case '+':System.out.println("Addition:"+(a+b+c));
            break;
            case '-':System.out.println("Subtraction:"+(a-b-c));
            break;
            case '*':System.out.println("Multiplication:"+(a*b*c));
            break;
            case '/':System.out.println("Division:"+(a/(b/c)));
            break;
            default: System.out.println("Invalid!!");
            break;
        }
    }
}
