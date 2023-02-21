package IO;

import AuctionhouseItemReport.AuctionHouse;

public class AuctionHouse3 {
    public static void main(String[] args) {
        AuctionHouse Newcastle = new AuctionHouse(750000, 245004.43, "Binoculars, Albert Einstein's glasses", "Nuclear BluePrint");
        System.out.println("The record sale item of Manchester's Auction House is a " + Newcastle.getHighestitem());
        System.out.println("Price of record sale item : " + Newcastle.getGetRecordSale());
        System.out.println("The average price of items sold : " + Newcastle.getAverage());
        System.out.println("List of all items sold by the auction house with a price greater than a given amount of money : " + Newcastle.getList());
    }
}
