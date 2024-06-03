import java.math.BigInteger;
import java.util.Scanner;

/**
 * This program calculates the factorial of a large number entered by the user.
 * It utilizes recursion and the `BigInteger` class for accurate calculations of factorials
 * for very large numbers.
 *
 * @author Legaspi,AlyssaMarie
 */
public class FactorialCalculator {

  /**
   * This method calculates the factorial of a non-negative integer `n` using recursion.
   * The base cases are:
   *   - Factorial of 0 (0!) and 1 (1!) is always 1 (represented by `BigInteger.ONE`).
   * For other values of `n`, the factorial is calculated as `n * (factorial of n-1)`.
   *
   * @param n The non-negative integer for which to calculate the factorial.
   * @return The factorial of `n` as a `BigInteger` value.
   */
  public static BigInteger calculateFactorial(int n) {
    if (n == 0 || n == 1) {
      return BigInteger.ONE;
    } else {
      return BigInteger.valueOf(n).multiply(calculateFactorial(n - 1));
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a non-negative integer: ");
    int number;

    // Ensure the user enters a non-negative integer using a do-while loop
    do {
      number = scanner.nextInt();
      if (number < 0) {
        System.out.println("Error: Factorial is not defined for negative numbers.");
        System.out.print("Enter a non-negative integer: ");
      }
    } while (number < 0);

    scanner.close(); // Close the Scanner to avoid resource leaks

    BigInteger factorial = calculateFactorial(number);
    System.out.println("The factorial of " + number + " is: " + factorial);
  }
}
