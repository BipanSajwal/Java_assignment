import java.util.Scanner;

public class vote_alloted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" your age: ");
        int userAge = scanner.nextInt();
        scanner.close();
        if (userAge > 17) {
            System.out.println("you are alloted to cast vote");

        }
    }
}
