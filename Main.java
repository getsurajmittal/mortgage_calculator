import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle amount:");
        double principle = sc.nextDouble();
        System.out.println("Enter the annual interest rate:");
        double irate = sc.nextDouble();
        double r = irate/100/12;
        System.out.println("Enter the number of years:");
        double years = sc.nextDouble();
        double n = years*12;

        double mortgage = (principle*r*Math.pow(1+r,n))/(Math.pow(1+r,n)-1);
        System.out.println("The mortgage is: $"+mortgage);

        sc.close();

    }
}
