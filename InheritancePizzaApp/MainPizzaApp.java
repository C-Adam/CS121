package InheritancePizzaApp;

import javax.swing.*;
import java.util.*;

public class MainPizzaApp {
    public static void main(String[] args) {

        //intro message
        JOptionPane.showMessageDialog(null, "Welcome to My Pizza App");

        //Initialize array of 10 slots for the toppings to be entered
        String[] pizza_toppings = new String[10];

        //List to hold all non-null toppings to be later converted back into an array
        List<String> pizza_toppings_list = new ArrayList<>();

        String last_topping_entered;

        //Loop requesting pizza toppings from the user
        for (int index = 0; index < pizza_toppings.length; index++){
            last_topping_entered = JOptionPane.showInputDialog("Please enter your pizza toppings (MAX 10) | Type \"QUIT\" to continue");
            if (last_topping_entered.equalsIgnoreCase("Quit")){
                break;
            }else{
                pizza_toppings[index] = last_topping_entered;
            }
        }

        //Add the non-null strings in the initial array to a list.
        for (String topping : pizza_toppings){
            if (topping != null){
                pizza_toppings_list.add(topping);
            }
        }

        //Create an array to hold the final pizza toppings
        String[] final_pizza_toppings = new String[pizza_toppings_list.size()];

        //Loop through the list and add the items to the array created above.
        for(int index = 0; index < pizza_toppings_list.size(); index++){
            final_pizza_toppings[index] = pizza_toppings_list.get(index);
        }

        //Checks if the order is for delivery
        int delivery_order_check = JOptionPane.showConfirmDialog(null, "Is this order for delivery?");
        if (delivery_order_check == JOptionPane.YES_OPTION){
            String delivery_address = JOptionPane.showInputDialog("What is the address the Pizza should be delivered to?");
            DeliveryPizza delivery_pizza = new DeliveryPizza(final_pizza_toppings, delivery_address);
            delivery_pizza.DisplayPizzaDescription(delivery_pizza);
        }else{
            Pizza created_pizza = new Pizza(final_pizza_toppings);
            created_pizza.DisplayPizzaDescription(created_pizza);
        }
    }
}
