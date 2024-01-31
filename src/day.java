import java.util.Scanner;
public class day {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print(" Days: ");
        int day= sc.nextInt();
        float minute= day*24*60;
        System.out.println("days in minute : "+minute+" min");
        float second= minute*60;
        System.out.print(" days in second : "+second+" sec");
    }
}