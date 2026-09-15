public class Thermometer {
    private double temperature;

    public Thermometer(double initialTemperature) {
        if (initialTemperature >= -50.0 && initialTemperature <= 100.0) {
            this.temperature = initialTemperature;
        } else {
            this.temperature = 0.0;
        }
    }

    public double getTemperature() {
        return temperature;
    }

    public boolean setTemperature(double newTemperature) {
        if (newTemperature >= -50.0 && newTemperature <= 100.0) {
            this.temperature = newTemperature;
            return true;
        }
        return false;
    }
}