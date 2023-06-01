/* Write a program to perform below operations on short type to get:
 a. The number of bits used to represent a short value
  b. The number of bytes used to represent a short value 
  c. The minimum value a short
   d. The maximum value a short*/
class q12 {
    public static void main (String args[]){
        System.out.println("BITS:"+Short.SIZE);
        System.out.println("BYTES:"+Short.BYTES);
        System.out.println("MINIMUM VALUE:"+Short.MIN_VALUE);
        System.out.println("MAXIMUM VALUE:"+Short.MAX_VALUE);
    }
}
