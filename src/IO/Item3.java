package IO;

import AuctionhouseItemReport.Item;

public class Item3{
    public static void main(String[] args) {
        Item RareStatue = new Item("Rare Statue", "Alex Ferguson", 412328, 20000, 2022);
        System.out.println("Name of Item : " + RareStatue.getName());
        System.out.println("Customer's name : " + RareStatue.getCustomer());
        System.out.println("Lot Number : " + RareStatue.getLotnumber());
        System.out.println("Item sold at : " + RareStatue.getPrice());
        System.out.println("Year the item was sold at : " + RareStatue.getYear());
    }
}
