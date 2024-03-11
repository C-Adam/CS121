import javax.swing.*;
import java.util.Scanner;

public class ShoppingListApp {
    public static void main(String[] args) {
        ShoppingCart my_shopping_cart = new ShoppingCart();
        int user_input = 0;
        while (user_input != 3){
            int input = Integer.parseInt(JOptionPane.showInputDialog("(1) Add an item to the list. | (2) Display list and total number of items. | (3) Calculate Total and Exit."));
            user_input = input;
            if (user_input == 1){
                my_shopping_cart.AddItem();
            }else if (user_input == 2) {
                my_shopping_cart.DisplayShoppingList();
            }else if (user_input == 3) {
                my_shopping_cart.CalculateTotalCost();
            }
        }

    }
}
