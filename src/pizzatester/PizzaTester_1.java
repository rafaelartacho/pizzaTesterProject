/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzatester;
import java.text.DecimalFormat; 
import javax.swing.JOptionPane; 
 
/**
 *
 * @author cristy
 */
public class PizzaTester_1
{
    public static Pizza aPizzaOrder;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Two methods are called from main:  getUserInput() and calculatePizzaCost()
        
        getUserInput();
        calculatePizzaCost();
    }
    
    public static void getUserInput()
    {
      
        String firstName;               //user's first name
        String userInput;
        int pizzaSizeInInches;          //10, 12, 14, 16
        char pizzaType;                 //hand, thin, deep dish
        boolean cheeseTopping = false;
        boolean pepperoniTopping = false;
        boolean sausageTopping = false;
        boolean onionTopping = false;
        boolean mushroomTopping = false;
         
        //welcome message 
        JOptionPane.showMessageDialog(null, "Welcome to Mike and Diane's Pizza."); 
     
 
        //get user's first name 
        firstName = JOptionPane.showInputDialog("Enter your first name: "); 


        //prompt user and get pizza size choice 
        JOptionPane.showMessageDialog(null, "Pizza Size (inches) Cost"+  
                                                    '\n'+ "10' $10.99"+ 
                                                    '\n'+ "12' $12.99"+ 
                                                    '\n'+ "14' $14.99"+ 
                                                    '\n'+ "16' $16.99"); 
 
        userInput = JOptionPane.showInputDialog("What size pizza would you like?" + 
                                            '\n'+"10, 12, 14, or 16(enter the number only)"); 
        pizzaSizeInInches = Integer.parseInt (userInput); 

 
        userInput = JOptionPane.showInputDialog("What type of crust would you like?"+ 
                '\n'+"(H)Hand-tossed, (T) Thin-crust, or (D) Deep-dish)"+ 
                '\n'+ "(Enter H, T, or D):"); 
        pizzaType = userInput.charAt(0); 
 
 

 
        JOptionPane.showMessageDialog(null,"All pizzas come with cheese."+ 
                                      '\n'+"Additional toppings are $1.25 each."+ 
                                      '\n'+"Choose from: Pepperoni, Sausage, Onion, or Mushroom."); 
        
        userInput = JOptionPane.showInputDialog("Would you like additional cheese?");
        if ((userInput.charAt(0) == 'y' || userInput.charAt(0) == 'Y'))
            cheeseTopping = true;
        
        userInput = JOptionPane.showInputDialog("Would you like Pepperoni?");
        if ((userInput.charAt(0) == 'y' || userInput.charAt(0) == 'Y'))
            pepperoniTopping = true;
        
        userInput = JOptionPane.showInputDialog("Would you like Sausage?");
        if ((userInput.charAt(0) == 'y' || userInput.charAt(0) == 'Y'))
            sausageTopping = true;
        
        userInput = JOptionPane.showInputDialog("Would you like Onion?");
        if ((userInput.charAt(0) == 'y' || userInput.charAt(0) == 'Y'))
            onionTopping = true;
        
        userInput = JOptionPane.showInputDialog("Would you like Mushrooms?");
        if ((userInput.charAt(0) == 'y' || userInput.charAt(0) == 'Y'))
            mushroomTopping = true;
        
        // Task #1:  Create an instance of aPizzaOrder by invoking the constructor, and passing it the values in firstName, pizzaSizeInInches, pizzaType, cheeseTopping, pepperoniTopping, sausageTopping, onionTopping, mushroomTopping.
        aPizzaOrder  = new Pizza(firstName, pizzaSizeInInches, pizzaType, cheeseTopping, pepperoniTopping, sausageTopping, onionTopping, mushroomTopping);
                
    }
    
    public static void calculatePizzaCost()
   {
        
        DecimalFormat aFormat = new DecimalFormat("$##0.00");
        double cost = 12.99;            //cost of the pizza     
        final double TAX_RATE = .08;    //sales tax rate     
        double tax; 
        String toppings = "";          //list of toppings     
        int numberOfToppings = 0;      //number of toppings
        String crust = "";
        final double TOPPING_PRICE = 1.25;
        
        
        if (aPizzaOrder.getHandThinDeep() == 'h'|| aPizzaOrder.getHandThinDeep() == 'H')
            crust = "Hand-Tossed";
        else if (aPizzaOrder.getHandThinDeep() == 't' || aPizzaOrder.getHandThinDeep() == 'T')
            crust = "Thin-Crust";
        else if (aPizzaOrder.getHandThinDeep() == 'd' || aPizzaOrder.getHandThinDeep() == 'D')
            crust = "Deep-Pan";
        
        if (aPizzaOrder.getCheeseTopping())
        { 
            numberOfToppings += 1; 
            toppings = toppings + "Additional Cheese "; 
        } 
         //Task #2a: Determine how many more toppings and concatenate them to the toppings String variable:
        if (aPizzaOrder.getPepperoniTopping()) 
        {
            numberOfToppings += 1; 
            toppings = toppings + "Additional Pepperoni ";
        }
        if (aPizzaOrder.getMushroomTopping())
        {
            numberOfToppings += 1; 
            toppings = toppings + "Additional Mushroom ";
        }
        if (aPizzaOrder.getOnionTopping())
        {
           numberOfToppings += 1; 
            toppings = toppings + "Additional Onion ";
        } 
        if (aPizzaOrder.getSausageTopping())
        {
           numberOfToppings += 1; 
           toppings = toppings + "Additional Sausage "; 
            
        //Task #2b:  Set the cost of the pizza based upon the size (10inch = 10.99; 12inch = 12.99; 14inch = 14.99; 16inch = 16.99)
        if (aPizzaOrder.getPizzaSize() == 10)
        {
            cost = 10.99;
        }
        else if (aPizzaOrder.getPizzaSize() == 12){
            cost = 12.99;
        } 
        else if (aPizzaOrder.getPizzaSize() == 14){
            cost = 14.99;
        }
        else if (aPizzaOrder.getPizzaSize() == 16){
            cost = 16.99;
        }
        }  
        
        // Finalize the total cost of the pizza:
          cost = cost + (TOPPING_PRICE * numberOfToppings); 


        //display order confirmation 
        JOptionPane.showMessageDialog(null, "Your order is as follows: "+ 
                                     '\n'+" One " +aPizzaOrder.getPizzaSize() +" inch pizza "+  
                                     '\n'+crust+ " crust "+ toppings+ "."); 


        //apply discount if user is eligible 
        //Task #3:  Figure out if there is a discount of $2 on this order, due to the customer's name being either Mike or Diane 
        
        if (aPizzaOrder.getPizzaCustomerName().equalsIgnoreCase("Mike")  && aPizzaOrder.getPizzaCustomerName().equalsIgnoreCase("Diane") ){
            cost -= 2;
        } 
   
  
        
        

        
        //ALL MONEY OUTPUT APPEARS WITH 2 DECIMAL PLACES, using the DecimalFormat class defined at the beginning of this method. 
        //calculate and display tax and total cost 

        tax = cost * TAX_RATE; 
        JOptionPane.showMessageDialog(null, "The cost of your order is: " + aFormat.format(cost)+ 
                '\n'+ "The tax is: " + aFormat.format(tax)+ 
                '\n'+ "The total due is:  " + aFormat.format(tax+cost)+ 
                '\n'+ "Your order will be ready for pick-up in 30 minutes."); 


} 

    
}
