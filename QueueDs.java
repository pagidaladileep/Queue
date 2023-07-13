public class QueueDs {
    private static Object[] queueArray;
    private static int size;
    private int front;
    private int rear;

    public QueueDs(int size) {
        this.size = size;
        this.front = -1;
        this.rear = -1;
        queueArray = new Object[size];
    }

    public void enqueue(Object value) {
        if (rear == size - 1) {
            System.out.println("Queue is full");
        } else {
            rear++;
            queueArray[rear] = value;
            if (front == -1) {
                front = 0;
            }
        }
    }

    public Object dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return null;
        } else {
            Object dequeuedValue = queueArray[front];
            queueArray[front] = null;
            front++;
            return dequeuedValue;
        }
    }

    public static void main(String[] args) {
        QueueDs q = new QueueDs(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        for (int i = q.front; i <= q.rear; i++) {
            System.out.println(queueArray[i]);
        }
    }
}
