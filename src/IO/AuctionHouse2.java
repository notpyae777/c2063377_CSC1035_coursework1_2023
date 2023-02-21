package IO;

import AuctionhouseItemReport.AuctionHouse;

public class AuctionHouse2 {
    public static void main(String[] args) {
        AuctionHouse Manchester = new AuctionHouse(130000, 56400.93, "WW1 rifle, BMW car", "Crown");
        System.out.println("The record sale item of Manchester's Auction House is a " + Manchester.getHighestitem());
        System.out.println("Price of record sale item : " + Manchester.getGetRecordSale());
        System.out.println("The average price of items sold : " + Manchester.getAverage());
        System.out.println("List of all items sold by the auction house with a price greater than a given amount of money : " + Manchester.getList());
    }
}
