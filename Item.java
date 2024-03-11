public class Item {
     private String name;
     private double price;

    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String GetItemName(){
        return name;
    }

    public Double GetItemPrice(){
        return price;
    }
}

