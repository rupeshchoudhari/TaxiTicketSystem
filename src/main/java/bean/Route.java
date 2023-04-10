package bean;

import java.util.ArrayList;
import java.util.List;

public class Route {

    private final String source;
    private final String destination;
    private final int distance;

    public Route(String source, String destination, int distance) {
        this.source = source;
        this.destination = destination;
        this.distance = distance;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getDistance() {
        return distance;
    }

    public static List<Route> getRoutes(){
        List<Route> routeList = new ArrayList<>();
        routeList.add(new Route("PUNE","MUMBAI", 120));
        routeList.add(new Route("PUNE","NASIK", 200));
        routeList.add(new Route("MUMBAI","GOA", 350));
        routeList.add(new Route("MUMBAI","NASIK", 180));
        return routeList;
    }

}
