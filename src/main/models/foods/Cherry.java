package main.models.foods;

public class Cherry extends Food {

    private boolean hasPits;

    public Cherry() {
        super(1.0, "kilo", false, 33);
        this.hasPits = true;
    }

    public Cherry(double quantity, int price) {
        super(quantity, "kilo", price);
        this.hasPits = true;
    }

    public Cherry(double quantity, String unitType, boolean isLongLife, int price, boolean hasPits) {
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