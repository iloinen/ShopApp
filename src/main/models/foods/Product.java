package main.models.foods;

// ősosztályom!
public class Product {

    // láthatósági jelző, static kulcsszó, adattípus, név
    public static int foodCounter;

    protected double quantity = 5.0;
    protected String unitType = "unknown";
    protected boolean isLongLife;
    protected int price = 1;

    public Product() {
        foodCounter++;
    }

    public Product(double quantity, String unitType, int price) {
        this.quantity = quantity;
        this.unitType = unitType;
        this.price = price;
    }

    // konstruktor
    public Product(double quantity, String unitType, boolean isLongLife, int price) {
        this(quantity, unitType, price);
        this.isLongLife = isLongLife;
    }

    public static void printInfo() {
        System.out.println("info");
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public boolean isLongLife() {
        return isLongLife;
    }

    public void setLongLife(boolean longLife) {
        isLongLife = longLife;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
