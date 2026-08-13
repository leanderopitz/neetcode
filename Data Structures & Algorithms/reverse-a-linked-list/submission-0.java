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
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;

        // Previous -> Current -> Next
        // Previous <- Current <- Next 

        while (current != null) {
            ListNode next = current.next;
            current.next = previous; // Pointer umdrehen
            previous = current; // Node weiterschieben
            current = next; // Node weiterschieben
        }
        return previous;
    }
}
