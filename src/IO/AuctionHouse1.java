package IO;

import AuctionhouseItemReport.AuctionHouse;

public class AuctionHouse1 {
    public static void main(String[] args) {
        AuctionHouse London = new AuctionHouse(540000, 246000.2, "Pigeon Statue, WW2 rifle, Samurai Sword", "GreekBook");
        System.out.println("The record sale item of London's Auction House is a " + London.getHighestitem());
        System.out.println("Price of record sale item : " + London.getGetRecordSale());
        System.out.println("The average price of items sold : " + London.getAverage());
        System.out.println("List of all items sold by the auction house with a price greater than a given amount of money : " + London.getList());


    }
}