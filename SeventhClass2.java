import java.util.Scanner;

public class SeventhClass2 {

  public static int sum(int a, int b) {
    return a + b;
  }

  public static int factorial(int f) {
    int result = 1;
    if (f < 0) {
      System.out.println("The number provided is invaild");
      return 0;
    } else {
      while (!(f == 0)) {
        result = result * f;
        f--;
      }
    }
    return result;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a Number");
    int a = sc.nextInt();
    System.out.println("Please enter a Number");
    int b = sc.nextInt();
    //  System.out.println(sum(a, b));
    System.out.println(factorial(b));
  }
}
