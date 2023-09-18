import java.util.Scanner;

public class ThirdClassb {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int button = sc.nextInt();

    switch (button) {
      case 1:
        System.out.println("button1");
        System.out.println("new button 11");
        break;
      case 2:
        System.out.println("button 2");
        System.out.println("new button 22");
        break;
      default:
        System.out.println("no button");
        break;
    }
  }
}
