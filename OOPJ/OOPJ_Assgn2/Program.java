import java.util.Scanner;
class TollBoothBillGenerator {
    private String vehicleType;
    private int numAxles;
    private double distanceTraveled;
    private double tollFee;
    private double totalAmountDue;

    TollBoothBillGenerator( ) {
        this.vehicleType = null;
        this.numAxles = 0;
        this.distanceTraveled = 0.0;
        this.tollFee = 0.0;
        this.totalAmountDue = 0.0;
    }
    public void showMenu( ) {
        System.out.println("Select the option :" );
        System.out.println("1. Enter vehicle type (car, van, bus, or truck) :" );
        System.out.println("2. Enter number of axles :" );
        System.out.println("3. Enter distance travelled :" );
        System.out.println("4. Calculate toll fee :" );
        System.out.println("5. Generate bill :" );
        System.out.println("6. Exit :" );
    }
    public void setvehicleType(String vehicletype ){
        this.vehicleType = vehicletype;
        System.out.println(this.vehicleType);
        
    }
    public String getvehicleType( ){
        return this.vehicleType ;
    }
    public void setnumAxles(int numAxles ){
        this.numAxles = numAxles;
    }
    public int getnumAxles( ){
        return this.numAxles;
    }
    public void setdistanceTravelled(double distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }
    public double getdistanceTravelled( ) {
        return this.distanceTraveled;
    }
    private void setTollFee() {
        System.out.println(this.vehicleType);
        if(this.vehicleType.equals("truck")){
            this.tollFee = ((0.50*this.distanceTraveled)*this.numAxles);
        }
        else {
            this.tollFee = ((0.25 * this.distanceTraveled) * this.numAxles);
        }
    }
    public void settollFee( ){
        this.setTollFee();
    } 
    public double getTollFee( ) {
        return this.tollFee;
    }
    private void setgeneratBill() {
        this.totalAmountDue = ( this.tollFee + 2 );
    }
    public double getgenerateBill(){
        return this.totalAmountDue;
    }

}
class Program {
    public static void main(String[] args) {
        TollBoothBillGenerator bill = new TollBoothBillGenerator();
        bill.showMenu( );
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1: {System.out.println("Enter vehicle type (car, van, bus, or truck) :");
                    String vehicletype = sc.next();
                    bill.setvehicleType( vehicletype );
                    }
            case 2: System.out.println("2. Enter number of axles :" );
                    int numAxles = sc.nextInt();
                    bill.setnumAxles(numAxles);
            case 3: System.out.println("3. Enter distance travelled :" );
                    double distanceTraveled = sc.nextDouble();
                    bill.setdistanceTravelled( distanceTraveled);
            case 4: System.out.println("4. Calculate toll fee :" );
                    bill.settollFee();
                    System.out.println("Toll fee : "+bill.getTollFee()); 
            case 5: bill.setgeneratBill();
                    System.out.println("Vehicle type: "+bill.getvehicleType()+" / Number of Axles: "+bill.getnumAxles()+" / Distance Travelled: "+bill.getdistanceTravelled()+" / Toll Fee"+bill.getTollFee()+" / Total Amount Due: "+bill.getgenerateBill());
            case 6: break;
        }
        
    }
    
}
