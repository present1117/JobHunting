package cc150.Question02;

import java.util.LinkedList;

import utils.LinkedListNode;

public class LinkedLists2_07 {
//Implement a function to check if a linked list is a palindrome.
	boolean isPalindrome(LinkedListNode head){
		LinkedListNode fast = head;
		LinkedListNode slow = head;
		
		LinkedList<Integer> stack = new LinkedList<>();
		
		while(fast != null && fast.next != null){
			stack.push(slow.val);
			slow = slow.next;
			fast = fast.next.next;
		}
		if(fast == null){//nodes are even
			while(slow != null){
				if(slow.val != stack.pop())
					return false;
				slow = slow.next;
			}
		}else if(fast.next == null){//nodes are odd3
			slow = slow.next;
			while(slow != null){
				if(slow.val != stack.pop()){
					return false;
				}
				slow = slow.next;
			}
		}else{
			return false;
		}
		return stack.isEmpty();
	}
}
