public class FourthClass {

  public static void main(String args[]) {
    for (int i = 0; i < 11; i++) {
      System.out.println(i);
    }

    System.out.println("Now from while loop");
    int i = 0;
    while (i < 11) {
      System.out.println(i);
      i++;
    }

    System.out.println("Now from do while loop");
    // i = 0;
    do {
      System.out.println(i);
      i++;
    } while (i < 2);
  }
}
