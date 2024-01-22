/**
 * Display factorial of a number.
 */
public class Factorial {
  public static void main(String[] args) {
    int n = 5; // Example

    try {
      int factorial = getFactorial(n);
      System.out.println("Factorial of " + n + " is: " + factorial);
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  static int getFactorial(int n) {
    int result = 1;

    for (int i = 1; i <= n; i++) {
      result = result * i;
    }

    return result;
  }
}