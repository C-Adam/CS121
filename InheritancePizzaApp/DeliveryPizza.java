package InheritancePizzaApp;

public class DeliveryPizza extends Pizza{
    double delivery_fee;
    String delivery_address;

    public DeliveryPizza(String[] pizza_toppings, String delivery_address) {
        super(pizza_toppings);
        if (this.price > 18){
            this.delivery_fee = 3;
        }else{
            this.delivery_fee = 5;
        }
        this.delivery_address = delivery_address;
    }

}
