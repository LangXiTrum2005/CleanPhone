package com.bytedance.adsdk.ri.lr.ik.ri;

import java.util.Deque;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public class jbs extends di {
    @Override // com.bytedance.adsdk.ri.lr.ik.ri.di
    public int ri(String str, int i, Deque<com.bytedance.adsdk.ri.lr.lr.ri> deque, com.bytedance.adsdk.ri.lr.ik.ri riVar) {
        com.bytedance.adsdk.ri.lr.lr.ri riVarPollFirst;
        if (')' != ri(i, str)) {
            return riVar.ri(str, i, deque);
        }
        LinkedList<com.bytedance.adsdk.ri.lr.lr.ri> linkedList = new LinkedList();
        while (true) {
            riVarPollFirst = deque.pollFirst();
            if (riVarPollFirst == null || riVarPollFirst.ri() == com.bytedance.adsdk.ri.lr.ka.ka.LEFT_PAREN || ((riVarPollFirst instanceof com.bytedance.adsdk.ri.lr.lr.ri.qt) && riVarPollFirst.ri() == com.bytedance.adsdk.ri.lr.ka.lr.METHOD && !((com.bytedance.adsdk.ri.lr.lr.ri.qt) riVarPollFirst).ik())) {
                break;
            }
            linkedList.addFirst(riVarPollFirst);
        }
        if (riVarPollFirst == null) {
            throw new IllegalArgumentException(str.substring(0, i));
        }
        if (riVarPollFirst.ri() != com.bytedance.adsdk.ri.lr.ka.lr.METHOD) {
            deque.push(com.bytedance.adsdk.ri.lr.fi.lr.ri(linkedList, str, i));
            return i + 1;
        }
        com.bytedance.adsdk.ri.lr.lr.ri.qt qtVar = (com.bytedance.adsdk.ri.lr.lr.ri.qt) riVarPollFirst;
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        for (com.bytedance.adsdk.ri.lr.lr.ri riVar2 : linkedList) {
            if (riVar2.ri() == com.bytedance.adsdk.ri.lr.ka.ka.COMMA) {
                linkedList2.add(com.bytedance.adsdk.ri.lr.fi.lr.ri(linkedList3, str, i));
                linkedList3.clear();
            } else {
                linkedList3.addLast(riVar2);
            }
        }
        if (!linkedList3.isEmpty()) {
            linkedList2.add(com.bytedance.adsdk.ri.lr.fi.lr.ri(linkedList3, str, i));
        }
        qtVar.ri((com.bytedance.adsdk.ri.lr.lr.ri[]) linkedList2.toArray(new com.bytedance.adsdk.ri.lr.lr.ri[linkedList2.size()]));
        qtVar.ri(true);
        int i2 = i + 1;
        deque.push(qtVar);
        return i2;
    }
}
