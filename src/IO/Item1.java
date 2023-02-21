package IO;

import AuctionhouseItemReport.Item;

public class Item1 {
    public static void main(String[] args) {
        Item DinosaurSkull = new Item("Dinosaur Skull", "Danny Wines", 235244, 25000, 2018);
        System.out.println("Name of Item : " + DinosaurSkull.getName());
        System.out.println("Customer's name : " + DinosaurSkull.getCustomer());
        System.out.println("Lot Number : " + DinosaurSkull.getLotnumber());
        System.out.println("Item sold at : " + DinosaurSkull.getPrice());
        System.out.println("Year the item was sold at : " + DinosaurSkull.getYear());
    }
}
