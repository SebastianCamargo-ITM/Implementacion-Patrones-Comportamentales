package strategies;

import interfaces.RoutingStrategy;
import models.Point;
import models.Route;
import models.RouteType;

public class FastestRouteStrategy implements RoutingStrategy {

    @Override
    public Route calculateRoute(Point start, Point end) {
        System.out.println("Calculating the fastest route...");
        String route = "route from " + start + " to " + end;
        return new Route(route);
    }

    @Override
    public void displayRoute(Route route) {
        String fastestRoute = "-> " + RouteType.FASTEST.toString() + " " + route.getRoute();
        System.out.println(fastestRoute);
    }
}
