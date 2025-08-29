/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        if(head==null)
            return 0;
            
            Node fast=head;
            Node slow=head;
            
            while(fast!=null && fast.next != null){
                fast=fast.next.next;
                slow=slow.next;
                
                if(fast==slow){
                    return countLoop(slow);
                }
            }
        return 0;
    }
    private int countLoop(Node head){
        int count=1;
        Node curr=head;
        
        while(curr.next != head){
            count++;
            curr=curr.next;
        }
        return count;
    }
}