package com.bytedance.adsdk.Lxb.LD.lk.Lxb;

import java.util.Deque;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public class QAg extends lc {
    @Override // com.bytedance.adsdk.Lxb.LD.lk.Lxb.lc
    public int Lxb(String str, int i, Deque<com.bytedance.adsdk.Lxb.LD.LD.Lxb> deque, com.bytedance.adsdk.Lxb.LD.lk.Lxb lxb) {
        com.bytedance.adsdk.Lxb.LD.LD.Lxb lxbPollFirst;
        if (')' != Lxb(i, str)) {
            return lxb.Lxb(str, i, deque);
        }
        LinkedList<com.bytedance.adsdk.Lxb.LD.LD.Lxb> linkedList = new LinkedList();
        while (true) {
            lxbPollFirst = deque.pollFirst();
            if (lxbPollFirst == null || lxbPollFirst.Lxb() == com.bytedance.adsdk.Lxb.LD.ZU.LD.METHOD || lxbPollFirst.Lxb() == com.bytedance.adsdk.Lxb.LD.ZU.ZU.LEFT_PAREN) {
                break;
            }
            linkedList.addFirst(lxbPollFirst);
        }
        if (lxbPollFirst == null) {
            throw new IllegalArgumentException(str.substring(0, i));
        }
        if (lxbPollFirst.Lxb() != com.bytedance.adsdk.Lxb.LD.ZU.LD.METHOD) {
            deque.push(com.bytedance.adsdk.Lxb.LD.JXs.LD.Lxb(linkedList, str, i));
            return i + 1;
        }
        com.bytedance.adsdk.Lxb.LD.LD.Lxb.nBu nbu = (com.bytedance.adsdk.Lxb.LD.LD.Lxb.nBu) lxbPollFirst;
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        for (com.bytedance.adsdk.Lxb.LD.LD.Lxb lxb2 : linkedList) {
            if (lxb2.Lxb() == com.bytedance.adsdk.Lxb.LD.ZU.ZU.COMMA) {
                linkedList2.add(com.bytedance.adsdk.Lxb.LD.JXs.LD.Lxb(linkedList3, str, i));
                linkedList3.clear();
            } else {
                linkedList3.addLast(lxb2);
            }
        }
        if (!linkedList3.isEmpty()) {
            linkedList2.add(com.bytedance.adsdk.Lxb.LD.JXs.LD.Lxb(linkedList3, str, i));
        }
        nbu.Lxb((com.bytedance.adsdk.Lxb.LD.LD.Lxb[]) linkedList2.toArray(new com.bytedance.adsdk.Lxb.LD.LD.Lxb[linkedList2.size()]));
        int i2 = i + 1;
        deque.push(nbu);
        return i2;
    }
}
