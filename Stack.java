import java.util.*;

class Stack {
    private int top;
    private int size;
    private int[] arr;

    // Constructor to create the stack
    public Stack(int size) {
        this.size = size;
        this.top = -1;
        this.arr = new int[size];
    }

    // Push operation
    public void push() {
        if (top == size - 1) {
            System.out.println("\nOVERFLOW\n");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter value: ");
            int val = scanner.nextInt();
            arr[++top] = val;
        }
    }

    // Pop operation
    public void pop() {
        if (top == -1) {
            System.out.println("\nUNDERFLOW\n");
        } else {
            top--;
        }
    }

    // Display operation
    public void display() {
        if (top == -1) {
            System.out.println("\nUNDERFLOW\n");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
        System.out.println();
    }

    // Main driver function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = scanner.nextInt();
        Stack stack = new Stack(size);

        while (true) {
            System.out.println("1->PUSH");
            System.out.println("2->POP");
            System.out.println("3->DISPLAY");
            System.out.println("4->EXIT");
            System.out.print("Enter your choice: ");
            int ch = scanner.nextInt();

            switch (ch) {
                case 1:
                    stack.push();
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("INVALID CHOICE!");
            }
        }
    }
}
