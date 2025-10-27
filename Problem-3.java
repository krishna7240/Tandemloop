import java.util.Scanner;

public class Problem-2{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int n;
    if (a % 2 == 0) {
      n = a + 1;
    } else {
      n = a;
    }
    for (int i = 1; i <= n; i += 2) {
      System.out.print(i);
      if (i + 2 <= n)
        System.out.print(",");
    }
  }
}
