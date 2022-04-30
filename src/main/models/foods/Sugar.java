package main.models.foods;

import main.models.UnitType;

public class Sugar extends Food {

    private boolean isBrown;

    public Sugar() {
        super(1.0, UnitType.KILOGRAM, false, 100);
    }

    public Sugar(double quantity, int price) {
        super(quantity, UnitType.KILOGRAM, price);
    }

    public Sugar(double quantity, UnitType unitType, int price) {
        super(quantity, unitType, price);
    }

    public Sugar(double quantity, UnitType unitType, boolean isLongLife, int price, boolean isBrown) {
        super(quantity, unitType, isLongLife, price);
        this.isBrown = isBrown;
    }

    public boolean isBrown() {
        return isBrown;
    }

    public void setBrown(boolean brown) {
        isBrown = brown;
    }

}
