/*Write a program to convert:
a. int value into String
b. int value into Integer instance.
c. String instance into Integer instance.
d. int value into binary, octal and hexadecimal string. */
class q16 {
    public static void main(String [] args){
        int a =45;
        System.out.println("String :"+Integer.toString(a));
        System.out.println("Integer :"+Integer.valueOf(a));
        String s = "235";
        System.out.println("String :"+Integer.valueOf(s));

        System.out.println("Binary String :"+Integer.toBinaryString(a));
        System.out.println("Octal String :"+Integer.toOctalString(a));
        System.out.println("Hexadecimal String :"+Integer.toHexString(a));
        
    }
}
