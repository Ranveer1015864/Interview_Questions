class lnode{
    int data;
    lnode next;

    lnode(int data){
        this.data=data;
        this.next=null;
    }

}
class llist{
    lnode front;
    lnode rear;

       llist(){
           this.front=null;
           this.rear=null;
       }

       public void enqueue(int data){

           lnode newnode =new lnode(data);

           if(rear==null){
               rear=front=newnode;
               return;
           }else{
               rear.next=newnode;
               rear=newnode;
           }
       }

       public void dequeue(){
           front=front.next;
       }

       public void display(){
           lnode curr=front;

           while(curr!=null){
               System.out.print(curr.data);
               curr=curr.next;
           }
       }


}



public class Revise {
    public static void main(String[] args) {


         llist obj=new llist();

         obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);

        obj.dequeue();

    }
}
