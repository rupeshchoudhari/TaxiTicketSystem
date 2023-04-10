package bean;

public class Ticket {

    private final Route route;
    private final Bill bill;

    public Ticket(Route route, Bill bill) {
        this.route = route;
        this.bill = bill;
    }

}
