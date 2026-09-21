class NODEnode{
    int data;
    NODEnode next;

    NODEnode(int data){
        this.data=data;
        this.next=null;
    }
}
class Thelist{
    NODEnode head;

    public void add(int data){
    NODEnode newnode=new NODEnode(data);
    newnode.next=head;
    head=newnode;
    }

    public void Addbtwn(int key,int data){
        NODEnode temp=head;

        while(temp!=null) {
            if (temp.data == key) {
                NODEnode newnode = new NODEnode(data);

                newnode.next = temp.next;
                temp.next = newnode;
                return;
            }
            temp=temp.next;
        }
    }

    public void deletefirst(){
        head=head.next;
    }

    public void deleteBtwn(int key){
        NODEnode temp=head;

        if(temp.next==null){
            temp.next=head;
            return;
        }
        while(temp!=null){
            if(temp.next.data==key){
                temp.next=temp.next.next;
                return;
            }
            temp=temp.next;
        }
    }

    public void display(){
        NODEnode curr=head;

        while(curr!=null){
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }
        System.out.println("null");
    }


    public void Reverse() {
        NODEnode curr = head;
        NODEnode prev = null;

        while (curr != null) {

            NODEnode newnode = curr.next;

            curr.next = prev;
            prev = curr;
            curr = newnode;
        }
        while (prev != null) {
            System.out.print(prev.data + "-->");
            prev = prev.next;
        }
    }

    }





public class LinkedLpractice {
    public static void main(String[] args) {

        Thelist list = new Thelist();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.display();

        list.deletefirst();
        list.display();

        list.Addbtwn(20, 25);

        list.Reverse();


    }
}
