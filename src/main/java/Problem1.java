// Problem1.java
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        // TODO: Implement the concatenate method
        // This method should concatenate l2 to l1 and return l1
        // Remember to create new nodes instead of directly linking l1 to l2
        if (l1 == null) {
            if (l2 == null) {
                return null;  // Both lists are null
            }
            // Create a new list copying all elements from l2
            ListNode newHead = new ListNode(l2.val);
            ListNode newCurrent = newHead;
            ListNode current = l2.next;
            
            // Loop through the rest of l2 nodes and copy them
            while (current != null) {
                newCurrent.next = new ListNode(current.val);
                newCurrent = newCurrent.next;
                current = current.next;
            }
            return newHead;
        }

        // Find the last node of l1
        ListNode currentL1 = l1;
        while (currentL1.next != null) {
            currentL1 = currentL1.next;
        }

        // Now append new nodes created from l2 to the end of l1
        ListNode currentL2 = l2;
        while (currentL2 != null) {
            currentL1.next = new ListNode(currentL2.val);  // Create a new node from l2 and append it
            currentL1 = currentL1.next;  // Move to the new node
            currentL2 = currentL2.next;  // Move to the next node in l2
        }

        return l1;
    }
}