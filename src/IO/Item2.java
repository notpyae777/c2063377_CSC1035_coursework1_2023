package IO;

import AuctionhouseItemReport.Item;

public class Item2 {
    public static void main(String[] args) {
        Item AncientPainting = new Item("Ancient Painting", "Donny Walker", 125788, 450000, 2020);
        System.out.println("Name of Item : " + AncientPainting.getName());
        System.out.println("Customer's name : " + AncientPainting.getCustomer());
        System.out.println("Lot Number : " + AncientPainting.getLotnumber());
        System.out.println("Item sold at : " + AncientPainting.getPrice());
        System.out.println("Year the item was sold at : " + AncientPainting.getYear());
    }
}
