// Implement a Stack using a Linked List.

class Node{
    int data;
    Node next;


    Node(int data){
        this.data=data;
        this.next=null;
    }
}


class List{
    Node top;

      List(){
          this.top=null;
      }

     public void push(int data){
          Node newnode=new Node(data);
          newnode.next=top;
          top=newnode;
     }

     public int pop(){
          int temp=top.data;
          top=top.next;
          return temp;

     }

     public void display(){
          Node curr=top;

          while(curr!=null){
              System.out.println(curr.data);
              curr=curr.next;
          }
     }
}



public class TheStackLinkedL {
    public static void main(String[] args) {

        List sl=new List();

        sl.push(10);
        sl.push(20);
        sl.push(30);
        sl.push(40);
        sl.push(50);

        sl.display();



    }
}
