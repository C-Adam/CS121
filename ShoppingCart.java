import javax.swing.*;
import java.util.*;


public class ShoppingCart {
    ArrayList<ItemOrder> shopping_list = new ArrayList<ItemOrder>();

    public void AddItem(){
        String item_name = JOptionPane.showInputDialog("Enter the name of your item");
        double item_price = Double.parseDouble(JOptionPane.showInputDialog("Enter the price of your item"));
        int item_quantity = Integer.parseInt(JOptionPane.showInputDialog("How many of this item are you buying?"));

        Item shopping_item = new Item(item_name, item_price);
        ItemOrder item_order = new ItemOrder(shopping_item, item_quantity);

        shopping_list.add(item_order);
    }

    public void DisplayShoppingList(){
        String output = "";
        for (ItemOrder itemOrder : shopping_list){
            output += "(" + itemOrder.quantity + ")" + itemOrder.item.GetItemName() + ": " + "$" + itemOrder.GetItemTotalPrice();
        }
        JOptionPane.showMessageDialog(null, shopping_list.size() + " items" + "\n" + output);
    }

    public void CalculateTotalCost(){
        double total = 0;
        for (ItemOrder itemOrder : shopping_list){
            total+= itemOrder.GetItemTotalPrice();
        }
        JOptionPane.showMessageDialog(null, "Your total is: " + "$" + total);
    }
}
