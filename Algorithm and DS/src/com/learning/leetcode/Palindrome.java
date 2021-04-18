package com.learning.leetcode;

import java.util.Stack;

public class Palindrome {

	public static void main(String[] args) {
		ListNode head = new ListNode(2, new ListNode(4, new ListNode(7, new ListNode(4, new ListNode(2, null)))));
		System.out.println(new Solution().isPalindrome(head));

	}

}

class Solution {
	public boolean isPalindrome(ListNode head) {
		Stack<Integer> stg = new Stack<>();
		boolean isPlim = true;
		ListNode node = head;
		while (node != null) {
			stg.add(node.val);
			node = node.next;
		}

		while (head != null) {
			isPlim = head.val == stg.pop();
			if (isPlim) {
				isPlim = true;
			} else {
				isPlim = false;
				break;
			}
			head = head.next;
		}
		return isPlim;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
