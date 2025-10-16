package challanges.leetcode.question2;

public class LeetCode2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int firstNumber = 0;
        int secondNumber = 0;

        for (int i = 0; l1 != null; l1 = l1.next) firstNumber += l1.val * (int)Math.pow(10, i);
        for (int i = 0; l2 != null; l2 = l2.next) secondNumber += l2.val * (int)Math.pow(10, i);

        int sum = firstNumber + secondNumber;
        String sumStr = String.valueOf(sum);

        ListNode dummy = new ListNode();
        ListNode listNode = dummy;

        for (int i = sumStr.length() - 1; i >= 0; i--) {
            int currentVal = Character.getNumericValue(sumStr.charAt(i));
            listNode.next = new ListNode(currentVal);
            listNode = listNode.next;
        }

        return dummy.next;
    }
}

