package main.models.foods;

import main.models.UnitType;

// gyerekosztály / származtatott osztály
public class Bread extends Food {

    private String flourType;

    public Bread() {
        super(1.0, UnitType.KILOGRAM, false, 10);
        this.flourType = "white wheat";
    }

    public Bread(double quantity, int price) {
        super(quantity, UnitType.KILOGRAM, price);
        this.flourType = "white wheat";
    }

    public Bread(double quantity, UnitType unitType, boolean isLongLife, int price, String flourType) {
        super(quantity, unitType, isLongLife, price);
        this.flourType = flourType;
    }

    public String getFlourType() {
        return flourType;
    }

    public void setFlourType(String flourType) {
        this.flourType = flourType;
    }

}
