// Implement a Queue using a Linked List.

class Thenode {
    int data;
    Thenode next;

    Thenode(int data) {
        this.data = data;
        this.next = null;
    }
}

     class QList{
         Thenode front;
         Thenode rear;

           QList(){
               this.front=null;
               this.rear=null;
           }

           public void Enqueue(int data){
               Thenode newnode=new Thenode(data);

                if(rear==null){
                    front=rear=newnode;
                    return;
                }else{
                    rear.next=newnode;
                    rear=newnode;
                }
           }

           public void Dequeue(){
               front=front.next;
           }
           public void display(){
               Thenode curr=front;

               while(curr!=null){
                   System.out.print(curr.data+" ");
                   curr=curr.next;
               }
           }
     }



public class TheQueueLinkedL {
    public static void main(String[] args) {

        QList obj=new QList();
        obj.Enqueue(10);
        obj.Enqueue(20);
        obj.Enqueue(30);
        obj.Enqueue(40);
        obj.Enqueue(50);

        obj.display();

    }
}
