class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    private static final int DISTANCE_PER_DRIVE = 10;
    
    private int distanceTravelled;
    private int numberOfVictories;
    
    public void drive() {
        this.distanceTravelled += DISTANCE_PER_DRIVE;
    }

    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        return o.getNumberOfVictories() - this.numberOfVictories;
    }
}
