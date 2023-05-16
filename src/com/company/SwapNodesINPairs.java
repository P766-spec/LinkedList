package com.company;
//  https://leetcode.com/problems/swap-nodes-in-pairs/

public class SwapNodesINPairs {
    public ListNode swapPairs(ListNode head) {
        if((head == null) || (head.next == null))
            return head;
        ListNode n = head.next;
        head.next = swapPairs(head.next.next);
        n.next = head;
        return n;
    }
}
