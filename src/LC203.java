public class LC203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode now;
        now = head;

        if (head == null)
            return head;

        while (now.next != null) {
            if (now.next.val == val) {
                now.next = now.next.next;
            } else {
                now = now.next;
            }
        }

        if(head.val == val)
            head = head.next;

        return head;
    }
}
