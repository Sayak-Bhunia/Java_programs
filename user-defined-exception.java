import java.util.*;

class NotPalindromeException extends Exception {
    public String toString() {
        return "It is not palindrome";
    }
}

class A {
    public static boolean helper(String s) {
        int i = 0, j = s.length() - 1;
        while(i<j) {
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        try {
            if(helper(s)) System.out.println("yes");
            else {
                throw new NotPalindromeException();
            }
        }
        catch (NotPalindromeException ex) {
            System.out.println("User defined exception: " + ex);
        }
    }
}
