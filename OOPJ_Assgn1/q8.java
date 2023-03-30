
/*Write a program to convert:
a. byte value into String
b. byte value into Byte instance.
c. String instance into Byte instance. */
class q8_a {
    public static void main(String [] args){
        byte b = 25;
        String s = Byte.toString(b);
        System.out.println("String :"+s);
    }
}

class q8_b {
    public static void main(String [] args){
        byte b = 25;
         Byte b1 = Byte.valueOf(b);
        System.out.println("BYTE :"+b1);
    }
}

class q8_d {
    public static void main(String [] args){
    
        String s = "MUMBAI";
        Byte b = Byte.valueOf(s);
        System.out.println("BYTE :"+s);
    }
}
