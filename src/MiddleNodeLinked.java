class NodEE {
    int data;
    NodEE next;

    NodEE(int data) {
        this.data = data;
        this.next = null;
    }
}

class TheList {

    NodEE head;

    public void add(int data) {

        NodEE newnode = new NodEE(data);

        newnode.next = head;
        head = newnode;
    }


    // Insert after a specific node
    public void addanywhere(int key, int data) {

        NodEE temp = head;

        while (temp != null) {

            if (temp.data == key) {

                NodEE newnode = new NodEE(data);

                newnode.next = temp.next;
                temp.next = newnode;

                return;
            }

            temp = temp.next;
        }
    }


    // Delete first node
    public void Deletefirst() {

        if (head == null) {
            return;
        }

        head = head.next;
    }


    // Delete specific node
    public void delete(int key) {

        if (head == null) {
            return;
        }

        // If first node needs to be deleted
        if (head.data == key) {
            head = head.next;
            return;
        }

        NodEE temp = head;

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

        NodEE slow = head;
        NodEE fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle node: " + slow.data);
    }


    // Display
    public void display() {

        NodEE curr = head;

        while (curr != null) {

            System.out.print(curr.data + "-->");
            curr = curr.next;
        }

        System.out.println("null");
    }
}


public class MiddleNodeLinked {

    public static void main(String[] args) {

        TheList l = new TheList();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);

        l.display();

        l.middleNode();
    }
}