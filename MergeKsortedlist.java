/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> minHeap= new PriorityQueue<>(); //minheap
        
        for(ListNode head : lists)                 //Adding values to min heap
        {
            while(head!=null){
                minHeap.add(head.val);
                head=head.next;
            }
        }
        
        ListNode result = new ListNode(-1);   // dummy list to print 
        ListNode head = result;
        
        while(!minHeap.isEmpty())                           //if min heap is empty or null terminater orelse remove the small minheap value or number and return in result of dummy list.
        {
            head.next = new ListNode(minHeap.remove());
            head=head.next;
        }
        
        return result.next;
        
    }
}
