package com.bytedance.adsdk.ri.lr.ik.ri;

import com.bytedance.adsdk.ri.lr.lr.ri.uq;
import java.util.Deque;

/* JADX INFO: loaded from: classes2.dex */
public class ik extends di {
    @Override // com.bytedance.adsdk.ri.lr.ik.ri.di
    public int ri(String str, int i, Deque<com.bytedance.adsdk.ri.lr.lr.ri> deque, com.bytedance.adsdk.ri.lr.ik.ri riVar) {
        char cRi = ri(i, str);
        return (com.bytedance.adsdk.ri.lr.fi.ri.lr(cRi) || cRi == '$') ? ri(str, i, deque) : riVar.ri(str, i, deque);
    }

    private int ri(String str, int i, Deque<com.bytedance.adsdk.ri.lr.lr.ri> deque) {
        int i2;
        int i3 = 0;
        while (true) {
            i2 = i3 + i;
            char cRi = ri(i2, str);
            if (!com.bytedance.adsdk.ri.lr.fi.ri.lr(cRi) && !com.bytedance.adsdk.ri.lr.fi.ri.ik(cRi) && '.' != cRi && '[' != cRi && ']' != cRi && '_' != cRi && '$' != cRi) {
                break;
            }
            i3++;
        }
        String strSubstring = str.substring(i, i2);
        if (com.bytedance.adsdk.ri.lr.ka.ri.ri(strSubstring) != null) {
            deque.push(new com.bytedance.adsdk.ri.lr.lr.ri.xha(strSubstring));
            return i2;
        }
        deque.push(new uq(strSubstring));
        return i2;
    }
}
