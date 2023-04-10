package service;

import bean.Bill;
import bean.Route;
import bean.Ticket;

import java.util.List;

public class TicketService {

    private List<Route> routeList = Route.getRoutes();

    public Ticket generateTicket(String source, String destination, int noOfTravellers) throws Exception {
        Route route =checkRouteValidity(source, destination);
        if(route != null){
            Bill bill = new Bill(route.getDistance(), noOfTravellers);
            Ticket ticket = new Ticket(route, bill);
            return ticket;
        }else
            throw new Exception("This is not a valid route");
    }

    private Route checkRouteValidity(String source, String destination) {
        for(Route r : routeList){
            if(r.getSource().equals(source) && r.getDestination().equals(destination))
                return r;
        }
        return null;
    }
}
