package src.main.java.Entities;

import java.io.Serializable;
import java.util.ArrayList;

public class Order implements Serializable {
    private final int order_id;
    private final ArrayList<Item> items_list;
    private final User buyer;
    private final User owner;
    private final double total;
    private final ArrayList<Integer> quantity;

    /**
     * The constructor of Order.
     * @param id - The order id of this order
     * @param items_list the items in this order
     * @param buyer the buyer of this order
     * @param owner the owner of this order (every order must only contain items from the same owner)
     * @param total the total amount of money that the items in this order worth
     * @param quantity the quantity of items in the order
     */
    public Order(int id, ArrayList<Item> items_list, User buyer, User owner, double total, ArrayList<Integer> quantity){
        this.order_id = id;
        this.items_list = items_list;
        this.buyer = buyer;
        this.owner = owner;
        this.total = total;
        this.quantity = quantity;
    }

    /**
     * Get the order's id number.
     * @return the Order's id.
     */
    public int getOrder_id() {
        return order_id;
    }

    /**
     * Produce a human-readable representation of an order.
     * @return the string representation of an order.
     */
    @Override
    public String toString() {
        StringBuilder items = new StringBuilder();
        for (int i=0;i<items_list.size();i+=1){
            Item item = items_list.get(i);
            Integer q = quantity.get(i);
            String s = item.toString2() +" Quantity:"+ q +"\n";
            items.append(s);
        }
        return "Order #" + order_id + ": \n" + "Buyer: " + buyer.toString() + "\nSeller: " + owner.toString() +
                "\nContains the following items: \n" + items + "Total: $" + total;
    }

    /**
     * Get the order's owner.
     * @return the order's owner.
     */
    public User getOwner(){return owner;}

    /**
     * Get the order's buyer.
     * @return the order's buyer.
     */
    public User getBuyer(){return buyer;}
}