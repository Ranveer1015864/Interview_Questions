// Create a Node class for a singly linked list and create 10 → 20 → 30 → 40. Display all elements.
// Insert a new node at the beginning of a linked list.
// Insert a node at a given position.
// Delete the first node from a linked list.
// Reverse a singly linked list.



class Nodee{
    int data;
    Nodee next;

       Nodee(int data){
           this.data=data;
           this.next=null;
       }
}


class Listt{

    Nodee head;

    public void add(int data){
        Nodee newnode=new Nodee(data);
        newnode.next=head;
        head=newnode;
    }

    public void addPosition(int key,int data){
        Nodee temp=head;

        while(temp!=null){
            if(temp.data==key){
                Nodee newnode=new Nodee(data);

                newnode.next=temp.next;
                temp.next=newnode;
            }
            temp=temp.next;
        }
    }

    public void deletefirst(){
        head=head.next;
    }


    public void delete(int key){
        Nodee temp=head;

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
        Nodee curr=head;

        while(curr!=null){
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }
        System.out.println("null");
    }

    public void reverse(){
        Nodee curr=head;
        Nodee prev=null;

        while(curr!=null) {
            Nodee newnode = curr.next;

            curr.next= prev;
            prev=curr;

            curr = newnode;
        }

        while(prev!=null){
            System.out.print(prev.data+"-->");
            prev=prev.next;
        }
        System.out.println("null");


    }

}
public class TheLinkedList {
    public static void main(String[] args) {

        Listt ll=new Listt();

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);

        ll.display();

        ll.addPosition(30,35);
        ll.display();

        ll.deletefirst();
        ll.display();

        ll.delete(35);
        ll.display();

        ll.reverse();

    }
}
