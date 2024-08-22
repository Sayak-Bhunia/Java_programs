import java.util.*;
class biggestofthree
{
  public static void main(String ar[])
  {
      Scanner sc = new Scanner(System.in);
      int a,b,c;
      System.out.println("Enter 3 nos");
      a = sc.nextInt();
      b = sc.nextInt();
      c = sc.nextInt();
      int res = 0;
      if(a>=b && a>=c) res = a;
      else if(b>=a && b>=c) res = b;
      else res = c;
      System.out.println("Sum = "+res);
  }
}
