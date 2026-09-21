class NoD{
    int data;
    NoD next;

      NoD(int data){
          this.data=data;
          this.next=null;
      }
}
class LL{
    NoD head;


    //insert at beginning
    public void add(int data){
        NoD newnode=new NoD(data);
        newnode.next=head;
        head=newnode;

    }

    //insert at specific position
    public void addanywhere(int key,int data){
        NoD temp=head;

        while(temp!=null){
            if(temp.data==key){
                NoD newnode=new NoD(data);

                newnode.next=temp.next;
                temp.next=newnode;
                return;
            }
            temp=temp.next;
        }
    }

    //delete first node;
    public void Deletefirst(){
        head=head.next;
    }

    //delete specific node
    public void delete(int key){
        NoD temp=head;

        if(temp.next==null){
            temp.next=head;
            return;
        }
        temp=temp.next;

        while(temp!=null){
            if(temp.next.data==key){
                temp.next=temp.next.next;
                return;
            }
            temp=temp.next;
        }
    }

       public void display(){
          NoD curr=head;

           while (curr != null) {
               System.out.print(curr.data+"-->");
               curr=curr.next;
           }
           System.out.println("null");
       }

//Reverse Linked List
    public void Reverse() {
        NoD curr = head;
        NoD prev = null;

        while (curr != null) {

            NoD newnode = curr.next;

            curr.next = prev;
            prev = curr;
            curr = newnode;
        }
        while (prev != null) {
            System.out.print(prev.data + "-->");
            prev = prev.next;
        }
        System.out.println("null");
    }
}
public class ActualLinkedList {
    public static void main(String[] args) {

        LL l=new LL();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);

        l.display();

        l.addanywhere(30,35);
        l.display();

        l.Deletefirst();
        l.display();

        l.Reverse();







    }
}

