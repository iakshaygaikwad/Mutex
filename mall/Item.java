package mall;

public abstract class Item {

     String itemName;
     float price;
     int quantity;


//Constructor For init
    Item(){
         itemName = "";
         price = 0;
         quantity = 0;
    }
    abstract float getGST(float price, int quantity);

    void setItem(String itemName, float price, int quantity)
    {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
