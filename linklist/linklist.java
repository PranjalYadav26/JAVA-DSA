package linklist;

public class linklist {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;

        }
        
    }
    public static Node Head;
    public static Node Tail;
    public static int size;

    public void addLast(int data){
     
        Node newNode= new Node(data);
        size++;
        if(Head==null){
            Head=Tail=newNode;
            return;
        }
        Tail.next=newNode;
        Tail=newNode;
    }

    public void addFirst(int data){
        //creating new node
        Node newNode= new Node(data);
        size++;
        if(Head == null){
            Head=Tail=newNode;
            return;
        }
        //linking node
        newNode.next=Head;
        //assigning head to newNode
        Head=newNode;


    }
    public void addmid(int idx,int  data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode= new Node(data);
        size++;
        Node Temp= Head;
        int i=0;
        while(i<idx-1){
        Temp=Temp.next;
        i++;
        }
        newNode.next=Temp.next;
        Temp.next=newNode;
    }

    public void print(){
        if (Head==null) {
            System.out.println("ll is empty");
            return;
        }
        Node temp=Head;
        while (temp !=null) {
            System.out.print(temp.data+ "->");
            temp=temp.next;
           
        }
        System.out.println("null");


    }

    public int removeFirst(){
        if(size==0){
            System.out.println("ll is empty");
            return 0 ;
        }
        else if(size==1){
            int val=Head.data;
            Head=Tail=null;
        }

        return 3;

    }
    public void reverse(){
        Node prev=null;
        Node curr=Head;
        Node next;

        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            
        }
        Head=prev;
    }
    public static void main(String[] args) {
        linklist ll=new linklist();

        
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addLast(7);
        ll.print();
        ll.addLast(9);
        ll.print();
        ll.addmid(2, 20);
        ll.print();
    ll.reverse();
    ll.print();
    }

    
}
