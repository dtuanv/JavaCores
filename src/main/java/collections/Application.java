package collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Application {
    public static void main(String[] args) {
        Room hamburg = new Room("Hamburg", 4,200.0);
        Room berlin = new Room("Berlin", 6, 500.0);
        Room trier = new Room("Trier", 8, 100.0);
        Room bodensee = new Room("Bodensee", 5, 120.0);

        Collection<Room> rooms = new ArrayDeque<>(Arrays.asList(hamburg, berlin, trier, bodensee));

        hamburg.setPetFriendly(true);
        bodensee.setPetFriendly(true);

        rooms.stream().filter(Room::isPetFriendly).forEach(room -> System.out.println(room.getName()));

        System.out.println("-------------------");

        RoomService roomService = new RoomService();
        roomService.setInventory(new ArrayList<>(Arrays.asList(hamburg, berlin, trier, bodensee)));

        roomService.applyDiscount(50);
    }
}
