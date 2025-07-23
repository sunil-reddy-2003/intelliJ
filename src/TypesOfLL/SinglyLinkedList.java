package TypesOfLL;
class NodeSLL{
    int data;
    NodeSLL next;
    NodeSLL(int data){
        this.data=data;
        this.next=null;
    }
}

public class SinglyLinkedList {
    NodeSLL head=null;

    void add(int data){
        NodeSLL newNode=new NodeSLL(data);
        if(head==null){
            head = newNode;
        }else{
            NodeSLL curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=newNode;
        }
    }
    void display(){
        NodeSLL curr=head;
        if(curr==null){
            System.out.print("Linked List is empty");
        }
        while (curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(1);
        sll.add(2);
        sll.add(3);
        sll.add(4);
        sll.display();
    }

}
