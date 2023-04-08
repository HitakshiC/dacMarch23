
public class bank {
    private  String CustomerName;
    private int AccNo;
    private double balance;
   bank(){
         this.AccNo =23001;
         this.balance=0.0;
   }
   public void setCustomerName(String CustomerName){
      this.CustomerName=CustomerName;
   }
   public void setAccNo( int AccNo){
      this.AccNo= AccNo;
   }
   public void setbalance(double balance){
      this.balance=balance;
   }

   public String getCustomerName(){
      return  this.CustomerName;
   }
   public int getAccNo(){
      return  this.AccNo;
   }
   public double getbalance(){
      return  this. balance;
   }

   public String toString(){
      return String.format("%-20s%-6d%-7.2f",this.CustomerName,this.AccNo,this.balance);}
   }
}
