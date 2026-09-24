package Lab02;

public class AsteroidExplorer implements SpaceExplorer {
    @Override
    public void explore() {
        System.out.println("AsteroidExplorer is navigating the asteroid belt!");
    }

    @Override
    public void collectSamples() {
        System.out.println("AsteroidExplorer is collecting asteroid dust samples!");
    }

    @Override
    public String sendReport() {
        return "AsteroidExplorer: Exploration and sample collection on asteroids complete!";
    }
}