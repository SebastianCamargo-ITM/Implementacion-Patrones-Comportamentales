import logic.NavigationSystem;
import models.Point;
import strategies.FastestRouteStrategy;
import strategies.ScenicRouteStrategy;
import strategies.ShortestRouteStrategy;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Create the points
        Point pointA = new Point("Tunja");
        Point pointB = new Point("Bogota");

        // Create the strategies
        FastestRouteStrategy fastestRouteStrategy = new FastestRouteStrategy();

        // Create the navigation system
        NavigationSystem navigationSystem = new NavigationSystem(fastestRouteStrategy);
        navigationSystem.displayRoute(pointA, pointB);

        // Change the strategy
        ScenicRouteStrategy scenicRouteStrategy = new ScenicRouteStrategy();
        navigationSystem.setStrategy(scenicRouteStrategy);
        navigationSystem.displayRoute(pointA, pointB);

        // Change the strategy
        ShortestRouteStrategy shortestRouteStrategy = new ShortestRouteStrategy();
        navigationSystem.setStrategy(shortestRouteStrategy);
        navigationSystem.displayRoute(pointA, pointB);
        
    }
}
