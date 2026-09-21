class Astack {
    int Maxsize;
    int []arr;
    int top;
      Astack(int size){
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


      public void push(int element){
          if(isFull()){
              System.out.println("Stack is full");
          }
          arr[++top]=element;
      }
      public int pop(){
          if(isEmpty()){
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
public class StackArr {
    public static void main(String[] args) {

            Astack stack=new Astack(5);

            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);
            stack.push(50);
            stack.display();

        System.out.println();

        System.out.println(stack.pop());
        stack.push(60);
        stack.display();


    }
}
