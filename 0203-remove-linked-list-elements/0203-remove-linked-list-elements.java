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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        ListNode temp = head;
        t.next = head;
        while(temp != null){
            if(temp.val == val){
                t.next = temp.next;
            }
            else{
                t = temp;
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}