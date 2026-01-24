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
    public static void recursiveDeletion(ListNode curr, ListNode prev, int target){
        if(curr==null){
            return;
        }
        if(curr.val==target){
            prev.next = curr.next;
            recursiveDeletion(curr.next, prev, target);
        } else {
            recursiveDeletion(curr.next, curr, target);
        }
    }
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) return null;
        recursiveDeletion(head.next, head, val);
        return head;
    }
}