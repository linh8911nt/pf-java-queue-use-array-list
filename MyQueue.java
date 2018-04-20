public class MyQueue {
    private int capacity;
    int queueArr[];
    int head = 0;
    int tail = -1;
    int currentSize = 0;

    public MyQueue() {
    }

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull(){
        boolean status = false;
        if (currentSize == capacity){
            status = true;
        }
        return status;
    }

    public boolean isQueueEmpty(){
        boolean status = false;
        if (currentSize == 0){
            status = true;
        }
        return status;
    }

    public void enqueue(int item){
        if (isQueueFull()){
            System.out.println("Overflow! unable to add element: " + item);
        } else {
            tail++;
            if (tail == capacity - 1){
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Element " + item + " is pushed to queue.");
        }
    }

    public void dequeue(){
        if (isQueueEmpty()){
            System.out.println("Underflow! unable to remove element from queue");
        } else {
            head++;
            if (head == capacity - 1){
                System.out.println("Pop operation done! remove: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Pop operation done! remove: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }
}
