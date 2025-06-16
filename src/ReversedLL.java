class NodeLL{
    int data;
    NodeLL next;
    NodeLL(int data){
        this.data=data;
        this.next=null;
    }
}
public class ReversedLL {
    NodeLL head=null;

    void addRLL(int data){
        NodeLL newNode=new NodeLL(data);
        if(head==null){
            head=newNode;
        }else{
            NodeLL curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }curr.next=newNode;
        }
    }

    void displayRLL(){
        NodeLL curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("END");
    }

    void reverseRLL(){
        NodeLL curr=head;
        NodeLL prev=null;
        NodeLL next=null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        NodeLL temp=head;
        while (temp!=null){
            System.out.print(temp.data+"<-");
            temp=temp.next;
        }
        System.out.println("START");
    }
}
