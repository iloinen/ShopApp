package main.models.foods;

import main.models.UnitType;

public class Cherry extends Food {

    private boolean hasPits;

    public Cherry() {
        super(1.0, UnitType.KILOGRAM, false, 33);
        this.hasPits = true;
    }

    public Cherry(double quantity, int price) {
        super(quantity, UnitType.KILOGRAM, price);
        this.hasPits = true;
    }

    public Cherry(double quantity, UnitType unitType, boolean isLongLife, int price, boolean hasPits) {
        super(quantity, unitType, isLongLife, price);
        this.hasPits = hasPits;
    }

    public boolean isHasPits() {
        return hasPits;
    }

    public void setHasPits(boolean hasPits) {
        this.hasPits = hasPits;
    }

}
