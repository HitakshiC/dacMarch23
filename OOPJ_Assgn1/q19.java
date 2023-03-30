/*Write a program to perform below operations on long type to get: 
a. The number of bits used to represent a long value 
b. The number of bytes used to represent a long value
 c. The minimum value a long 
 d. The maximum value a long
 */
 class q19 {
    public static void main(String []args) {
        System.out.println("BITS:"+Long.SIZE);
        System.out.println("BYTES:"+Long.BYTES);
        System.out.println("MINIMUM VALUE:"+Long.MIN_VALUE);
        System.out.println("MAXIMUM VALUE:"+Long.MAX_VALUE); 
    }
}
