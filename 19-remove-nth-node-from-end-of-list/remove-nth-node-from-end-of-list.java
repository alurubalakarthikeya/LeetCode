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
    public ListNode removeNthFromEnd(ListNode head, int n) {
 ListNode current = head;
        int size = 0;
        while (current != null) {
            size += 1;
            current = current.next;
        }
        if (n == size) {
            return head.next;
        }
        int counter = 0;
        ListNode prev = head;
        current = head;
        while (current != null) {
            counter += 1;
            if (size - n +1== counter) {
                prev.next = current.next;
                break; 
            } else {
                prev = current;
                current = current.next;
            }
        }
        return head;
    }
}