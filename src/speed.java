import java.util.Scanner;
public class speed {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("distance in km : ");
        float distance_Km= sc.nextFloat();
        float distance= distance_Km*1000;
        System.out.print(" time : ");
        float time= sc.nextFloat();
        double speed=distance/time;
        System.out.print("Calculated Speed is: "+speed+" m/s");
    }
}