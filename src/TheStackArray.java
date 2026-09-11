//Implement a Stack using an array.


class stack{
    int Maxsize;
    int[] arr;
    int top;

      stack(int size){
          this.Maxsize=size;
          this.arr=new int[size];
          this.top=-1;
      }

      public boolean isFull(){
          return top==Maxsize-1;
      }
      public boolean isEmpty(){
          return top==-1;
      }
      public int peek(){
          return arr[top];
      }


      public void push(int data){
          if(isFull()){
              System.out.println("Stack is Full");
          }
          arr[++top]=data;
      }

      public int pop(){
          if(isEmpty()){
              System.out.println("Stack is Empty");
          }
          return arr[top--];
      }

      public void display(){
          for(int i:arr){
              System.out.println(i);
          }
      }


}



public class TheStackArray {
    public static void main(String[] args) {


        stack sk=new stack(5);

        sk.push(10);
        sk.push(20);
        sk.push(30);
        sk.push(40);
        sk.push(50);

        sk.display();

        System.out.println("pooped element "+sk.pop());
        System.out.println("peek element "+sk.peek());



    }
}
