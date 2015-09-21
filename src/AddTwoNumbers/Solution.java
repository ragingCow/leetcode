import java.lang.Math;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
    }


/**
 *
 * 笨方法，看错顺序了，后来干脆写一个反转list的函数。。。。
 *
 */


public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode outputList =null;
        ListNode ptr1 = l1;
        ListNode ptr2 = l2;
        int add = 0;

        while(true){
            if(ptr1 == null && ptr2 == null){
                if(add == 1){
                    ListNode tempNode = new ListNode(1);
                    tempNode.next = outputList;
                    outputList = tempNode;
                }

                break;
            }

            if(ptr1 != null){
                add += ptr1.val;
                ptr1 = ptr1.next;
            }

            if(ptr2 != null){
                add += ptr2.val;
                ptr2 =  ptr2.next;
            }

            ListNode tempNode = new ListNode(0);
            tempNode.val = add % 10;
            add = add >= 10 ? 1 : 0;

            if(outputList == null){
                outputList = tempNode;
            }else{
                tempNode.next = outputList;
                outputList = tempNode;
            }
        }
        return reverse(outputList);
    }

    private ListNode reverse(ListNode list){
        if(list == null)
            return list;

        ListNode retList = list;
        list = list.next;
        retList.next = null;

        while(list != null){
            ListNode tempNode = list;
            list = list.next;
            tempNode.next = retList;
            retList = tempNode;
        }
        return retList;
    }
}
