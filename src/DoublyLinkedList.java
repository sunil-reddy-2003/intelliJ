class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

class DoublyLinkedList {
    Node head=null;

    void add(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
        }else{
            Node curr=head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next=newNode;
            newNode.prev=curr;
        }
    }

    void insert(int data,int pos){
        Node curr=head;
        Node newNode=new Node(data);
        for(int i=1; i<pos-1; i++){
            curr=curr.next;
        }
        newNode.next=curr.next;
        newNode.prev=curr;
        curr.next.prev=newNode;
        curr.next=newNode;
//        newNode.prev.next=newNode;
    }

    void addFirst(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        if(head!=null){
            head.prev=newNode;
        }
        head=newNode;
    }
    void addLast(int data){
        Node curr=head;
        Node newNode=new Node(data);
        if(head==null){
            addFirst(data);
            return;
        }
        while (curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
        newNode.prev=curr;
    }

    void display(){
        Node curr=head;
        Node last=null;
        while(curr!=null){
            System.out.print(curr.data+" ");
            last=curr;
            curr=curr.next;
        }
        System.out.println();

        while (last!=null){
            System.out.print(last.data+" ");
            last=last.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.add(2);
        dll.add(3);
        dll.add(5);
        dll.addFirst(1);
        dll.addLast(6);
        dll.insert(4,4);
        dll.display();

    }
}
