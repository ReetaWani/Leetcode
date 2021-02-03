/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    Set<ListNode> set = null;
    public boolean hasCycle(ListNode head) {
        set = new HashSet<>();
        ListNode it = head;
        while(it!=null){
            if(set.contains(it)){
                return true; 
            }
            set.add(it);
            it = it.next;
        }

        return false;
    }
}
