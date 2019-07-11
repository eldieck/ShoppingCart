package main.java;

public class ShoppingCart {

    public static void checkout(String[] items) {
        //If the items list changed I would have an outside data source to keep track of items and prices
        double total = 0;
        double savings = 0;
        int apples = 0;
        int oranges = 0;
        for (int i = 0; i < items.length; i++) {
            if(items[i].equalsIgnoreCase("apple")) {
                total += 0.60;
                apples++;
            } else if (items[i].equalsIgnoreCase("orange")) {
                total += 0.25;
                oranges++;
            }
        }

        savings = ((oranges / 3) * 0.25) + ((apples / 2) * 0.60);

        System.out.println("The total is: \u00A3" + String.format("%.2f", total - savings));
    }
}
