public class addTwoNumbers_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        ListNode l3 = new ListNode(0);
        ListNode l4 = l3;
        while (l1 != null && l2 != null){
            l3.val = l1.val + l2.val;
            l1 = l1.next;
            l2 = l2.next;
            l3 = l3.next;
        }
        if (l2 == null)
            l3 = l1;
        else if (l1 == null)
            l3 = l2;
        while (l4.val >= 10){
            if (l4.next != null){
                l4.next.val += 1;
            }
            else {
                l4 = l4.next;
                l4.val = 1;
            }
            l4 = l4.next;
        }
        return l4;
    }
}
