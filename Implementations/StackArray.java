class StackArray {
    int[] arr;
    int top, size;

    StackArray(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    void push(int val) {
        if (top == size - 1) {
            System.out.println("Overflow");
            return;
        }
        arr[++top] = val;
    }

    int pop() {
        if (top == -1) throw new RuntimeException("Underflow");
        return arr[top--];
    }

    int peek() {
        if (top == -1) throw new RuntimeException("Empty Stack");
        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
