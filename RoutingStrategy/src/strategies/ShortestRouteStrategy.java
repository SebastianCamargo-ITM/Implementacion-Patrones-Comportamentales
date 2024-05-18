package strategies;

import interfaces.RoutingStrategy;
import models.Point;
import models.Route;
import models.RouteType;

public class ShortestRouteStrategy implements RoutingStrategy{

    @Override
    public Route calculateRoute(Point start, Point end) {
        System.out.println("Calculating Shortest route...");
        String route = "route from " + start + " to " + end;
        return new Route(route);
    }

    @Override
    public void displayRoute(Route route) {
        String shortestRoute = "-> " + RouteType.SHORTEST.toString() + " " + route.getRoute();
        System.out.println(shortestRoute);
    }

}
