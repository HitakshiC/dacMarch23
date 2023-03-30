import java.nio.charset.CharacterCodingException;

/*Accept character from command line and perform below operations.
 Here you can use charAt() method to extract character:
a. Check whether entered character is letter or digit. 
If it is digit then print its values as well as code point.
b. If it is character then check whether it is in lowercase? 
If it is in lowercase then convert it into upper case and print it well as its code point. 
If it is in uppercase then convert it into lower case and print it well as its code point.*/
class q11 {
    public static void main(String [] args){
        String a =args[0];
       char c=a.charAt(0);
        if(c>='0' && c<='9'){
            System.out.println("Value of digit is "+c+" code point is "+a.codePointAt(0));
        }
        else{
            if(Character.isLowerCase(c)){
                System.out.println(Character.toUpperCase(c)+" code point is "+a.codePointAt(0));
            }
            else{
                System.out.println(Character.toLowerCase(c)+" code point is "+a.codePointAt(0));
            }
        }
    }
}
