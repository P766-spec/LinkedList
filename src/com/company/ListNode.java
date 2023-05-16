package com.company;
//https://leetcode.com/problems/swap-nodes-in-pairs/

  public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next)
      { this.val = val;
          this.next = next;
      }
  }

class Solution1 {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
            return head;

        ListNode prev=head,curr=prev.next;
        prev.next=swapPairs(curr.next);
        curr.next=prev;
        return curr;


    }
}