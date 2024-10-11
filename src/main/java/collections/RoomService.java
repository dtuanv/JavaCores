package collections;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RoomService {

    public Collection<Room> inventory;

    public RoomService(){
        this.inventory = new LinkedHashSet<>();
    }

    public  void applyDiscount(final double discount){
          this.inventory.stream().forEach(i -> i.setRate(i.rate * (100.0 - discount) / 100) );
        this.inventory.stream().forEach(r -> System.out.println("rate: "+ r.rate));
    }

    public Collection<Room> getRoomsByCapacity(final int num){
        return this.inventory.stream().filter(i -> i.number > num).collect(Collectors.toSet());
    }

    public Collection<Room> getInventory() {
        return inventory;
    }

    public void setInventory(Collection<Room> inventory) {
        this.inventory = inventory;
    }
}
