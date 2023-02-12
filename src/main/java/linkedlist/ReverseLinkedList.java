package linkedlist;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        reverseList(listNode);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode reversed = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = reversed;
            reversed = head;
            head = next;
        }

        return reversed;
    }
}
