import java.util.Scanner;
import java.lang.Math;

class Quad {
    int a, b, c;
    double d, r1, r2;

    void getr() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coefficients a, b, c: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
    }

    void compiler() {
        if (a == 0) {
            System.out.println("Invalid: 'a' cannot be zero.");
            return;
        }

        d = (b * b) - (4 * a * c);  // Calculate the discriminant

        if (d == 0) {
            r1 = -b / (2.0 * a);
            System.out.printf("The equal root is: %.2f%n", r1);
        } else if (d > 0) {
            r1 = (-b + Math.sqrt(d)) / (2.0 * a);
            r2 = (-b - Math.sqrt(d)) / (2.0 * a);
            System.out.printf("The first root is: %.2f%n", r1);
            System.out.printf("The second root is: %.2f%n", r2);
        } else { // d < 0
            double realPart = -b / (2.0 * a);
            double imaginaryPart = Math.sqrt(-d) / (2.0 * a);
            System.out.printf("Roots are imaginary: %.2f + %.2fi%n", realPart, imaginaryPart);
            System.out.printf("Roots are imaginary: %.2f - %.2fi%n", realPart, imaginaryPart);
        }
    }
}

public class quadratic {
    public static void main(String[] args) {
        Quad q1 = new Quad();
        q1.getr();
        q1.compiler();
    }
}
