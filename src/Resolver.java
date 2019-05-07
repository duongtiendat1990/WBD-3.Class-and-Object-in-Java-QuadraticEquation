import java.util.Scanner;

public class Resolver {
  public static void main(String[] args) {
    int choice;
    do {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Quadratic Equation Resolver");
      System.out.println("Given a equation as 'a * x * x + b * x + c = 0', please enter constants:");
      System.out.print("a: ");
      double a = scanner.nextDouble();

      System.out.print("b: ");
      double b = scanner.nextDouble();

      System.out.print("c: ");
      double c = scanner.nextDouble();
      QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
      quadraticEquation.getRoot();
      System.out.println("Do it again?");
      System.out.println("1. Yes");
      System.out.println("0. No");
      System.out.println("Enter your choice: ");
      choice = scanner.nextInt();
    } while (choice!=0);
  }
}
