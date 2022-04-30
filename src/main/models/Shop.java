package main.models;

import main.models.foods.*;

public class Shop {

    private Product[] products;
    private boolean isOpen;
    private int income;

    public Shop(int productNumber) {
        fillProducts(productNumber);
    }

    public Product findProduct(String productName) {
        Class searchForClass = findClassByName(productName);

        for (Product product : products) {
            if (product.getClass().equals(searchForClass)) {
                return product;
            }
        }

        return null;
    }

    private Class findClassByName(String className) {
        return switch (className) {
            case "kenyér" -> Bread.class;
            case "cseresznye" -> Cherry.class;
            case "tej" -> Milk.class;
            case "rum" -> Rum.class;
            case "cukor" -> Sugar.class;
            default -> null;
        };
    }

    public void open() {
        isOpen = true;
    }

    public void close() {
        isOpen = false;
    }

    public void fillProducts(int productNumber) {
        products = new Product[productNumber];

        for (int i = 0; i < productNumber; i++) {
            products[i] = randomProduct();
        }
    }

    private Product randomProduct() {
        int random = (int) (Math.random() * 5);

        return switch (random) {
            case 0 -> new Bread();
            case 1 -> new Cherry();
            case 2 -> new Milk();
            case 3 -> new Rum();
            default -> new Sugar();
        };
    }

    public void cashDesk(Customer customer) {
        int bill = createBill(customer);

        if (bill <= customer.getMoney()) {
            customer.payTheBill(bill);
            //addToIncome(bill);
            setIncome(income + bill);
            System.out.println("Customer successfully paid for the products.");
        } else {
            System.out.println("Customer does not have enough money to pay! Sorry.");
        }
    }

    private int createBill(Customer customer) {
        int sum = 0;

        for (Product product : customer.getCart()) {
            sum += product.getPrice();
        }

        return sum;
    }

    public void addToIncome(int money) {
        income += money;
    }

    public Product[] getProducts() {
        return products;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

}
