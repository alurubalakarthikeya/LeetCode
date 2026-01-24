1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public static void recursiveDeletion(ListNode curr, ListNode prev, int target){
13        if(curr==null){
14            return;
15        }
16        if(curr.val==target){
17            prev.next = curr.next;
18            recursiveDeletion(curr.next, prev, target);
19        } else {
20            recursiveDeletion(curr.next, curr, target);
21        }
22    }
23    public ListNode removeElements(ListNode head, int val) {
24        while (head != null && head.val == val) {
25            head = head.next;
26        }
27        if (head == null) return null;
28        recursiveDeletion(head.next, head, val);
29        return head;
30    }
31}