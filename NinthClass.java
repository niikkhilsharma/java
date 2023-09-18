import java.util.Scanner;

public class NinthClass {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    Arrays2(size);
    //  Arrays();
  }

  public static void Arrays() {
    //  int[] marks = new int[3];
    /*    int marks[] = new int[3];
    marks[0] = 97;
    marks[1] = 92;
    marks[2] = 100; */
    int marks[] = { 97, 98, 99 };
    System.out.println(marks[0]);
    System.out.println(marks[1]);
    System.out.println(marks[2]);
  }

  public static void Arrays2(int size) {
    int numbers[] = new int[size];
    for (int i = 0; i < size; i++) {
      Scanner sc = new Scanner(System.in);
      numbers[i] = sc.nextInt();
    }
    System.out.println("Printing all the values");

    for (int i = 0; i < size; i++) {
      System.out.println(numbers[i]);
    }
  }
}
