public class TestEWallet {
    public static void main(String[] args) {
        EWallet wallet = new EWallet("Mateo Piedrahíta");

        System.out.println("--- ESTADO INICIAL ---");
        System.out.println("Propietario: " + wallet.getOwnerName());
        System.out.println("Saldo inicial: $" + wallet.getBalance());

        System.out.println("\n--- PRUEBA 1: Recarga Válida ($600.000) ---");
        if (wallet.recharge(600000.0)) {
            System.out.println("Recarga exitosa. Saldo: $" + wallet.getBalance());
        } else {
            System.out.println("Recarga rechazada.");
        }

        System.out.println("\n--- PRUEBA 2: Recarga Inválida (-$50.000) ---");
        if (wallet.recharge(-50000.0)) {
            System.out.println("Recarga exitosa.");
        } else {
            System.out.println("Recarga RECHAZADA (Monto no permitido). Saldo: $" + wallet.getBalance());
        }

        System.out.println("\n--- PRUEBA 3: Pago Válido ($200.000) ---");
        if (wallet.makePayment(200000.0)) {
            System.out.println("Pago exitoso. Saldo: $" + wallet.getBalance());
        } else {
            System.out.println("Pago rechazado.");
        }

        System.out.println("\n--- PRUEBA 4: Pago Superior al Saldo ($500.000) ---");
        if (wallet.makePayment(500000.0)) {
            System.out.println("Pago exitoso.");
        } else {
            System.out.println("Pago RECHAZADO (Saldo insuficiente). Saldo: $" + wallet.getBalance());
        }

        System.out.println("\n--- PRUEBA 5: Pago Superior al Límite de $500.000 ($500.001) ---");
        // Primero recargamos para tener dinero suficiente en la prueba
        wallet.recharge(500000.0);
        if (wallet.makePayment(500001.0)) {
            System.out.println("Pago exitoso.");
        } else {
            System.out.println("Pago RECHAZADO (Supera el límite de $500.000). Saldo: $" + wallet.getBalance());
        }

        System.out.println("\n--- PRUEBA 6: Pago con Valor Negativo (-$10.000) ---");
        if (wallet.makePayment(-10000.0)) {
            System.out.println("Pago exitoso.");
        } else {
            System.out.println("Pago RECHAZADO (Monto no permitido). Saldo final: $" + wallet.getBalance());
        }
    }
}