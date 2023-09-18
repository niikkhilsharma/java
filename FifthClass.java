public class FifthClass {

  public static void main(String args[]) {
    //This is the 1st pattern
    /*     for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print("*");
      }
      System.out.println();
    } */

    //This is the 2nd pattern
    /*     for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        if (i > 0 && i < 3) {
          if (j > 0 && j < 4) {
            System.out.print(" ");
            continue;
          }
          System.out.print("*");
        } else {
          System.out.print("*");
        }
      }
      System.out.println();
    } */

    //  This is the 3rd pattern
    /*     for (int i = 1; i < 6; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    } */

    //4th pattern
    /*     int k = 4;
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < k; j++) {
        System.out.print("*");
      }
      System.out.println();
      k--;
    } */

    //5th pattern
    /*     for (int i = 9; i > 5; i--) {
      for (int j = 6; j < 10; j++) {
        if (i > j) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      System.out.println();
    } */

    //6th pattern
    /*     for (int i = 2; i < 7; i++) {
      for (int j = 1; j < i; j++) {
        System.out.print(j);
      }
      System.out.println();
    } */

    //7th pattern
    /*     for (int i = 6; i > 1; i--) {
      for (int j = 1; j < i; j++) {
        System.out.print(j);
      }
      System.out.println();
    } */

    //8th pattern
    /*     int a = 1;
    for (int i = 1; i < 6; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(a);
        System.out.print(" ");
        a++;
      }
      System.out.println();
    } */

    //9th pattern
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        if ((i + j) % 2 == 0) {
          System.out.print("1");
        } else {
          System.out.print("0");
        }
      }
      System.out.println();
    }
  }
}
