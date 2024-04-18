//check Prime Number Program in Java
public class Primenumber {

  static boolean isPrime(int n) {
    // Check if the number is <= 1
    if (n <= 1) return false;

    // Check for factors
    for (int j = 2; j <= n / 2; j++) {
      if (n % j == 0) return false;
    }
    return true;
  }

  public static void main(String[] args) {
    if (isPrime(11)) {
      System.out.println("The number is prime");
    } 
    else {
      System.out.println("The number is not prime");
    }
  }
}
