
public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        // TODO: Implement the insert method
        // This method should insert a new node with the given value at the specified position
        // If the position is out of bounds, insert the node at the end of the list
        // Create the new node to insert
        ListNode newNode = new ListNode(val);

        // Case 1: Insert at the beginning (position == 1 or list is empty)
        if (position == 1 || head == null) {
            newNode.next = head;  // New node points to the current head
            head = newNode;        // New node becomes the new head
        } else {
            // Case 2: Insert at a position in the middle or at the end
            ListNode current = head;
            int currentPosition = 1;

            // Traverse to the node just before the target position
            while (currentPosition < position - 1 && current.next != null) {
                current = current.next;
                currentPosition++;
            }

            // Insert the new node by adjusting the next pointers
            newNode.next = current.next;
            current.next = newNode;
        }

        // Printing the modified linked list
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println(); // Move to the next line after printing the list

        return head;
    }
}
