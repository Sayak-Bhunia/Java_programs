class Student {
    int roll;
    String name;
    float marks;
    Student() {
        roll = 31;
        name = "Sayak Bhunia";
        marks = 84.4f;
    }
    
    void display() {
        System.out.println("Roll = " + roll);
        System.out.println("Name = " + name);
        System.out.println("Marks = " + marks);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
