import java.util.Scanner;

public class Billing_System {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Billing System!");
        System.out.print("Enter the number of items: ");
        int numberOfItems = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        double totalCost = 0;

        for (int i = 1; i <= numberOfItems; i++) {
            System.out.println("\nItem " + i + ":");
            System.out.print("Enter item name: ");
            String itemName = scanner.nextLine();
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
            System.out.print("Enter price per item: ");
            double pricePerItem = scanner.nextDouble();

            double itemCost = quantity * pricePerItem;
            totalCost += itemCost;
        }

        System.out.print("\nDo you have a membership? (yes/no): ");
        String membership = scanner.next();
        double discount = 0;

        if (membership.equalsIgnoreCase("yes")) {
            discount = 0.10 * totalCost;
            totalCost -= discount;
        }

        System.out.println("\n------ Bill ------");
        System.out.println("Total Cost: $" + totalCost);
        if (discount > 0) {
            System.out.println("Discount Applied: $" + discount);
        }
        System.out.println("------------------");

        scanner.close();
    }
}
