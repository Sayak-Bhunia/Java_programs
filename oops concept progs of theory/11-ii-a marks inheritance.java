class StudentDetails {
    protected String name;
    protected int roll;
    protected int yoa; // year of admission
    protected String dob;
    protected int sem;
    public StudentDetails(String name, int roll, int yoa, String dob, int sem) {
        this.name = name;
        this.roll = roll;
        this.yoa = yoa;
        this.dob = dob;
        this.sem = sem;
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Year of Admission: " + yoa);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Semester: " + sem);
    }
}

class Marks extends StudentDetails {
    private double[] sub;
    private int n; // total no. of subs
    public Marks(String name, int roll, int yoa, String dob, int sem, int n) {
        super(name, roll, yoa, dob, sem);
        this.n = n;
        this.sub = new double[n];
    }
    public void setMarks(double[] marks) {
        if (marks.length == n) this.sub = marks;
        else System.out.println("INVALID");
    }
    private double calculatePercentage() {
        int sum = 0;
        for(double it:sub) sum += it*10;
        return (sum/(double) (n*100))*100;
    }
    public void displayStudentDetails() {
        displayDetails(); 
        double percentage = calculatePercentage();
        System.out.println("Secured Percentage: " + percentage + "%");
    }
}

public class Main {
    public static void main(String[] args) {
        Marks std = new Marks("Sayak Bhunia", 31, 2022, "29-03-2005", 4, 4);
        double[] marks = {9.15, 9.45, 9.15, 9.63};
        std.setMarks(marks);
        std.displayStudentDetails();
    }
}
