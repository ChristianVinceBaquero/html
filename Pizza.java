public class Pizza{
   
   private String pizza_toppings;
   private int pizza_diameter;
   private double pizza_price;
   
   //default construction
   public Pizza(){
      pizza_toppings="Pineapple";
      pizza_diameter=12;
      pizza_price=13.99;         
      
      
   }
   
   public void display(){
      System.out.println("Pizza Toppings: " + pizza_toppings +
                         "\n Pizza Diameter: " + pizza_diameter +
                         "\n Pizza Price: " + pizza_price);
                         
   }
   
   }