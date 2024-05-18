package interfaces;

import models.Point;
import models.Route;

public interface RoutingStrategy {
    Route calculateRoute(Point start, Point end);
    void displayRoute(Route route);
}
