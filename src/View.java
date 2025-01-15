import java.util.Scanner;

public class View {
//CRUD
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("\nGame of Thrones Trade Network - Menu");
        System.out.println("1. Manage Products");
        System.out.println("2. Manage Characters");
        System.out.println("3. Filter Characters by Origin");
        System.out.println("4. Find Characters by Product Region");
        System.out.println("5. Sort Products by Price for a Character");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> manageProducts(scanner);
            case 2 -> GameOfThronesTradeNetwork.manageCharacters(scanner);
            case 3 -> GameOfThronesTradeNetwork.filterCharactersByOrigin(scanner);
            case 4 -> findCharactersByProductRegion(scanner);
            case 5 -> sortProductsByPrice(scanner);
            case 0 -> {
                System.out.println("Exiting the application...");
                scanner.close();
                return;
            }
            default -> System.out.println("Invalid option. Please try again.");
        }
    }
}

    // Option 1: Manage Products
    private static void manageProducts(Scanner scanner) {
        System.out.println("\nManage Products");
        System.out.println("1. Add Product");
        System.out.println("2. Edit Product");
        System.out.println("3. Delete Product");
        System.out.println("4. View All Products");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {

        }
    }
}
