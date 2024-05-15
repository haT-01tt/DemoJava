package Exercise;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode res = dummy;
        int total = 0, carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            // gan gia tri cua total = 0 vi carry o day bang 0
            total = carry;
            // cong 2 node
            if (l1 != null) {
                // lay gia tri cua node
                total += l1.val;
                // chuyen con tro den node tiep theo
                l1 = l1.next;
            }
            if (l2 != null) {
                // lay gia tri cua node
                total += l2.val;
                // chuyen con tro den node tiep theo
                l2 = l2.next;
            }
            // chia lay du
            int num = total % 10;
            // chia lay phan nguyen
            carry = total / 10;
            // gan gia tri vao node
            dummy.next = new ListNode(num);
            // chuyen con tro den node tiep theo
            dummy = dummy.next;
        }

        return res.next;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        while (result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static class ListNode {
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
}
