package models;

public enum RouteType {
    SHORTEST("Shortest"), FASTEST("Fastest"), SCENIC("Scenic");

    private String route;

    private RouteType(String strategy) {
        this.route = strategy;
    }

    @Override
    public String toString() {
       return route;
    }
}
