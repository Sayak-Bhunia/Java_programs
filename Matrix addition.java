import java.util.*;


class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        if(n != p || m != q) {
            System.out.println("matrices are incompatible for addition");
            return;
        }
        int[][] a = new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) a[i][j] = sc.nextInt();
        }
        int[][] b = new int[p][q];
        for(int i=0;i<p;i++) {
            for(int j=0;j<q;j++) b[i][j] = sc.nextInt();
        }
        int[][] c = new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) c[i][j] = a[i][j] + b[i][j];
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) System.out.print(c[i][j] + " ");
            System.out.println();
        }
    }
}
