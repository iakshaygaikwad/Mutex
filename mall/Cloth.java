package mall;

public class Cloth extends Item {

    public static final float GST_RATE = 12.0f;

    void buyItem(String itemName, float price, int quantity)
    {
        super.setItem(itemName,price,quantity);
    }

    float getGST(float price, int quantity)
    {
        return ((price*GST_RATE)/100)*quantity;
    }

}
