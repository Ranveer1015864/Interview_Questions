class nodee {
    int data;
    nodee next;

    nodee(int data) {
        this.data = data;
        this.next = null;
    }
}

class LISTTT {

    nodee head;

    public void add(int data) {

        nodee newnode = new nodee(data);

        newnode.next = head;
        head = newnode;
    }



    public void Deletefirst() {

        if (head == null) {
            return;
        }

        head = head.next;
    }


    // Delete specific node
    public void delete(int key) {

        nodee temp = head;

        while (temp.next != null) {

            if (temp.next.data == key) {

                temp.next = temp.next.next;
                return;
            }

            temp = temp.next;
        }
    }


    // Find middle node
    public void middleNode() {

        if (head == null) {
            return;
        }

        nodee slow = head;
        nodee fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle node: " + slow.data);
    }


    // Display
    public void display() {

        nodee curr = head;

        while (curr != null) {

            System.out.print(curr.data + "-->");
            curr = curr.next;
        }

        System.out.println("null");
    }


    public void detectCycle() {

        nodee slow = head;
        nodee fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                System.out.println("Cycle exists");
                return;
            }
        }

        System.out.println("No cycle");
    }
}


public class LinkedDetectCycle {

    public static void main(String[] args) {

        LISTTT l = new LISTTT();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);

        l.display();

        l.middleNode();

        l.detectCycle();
    }
}