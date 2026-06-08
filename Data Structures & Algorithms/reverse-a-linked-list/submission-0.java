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
        ListNode prev = null;

        ListNode newNode = head;

        while(newNode != null){
            ListNode temp = newNode.next;
            newNode.next = prev;
            prev = newNode;
            newNode = temp;
            
        }

        return prev;
    }
}
