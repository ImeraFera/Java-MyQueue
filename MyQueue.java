/**
 * MyQueue
 */
public class MyQueue {

    private int front;
    private int rear;
    private Object[] arr;

    public void setArr(Object[] arr) {
        this.arr = arr;
    }

    public Object[] getArr() {
        return arr;
    }

    public MyQueue(int size) {

        arr = new Object[size];
        front = 0;
        rear = -1;

    }

    private void shiftElements() {

        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            Object temp = arr[i];
            arr[j] = temp;
            arr[i] = null;
        }
    }

    public int size() {

        return rear - front + 1;

    }

    public Object peek() {

        return (isEmpty()) ? null : arr[front];

    }

    public void enqueue(Object element) {

        if (isEmpty()) {
            rear = -1;
        }

        if (!isFull()) {
            rear++;
            arr[rear] = element;
        } else {
            throw new IllegalStateException("Queue is already full");
        }

    }

    public Object dequeue() {

        if (!isEmpty()) {
            rear--;
            Object temp = arr[front];
            arr[front] = null;
            shiftElements();

            return temp;
        } else {

            throw new IllegalStateException("Queue is already empty");
        }

    }

    public boolean isEmpty() {

        return (arr[front] == null);

    }

    public boolean isFull() {

        return (rear + 1 == arr.length);
    }

    public void clear() {
        while (!isEmpty()) {
            dequeue();
        }
        System.out.println("Queue has been cleared");
    }

    public void print() {

        for (Object object : arr) {
            System.out.print(object + " ");
        }
        System.out.println();
    }
}