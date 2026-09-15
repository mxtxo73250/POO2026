public class TestThermometer {
    public static void main(String[] args) {
        Thermometer thermometer = new Thermometer(22.5);

        System.out.println("--- ESTADO INICIAL ---");
        System.out.println("Temperatura actual: " + thermometer.getTemperature() + " °C");

        System.out.println("\n--- PRUEBA 1: Registro Válido (36.5 °C) ---");
        if (thermometer.setTemperature(36.5)) {
            System.out.println("Cambio ACEPTADO.");
        } else {
            System.out.println("Cambio RECHAZADO.");
        }
        System.out.println("Temperatura registrada: " + thermometer.getTemperature() + " °C");

        System.out.println("\n--- PRUEBA 2: Registro Inválido por arriba (105.0 °C) ---");
        if (thermometer.setTemperature(105.0)) {
            System.out.println("Cambio ACEPTADO.");
        } else {
            System.out.println("Cambio RECHAZADO (Fuera de rango).");
        }
        System.out.println("Temperatura en memoria: " + thermometer.getTemperature() + " °C");

        System.out.println("\n--- PRUEBA 3: Registro Inválido por abajo (-60.0 °C) ---");
        if (thermometer.setTemperature(-60.0)) {
            System.out.println("Cambio ACEPTADO.");
        } else {
            System.out.println("Cambio RECHAZADO (Fuera de rango).");
        }
        System.out.println("Temperatura en memoria: " + thermometer.getTemperature() + " °C");
    }
}