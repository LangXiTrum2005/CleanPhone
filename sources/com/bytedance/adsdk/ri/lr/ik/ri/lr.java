package com.bytedance.adsdk.ri.lr.ik.ri;

import com.bytedance.adsdk.ri.lr.lr.ri.ac;
import java.util.Deque;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends di {
    @Override // com.bytedance.adsdk.ri.lr.ik.ri.di
    public int ri(String str, int i, Deque<com.bytedance.adsdk.ri.lr.lr.ri> deque, com.bytedance.adsdk.ri.lr.ik.ri riVar) {
        if ('\'' != ri(i, str)) {
            return riVar.ri(str, i, deque);
        }
        int i2 = i + 1;
        int length = str.length();
        int i3 = i2;
        while (i3 < length && ri(i3, str) != '\'') {
            i3++;
        }
        if (ri(i3, str) != '\'') {
            throw new com.bytedance.adsdk.ri.ri.ri("String expression not surrounded by '", str.substring(i));
        }
        deque.push(new ac(str.substring(i2, i3)));
        return i3 + 1;
    }
}
