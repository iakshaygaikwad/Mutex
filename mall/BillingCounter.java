package mall;

public class BillingCounter {

    public static void main(String[] args) {

        Item[] items = new Item[2];
        Cloth cloth = new Cloth();
        Toy toy = new Toy();
        cloth.buyItem("Arrow",500,2);
        toy.buyItem("Teddy Bear",400,2);
        items[0] = cloth;
        items[1] = toy;
        new Invoice().print(items);
    }
}
