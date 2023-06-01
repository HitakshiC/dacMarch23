/*Write a program to perform below operations on float type to get: 
a. The number of bits used to represent a float value
 b. The number of bytes used to represent a float value 
 c. The minimum value a float
  d. The maximum value a float */
class q23 {
    public static void main(String [] args){
        System.out.println("Float in bits Value : "+Float.SIZE);
       System.out.println("Float in bytes Value : "+Float.BYTES);
        System.out.println("MINIMUM VALUE : "+Float.MIN_VALUE);
        System.out.println("MAXIMUM VALUE : "+Float.MAX_VALUE);

    }
}
