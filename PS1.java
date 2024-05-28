import java.util.Scanner;

public class PS1 {
    public static double CalculateAverage(double a, double b, double c){
        return (a+b+c)/3;
    }
    // enter 3 numbers from the user & make a function to print their average
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.print("Enter First Number: "); double a = sc.nextDouble();
       System.out.print("Enter Second Number: "); double b = sc.nextDouble();
       System.out.print("Enter Third Number: "); double c = sc.nextDouble();

       System.out.println("Average of Three Numbers is :"+ CalculateAverage(a, b, c));

    }
}
