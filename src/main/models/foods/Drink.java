package main.models.foods;

import main.models.Consumable;
import main.models.UnitType;

public class Drink extends Product implements Consumable {

    public Drink(double quantity, UnitType unitType, int price) {
        this.quantity = quantity;
        this.unitType = unitType;
        this.price = price;
    }

    public Drink(double quantity, UnitType unitType, boolean isLongLife, int price) {
        this(quantity, unitType, price);
        this.isLongLife = isLongLife;
    }

    public void sayHello(String name) {
        System.out.println("Welcome");
    }

}
