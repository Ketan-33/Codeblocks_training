package LL;

import java.util.LinkedList;

public class ListNode {
    int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        public static void main(String[] args) {
            ListNode node;

        }

        public static ListNode middle(ListNode head){
            ListNode slow=head;
            ListNode fast=head;
            while(fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }
            return slow;
        }

        public static ListNode reverse(ListNode head){
            ListNode cur=head;
            ListNode prev = null;
            while(cur!=null){
                ListNode temp =cur.next;
                cur.next=prev;
                prev=cur;
                cur=prev;
            }
            head=prev;
            return head;
        }
  }


