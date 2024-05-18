package strategies;

import interfaces.RoutingStrategy;
import models.Point;
import models.Route;
import models.RouteType;

public class ScenicRouteStrategy implements RoutingStrategy {

    @Override
    public Route calculateRoute(Point start, Point end) {
        System.out.println("Calculating Scenic route...");
        String route = "route from " + start + " to " + end;
        return new Route(route);
    }

    @Override
    public void displayRoute(Route route) {
        String scenicRoute = "-> " + RouteType.SCENIC.toString() + " " + route.getRoute();
        System.out.println(scenicRoute);
    }
}