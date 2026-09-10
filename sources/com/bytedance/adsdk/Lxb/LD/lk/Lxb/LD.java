package com.bytedance.adsdk.Lxb.LD.lk.Lxb;

import com.bytedance.adsdk.Lxb.LD.LD.Lxb.DY;
import java.util.Deque;

/* JADX INFO: loaded from: classes.dex */
public class LD extends lc {
    @Override // com.bytedance.adsdk.Lxb.LD.lk.Lxb.lc
    public int Lxb(String str, int i, Deque<com.bytedance.adsdk.Lxb.LD.LD.Lxb> deque, com.bytedance.adsdk.Lxb.LD.lk.Lxb lxb) {
        if ('\'' != Lxb(i, str)) {
            return lxb.Lxb(str, i, deque);
        }
        int i2 = i + 1;
        int length = str.length();
        int i3 = i2;
        while (i3 < length && Lxb(i3, str) != '\'') {
            i3++;
        }
        if (Lxb(i3, str) != '\'') {
            throw new com.bytedance.adsdk.Lxb.Lxb.Lxb("String expression not surrounded by '", str.substring(i));
        }
        deque.push(new DY(str.substring(i2, i3)));
        return i3 + 1;
    }
}
