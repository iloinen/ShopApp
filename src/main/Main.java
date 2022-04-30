package main;

import main.models.Customer;
import main.models.foods.*;

public class Main {

    public static void main(String[] args) {
        Product[] products = {
                null,
                new Sugar(),
                new Milk(),
                new Product()
        };

        Class breadClass = Bread.class;                     // Bread maga az osztály

        for (Product product : products) {
            if (product instanceof Bread) {
                System.out.println("ez egy kenyér");
            } else  {
                System.out.println("nem kenyér");
            }

            // alább ugyanaz, mint fentebb, csak az instanceof nélkül

            if (product != null) {
                Class productClass = product.getClass();        // product - egy objektum

                if (productClass == (breadClass)) {
                    Bread bread = (Bread) product;
                    System.out.println("ez egy kenyér, a lisztje: " + bread.getFlourType());
                } else {
                    System.out.println("ez nem kenyér");
                }
            } else {
                System.out.println("ez egy null");
            }
        }

        /*Customer buyer = new Customer("Név");

        Class cl = buyer.getClass();

        String clClassnameWithPackages = buyer.getClass().getName();  // main.models.Customer
        String clClassname = buyer.getClass().getSimpleName();        // Customer

        System.out.println(cl);

        boolean equals = buyer.equals("string");

        Product p = new Bread();
        Bread b = (Bread) p;
        b.getFlourType();

        System.out.println("cast success");*/
    }


    // DRY = DO NOT REPEAT YOURSELF!!!
    // kód leegyszerűsítése, könnyebb kezelhetősége

    // ---------------------

    /*
        élelmiszerek (ősosztály vagy anyaosztály vagy apaosztály):
            kenyér
            alma
            tej
            cukor
            sör
        vásárló:
            vásárló
                private Food[] cart;

     */

}
