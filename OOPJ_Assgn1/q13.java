/*Write a program to convert:
a. short value into String
b. short value into Short instance.
c. String instance into Short instance.
 */
class q13 {
    public static void main(String [] args){
    short a =45;
    System.out.println("String :"+Short.toString(a));
    System.out.println("Short :"+Short.valueOf(a));
    String s = "MUMBAI";
    System.out.println("String :"+Short.valueOf(a));
    
}
    
}
