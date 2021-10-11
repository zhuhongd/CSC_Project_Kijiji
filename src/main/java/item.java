package src.main.java;


public class item {

    private String name;
    private double price;
    private int quantity;

    public item(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    /**
     * get the selling item's name
     * return type string
     */
    public String getItemName(){
        return this.name;
    }
    /**
     * get the price for the selling item
     * return a double type representing the price
     */
    public double getItemPrice(){
        return this.price;
    }
    /**
     * get how many stocks are left for the selling item
     * return an int type
     */
    public int getQuantity(){
        return this.quantity;
    }
    /**
     * change the item's name
     * this should return nothing
     */
    public void changeItemName(String new_name){
        this.name = new_name;
    }
    /**
     * change the price of the item
     * return nothing
     */
    public void changeItemPrice(double new_price){
        this.price = new_price;
    }

    /**
     * To increase/subtract the quantity of the item
     * return nothing
     */
   public void addQuantity(int new_quantity){
        this.quantity = this.quantity + new_quantity;
   }

   public void subtractQuantity(int new_quantity){
        this.quantity = this.quantity - new_quantity;
   }
}
