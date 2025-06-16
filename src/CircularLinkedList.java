class NodeCLL{
    int data;
    NodeCLL next;
    NodeCLL(int data){
        this.data=data;
        this.next=null;
    }
}

public class CircularLinkedList {
    NodeCLL head=null;
    NodeCLL tail=null;

    void add(int data){
        NodeCLL newNode=new NodeCLL(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            tail.next=head;
        }else{
            tail.next=newNode;
            newNode.next=head;
            tail=newNode;
        }
    }
    void addFirstCLL(int data){
        NodeCLL newNode=new NodeCLL(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            tail.next=head;
            return;
        }
        NodeCLL curr=head;
        newNode.next=head;
        head=newNode;
        tail.next=newNode;
    }
    void addLastCLL(int data){
        NodeCLL curr=tail;
        NodeCLL newNode=new NodeCLL(data);
        newNode.next=head;
        tail.next=newNode;
        tail=newNode;
    }
    void insertCLL(int pos,int data){
        NodeCLL newNode=new NodeCLL(data);
        if(pos==1){
            addFirstCLL(data);
            return;
        }
        NodeCLL curr=head;
        for(int i=1; i<pos-1; i++){
            curr=curr.next;
        }
        newNode.next=curr.next;
        curr.next=newNode;

    }

    void display(){
        NodeCLL curr=head;
        do{
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        while (curr!=head);
        System.out.println("Head");
    }


}
