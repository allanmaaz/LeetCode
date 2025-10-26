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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode middle=findmiddle(head);
        ListNode l1=head;
        ListNode l2=middle;
        l2=reverse(l2);
        mearge(l1,l2);

    }
    private ListNode findmiddle(ListNode head){
        ListNode pre=null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            pre=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(pre!=null){
            pre.next=null;
        }
        return slow;
    }
    private ListNode reverse(ListNode head){
        ListNode pre=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        return pre;
    }
    private void mearge(ListNode l1,ListNode l2){
        ListNode l1next;
        ListNode l2next;
        while(l1!=null&&l2!=null){
            l1next=l1.next;
            l2next=l2.next;
            l1.next=l2;
            if(l1next==null)break;
            l2.next=l1next;
            l1=l1next;
            l2=l2next;
        }
    }}
