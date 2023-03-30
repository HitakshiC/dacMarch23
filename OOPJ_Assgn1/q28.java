/*Write a program to convert:
a. double value into String
b. double value into Double instance.
c. String instance into Double instance.
d. double value into binary, octal and hexadecimal string
(Note: Here you can use doubleToDoubleBits() method aDouble with methods of Double class). */
class q28 {
    public static void main(String [] args){
        double a =45.63;
        System.out.println("String :"+Double.toString(a));
        System.out.println("Double :"+Double.valueOf(a));
        String s = "235";
        System.out.println("String :"+Double.valueOf(s));

        System.out.println("Binary String :"+Double.doubleToLongBits(a));
        System.out.println("Octal String :"+Double.doubleToLongBits(a));
        System.out.println("Hexadecimal String :"+Double.toHexString(a));
        
    }
}
