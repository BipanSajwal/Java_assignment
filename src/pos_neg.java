import java.util.Scanner;

public class pos_neg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" number: ");
        int number = scanner.nextInt();
        scanner.close();
        if (number > 0) {
            System.out.println(number + " positive number");
        } else {
            System.out.println(number + " negative number.");
        }
    }
}