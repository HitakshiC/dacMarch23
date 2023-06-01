/*You are required to write a Java program to implement a Book class that can be
used to manage a book inventory system.
The Book class should have the following fields:
a. title: A string field to store the title of the book.
b. author: A string field to store the name of the author of the book.
c. publisher: A string field to store the name of the publisher of the book.
d. isbn: A string field to store the ISBN number of the book.
e. year: An integer field to store the year in which the book was published.
f. price: A double field to store the price of the book.
g. quantity: An integer field to store the quantity of the book in the inventory.
The Book class should have following methods
a. Constructors,
b. Getter & setter methods
c. Business Logic methods
I. increaseQuantity(int quantity ): A method to increase the quantity of
the book in the inventory by the specified amount.
II. decreaseQuantity(int quantity): A method to decrease the quantity of
the book in the inventory by the specified amount.
III. getInventoryValue(): A method to calculate the total value of the
inventory of the book, which is the product of the price and the
quantity of the book. */
import java.util.Scanner;
class Book{
    String title;
    String author;
    String publisher;
    String isbn;
    int year;
    double price;
    int quantity;

    Book(String title,String author,String publisher,String isbn,int  year){
        this.title=title;
        this.author=author;
        this.publisher=publisher;
        this.isbn = isbn;
        this.year=year;
    }
    public void setprice(double price){
        this.price=price;
    }
    public void setquantity(int quantity){
        this.quantity=quantity;
    }
    public double getprice(){
        return this.price;
    }
    public double getquantity(){
        return this.quantity;
    }
    public void increaseQuantity(){
         ++this.quantity;
    }
    public void decreaseQuantity(){
         --this.quantity;
    }

    public void getInventoryValue(){
        System.out.print(this.title+"  "+this.price+"  "+this.quantity);
    }

}


public class q3 {
    public static void main(String args[]) {
        Book b1 = new Book("Let us C", "Yashvant Kanetkar", "McgrawHill", "ABFG23456",2014);
        b1.setprice(700);
        b1.setquantity(4); 
        b1.increaseQuantity();
        b1.increaseQuantity();
        b1.getInventoryValue();
    }
}
