class NODEE {
    int data;
    NODEE next;

    NODEE(int data) {
        this.data = data;
        this.next = null;
    }
}
class LISTT{
    NODEE top;

    LISTT(){
            this.top=null;
        }


        public void push(int element){
            NODEE newnode=new NODEE(element);
            newnode.next=top;
            top=newnode;
        }

                        public int pop(){
                            int temp=top.data;
                            top=top.next;

                            return temp;
                        }

    public void display() {
        NODEE temp = top;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }





}

public class StackLinked {
    public static void main(String[] args) {

        LISTT stack=new LISTT();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.display();


    }
}
