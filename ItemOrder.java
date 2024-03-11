public class ItemOrder {
     int quantity;
     Item item;

    public ItemOrder(Item item, int quantity){
        this.item = item;
        this.quantity = quantity;
    }

    public Double GetItemTotalPrice(){
        return item.GetItemPrice() * quantity;
    }

}
