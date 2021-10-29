package src.main.java.Use_cases;

import src.main.java.Entities.Item;
import src.main.java.Entities.ItemStorage;
import src.main.java.Entities.User;

import java.util.ArrayList;
import java.util.Map;

public class ItemManager implements Manager {

    /**
     * Return the Item that match with the name searched. Return nothing if no match found.
     *
     * @param name A String of name.
     * @return The Item with the same name.
     */
    public Item search(String name) {

        return null;
    }

    public void addElements(Object[] newItems) {
        for (Object item : newItems){
            ItemStorage.addElement(item);
        }
    }

    public static void addElement(Object item){
        ItemStorage.addElement(item);
    }

    public static void removeElement(Object[] Items) {
        for (Object item : Items){
            ItemStorage.deleteElement(item);
        }
    }

    public static void removeElement(Object element){
        ItemStorage.deleteElement(element);
    }

    public static Item[] loadItems(User u){
        Item item1 = new Item("U of T Notebook", u, 10, "Study", 1);
        Item item2 = new Item("Newborn British Shorthair", u, 1500, "Pets", 2);
        Item item3 = new Item("Strawberries", u, 15, "Food", 3);
        Item item4 = new Item("Happiness", u, 5000, "NotFromUofT", 4);
        Item item5 = new Item("iPhone13", u, 20, "Electronics", 5);
        Item[] itemList = new Item[]{item1, item2, item3, item4, item5};
        ItemStorage.addElement(itemList);
        return itemList;
    }

    public static Map<String, ArrayList<Item>> getItems(){
        return ItemStorage.getItemsList();
    }
}
