
package day8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter numerator");
            int numerator = sc.nextInt();

            System.out.println("Enter denominator");
            int denominator = sc.nextInt();

            double result = numerator / denominator;
            System.out.println(result);

            String name = null;
            System.out.println(name.length());
        }
        catch (ArithmeticException ex) {
            System.out.println("Please enter non zero denominator");
        }
        catch (InputMismatchException ex) {
            System.out.println("Please enter valid integer value only");
        }
        catch (Exception ex) {
            System.out.println("Some issue occurred");
        }

        System.out.println("Thank You!!!");
        sc.close();
    }
}