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
    public ListNode swapNodes(ListNode head, int k) {
        // sabse pahle ak for loop chlaya k tak.
        ListNode slow = head;
        ListNode fast = head;
        for(int i = 1; i <= k; i++){
            fast = fast.next;
        }
        //fir dono slow fast pointer ko move karenge jabtak fast zero tak na pahuch na jaye
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        // fir fast ko zero se wapas head se start karenge aur k - 1 tak move karenge fir dono slow fast ko swap kar denge.
        fast = head;
        for(int i = 1; i <= k - 1; i++){
            fast = fast.next;
        }
        int temp = slow.val;
        slow.val = fast.val;
        fast.val = temp;
        return head;
    }
}