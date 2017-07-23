package mall;

public abstract class Item {

     String itemName = "";
     float price = 0;
     int quantity = 0;
     float gstValue = 0;



    abstract float getGST(float price, int quantity);

    void setItem(String itemName, float price, int quantity, float gstValue)
    {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.gstValue = gstValue;

    }

}
