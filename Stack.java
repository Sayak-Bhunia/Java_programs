import java.util.Scanner;

class Stack {
    private int mx;
    private int top;
    private int[] stackArray;

    public Stack(int size) {
        mx = size;
        stackArray = new int[mx];
        top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("OVERFLOW: Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed " + value + " to stack.");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == mx - 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }
}

public class StackMenuDriven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = null;

        try {
            while (true) {
                System.out.println("Menu:");
                System.out.println("1. Create Stack");
                System.out.println("2. Push Element");
                System.out.println("3. Pop Element");
                System.out.println("4. Peek Element");
                System.out.println("5. Display Stack");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                int ch = scanner.nextInt();

                switch (ch) {
                    case 1:
                        System.out.print("Enter stack size: ");
                        int size = scanner.nextInt();
                        stack = new Stack(size);
                        System.out.println("Stack created with size " + size);
                        break;

                    case 2:
                        if (stack == null) {
                            System.out.println("Stack not created. Please create a stack first.");
                        } else {
                            System.out.print("Enter element to push: ");
                            int value = scanner.nextInt();
                            stack.push(value);
                        }
                        break;

                    case 3:
                        if (stack == null) {
                            System.out.println("Stack not created. Please create a stack first.");
                        } else {
                            int poppedValue = stack.pop();
                            if (poppedValue != -1) {
                                System.out.println("Popped " + poppedValue + " from stack.");
                            }
                        }
                        break;

                    case 4:
                        if (stack == null) {
                            System.out.println("Stack not created. Please create a stack first.");
                        } else {
                            int topValue = stack.peek();
                            if (topValue != -1) {
                                System.out.println("Top element is " + topValue);
                            }
                        }
                        break;

                    case 5:
                        if (stack == null) {
                            System.out.println("Stack not created. Please create a stack first.");
                        } else {
                            stack.display();
                        }
                        break;

                    case 6:
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } finally {
            scanner.close();
        }
    }
}
