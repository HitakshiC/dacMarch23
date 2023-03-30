/*Write a program to convert:
a. float value into String
b. float value into Float instance.
c. String instance into Float instance.
d. float value into hexadecimal string. */
class q24 {
    public static void main(String args[]){
    float a =45.56f;
    System.out.println("String :"+Float.toString(a));
    System.out.println("Float :"+Float.valueOf(a));
    String s = "235";
    System.out.println("String :"+Float.valueOf(s));

  
    System.out.println("Hexadecimal String :"+Float.toHexString(a));
    
}
}
