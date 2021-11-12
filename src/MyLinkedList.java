class MyLinkedList {
    int size;
    ListNode head;

    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }

    public int get(int index) {
        if(index >= size || index < 0)
            return -1;
        ListNode now = head;

        for(int i = 0; i < index + 1; i++) {
            now = now.next;
        }

        return now.val;
    }

    public void addAtHead(int val) {
        ListNode add = new ListNode(val);
        add.next = head.next;
        head.next = add;
        size++;
    }

    public void addAtTail(int val) {
        ListNode add = new ListNode(val);
        ListNode now = head;
        for(int i = 0; i < size; i++) {
            now = now.next;
        }
        add.next = null;
        now.next = add;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0)
            addAtHead(val);
        else if (index == size)
            addAtTail(val);
        else{
            ListNode add = new ListNode(val);
            ListNode now = head;
            for(int i = 0; i < index; i++) {
                now = now.next;
            }
            add.next = now.next;
            now.next = add;
            size++;
        }

    }

    public void deleteAtIndex(int index) {
        if(index >= 0 && index < size) {
            ListNode now = head;
            for(int i = 0; i < index; i++) {
                now = now.next;
            }
            now.next = now.next.next;
            size--;
        }
    }
}
