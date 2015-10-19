class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):

    def mergeTwoLists(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        if l1 == None:
            return l2
        if l2 == None:
            return l1

        return self.doMerge(l1,l2)


    def doMerge(self, l1, l2):
        head = None
        if l1.val > l2.val:
            head = l2
            l2 = l2.next
        else:
            head = l1
            l1 = l1.next
        
        last = head
        while l1 != None or l2 != None:
            print l1.val , l2.val
            if l1 == None:
                last.next = l2
                return head
            if l2 == None:
                last.next = l1
                return head

            if l1.val > l2.val:
                last.next = l2
                l2 = l2.next
                last = last.next
            else:
                last.next = l1
                l1 = l1.next
                last = last.next
        last.next = None
        return head
