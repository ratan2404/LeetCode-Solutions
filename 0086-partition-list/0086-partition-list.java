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
    public ListNode partition(ListNode head, int x) {
        // 1. Do dummy nodes banaye: ek chhote (< x) numbers ke liye, ek bade (>= x) ke liye
        // Dummy nodes isliye taaki head handle karne ka jhanjhat na rahe
        ListNode d1 = new ListNode(-1); 
        ListNode d2 = new ListNode(-1); 

        // 2. Tail pointers jo dono lists ko aage badhayenge
        ListNode t1 = d1; // chhote elements (< x) ki list ka end
        ListNode t2 = d2; // bade elements (>= x) ki list ka end

        // 3. Original list ko traverse karne ke liye pointer
        ListNode t = head;

        while (t != null) {
            if (t.val < x) {
                // Agar value x se chhoti hai, toh pehli list (t1) mein jodo
                t1.next = t;
                t1 = t1.next; // t1 ko aage badhao
            } else {
                // Agar value x ke barabar ya badi hai, toh doosri list (t2) mein jodo
                t2.next = t;
                t2 = t2.next; // t2 ko aage badhao
            }
            t = t.next; // Original list mein aage badho
        }

        // 4. Dono lists ko aapas mein connect karo
        // Chhoti list ke end (t1) ko badi list ke start (d2.next) se jodo
        t1.next = d2.next;

        // 5. BAHUT ZAROORI: Badi list ke end ko null karo, warna cycle ban sakti hai!
        // (Kyunki original list mein iske baad koi chhota node raha hoga)
        t2.next = null;

        // 6. Chhoti list ka asli head return karo (dummy node d1 ko chhod kar)
        return d1.next;
    }
}
