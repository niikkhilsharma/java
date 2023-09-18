import java.util.Scanner;

public class ElevenClass {

  public static void main(String args[]) {
    //  Learning();
    Assignment();
  }

  public static void Learning() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter number of rows");
    int rows = sc.nextInt();
    System.out.println("Please enter number of cols");
    int cols = sc.nextInt();

    int twoDArray[][] = new int[rows][cols];

    System.out.println("Now you'll be entering values for the 2D Array");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        twoDArray[i][j] = sc.nextInt();
      }
    }
    System.out.println("Below are printed the value of 2D Array");
    for (int i = 0; i < rows; i++) {
      for (int k = 0; k < cols; k++) {
        System.out.print(twoDArray[i][k] + " ");
      }
      System.out.println();
    }
  }

  public static void Assignment() {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int cols = sc.nextInt();

    int matrix[][] = new int[rows][cols];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("Please enter the number to find in the matrix");
    int find = sc.nextInt();

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (matrix[i][j] == find) {
          System.out.println(i + "," + j + "is the index");
          return;
        }
      }
    }
  }
}
