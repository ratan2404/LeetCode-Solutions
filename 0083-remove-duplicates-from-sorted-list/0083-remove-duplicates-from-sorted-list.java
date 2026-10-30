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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode i = head;
        ListNode j = head;
        while(j != null){
            if(i.val == j.val){
                j = j.next;
            }
            else{
                i.next = j;
                i = j;  // i को नए यूनिक नोड पर लाएं
                j = j.next;   // j को अगले नोड पर बढ़ाएं
            }
            i.next = null; // लूप खत्म होने के बाद आखिरी टेल को null करें ताकि बचे हुए डुप्लीकेट्स हट जाएं
        }
        return head;

    }
}