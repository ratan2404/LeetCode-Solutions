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
        ListNode i = list1;
        ListNode j = list2;
        
        // k dummy node hai aur current pointer aage badhne ke liye hai
        ListNode k = new ListNode(-1);
        ListNode current = k;
        
        while (i != null && j != null) {
            if (i.val <= j.val) {
                current.next = i;
                i = i.next;
            } else {
                current.next = j;
                j = j.next;
            }
            current = current.next;
        }
        
        // Bachi hui nodes ko direct attach karein
        if (i != null) {
            current.next = i;
        } else {
            current.next = j;
        }
        
        // Dummy node k ke baad wali node actual head hai
        return k.next;
    }
}
