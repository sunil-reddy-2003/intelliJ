package Queue.CircularQueue;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    protected int end=0;
    protected int front=0;
    private int size=0;
    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data=new int[size];
    }
    private boolean isFull() {
        return size== data.length;
    }
    public boolean add(int item){
        if(isFull()){
            System.out.println("circular queue is full");
            return false;
        }
        data[end++]=item;
        end=end%data.length;
        size++;
        return true;
    }
    public int remove(){
        int removed=data[front];
        front++;
        front=front% data.length;
        size--;
        return removed;
    }

    private boolean isEmpty() {
        return size== 0;
    }
    public int Size(){
        return size;
    }
    public int front(){
        return data[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        do{
            System.out.print(data[i]+"->");
            i++;
            i%= data.length;
        }while (i!=end);
        System.out.println("END");
    }

}
