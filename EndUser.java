package p1;

import java.util.Scanner;

public class EndUser {
    public static void main(String[] args) {
        IceCream iceCreamShop = new IceCream();

        // Add flavors to the ice cream shop
        iceCreamShop.addFlavor(new Flavour("Vanilla", 2.0));
        iceCreamShop.addFlavor(new Flavour("Chocolate", 2.5));
        iceCreamShop.addFlavor(new Flavour("Strawberry", 3.0));

        // Display available flavors
        System.out.println("Available flavors:");
        for (String flavorName : iceCreamShop.getFlavorNames()) {
            System.out.println(flavorName);
        }

        // Take user input for selected flavor
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the flavor you want: ");
        String selectedFlavor = scanner.nextLine().trim().toLowerCase(); // Convert to lowercase and trim

        // Check if the selected flavor exists
        double price = iceCreamShop.getPrice(selectedFlavor);
        if (price > 0) {
            System.out.println("You selected " + selectedFlavor + " ice cream.");
            System.out.println("Price: $" + price);
        } else {
            System.out.println("Sorry, the selected flavor is not available.");
        }

        scanner.close();
    }
}
