package U5T7_StaticMethods2;
import java.util.Scanner;

public class Program {
    public Program() { } 
    
    public void start() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first side of your triangle: ");
        int s1 = scan.nextInt();
        System.out.println("Enter the second side of your triangle: ");
        int s2 = scan.nextInt();
        System.out.println("Enter the third side of your triangle: ");
        int s3 = scan.nextInt();
        Triangle tri = new Triangle(s1, s2, s3);
        System.out.println("Possible Equilateral: " + tri.possibleEquilateral());
        System.out.println(tri.triangleInfo());
        System.out.println();
        System.out.println("Enter an integer: ");
        int x = scan.nextInt();
        System.out.println(x + " is even: " + Utility.isEven(x));
        System.out.println(x + " is divisible by 3: " + Utility.isDivisibleBy3(x));
        System.out.println(x + " is a perfect square: " + Utility.isPerfectSquare(x));
    }
}
