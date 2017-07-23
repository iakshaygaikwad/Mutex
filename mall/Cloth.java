package mall;

public class Cloth extends Item {

    final float GST_RATE = 12.0f;

    void buyItem(String itemName, float price, int quantity)
    {
        gstValue = getGST(price,quantity);
        super.setItem(itemName,price,quantity,gstValue);
    }

    float getGST(float price, int quantity)
    {
        gstValue = ((price*GST_RATE)/100)*quantity;
        return gstValue;
    }

}
