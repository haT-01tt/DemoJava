package Exercise;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Tạo một nút giả để làm điểm bắt đầu của danh sách đã gộp
        ListNode dummy = new ListNode(-1);
        // Con trỏ để xây dựng danh sách mới
        ListNode current = dummy;

        // Duyệt qua cả hai danh sách
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Nếu một trong hai danh sách không rỗng, thêm các phần tử còn lại
            current.next = list1 != null ? list1 : list2;

        // Danh sách đã gộp nằm ở dummy.next
        return dummy.next;
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

    public static void main(String[] args) {

        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode(0);
//        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
//        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode result = new MergeTwoSortedLists().mergeTwoLists(list1, list2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
