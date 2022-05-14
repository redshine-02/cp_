package leetcode.LinkedList;

public class LC328 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next==null || head.next.next==null){
            return head;
        }
        ListNode odd = head;
        ListNode curr1 = head;
        ListNode curr2 = head.next;
        ListNode even = head.next;
        while(odd.next!=null && odd.next.next!=null){
            //linking
            odd.next = odd.next.next;
            even.next = even.next.next;
            
            //Moving
            odd = odd.next;
            even = even.next;
        }
        odd.next = curr2;
        
        return curr1;
    }
}