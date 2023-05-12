package testDrivenDeverloper;

import java.util.List;

public class ShoppingBasket {
    private  List<Item> items;
    public  ShoppingBasket(List<Item> items) {
        this.items = items;
    }
    public  ShoppingBasket() {
    }
    public double getTotal() {
        if(items == null  ||  items.isEmpty()){
            return 0.0;

        }else {
            return items.stream().mapToDouble(item -> item.getSubTotal()).sum();

        }
    }
}
