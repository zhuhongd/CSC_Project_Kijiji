package src.test.java.Use_cases;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import src.main.java.Entities.Item;
import src.main.java.Entities.OrderStorage;
import src.main.java.Entities.User;
import src.main.java.Use_cases.OrderManager;
import src.main.java.Use_cases.OrderReadWriter;

import java.io.IOException;
import java.util.ArrayList;

public class OrderReadWriterTest {

    @Test
    public void OrderWriteTest() throws IOException {
        Item item1, item2, item3, item4;
        User u1, u2;
        ArrayList<Item> lst = new ArrayList<>();
        u1 = new User("Howard",  "012345678");
        u2 = new User("H", "6666");
        item1 = new Item("Cat", u1, 999999.99, "Pets");
        item2 = new Item("Airpods3", u2, 199.99, "Technology");
        item3 = new Item("iPhone14", u2, 2000.00, "Technology");
        item4 = new Item("Airpods3", u1, 179.99, "Technology");
        lst.add(item2);
        lst.add(item3);
        lst.add(item4);
        OrderManager.create_order(lst, u1, u2);
        OrderReadWriter.saveIntoFile(OrderStorage.getItems());
        System.out.println(OrderStorage.getItems());
    }

    @Test
    public void OrderReadTest() throws IOException, ClassNotFoundException {
        OrderReadWriter.readFromFile();
        System.out.println(OrderStorage.getItems());
    }
}