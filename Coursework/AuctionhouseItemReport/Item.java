package AuctionhouseItemReport;

public class Item {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    String customer;

    public int getLotnumber() {
        return lotnumber;
    }

    public void setLotnumber(int lotnumber) {
        this.lotnumber = lotnumber;
    }

    int lotnumber;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    int price;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    int year;

    public Item(String gname, String gcustomer, int glotnumber, int gprice, int gyear){
        name = gname;
        customer = gcustomer;
        lotnumber = glotnumber;
        price = gprice;
        year = gyear;
    }

}
