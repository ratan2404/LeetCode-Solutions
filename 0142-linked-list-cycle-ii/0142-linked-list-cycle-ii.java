/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode b = head;
        // Detect if a cycle exists
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            // // Cycle detected!
            if(slow == fast){
                // yaha hamne ak 3rd variable maan ke use head se traverse kiya jabtak slow ke barabar na aa jaye uske bich dono ko ak ak kadam badhate rahe. jaise hi mile dono return kara dunga.
                while(slow != b){
                b = b.next;
                slow = slow.next;
                }
                return b;
            }
        }
        return null;  // // Cycle detected!

    }
}