public class MyLinkedL {

    class Node1 {
        int data;
        Node1 next;

        Node1(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node1 head;

    //insert at beginning
    public void add(int element) {
        Node1 newnode = new Node1(element);
        newnode.next = head;
        head = newnode;
    }
    // INSERT ELEMENT IN BETWEEN
    public void insertBetween(int key, int element) {

        Node1 temp = head;

        while (temp != null) {

            if (temp.data == key) {

                Node1 newnode = new Node1(element);

                newnode.next = temp.next;
                temp.next = newnode;

                return;
            }

            temp = temp.next;
        }
    }

    //delete at firat and inbetween nodes
    public void delete(int key) {

        Node1 temp = head;

        if (temp.next==null) {
              temp.next=head;
            return;
        }
        temp=temp.next;


        while (temp.next != null) {
            if (temp.next.data == key) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }



    public void display() {

        Node1 curr = head;

        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }

        System.out.print("null");
    }

    public static void main(String[] args) {

        MyLinkedL list = new MyLinkedL();

        //Normal linked list printing + inserting at beginning
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.display();

        System.out.println();


        list.delete(40);
        list.display();




    }
}