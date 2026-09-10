package com.bytedance.adsdk.ri.lr.ik.ri;

import com.bytedance.adsdk.ri.lr.lr.ri.slm;
import java.util.Deque;

/* JADX INFO: loaded from: classes2.dex */
public class mj extends di {
    @Override // com.bytedance.adsdk.ri.lr.ik.ri.di
    public int ri(String str, int i, Deque<com.bytedance.adsdk.ri.lr.lr.ri> deque, com.bytedance.adsdk.ri.lr.ik.ri riVar) {
        if (!com.bytedance.adsdk.ri.lr.fi.ri.ka(ri(i, str))) {
            return riVar.ri(str, i, deque);
        }
        int i2 = i + 1;
        String str2 = new String(new char[]{ri(i, str), ri(i2, str)});
        if (com.bytedance.adsdk.ri.lr.ka.ik.ri(str2) != null) {
            deque.push(new slm(com.bytedance.adsdk.ri.lr.ka.ik.ri(str2)));
            return i + 2;
        }
        String strValueOf = String.valueOf(ri(i, str));
        if (com.bytedance.adsdk.ri.lr.ka.ik.ri(strValueOf) != null) {
            deque.push(new slm(com.bytedance.adsdk.ri.lr.ka.ik.ri(strValueOf)));
            return i2;
        }
        throw new IllegalArgumentException("Unrecognized:" + strValueOf + "examine:" + str.substring(0, i));
    }
}
