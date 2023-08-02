/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode head = new ListNode(0);
        ListNode tail = head;
        int carry = 0;
        int sum;
        int d1;
        int d2;
        int digit;

        while (l1 != null || l2 != null || carry != 0){
            d1 = (l1 != null) ? l1.val : 0;
            d2 = (l2 != null) ? l2.val : 0;
            
            sum = d1 + d2 + carry;
            carry = (sum > 9) ? sum/10 : 0;
            digit = sum % 10;
            
            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            // moving nodes over
            tail = tail.next;
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        ListNode result = head.next;
        head.next = null;
        return(result);
    }
}