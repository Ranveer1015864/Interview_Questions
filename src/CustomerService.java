//Create a Customer Service Queue and serve customers using FIFO order.

class queuee{
    int Maxsize;
    String[]arr;
    int front;
    int rear;


      queuee(int size){
          this.Maxsize=size;
          this.arr=new String[size];
          this.front=0;
          this.rear=-1;
      }

      public boolean isfull(){
          return front==Maxsize-1;
      }
    public boolean isempty(){
        return front>rear;
    }


      public void Enqueue(String cust){
          if(isfull()){
              System.out.println("All tickets sold");
          }
           arr[++rear]=cust;
      }
      public String finish(){
          if(isempty()){
              System.out.println("Theater is empty already");
          }
           return arr[front++];
      }
      public String peek(){
          return arr[0];
      }


      public void display(){

          System.out.println("Customer's Line to buy Movie ticket");
          for(int i = front; i <= rear; i++){
              System.out.println(arr[i]);
          }

      }

}



public class CustomerService {
    public static void main(String[] args) {

        queuee qq=new queuee(4);

        qq.Enqueue("Ranveer  : ");
        qq.Enqueue("Ranjeet  : ");
        qq.Enqueue("Rohan    : ");
        qq.Enqueue("Shreyash : ");


        qq.display();

        System.out.println();

        System.out.println(qq.finish()+"Is in the Movie Theater");

        System.out.println();



        System.out.println("Next person to buy ticket");

        System.out.println(qq.peek()+"Is next ");

        System.out.println();

        System.out.println("Waiting List ");
       qq.display();






    }
}
