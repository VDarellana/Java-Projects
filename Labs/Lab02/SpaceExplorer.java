package Lab02;
interface SpaceExplorer {
    void explore();
    void collectSamples();
    String sendReport();

    default void prepareForMission() {
        System.out.println("Preparing for the mission. Checking all systems and supplies.");
    }
}
