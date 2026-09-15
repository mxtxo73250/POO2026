public class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        if (name != null && !name.trim().isEmpty() && price > 0 && stock >= 0) {
            this.name = name;
            this.price = price;
            this.stock = stock;
        } else {
            this.name = "Default Product";
            this.price = 1.0;
            this.stock = 0;
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public boolean updateInformation(String newName, double newPrice, int newStock) {
        if (newName != null && !newName.trim().isEmpty() && newPrice > 0 && newStock >= 0) {
            this.name = newName;
            this.price = newPrice;
            this.stock = newStock;
            return true;
        }
        return false;
    }
}