class NeedForSpeed {

    private int speed;
    private int batteryDrain;
    private int distanceDriven;
    private int batteryPercentage;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.distanceDriven = 0;
        this.batteryPercentage = 100;
    }

    public boolean batteryDrained() {
        return batteryPercentage < batteryDrain;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (this.batteryPercentage >= batteryDrain) {
            this.distanceDriven += speed;
            this.batteryPercentage -= batteryDrain;
        }
    }

    public int maxDistance() {
        return (100 / batteryDrain) * speed;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {

    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return car.maxDistance() >= this.distance;
    }
}
