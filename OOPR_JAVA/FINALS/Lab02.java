import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"Notebook", "Pen", "Folder", "USB"};
        int[] reorder = {5, 10, 5, 2};
        int[] target = {20, 30, 20, 10};
        int[] stock = new int[4];

        inputStock(scanner, names, stock);

        printReport(names, stock, reorder, target);

        scanner.close();
    }

    public static void inputStock(Scanner scanner, String[] names, int[] stock) {
        for (int i = 0; i < names.length; i++) {
            int amount = -1;

            while (amount < 0 || amount > 10000) {
                System.out.print(names[i] + " stock: ");

                try {
                    amount = scanner.nextInt();

                    if (amount < 0 || amount > 10000) {
                        System.out.println("INVALID! Stock must be between 0 and 10000.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("INVALID! Please enter a whole number.");
                    scanner.next();
                }
            }

            stock[i] = amount;
        }
    }

    public static void printReport(String[] names, int[] stock, int[] reorder, int[] target) {
        int totalStock = 0;
        int totalSuggestedOrder = 0;

        for (int i = 0; i < names.length; i++) {
            totalStock = totalStock + stock[i];

            int suggestedOrder;

            if (stock[i] <= reorder[i]) {
                suggestedOrder = target[i] - stock[i];
                totalSuggestedOrder = totalSuggestedOrder + suggestedOrder;
            } else {
                suggestedOrder = 0;
            }

            System.out.println(names[i] + " stock=" + stock[i] + " order=" + suggestedOrder);
        }

        System.out.println("Total stock: " + totalStock);
        System.out.println("Total suggested order: " + totalSuggestedOrder);
    }
}
