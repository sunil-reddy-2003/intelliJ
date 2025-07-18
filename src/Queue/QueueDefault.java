package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDefault {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);
//        System.out.println(queue.poll());//retrieves and removes the head
        System.out.println(queue.peek());//returns the head or returns null if empty
        System.out.println(queue.element());//returns the head or returns exception if empty
        queue.remove();
        queue.remove();
        System.out.println(queue);
    }
}
