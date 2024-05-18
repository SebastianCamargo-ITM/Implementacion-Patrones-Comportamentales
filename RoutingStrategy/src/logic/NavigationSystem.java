package logic;

import interfaces.RoutingStrategy;
import models.Point;
import models.Route;

public class NavigationSystem {
    private RoutingStrategy strategy;

    public NavigationSystem(RoutingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(RoutingStrategy strategy) {
        this.strategy = strategy;
    }

    public Route calculateRoute(Point start, Point end) {
        return strategy.calculateRoute(start, end);
    }

    public void displayRoute(Point start, Point end) {
        Route route = calculateRoute(start, end);
        strategy.displayRoute(route);
    }
}
