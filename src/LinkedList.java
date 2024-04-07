public class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }


    // Function that removes the following node
    void RemoveAfter(Node node) {
        if (node == null || node.next == null)
            return;
        node.next = node.next.next;
    }

    // function that creates a copy of the linked list
    LinkedList copy() {
        LinkedList newList = new LinkedList();
        Node current = this.head;
        Node newHead = null;
        Node tail = null;

        while (current != null) {
            Node newNode = new Node(current.data);
            if (newHead == null) {
                newHead = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            current = current.next;
        }
        newList.head = newHead;
        return newList;
    }


    void RemoveDuplicate(int key) {// Removing  nodes with item field equal to key
        if (head == null)
            return;
        Node current = head;
        while (current.next != null) {
            if (current.next.data == key) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }


    int max(Node node) {// finding the maximum item in the list using while loop
        int max = 0;
        while (node != null) {
            if (node.data > max)
                max = node.data;
            node = node.next;
        }
        return max;
    }
}
