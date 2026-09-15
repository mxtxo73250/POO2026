public class EWallet {
    private String ownerName;
    private double balance;

    public EWallet(String ownerName) {
        this.ownerName = (ownerName != null && !ownerName.trim().isEmpty()) ? ownerName : "Unknown";
        this.balance = 0.0;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public boolean recharge(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        }
        return false;
    }

    public boolean makePayment(double amount) {
        if (amount > 0 && amount <= 500000.0 && amount <= balance) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
}