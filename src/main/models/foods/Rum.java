package main.models.foods;

public class Rum extends Drink {

    // alcohol by volume
    private int abv;

    public Rum() {
        super(1.0, "deciliter", false, 20);
        this.abv = 40;
    }

    public Rum(double quantity, int price) {
        super(quantity, "deciliter", price);
        this.abv = 40;
    }

    public Rum(double quantity, String unitType, boolean isLongLife, int price, int abv) {
        super(quantity, unitType, isLongLife, price);
        this.abv = abv;
    }

    public int getAbv() {
        return abv;
    }

    public void setAbv(int abv) {
        this.abv = abv;
    }

}
