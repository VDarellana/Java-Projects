package Lab02;
public class MoonExplorer implements SpaceExplorer {
   @Override
    public void explore() {
        System.out.println("MoonExplorer is exploring the lunar surface!");
    }

    @Override
    public void collectSamples() {
        System.out.println("MoonExplorer is collecting moon rocks!");
    }

    @Override
    public String sendReport() {
        return "MoonExplorer: Exploration and sample collection on the Moon complete!";
    }      
}
