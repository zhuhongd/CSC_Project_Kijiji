package src.test.java.Entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.main.java.Entities.Order;
import src.main.java.Entities.Item;
import src.main.java.Entities.User;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {
    Order BigOrder;
    Item item1;
    User buyer;
    User seller;
    ArrayList<Item> lst;
    ArrayList<Integer> q = new ArrayList<>();

    @BeforeEach
    void setup() {
        buyer = new User("Ricardo", "4396yyds", 999999);
        seller = new User("April", "1234569", 0);
        item1 = new Item("STA257 Help", seller, 999999, "Study");
        lst = new ArrayList<>();
        lst.add(item1);
        q.add(1);
        BigOrder = new Order(666, lst, buyer, seller, 999999,q);
    }

    @Test
    public void TestToString(){
        assertEquals("Order #666: \n" + "Buyer: Ricardo\n" + "Seller: April\n" +
                "Contains the following items: \nSTA257 Help: Category: Study, Price: $999999.0 Quantity:1\n" +
                "Total: $999999.0",
                BigOrder.toString());
    }

    @Test
    public void TestGetOwner(){
        assertEquals(BigOrder.getOwner(), seller);
    }

    @Test
    public void TestGetBuyer(){
        assertEquals(BigOrder.getBuyer(), buyer);
    }
}
