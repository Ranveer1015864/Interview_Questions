class NODE{
    int data;
    NODE next;


      NODE(int data){
          this.data=data;
          this.next=null;
      }
}
class LIST{
    NODE front;
    NODE rear;

       LIST(){
           this.front=null;
           this.rear=null;
       }

       public void Enqueue(int element){
           NODE newnode=new NODE(element);
         if(rear==null){
             front=rear=newnode;
         }
         else{
             rear.next=newnode;
             rear=newnode;
         }
       }
       public void Dequeue(){
           front=front.next;

       }



       public void peek(){

           System.out.println(front.data);
       }

}



public class QueueLinked {
    public static void main(String[] args) {
        LIST queue=new LIST();

        queue.Enqueue(10);
        queue.Enqueue(20);

        queue.peek();
    }
}
