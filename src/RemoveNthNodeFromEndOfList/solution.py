
class ListNode(object):
     def __init__(self, x):
         self.val = x
         self.next = None

class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        length = self.calLength(head)
        nth = length - n + 1
        return self.removeNthFromStart(head, nth)
        
    def removeNthFromStart(self, head, n):
        if n == 1:
            return head.next
        
        count = 1
        node = head
        while count < n - 1:
           node = node.next 
           count += 1

        node.next = node.next.next
        return head
        
        
    def calLength(self, head):
        count = 0
        node = head
        while node != None:
            count +=1
            node = node.next;

        return count;



