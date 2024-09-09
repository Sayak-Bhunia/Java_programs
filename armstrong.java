import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int n = scanner.nextInt();
        int c = 0;
        int k = n;
        while (k != 0) {
            c++;
            k = k / 10;
        }
        int t = n;
        int m = 0;
        while (t != 0) {
            int r = t % 10;
            int p = 1;
            int d = c;
            while (d != 0) {
                p = p * r;
                d--;
            }
            m = m + p;
            t = t / 10;
        }
        if(m == n) System.out.println("Armstrong number");
        else System.out.println("Not Armstrong");
        scanner.close();
    }
}
