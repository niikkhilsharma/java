import java.util.Scanner;

public class NinthClass2 {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int array[] = new int[size];
    for (int i = 0; i < size; i++) {
      array[i] = sc.nextInt();
    }
    System.out.println("Please enter the number to find in array");
    int findNumber = sc.nextInt();
    for (int i = 0; i < array.length; i++) {
      if (array[i] == findNumber) {
        System.out.println("The number is found at index " + i);
        break;
      }
    }
  }
}
