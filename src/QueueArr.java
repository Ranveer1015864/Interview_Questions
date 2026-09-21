class Queue{
    int Maxsize;
    int[]arr;
    int front;
    int rear;

        Queue(int size){
            this.Maxsize=size;
            this.arr=new int[size];
            this.front=0;
            this.rear=-1;
        }

        public boolean isFull(){
            return front==Maxsize-1;
        }

        public boolean isEmpty(){
            return rear==-1;
        }
        public void peek(){
            System.out.println(arr[front]);
        }

                    public void Enqueue(int element){
                        arr[++front]=element;
                    }


                    public int Dequeue(){
                        if(isEmpty()){
                            System.out.println("Queue is Empty");
                        }
                        return arr[rear--];
                    }


                                                public void display(){
                                                    for(int i:arr){
                                                        System.out.print(" "+i);
                                                    }
                                                }


}


public class QueueArr {
    public static void main(String[] args) {
        Queue q=new Queue(6);

        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);
        q.Enqueue(50);

        q.display();
    }
}
