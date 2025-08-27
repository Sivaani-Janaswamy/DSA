class QueueArray {
    int[] arr;
    int front, rear, size;

    QueueArray(int size) {
        this.size = size;
        arr = new int[size];
        front = rear = -1;
    }

    void enqueue(int val) {
        if ((rear + 1) % size == front) {
            System.out.println("Overflow");
            return;
        }
        if (front == -1) front = 0;
        rear = (rear + 1) % size;
        arr[rear] = val;
    }

    int dequeue() {
        if (front == -1) throw new RuntimeException("Underflow");
        int val = arr[front];
        if (front == rear)
            front = rear = -1;
        else
            front = (front + 1) % size;
        return val;
    }
}
