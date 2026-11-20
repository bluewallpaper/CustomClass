public class VendingMachine {
   
   // instance variables
   private String productName;
   private int barCode;
   private double price;
   private int quantity;
   private boolean randomProduct;
   
   private String location;
   private String date;
   private int machineNumber;
   
   public void ProductInformation() {
      productName = "Product Name";
      barCode = 0;
      price = 4;
      quantity = 0;
      randomProduct = false;
   }
   public void MachineInformation(String location, String date, int machineNumber) {
      this.location = location;
      this.date = date;
      this.machineNumber = machineNumber;
   }
   public double PriceByTwo() {
      this.price = price;
      double byTwo = price / 2;
      return byTwo;
   }
   public static void ThanksMessage() {
      System.out.println("Thank you for buying with us.");
   }
   public static void BuyMore() {
      System.out.println("Would you like to buy more?");
   }
   public static void FairPrice() {
      System.out.println("Was the price fair enough?");
   }
   public static void MachineFeedback() { 
      System.out.println("How the machine went?");
   }
   
   public void main(String[] args) {
      ThanksMessage();
      PriceByTwo();
   }
}