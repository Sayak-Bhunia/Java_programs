class Mul {
    static int display(int a, int b) {
        return a*b;
    }
    
    static double display(double a, double b) {
        return a*b;
    }

    public static void main(String[] args) {
       System.out.println(Mul.display(2, 3));
       System.out.println(Mul.display(2.3, 3.2));
    }
}

// class Another {
//     public static void main(String[] args) {
//       System.out.println(Mul.display(2, 3));
//       System.out.println(Mul.display(2.3, 3.2));
//     }
// }
