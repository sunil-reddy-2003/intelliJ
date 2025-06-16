//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        DoublyLinkedList dll = new DoublyLinkedList();
//        dll.add(2);
//        dll.add(3);
//        dll.add(5);
//        dll.addFirst(1);
//        dll.addLast(6);
//        dll.insert(4,4);
//        dll.display();



        CircularLinkedList cll = new CircularLinkedList();
//        cll.add(20);
//        cll.add(3);
//        cll.add(5);

//        cll.insertCLL(1,1);
//        cll.insertCLL(2,2);
//        cll.insertCLL(3,3);
//        cll.insertCLL(4,4);
//        cll.insertCLL(5,5);
//        cll.display();


        ReversedLL rll = new ReversedLL();
        rll.addRLL(1);
        rll.addRLL(2);
        rll.addRLL(3);
        rll.addRLL(4);
        rll.addRLL(5);
        rll.addRLL(6);
        rll.displayRLL();
        rll.reverseRLL();
    }
}