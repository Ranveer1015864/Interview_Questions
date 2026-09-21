class theNode{
    int data;
    theNode next;

      theNode(int data){
          this.data=data;
          this.next=null;
      }
}
class STack{
    theNode top;

     STack(){
         this.top=null;
     }



     public void push(int data){
         theNode newnode=new theNode(data);
         newnode.next=top;
         top=newnode;
     }


     public int pop(){
         int temp=top.data;
         top=top.next;
         return temp;
     }

    public void display() {
        theNode temp = top;

        while (temp != null) {
            System.out.print(" "+temp.data);
            temp = temp.next;
        }
    }
}




public class TheStackLinked {
    public static void main(String[] args) {

        STack stack=new STack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.display();

    }
}
