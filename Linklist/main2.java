
class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data=data;
        this.next=null;
    }
    
}

class MyLinkedList{
    Node head;

    void insertLast(int data){
        Node temp=head;
        
        while(temp.next!=null){
            temp=temp.next;
        }
        Node newNode=new Node(data);
     
        temp.next=newNode;
     
    }

    void Display(){
        Node temp =head;

        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.print("Null");

    }
}



public class main2 {
    public static void main(String[] args) {
        MyLinkedList ls =new MyLinkedList();
        ls.insertLast(10);
        ls.insertLast(20);
        // ls.Display();

        
    }
    
}
