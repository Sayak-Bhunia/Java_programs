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
    int marks;
    String grade;
    public Result() {
        this.marks = marks1 + marks2;
        calGrade();
    }
    private void calGrade() {
        if(marks>=180 && marks<200) grade = "AA";
        else if(marks>=160 && marks<180) grade = "A";
        else if(marks>=140 && marks<160) grade = "B";
        else if(marks>=120 && marks<140) grade = "C";
        else if(marks>=100 && marks<120) grade = "D";
        else grade = "F";
    }
    void result() {
        System.out.println("--------Result--------");
        System.out.println("Name = "+name);
        System.out.println("Roll = "+roll);
        System.out.println("Grade = "+grade);
        System.out.println("Credits = "+credit);
    }
}

public class Main {
    public static void main(String[] args) {
        Result r = new Result();
        r.result();
    }
}
