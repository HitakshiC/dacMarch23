

/*7.Write a program to perform below operations on byte type to get:
 a. The number of bits used to represent a byte value 
 b. The number of bytes used to represent a byte value 
 c. The minimum value a byte
  d. The maximum value a byte */

  class q7_a {
    public static void main(String args[]){
    
        System.out.println("BYTE VALUE : "+Byte.SIZE);
    }
}

class q7_b {
    public static void main(String args[]){
    
        System.out.println("BYTE VALUE : "+Byte.BYTES);
    }
}


class q7_c {
    public static void main(String args[]){
    
        System.out.println("MINIMUM VALUE : "+Byte.MIN_VALUE);
    }
}

class q7_d {
    public static void main(String args[]){
    
        System.out.println("MINIMUM VALUE : "+Byte.MAX_VALUE);
    }
}
