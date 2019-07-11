package main.java;

public class ShoppingCart {

    public static void checkout(String[] items) {
        double total = 0;

        for (int i = 0; i < items.length; i++) {
            if(items[i].equalsIgnoreCase("apple")) {
                total += 0.60;
            } else if (items[i].equalsIgnoreCase("orange")) {
                total += 0.25;
            }
        }
        System.out.println("The total is: \u00A3" + String.format("%.2f", total));
    }
}
