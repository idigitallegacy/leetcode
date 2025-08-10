package easy;

import easy.dto.ListNode;

import java.util.ArrayList;

public class MergeTwoSortedLists21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode left = list1;
        ListNode right = list2;

        ListNode head = new ListNode();
        ListNode tail = head;

        while (left != null || right != null) {
            if (right == null) {
                tail.next = left;
                left = left.next;
                tail = tail.next;
                continue;
            }

            if (left == null) {
                tail.next = right;
                right = right.next;
                tail = tail.next;
                continue;
            }

            if (left.val <= right.val) {
                tail.next = left;
                left = left.next;
                tail = tail.next;
                continue;
            }

            tail.next = right;
            right = right.next;
            tail = tail.next;
        }

        return head.next;
    }
}
