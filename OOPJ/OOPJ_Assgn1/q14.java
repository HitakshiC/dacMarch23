/*Write a program to convert state of Short instance into byte, short, int, long, float and double.*/
class q14 {
    public static void main(String [] args){
        Short b =new Short((short)20);
        System.out.println("byte: "+b.byteValue());
        System.out.println("short: "+b.shortValue());
        System.out.println("int: "+b.intValue());
        System.out.println("long: "+b.longValue());
        System.out.println("float: "+b.floatValue());
        System.out.println("double: "+b.doubleValue());
    
}
}
