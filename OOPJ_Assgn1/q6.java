/*Write a program to perform below operations on Boolean type to convert:
a. boolean value into String
b. boolean value into Boolean instance.
c. String value into boolean value
d. String value into Boolean instance. */

class q6_a{
    public static void main(String args[]){
       boolean b = true;
       String s = String.valueOf(b);
       System.out.println("String is :"+s);
    }
}

class q6_b{
 
    public static void main(String args[]){
       boolean b = true;
        Boolean b1 = Boolean.valueOf(b);
       System.out.println("Boolean value is :"+b1);
    }
}

class q6_c{
    public static void main(String args[]){
       String s = "CDAC";

       boolean b = Boolean.valueOf(s);
       
       System.out.println("Boolean is :"+b);
    }
}

class q6_d{
    public static void main(String args[]){
       String s = "CDAC";

       Boolean b = Boolean.valueOf(s);
       
       System.out.println("Boolean is :"+b);
    }
}