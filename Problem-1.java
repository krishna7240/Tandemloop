import java.util.Scanner;

public class Problem-1
{
  private int a;
  private int b;
  private String o_type;

  void oper(int a, int b, String o_type) {
    this.a = a;
    this.b = b;
    this.o_type = o_type.toLowerCase();
  }

  public int cal() {
    switch (o_type) {
      case "addition":
        return a + b;
      case "subtraction":
        return a - b;
      case "multiplication":
        return a * b;
      case "division":
        if (b == 0) {
          throw new ArithmeticException("Error");
        }
        return a / b;
      default:
        throw new IllegalArgumentException("Invalid Input");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter Operation(addition,subtracion,mutiplication,division)");
    String o_type = sc.nextLine();
    Arito c = new Arito();
    c.oper(a, b, o_type);
    System.out.println(c.cal());
  }
}
