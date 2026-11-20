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
   
   
   public ProductInformation() {
      productName = "Product Name";
      barCode = 0;
      price = 0.0;
      quantity = 0;
      randomProduct = false;
   }
   public MachineInformation() {
      location = "Null Location";
      date = "Null Date";
      machineNumber = 0;
   }
}