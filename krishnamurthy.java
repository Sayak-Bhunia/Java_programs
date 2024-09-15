import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int n = sc.nextInt();
        sc.close();
        int t = n;
        int m = 0;
        while(t != 0) {
            int r = t%10;
            int f = 1;
            for(int i=1;i<=r;i++) f *= i;
            m += f;
            t /= 10;
        }
        if(m == n) System.out.println("krishnamurthy");
        else System.out.println("not krishnamurthy");
    }
}
