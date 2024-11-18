import java.util.Scanner;

class Student {
    public String name = "Sayak Bhunia";
    public int roll = 31;
    public int marks1 = 96;
    public int marks2 = 75;
}

interface Excurr{
    public int credit = 3;
}

class Result extends Student implements Excurr {
    int marks = marks1 + marks2;
    void result() {
        System.out.println("--------Result--------");
        System.out.println("Name = "+name);
        System.out.println("Roll = "+roll);
        System.out.println("Marks = "+marks);
        System.out.println("Credits = "+credit);
    }
}

public class Main {
    public static void main(String[] args) {
        Result r = new Result();
        r.result();
    }
}
