package Lab02;

public class MarsExplorer implements SpaceExplorer {

    @Override
    public void explore() {
        System.out.println("MarsExplorer is exploring the red planet!");
    }

    @Override
    public void collectSamples() {
        System.out.println("MarsExplorer is collecting Martian soil samples!");
    }

    @Override
    public String sendReport() {
        return "MarsExplorer: Exploration and sample collection on Mars complete!";
    }
    
}
