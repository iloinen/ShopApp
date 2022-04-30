package main.models.foods;

import main.models.UnitType;

// ősosztályom!
public class Product {

    // láthatósági jelző, static kulcsszó, adattípus, név
    public static int foodCounter;

    protected double quantity = 5.0;
    protected UnitType unitType;
    protected boolean isLongLife;
    protected int price = 1;

    public Product() {
        foodCounter++;
    }

    public Product(double quantity, UnitType unitType, int price) {
        this.quantity = quantity;
        this.unitType = unitType;
        this.price = price;
    }

    // konstruktor
    public Product(double quantity, UnitType unitType, boolean isLongLife, int price) {
        this(quantity, unitType, price);
        this.isLongLife = isLongLife;
    }

    // unitType kezelése enum nélkül
    private String checkUnitType(String unitType) {
        switch (unitType) {
            case "kilo":
            case "kg":
            case "kilogram":
                return unitType;
            default:
                throw new RuntimeException("not good unit type");
        }
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

    public UnitType getUnitType() {
        return unitType;
    }

    public void setUnitType(UnitType unitType) {
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
