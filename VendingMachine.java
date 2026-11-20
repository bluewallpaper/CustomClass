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
   
   public VendingMachine() {
      productName = "Product Name";
      barCode = 0;
      price = 0.0;
      quantity = 0;
      randomProduct = false;
   }
   public void machineInformation(String location, String date, int machineNumber) {
      this.location = location;
      this.date = date;
      this.machineNumber = machineNumber;
   }
   public static void ThanksMessage() {
      System.out.println("Thank you for buying with us");
   }
}