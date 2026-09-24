package Lab02;
public class SpaceExplorationAgency {
    public static void main(String[] args){
        SpaceExplorer[] explorers = {
        new MarsExplorer(),
        new MoonExplorer(),
        new AsteroidExplorer(),
        };
        
        for (int i = 0; i < explorers.length; i++){
            SpaceExplorer explorer = explorers[i];
            explorer.prepareForMission();
            explorer.explore();
            explorer.collectSamples();
            System.out.println(explorer.sendReport());
            System.out.println();
        }
    
    }    
}
