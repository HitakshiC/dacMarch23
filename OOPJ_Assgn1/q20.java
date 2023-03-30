/*Write a program to convert:
a. long value into String
b. long value into Long instance.
c. String instance into Long instance.
d. long value into binary, octal and hexadecimal string. */
class q20 {
    public static void main(String [] args){
        long a =45;
        System.out.println("String :"+Long.toString(a));
        System.out.println("Integer :"+Long.valueOf(a));
        String s = "235";
        System.out.println("String :"+Long.valueOf(s));

        System.out.println("Binary String :"+Long.toBinaryString(a));
        System.out.println("Octal String :"+Long.toOctalString(a));
        System.out.println("Hexadecimal String :"+Long.toHexString(a));
        
    }
}
