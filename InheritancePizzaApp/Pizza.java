package InheritancePizzaApp;

import javax.swing.*;
import java.util.Objects;

public class Pizza {
    String[] pizza_toppings;
    double price;

    public Pizza(String[] pizza_toppings){
        this.pizza_toppings = pizza_toppings;
        this.price = 14 + (2 * pizza_toppings.length); //Adds the toppings price to initial pizza price
    }

    public void DisplayPizzaDescription(Pizza pizza){
        StringBuilder description = new StringBuilder();
        for(String topping : pizza_toppings)
            if (!Objects.equals(topping, pizza_toppings[pizza_toppings.length - 1])) {
                description.append(topping).append(",").append(" ");
            }else{
                description.append(topping);
            }
        if (pizza instanceof DeliveryPizza){
            //Show the extra details of the delivery pizza
            double total_fee = (this.price + ((DeliveryPizza) pizza).delivery_fee);
            JOptionPane.showMessageDialog(null, "Delivery Address: "+ ((DeliveryPizza) pizza).delivery_address + "\n" + "Delivery Fee: " + ((DeliveryPizza) pizza).delivery_fee + "\n" + "Toppings: " + description + "\n" + "Price: $" + this.price + "\n" + "Total: " + total_fee + "\n" + "Thank you for your order! Your pizza shall be ready shortly!");
        }else{
            JOptionPane.showMessageDialog(null, "Toppings: " + description + "\n" + "Price: $" + this.price + "\n" + "Thank you for your order! Your pizza shall be ready shortly!");
        }
    }
}
