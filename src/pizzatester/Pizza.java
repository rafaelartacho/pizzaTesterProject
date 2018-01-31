/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzatester;

/**
 *
 * @author 
 */
public class Pizza
{
    private String pizzaCustomerName; 
    private int pizzaSize;      // 10, 12, 14, or 16 inches in diameter
    private char handThinDeep;  // 'H' or 'T' or 'D' for hand tossed, thin crust, or deep dish, respecitively
    private boolean cheeseTopping;
    private boolean pepperoniTopping;
    private boolean sausageTopping;
    private boolean onionTopping;
    private boolean mushroomTopping;
    
    public Pizza(String aPizzaCustomerName, int aSize, char aPizzaType, boolean aCheeseTopping, boolean aPepperoniTopping, boolean aSausageTopping, boolean aOnionTopping, boolean aMushroomTopping)
    {
        
        pizzaCustomerName = aPizzaCustomerName;
        pizzaSize = aSize;
        handThinDeep = aPizzaType;
        cheeseTopping = aCheeseTopping;
        pepperoniTopping = aPepperoniTopping;
        sausageTopping = aSausageTopping;
        onionTopping = aOnionTopping;
        mushroomTopping = aMushroomTopping;
    }
    
    public String getPizzaCustomerName()
    {
        return pizzaCustomerName;
    }
    
    public int getPizzaSize()
    {
        return pizzaSize;
    }
    
    public char getHandThinDeep()
    {
        return handThinDeep;
    }
    
    public boolean getCheeseTopping()
    {
        return cheeseTopping;
    }
    
    public boolean getPepperoniTopping()
    {
        return pepperoniTopping;
    }
    
    public boolean getSausageTopping()
    {
        return sausageTopping;
    }
    
    public boolean getOnionTopping()
    {
        return onionTopping;
    }
    
    public boolean getMushroomTopping()
    {
        return mushroomTopping;
    }
    
    
    public void setPizzaCustomerName(String aCustomerName)
    {
        pizzaCustomerName = aCustomerName;
    }
    
    public void setPizzaSize(int aSize)
    {
        pizzaSize = aSize;
    }
    
    public void setHandThinDeep(char aPizzaType)
    {
        handThinDeep = aPizzaType;
    }
    
    public void setCheeseTopping(boolean aCheeseTopping)
    {
        cheeseTopping = aCheeseTopping;
    }
    
    public void setPepperoniTopping(boolean aPepperoniTopping)
    {
        pepperoniTopping = aPepperoniTopping;
    }
    
    public void setSausageTopping(boolean aSausageTopping)
    {
        sausageTopping = aSausageTopping;
    }
    
    public void setOnionTopping(boolean anOnionTopping)
    {
        onionTopping = anOnionTopping;
    }
    
    public void setMushroomTopping(boolean aMushroomTopping)
    {
        mushroomTopping = aMushroomTopping;
    }
    
    public String toString()
    {
        String pizzaDisplay = pizzaSize + "inch " + handThinDeep + " Pizza ";
        if (getCheeseTopping() || getPepperoniTopping() || getSausageTopping() || getOnionTopping() || getMushroomTopping())
            pizzaDisplay += " with: ";
        if (getCheeseTopping())
            pizzaDisplay += "\n Extra Cheese ";
        if (getPepperoniTopping())
            pizzaDisplay += "\n Pepperoni";
        if (getSausageTopping())
            pizzaDisplay += "\n Sausage";
        if (getOnionTopping())
            pizzaDisplay += "\n Onion";
        if (getMushroomTopping())
            pizzaDisplay += "\n Mushroom";
        
        return pizzaDisplay;
        
                    
    }
}
    
    
