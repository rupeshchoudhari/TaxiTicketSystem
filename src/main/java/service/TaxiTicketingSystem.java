package service;

import bean.Bill;
import bean.Route;

public class TaxiTicketingSystem {

    public static void main(String[] args) {

        //User input
        int noOfTravellers=2;
        String source="PUNE";
        String destination = "NASHIK";


        TicketService ticketService = new TicketService();
        try {
            ticketService.generateTicket(source, destination, noOfTravellers);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Please select valid route");
        }

    }


}
