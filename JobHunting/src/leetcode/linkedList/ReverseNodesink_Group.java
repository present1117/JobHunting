package leetcode.linkedList;

import utils.ListNode;

public class ReverseNodesink_Group {
//	Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
//
//			If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.
//
//			You may not alter the values in the nodes, only nodes itself may be changed.
//
//			Only constant memory is allowed.
//
//			For example,
//			Given this linked list: 1->2->3->4->5
//
//			For k = 2, you should return: 2->1->4->3->5
//
//			For k = 3, you should return: 3->2->1->4->5
    public ListNode reverseKGroup(ListNode head, int k) {
    	if(head == null || k == 1)
    		return head;
    	ListNode fakeNode = new ListNode(0);
    	fakeNode.next = head;
    	ListNode pre = fakeNode;
    	ListNode last = head;
    	int i = 0;
    	while(last != null){
    		i++;
    		if(i % k == 0){//reverse between these k nodes.
    			pre = reverse(pre, last.next);
    			last = pre.next;
    		}else {
				last = last.next;
			}
    	}
    	return fakeNode.next;
    }
    /**
     * Reverse a link list between pre and next exclusively
     * an example:
     * a linked list:
     * 0->1->2->3->4->5->6
     * |  |        |   
     * pre last    next
     * after call pre = reverse(pre, next)
     * 
     * 0->3->2->1->4->5->6
     *          |  |
     *          pre next
     * @param pre 
     * @param next
     * @return the reversed list's last node, which is the precedence of parameter next
     */
	private static ListNode reverse(ListNode pre, ListNode next){
		ListNode last = pre.next;
		ListNode cur = last.next;
		while (cur != next){
			last.next = cur.next;
			cur.next = pre.next;
			pre.next = cur;
			cur = last.next;
		}
		return last;
	}
}