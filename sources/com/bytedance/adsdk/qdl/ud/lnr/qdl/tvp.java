package com.bytedance.adsdk.qdl.ud.lnr.qdl;

import java.util.Deque;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public class tvp extends mo {
    @Override // com.bytedance.adsdk.qdl.ud.lnr.qdl.mo
    public int qdl(String str, int i2, Deque<com.bytedance.adsdk.qdl.ud.ud.qdl> deque, com.bytedance.adsdk.qdl.ud.lnr.qdl qdlVar) {
        com.bytedance.adsdk.qdl.ud.ud.qdl qdlVarPollFirst;
        if (')' != qdl(i2, str)) {
            return qdlVar.qdl(str, i2, deque);
        }
        LinkedList<com.bytedance.adsdk.qdl.ud.ud.qdl> linkedList = new LinkedList();
        while (true) {
            qdlVarPollFirst = deque.pollFirst();
            if (qdlVarPollFirst == null || qdlVarPollFirst.qdl() == com.bytedance.adsdk.qdl.ud.mml.mml.LEFT_PAREN || ((qdlVarPollFirst instanceof com.bytedance.adsdk.qdl.ud.ud.qdl.to) && qdlVarPollFirst.qdl() == com.bytedance.adsdk.qdl.ud.mml.ud.METHOD && !((com.bytedance.adsdk.qdl.ud.ud.qdl.to) qdlVarPollFirst).lnr())) {
                break;
            }
            linkedList.addFirst(qdlVarPollFirst);
        }
        if (qdlVarPollFirst == null) {
            throw new IllegalArgumentException(str.substring(0, i2));
        }
        if (qdlVarPollFirst.qdl() != com.bytedance.adsdk.qdl.ud.mml.ud.METHOD) {
            deque.push(com.bytedance.adsdk.qdl.ud.mzz.ud.qdl(linkedList, str, i2));
            return i2 + 1;
        }
        com.bytedance.adsdk.qdl.ud.ud.qdl.to toVar = (com.bytedance.adsdk.qdl.ud.ud.qdl.to) qdlVarPollFirst;
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        for (com.bytedance.adsdk.qdl.ud.ud.qdl qdlVar2 : linkedList) {
            if (qdlVar2.qdl() == com.bytedance.adsdk.qdl.ud.mml.mml.COMMA) {
                linkedList2.add(com.bytedance.adsdk.qdl.ud.mzz.ud.qdl(linkedList3, str, i2));
                linkedList3.clear();
            } else {
                linkedList3.addLast(qdlVar2);
            }
        }
        if (!linkedList3.isEmpty()) {
            linkedList2.add(com.bytedance.adsdk.qdl.ud.mzz.ud.qdl(linkedList3, str, i2));
        }
        toVar.qdl((com.bytedance.adsdk.qdl.ud.ud.qdl[]) linkedList2.toArray(new com.bytedance.adsdk.qdl.ud.ud.qdl[linkedList2.size()]));
        toVar.qdl(true);
        int i3 = i2 + 1;
        deque.push(toVar);
        return i3;
    }
}
