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
    public ListNode sortList(ListNode head) {
        // Base case: agar list khali hai ya sirf 1 node hai, toh pehle se hi sorted hai
       if(head == null || head.next == null) return head;
       // Step 1: Middle node dhundhna (Tortoise & Hare approach)
       ListNode slow = head;
       ListNode fast = head;
       while(fast.next != null && fast.next.next != null ){
          slow = slow.next;
          fast = fast.next.next;
       }
       // Step 2: List ko 2 hisson mein todna
       ListNode head2 = slow.next;
       slow.next = null;
        // Step 3: Recursion se dono hisson ko alag-alag sort karna
       head = sortList(head);
       head2 = sortList(head2);
       // Step 4: Dono sorted lists ko jod kar wapas return karna (yeh dummy.next hi dega)
       return mergeTwoLists(head, head2);
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode i = list1;
        ListNode j = list2;
        ListNode dummy = new ListNode(-1);
        ListNode k = dummy;
        while(i != null && j != null){
            if(i.val <= j.val){
                k.next = i;
                i = i.next;
            }
            else{
                k.next = j;
                j = j.next;
            }
            k = k.next;
        }
        if(i == null){
            k.next = j;
        }
        else{
            k.next = i;
        }
        return dummy.next;
    }
}