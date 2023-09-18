package homework;

import java.util.Scanner;

public class PrimeNumber4 {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    if (number == 1) {
      System.out.println("1 is not a prime number");
    }
    for (int i = 2; i <= number; i++) {
      if (number == i) {
        System.out.println("this is a prime number");
      } else if (number % i == 0) {
        System.out.println("This is not a prime number");
        break;
      }
    }
  }
}
// This is the HW solution of video 4
