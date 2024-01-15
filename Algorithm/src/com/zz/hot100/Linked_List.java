package com.zz.hot100;

import org.w3c.dom.NodeList;

import java.util.List;

public class Linked_List {

    /**
     * 206. 反转链表  https://www.bilibili.com/video/BV1wt4y1d7CW/?spm_id_from=333.337.search-card.all.click&vd_source=f4ed1c22eaae87757d6ac636e2c7cfb7
     * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
     * 示例 1：
     *     1-2-3-4-5
     *     5-4-3-2-1
     * 输入：head = [1,2,3,4,5]
     * 输出：[5,4,3,2,1]
     *
     * 示例 2：
     *     1-2
     *     2-1
     * 输入：head = [1,2]
     * 输出：[2,1]
     */
    public ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode next = cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }


}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
