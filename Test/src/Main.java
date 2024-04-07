public class Main {
    public static void PrintList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        //creating nodes to be used in the linked list
        Node node_1 = new Node(1);
        Node node_2 = new Node(2);
        Node node_3 = new Node(3);

        list.head = node_1;
        node_1.next = node_2;
        node_2.next = node_3;

        System.out.println("The Original List:");
        PrintList(list.head);
        list.RemoveAfter(node_2);
        System.out.println("List after removing the second node:");
        PrintList(list.head);

        // Copying the linked list
        LinkedList newList = list.copy();
        System.out.println("The Copied Linked List:");
        PrintList(newList.head);

        // Removing duplicate nodes with item field equal to "2"
        list.RemoveDuplicate(2);
        System.out.println("After removing duplicate nodes with item field as 2:");
        PrintList(list.head);

        // Finding the maximum item in the list
        int max_item = list.max(list.head);
        System.out.println("Maximum item in the list: " + max_item);
    }



}
