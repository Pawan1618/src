public class LL {
    private Node head;
    private Node tail;

    private int size;
    public LL(){
        this.size=0;
    }

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void insertEnd(int val){
        Node last= new Node(val);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=last;
        tail=last;
//        size+=1;
        size++;

    }
    void insertAtK(int value,int index){
        Node node=new Node(value);
        Node temp=head;
        while(index-1>0){
            temp=temp.next;
            index--;
        }

        node.next=temp.next;
        temp.next=node;
//        node.next=temp.next;

    }

    //insert using recursion
    public void insertRec(int val, int index){
        head=insertRec(val,index,head);

    }
    private Node insertRec(int val, int index,Node node){
        if(index==0){
            Node temp=new Node(val,node);
            size++;
            return temp;
        }
        node.next=  insertRec(val,index-1,node.next);
        return node;
    }

    void insertLast(int value){
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size++;

    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.print("end");
    }
    private class Node{


        private int value;
        private Node next;
        public Node(int value){
            this.value=value;


        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
}
