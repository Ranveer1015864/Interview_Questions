class STK{
    private int Maxsize;
    private int[]arr;
    private int top;

       STK(int size){
           this.Maxsize=size;
           this.arr=new int[size];
           this.top=-1;
       }

       public boolean isfull(){
           return top==Maxsize-1;
       }
       public boolean isempty(){
           return top==-1;
       }
       public int peek(){
           return arr[top];
       }



       public void push(int element){
           if(isfull()){
               System.out.println("Stack is Full");
           }
           arr[++top]=element;
       }

       public int pop(){
           if(isempty()){
               System.out.println("Stack is empty");
           }
           return arr[top--];
       }

       public void display(){
           for(int i:arr){
               System.out.println(i);
           }
       }

}


public class TheStackarr {
    public static void main(String[] args) {

        STK stack=new STK(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);


        System.out.println(stack.pop());
        stack.display();

        System.out.println();

        stack.push(60);
        System.out.println("peek "+stack.peek());
        stack.display();




    }
}
