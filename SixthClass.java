public class SixthClass {

  public static void main(String args[]) {
    //10th pattern
    /*     for (int i = 1; i <= 4; i++) {
      for (int j = 1; j <= 4; j++) {
        if (i >= j) {
          System.out.print("*");
        } else {
          System.out.print(' ');
        }
      }
      for (int k = 4; k >= 1; k--) {
        if (i >= k) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }

    for (int i = 4; i >= 1; i--) {
      for (int j = 1; j <= 4; j++) {
        if (i >= j) {
          System.out.print("*");
        } else {
          System.out.print(' ');
        }
      }
      for (int k = 4; k >= 1; k--) {
        if (i >= k) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    } */

    //11th pattern
    int k;
    for (int i = 5; i >= 1; i--) {
      for (int j = 1; j <= 9; j++) {
        if (j < i) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
        k = i - j;
      }
      while (k < 4) {
        System.out.print(" ");
        k++;
      }
      System.out.println();
    }
  }
}
