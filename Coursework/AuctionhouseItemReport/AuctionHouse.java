package AuctionhouseItemReport;

public class AuctionHouse {

    int getRecordSale;
    double average;
    String list;
    String highestitem;

    public String getHighestitem() {
        return highestitem;
    }

    public void setHighestitem(String highestitem) {
        this.highestitem = highestitem;
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public int getGetRecordSale() {
        return getRecordSale;
    }

    public void setGetRecordSale(int getRecordSale) {
        this.getRecordSale = getRecordSale;
    }

    public AuctionHouse(int mgetrecordsale, double maverage, String mlist, String mhighestitem){
        getRecordSale = mgetrecordsale;
        average = maverage;
        list = mlist;
        highestitem = mhighestitem;
    }

}