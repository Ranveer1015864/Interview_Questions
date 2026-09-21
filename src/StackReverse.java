class STKK{
    private int Maxsize;
    private int[]arr;
    private int top;

    STKK(int size){
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

public class StackReverse {
    public static void main(String[] args) {


        int[] arr = {10, 20, 30, 40, 50};

        STKK stack = new STKK(arr.length);

        // Push array into Stack
        for(int i=0; i<arr.length; i++){
            stack.push(arr[i]);
        }

        // Pop Stack back into array
        for(int i=0; i<arr.length; i++){
            arr[i] = stack.pop();
        }

        // Display reversed array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }



    }
}
