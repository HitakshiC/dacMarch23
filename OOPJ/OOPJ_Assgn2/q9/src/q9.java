import java.time.*;
import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.format.*;

class DateInfo{
    private int day;
    private int month;
    private int year;
   
    public void  setDay(int day){
        this.day=day;
    }
    public void  setMonth(int month){
        this.month=month;
    }
    public void  setYear(int year){
        this.year=year;
    }
    public int  getDay(){
        return this.day;
    }
    public int  getMonth(){
        return this.month;
    }
    public int  getYear(){
        return this.year;
    }
}
class DateConverter{
    static DateInfo dateInfo=new DateInfo();
    Scanner sc=new Scanner(System.in);
    void acceptDate(){
        System.out.println("Enter the date : ");
        System.out.print("Day      :   ");
        dateInfo.setDay(sc.nextInt());
        System.out.print("Month    :   ");
        dateInfo.setMonth(sc.nextInt());
        System.out.print("Year     :   ");
        dateInfo.setYear(sc.nextInt());
    }
    void formatDate(){
        LocalDate myDateObj = LocalDate.of(dateInfo.getYear(),dateInfo.getMonth(),dateInfo.getDay());
        System.out.println("Before formatting: " + myDateObj);

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting (dd/MM/yyyy): " + formattedDate);

        myFormatObj = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting (MM/dd/yyyy): " + formattedDate);

        myFormatObj = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting (yyyy/MM/dd): " + formattedDate);
    }
    static DateInfo getDateObj(){
        return dateInfo;
    }
}
class Time{
    private int hour;
    private int minute;
    private int seconds;
   
    public void  setHour(int hour){
        this.hour=hour;
    }
    public void  setMinute(int minute){
        this.minute=minute;
    }
    public void  setSeconds(int seconds){
        this.seconds=seconds;
    }
    public int  getHour(){
        return this.hour;
    }
    public int  getMinute(){
        return this.minute;
    }
    public int  getSecond(){
        return this.seconds;
    }
    
}
class TimeConverter{
    static private Time timeInfo=new Time();
    Scanner sc=new Scanner(System.in);
    void acceptTime(){
        Time tm=new Time();
        System.out.println("Enter the date : ");
        System.out.print("hour      :   ");
        timeInfo.setHour(sc.nextInt());
        System.out.print("min    :   ");
        timeInfo.setMinute(sc.nextInt());
        System.out.print("seconds     :   ");
        timeInfo.setSeconds(sc.nextInt());
    }
    void formatTime(){
        LocalTime myTimeObj = LocalTime.of(timeInfo.getHour(),timeInfo.getMinute(),timeInfo.getSecond());
        System.out.println("Before formatting: " + myTimeObj);

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedDate = myTimeObj.format(myFormatObj);
        System.out.println("After formatting (hh:mm:ss): " + formattedDate);

        myFormatObj = DateTimeFormatter.ofPattern("hh:mm:ss a");
        formattedDate = myTimeObj.format(myFormatObj);
        System.out.println("After formatting (hh:mm:ss a): " + formattedDate);

        myFormatObj = DateTimeFormatter.ofPattern("HH:mm");
        formattedDate = myTimeObj.format(myFormatObj);
        System.out.println("After formatting (hh:mm): " + formattedDate);
    }
    static Time getTimeObj(){
        return timeInfo;
    }
}
class DateTimeConverter{
    
    DateInfo dateInfo = DateConverter.getDateObj();
    Time timeInfo = TimeConverter.getTimeObj();
    
    void formatDateTime(){
        LocalDateTime myDateTimeObj = LocalDateTime.of(dateInfo.getYear(),dateInfo.getMonth(),dateInfo.getDay(),timeInfo.getHour(),timeInfo.getMinute(),timeInfo.getSecond());
        System.out.println("Before formatting: " + myDateTimeObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
        String formattedDate = myDateTimeObj.format(myFormatObj);
        System.out.println("After formatting (dd/MM/yyy HH:mm:ss): " + formattedDate);

        myFormatObj = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");
        formattedDate = myDateTimeObj.format(myFormatObj);
        System.out.println("After formatting (MM/dd/yyyy hh:mm:ss a): " + formattedDate);

        myFormatObj = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        formattedDate = myDateTimeObj.format(myFormatObj);
        System.out.println("After formatting (yyyy/MM/dd hh:mm): " + formattedDate);
    }
        // void formatDateTime(){
        // DateConverter dateConverter = new DateConverter();
        // dateConverter.acceptDate();
        // TimeConverter timeConverter = new TimeConverter();
        // timeConverter.acceptTime();
        // dateConverter.formatDate();
        // timeConverter.formatTime();
        // }
}
public class q9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DateConverter dateConverter = new DateConverter();
        dateConverter.acceptDate();
        dateConverter.formatDate();
        TimeConverter timeConverter = new TimeConverter();
        timeConverter.acceptTime();
        timeConverter.formatTime();
        DateTimeConverter dateTimeConverter = new DateTimeConverter();
        dateTimeConverter.formatDateTime();
  }
}