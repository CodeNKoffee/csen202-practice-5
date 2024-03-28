import java.util.Scanner;

public class SheetFive {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Exercise 5-8 Prime
    System.out.print("Enter a number to check if it's prime: ");
    int number = scanner.nextInt();
    if (isPrime(number)) {
      System.out.println(number + " is prime");
    } else {
      System.out.println(number + " is not prime");
    }

    // Exercise 5-4 Power
    System.out.print("Enter base (m) for power calculation: ");
    int base = scanner.nextInt();
    System.out.print("Enter exponent (n) for power calculation: ");
    int exponent = scanner.nextInt();
    System.out.println("Result of " + base + " raised to the power of " + exponent + " is: " + power(base, exponent));

    // Exercise 5-5 Euler
    System.out.print("Enter the number of terms for Euler's constant calculation: ");
    int n = scanner.nextInt();
    System.out.println("Euler's constant (e) with " + n + " terms is: " + euler(n));

    // Exercise 5-6 Perfect Number
    System.out.print("Enter a number to find perfect numbers up to: ");
    int limit = scanner.nextInt();
    System.out.println("Perfect numbers up to " + limit + ":");
    findPerfectNumbers(limit);

    // Extra Exercise: Exercise 5-7 Palindrome
    scanner.nextLine(); // Consume newline
    System.out.print("Enter text to check if it's a palindrome: ");
    String text = scanner.nextLine();
    if (isPalindrome(text.toLowerCase())) {
      System.out.println("The text is a palindrome.");
    } else {
      System.out.println("The text is not a palindrome.");
    }

    scanner.close();
  }

  // Exercise 5-8 Prime
  public static boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  // Exercise 5-4 Power
  public static double power(int base, int exponent) {
    return Math.pow(base, exponent);
  }

  // Exercise 5-5 Euler
  public static double euler(int n) {
    double e = 1;
    for (int i = 1; i <= n; i++) {
      e += 1.0 / factorial(i);
    }
    return e;
  }

  // Helper method for Euler
  public static long factorial(int num) {
    long fact = 1;
    for (int i = 1; i <= num; i++) {
      fact *= i;
    }
    return fact;
  }

  // Exercise 5-6 Perfect Number
  public static void findPerfectNumbers(int limit) {
    for (int i = 1; i <= limit; i++) {
      if (isPerfect(i)) {
        System.out.println(i);
      }
    }
  }

  // Helper method for Perfect Number
  public static boolean isPerfect(int num) {
    int sum = 0;
    for (int i = 1; i < num; i++) {
      if (num % i == 0) {
        sum += i;
      }
    }
    return sum == num;
  }

  // Extra Exercise: Exercise 5-7 Palindrome
  public static boolean isPalindrome(String text) {
    int i = 0;
    int j = text.length() - 1;
    while (i < j) {
      if (text.charAt(i) != text.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }
}
