public class JedliksToyCar {

    private static final int DISTANCE_PER_DRIVE = 20;
    private static final int BATTERY_DRAIN = 1;
    
    private int distanceDriven;
    private int batteryPercentage;

    public JedliksToyCar() {
        this.distanceDriven = 0;
        this.batteryPercentage = 100;
    }
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    public String batteryDisplay() {
        if (batteryPercentage == 0) return "Battery empty";
        return "Battery at " + batteryPercentage + "%";
    }

    public void drive() {
        if (batteryPercentage > 0) {
            distanceDriven += DISTANCE_PER_DRIVE;
            batteryPercentage -= BATTERY_DRAIN;
        }
    }
}
