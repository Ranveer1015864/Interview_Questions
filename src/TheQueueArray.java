// Implement a Queue using an array.

class queue{
    int Maxsize;
    int[] arr;
    int front;
    int rear;

      queue(int size){
          this.Maxsize=size;
          this.arr=new int[size];
          this.front=0;
          this.rear=-1;
      }

      public boolean isfull(){
          return front==Maxsize-1;
      }
      public boolean isempty(){
          return front==-1;
      }
      public int peek(){
          return arr[front];
      }


      public void Enqueue(int data){
          if(isfull()){
              System.out.println("Queue is full");
          }
          arr[++rear]=data;
      }

      public int Dequeue(){
          if(isempty()){
              System.out.println("queue is empty");
          }
          return arr[front++];
      }

      public void display(){

         for(int i:arr){
             System.out.println(i);
          }
      }
}





public class TheQueueArray {
    public static void main(String[] args) {

    queue q=new queue(5);

       q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);
        q.Enqueue(50);

        q.display();

        System.out.println("Peek element :"+q.peek());


        System.out.println();
        System.out.println("Delete element :"+q.Dequeue());

        System.out.println("Newpeek element :"+q.peek());



    }
}
