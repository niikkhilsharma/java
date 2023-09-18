import java.util.Scanner;

public class FourthClass2 {

  public static void main(String args[]) {
    /*  int sum = 0;
    for (int i = 1; i < 5; i++) {
      sum += i;
    }
    System.out.println(sum); */

    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    for (int i = 1; i < 11; i++) {
      System.out.println(number * i);
    }
  }
}
