package bean;

public class Bill {
    private int distance;
    private int noOfTraveller;
    private int finalFare;

    public Bill(int distance, int noOfTraveller) {
        this.distance = distance;
        this.noOfTraveller = noOfTraveller;
        this.getBill();
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getNoOfTraveller() {
        return noOfTraveller;
    }

    public void setNoOfTraveller(int noOfTraveller) {
        this.noOfTraveller = noOfTraveller;
    }

//    Rules for fare calculation per person: 1st 100 km = 750 INR. Then 5 INR per km.

    //TODO
    public Bill getBill(){

        return null;
    }
}
