import java.util.Scanner;

public class RestaurantInteractiveApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //This Define the menu items and their corresponding prices
        double[] prices = {100.0, 150.0, 200.0, 35.0, 50.0};
        String[] items = {"C1", "C2", "C3", "R1", "R2"};
        
        //This Initialize variables to keep track of the total price and quantity
        double totalPrice = 0.0;
        int totalQty = 0;

        //This Display the menu to the user
        System.out.println("Menu:");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - Php " + prices[i]);
        }

        //This Allow the user to make selections and calculate the total price
        while (true) {
            System.out.print("Enter your choice");
            int choice = scanner.nextInt();
            
            if (choice == 0) {
                break;
            } else if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice. Please select a valid item.");
                continue;
            }

            System.out.print("Enter the quantity: ");
            int qty = scanner.nextInt();

            double itemPrice = prices[choice - 1];
            double itemTotal = itemPrice * qty;
            totalPrice += itemTotal;
            totalQty += qty;
          //This Display the quantity, selected item, and its total price in the format
            System.out.println(qty + " x " + items[choice - 1] + " - Php " + itemTotal);
        }

        //This Display the add-ons menu
        System.out.println("\nAdd-ons:");
        String[] addons = {"R1", "R2"};
        double[] addonPrices = {35.0, 50.0};

        for (int i = 0; i < addons.length; i++) {
            System.out.println(addons[i] + " - Php " + addonPrices[i]);
        }

        // This Allow the user to select add-ons and calculate the total price
        while (true) {
            System.out.print("Enter your choice of add-on ");
            int choice = scanner.nextInt();
            
            if (choice == 0) {
                break;
            } else if (choice < 1 || choice > 2) {
                System.out.println("Invalid choice. Please select a valid add-on.");
                continue;
            }

            System.out.print("Enter the quantity: ");
            int qty = scanner.nextInt();

            double addonPrice = addonPrices[choice - 1];
            double addonTotal = addonPrice * qty;
            totalPrice += addonTotal;
            totalQty += qty;
        
            System.out.println(qty + " x " + addons[choice - 1] + " - Php " + addonTotal);
        }

        // This Display the order summary to the user
        System.out.println("\nOrder Summary:");
        System.out.println("Total Quantity: " + totalQty);
        System.out.println("Total Price (in PHP): " + (int) totalPrice); 
        System.out.println("Total Price (in USD): $" + ((int) totalPrice / 56)); 
    }
}
      /*How to properly use the menu first:
      Enter your choice like 1 or c1 then enter the quantity and how much
      you want to have example 1 it well add how much is it.
      If you want to reset just type 0 and the add-ons menu well be pop out if 
      you want to add just choose it if you want to skip just type 0 it well calculate
      the total summary of your order.*/
      
      