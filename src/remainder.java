import java.util.Scanner;
public class remainder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("first number: ");
        float num1= sc.nextInt();
        System.out.print("second number: ");
        float num2= sc.nextInt();
        double quotient= num1 /num2;
        System.out.println("quotient: "+quotient);
        double remainder=num1%num2;
        System.out.print("remainder: "+remainder);
    }
}