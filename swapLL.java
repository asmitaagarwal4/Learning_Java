class ListNode {
         public int val;
         public ListNode next;
         ListNode(int x) { val = x; next = null; }
     }

public class swapLL {
    public static ListNode swapPairs(ListNode head) {
        int count=0;
        ListNode tempHead= head;
        if(head==null || head.next==null){
            return head;
        }
        if(head.next.next==null){
            head.next.next=head;
            head.next=null;
            head=head.next;
        }
        ListNode prev=new ListNode(0);
        prev.next=tempHead;
        while(tempHead.next!=null){
            if(count%2==0){
            ListNode tempNext=head.next;
            tempHead.next= tempHead.next.next;
            tempNext.next=tempHead;
            prev.next=tempNext;
            count++;
            }
            tempHead=tempHead.next;
        }
        return head;
    }
    
    public static void print(ListNode head){
        if(head== null)
            System.out.println(0);
        ListNode temp= head;
        while(temp.next!=null){
            System.err.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println(temp.val);
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(3);
        
       
        print(head);
        ListNode result=swapPairs(head);
        print(result);
    }
}
