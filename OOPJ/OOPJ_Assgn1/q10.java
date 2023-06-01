/* 10.Write a program to perform below operations on char type to get:
 a. The number of bits used to represent a char value 
b. The number of bytes used to represent a char value 
c. The minimum value a char 
d. The maximum value a char */
class q10 {
    public static void main(String [] args){
        System.out.println("Char in bits Value : "+Character.SIZE);
       System.out.println("Char in bytes Value : "+Character.BYTES);
        System.out.println("MINIMUM VALUE : "+Character.MIN_VALUE);
        System.out.println("MAXIMUM VALUE : "+Character.MAX_VALUE);

    }
}
