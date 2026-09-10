package com.bytedance.adsdk.ri.lr.ik.ri;

import java.util.Deque;

/* JADX INFO: loaded from: classes2.dex */
public class fi extends di {
    @Override // com.bytedance.adsdk.ri.lr.ik.ri.di
    public int ri(String str, int i, Deque<com.bytedance.adsdk.ri.lr.lr.ri> deque, com.bytedance.adsdk.ri.lr.ik.ri riVar) {
        char cRi;
        int i2 = i;
        while (true) {
            cRi = ri(i2, str);
            if (!com.bytedance.adsdk.ri.lr.fi.ri.lr(cRi) && !com.bytedance.adsdk.ri.lr.fi.ri.ik(cRi)) {
                break;
            }
            i2++;
        }
        if (cRi != '(') {
            return riVar.ri(str, i, deque);
        }
        deque.push(new com.bytedance.adsdk.ri.lr.lr.ri.qt(str.substring(i, i2)));
        return i2 + 1;
    }
}
