import java.util.Scanner;
public class KE {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("mass : ");
        float mass= sc.nextFloat();
        System.out.print(" velocity : ");
        float velocity= sc.nextFloat();
        double Kinetic_Energy= (mass*velocity)/2;
        System.out.print(" Kinetic Energy : "+Kinetic_Energy+" J");
    }
}