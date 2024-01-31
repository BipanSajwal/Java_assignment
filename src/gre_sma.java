
import java.util.Scanner;

public class gre_sma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number: ");
        int num1 = scanner.nextInt();
        System.out.print("number: ");
        int num2 = scanner.nextInt();
        scanner.close();
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " is smaller than " + num1);
        }
    }
}