class QQ{
    int Maxsize;
    int[] arr;
    int front;
    int rear;
    int CurrCapacity;

      QQ(int size){
          this.Maxsize=size;
          this.arr=new int[size];
          this.front=0;
          this.rear=-1;
          this.CurrCapacity=0;
      }



      public boolean isfull(){
          return rear==Maxsize-1;
      }
      public boolean isempty(){
          return front==-1;
      }

      public void Enqueue(int element){
          if(isfull()){
              System.out.println("Queue if Full");
          }

          rear=(rear+1)%Maxsize;
          arr[rear]=element;

      }

      public int Dequeue(){
          if(isempty()){
              System.out.println("Queue is Empty");
          }

          int data=arr[front];
          front=(front+1);
          return data;
      }
}



public class CircularQueue {
}
