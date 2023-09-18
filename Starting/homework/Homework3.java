package homework;

import java.util.Scanner;
import java.utils.*;

public class Homework3 {

  public static void main(String args[]) {
    int a = 12;
    float b = 12.22f;
    System.out.println("Please enter the radius of the circle");
    Scanner sc = new Scanner(System.in);
    int radius = sc.nextInt();
    System.out.print("The area of the circle is ");
    System.out.println(radius * radius);
  }
}
