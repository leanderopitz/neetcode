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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode current1 = list1;
        ListNode current2 = list2;
        ListNode dummy = new ListNode();
        ListNode result = dummy;

        while (current1 != null && current2 != null) {
            if (current1.val <= current2.val) {
                result.next = current1;
                result = result.next;
                current1 = current1.next;
            } else {
                result.next = current2;
                result = result.next;
                current2 = current2.next;
            }
        }
        if (current1 == null) {
                result.next = current2;
            } else {
                result.next = current1;
            }
        return dummy.next;
    }
}