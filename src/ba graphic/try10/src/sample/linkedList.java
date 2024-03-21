package sample;

public class linkedList {

    Node head;



    public void add(linkedList list, int data) {
        Node new_node = new Node(data);
        //for readablity but it is null itself
        new_node.next = null;


        if (list.head == null) {
            list.head = new_node;

        } else {

            Node n = list.head;
            while (n.next != null) {
                // move forward nodes by (next)= refrence of another node
                n = n.next;

            }

            n.next = new_node;

        }

    }


    public static void printList(linkedList list) {

        Node currNode = list.head;

        System.out.println("linkedList: ");

        while (currNode != null) {

            System.out.print(currNode.data + " ");
            currNode = currNode.next;

        }
    }



    static Node push(Node head, int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }


    static Node middleNode(Node start, Node last)
    {
        if (start == null)
            return null;

        Node slow = start;
        Node fast = start.next;

        while (fast != last)
        {
            fast = fast.next;
            if (fast != last)
            {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return slow;
    }



}
