import java.util.*;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n, sum = 0;
        while(t != 0) {
            int f = 1;
            for(int i=1;i<=t%10;i++) f *= i;
            sum += f;
            t /= 10;
        }
        if(sum == n) System.out.println("krishnamurthy");
        else System.out.println("not krishnamurthy");
    }
}
