class Solution {
    public Node insertAtEnd(Node head, int x) {
        Node newnode = new Node(x);

        if (head == null) {
            return newnode;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newnode;

        return head;
    }
}
