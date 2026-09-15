public class TestProduct {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 1200.0, 10);

        System.out.println("--- INFORMACIÓN INICIAL ---");
        System.out.println("Nombre: " + product.getName());
        System.out.println("Precio: $" + product.getPrice());
        System.out.println("Stock: " + product.getStock());

        System.out.println("\n--- INTENTO 1: Modificación Válida ---");
        boolean result1 = product.updateInformation("Laptop Gaming", 1500.0, 8);
        if (result1) {
            System.out.println("Modificación ACEPTADA.");
        } else {
            System.out.println("Modificación RECHAZADA.");
        }
        System.out.println("Estado actual: " + product.getName() + " | $" + product.getPrice() + " | Stock: " + product.getStock());

        System.out.println("\n--- INTENTO 2: Modificación Inválida (Precio negativo) ---");
        boolean result2 = product.updateInformation("Laptop Gaming", -500.0, 5);
        if (result2) {
            System.out.println("Modificación ACEPTADA.");
        } else {
            System.out.println("Modificación RECHAZADA (Se conserva el estado anterior).");
        }
        System.out.println("Estado actual: " + product.getName() + " | $" + product.getPrice() + " | Stock: " + product.getStock());
    }
}