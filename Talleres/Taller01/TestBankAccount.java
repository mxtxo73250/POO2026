public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", "Mateo Piedrahíta", 500.0);

        System.out.println("--- ESTADO INICIAL ---");
        System.out.println("Cuenta: " + account.getAccountNumber());
        System.out.println("Titular: " + account.getHolderName());
        System.out.println("Saldo inicial: $" + account.getBalance());

        System.out.println("\n--- PRUEBA 1: Depósito Válido ($200) ---");
        if (account.deposit(200.0)) {
            System.out.println("Depósito exitoso. Saldo actual: $" + account.getBalance());
        } else {
            System.out.println("Error en el depósito.");
        }

        System.out.println("\n--- PRUEBA 2: Depósito Inválido (-$50) ---");
        if (account.deposit(-50.0)) {
            System.out.println("Depósito exitoso.");
        } else {
            System.out.println("Depósito rechazado. Saldo actual: $" + account.getBalance());
        }

        System.out.println("\n--- PRUEBA 3: Retiro Válido ($150) ---");
        if (account.withdraw(150.0)) {
            System.out.println("Retiro exitoso. Saldo actual: $" + account.getBalance());
        } else {
            System.out.println("Error en el retiro.");
        }

        System.out.println("\n--- PRUEBA 4: Retiro por valor superior al saldo ($1000) ---");
        if (account.withdraw(1000.0)) {
            System.out.println("Retiro exitoso.");
        } else {
            System.out.println("Retiro rechazado (Fondos insuficientes). Saldo actual: $" + account.getBalance());
        }

        System.out.println("\n--- PRUEBA 5: Retiro con valor negativo (-$100) ---");
        if (account.withdraw(-100.0)) {
            System.out.println("Retiro exitoso.");
        } else {
            System.out.println("Retiro rechazado (Monto no permitido). Saldo actual: $" + account.getBalance());
        }
    }
}