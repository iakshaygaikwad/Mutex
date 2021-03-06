package mall;

public class Invoice {

    void print(Item item[])
    {
        float grandTotal = 0;
        System.out.printf("%-10s\t\t%8s\t\t%-5s\t\t%-2s\t\t\t%-5s","ItemName","Price","Quantity","GST","TotalPrice");
        System.out.println("\n========================================================================");
        for (Item items : item)
        {
            float gst = items.getGST(items.price,items.quantity);
            System.out.printf("%-10s\t\t%f\t\t\t%d\t\t%f\t\t%f",items.itemName,items.price,items.quantity,gst,(gst+items.price));
            System.out.println();
            grandTotal = grandTotal + (gst+items.price);
        }
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("Total : %63f",grandTotal);
    }
}
