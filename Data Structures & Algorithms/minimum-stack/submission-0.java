class MinStack {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode head;

    public MinStack() {
        head =  new ListNode();
        head.next = null;
    }
    
    public void push(int val) {
        ListNode newHead = new ListNode(val);
        ListNode oldHead = head;
        this.head = newHead;
        this.head.next = oldHead;
    }
    
    public void pop() {
        ListNode newHead = this.head.next;
        this.head = newHead;
    }
    
    public int top() {
        return this.head.val;
    }
    
    public int getMin() {
        ListNode curr = head;
        int currMin = curr.val;
        while (curr.next != null) { 
            if (currMin > curr.val) {
                currMin = curr.val;
            }
            curr = curr.next;
        }
        return currMin;
    }
}
