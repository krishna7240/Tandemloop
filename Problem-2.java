import java.util.*;
public class Problem-2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    for(int i=1;i<=a;i++)
    {
     int n = 2 * i - 1;
      System.out.print(n);
      if(i<a)
      System.out.print(",");
    }
  }
}
