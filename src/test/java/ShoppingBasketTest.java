import org.junit.jupiter.api.Test;
import testDrivenDeverloper.Item;
import testDrivenDeverloper.ShoppingBasket;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingBasketTest {

    @Test
    public  void totalOfEmptyBasket(){
        ShoppingBasket basket = new ShoppingBasket();
        assertEquals(0.0, basket.getTotal());
    }

    @Test
    public void totalOfSingleItem(){
        ShoppingBasket basket = new ShoppingBasket(Arrays.asList(new Item(100.0,1)));
        assertEquals(100.0, basket.getTotal(), 0.0);
    }

    @Test
    public void totalOfTwoItem(){
        ShoppingBasket basket = new ShoppingBasket(Arrays.asList(new Item(100.0,1), new Item(200.0,1)));
        assertEquals(300.0, basket.getTotal());
    }

    @Test
    public void totalOfItemWithQuantity(){
        ShoppingBasket basket = buildAShoppingBasket(Arrays.asList(new Item(150.0, 2) ,new Item(200.0,2)));
        assertEquals(700.0,basket.getTotal());
    }

    private ShoppingBasket buildAShoppingBasket(List<Item> items) {
        ShoppingBasket basket = new ShoppingBasket(items);
        return basket;
    }
}
