class Solution {
    public Node reverse(Node head) {
         Node curr = head;
        while(curr != null) {
            //Swapping of link
            Node temp = curr.next;
            curr.next = curr.prev;
            curr.prev = temp;
            
            if(curr.prev == null) head = curr;
            //Move to next node
            curr = curr.prev;
        }
        return head;
}
}