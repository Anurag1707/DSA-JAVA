 class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data=data;
        this.next=null;
    } 

}

class  MyLinkedList{
    Node head;

    void insert(int data){
        Node newnode= new Node(data);
        newnode.next=head;
        head=newnode;
    }

    void Display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("Null");
    }

}

class main {
    public static void main(String[] args) {
        MyLinkedList ls=new MyLinkedList();
        ls.insert(10);
         ls.insert(20);
         ls.Display();

        
    }
    
}
