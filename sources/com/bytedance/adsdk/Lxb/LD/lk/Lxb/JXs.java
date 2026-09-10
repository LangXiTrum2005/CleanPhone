package com.bytedance.adsdk.Lxb.LD.lk.Lxb;

import java.util.Deque;

/* JADX INFO: loaded from: classes.dex */
public class JXs extends lc {
    @Override // com.bytedance.adsdk.Lxb.LD.lk.Lxb.lc
    public int Lxb(String str, int i, Deque<com.bytedance.adsdk.Lxb.LD.LD.Lxb> deque, com.bytedance.adsdk.Lxb.LD.lk.Lxb lxb) {
        char cLxb;
        int i2 = i;
        while (true) {
            cLxb = Lxb(i2, str);
            if (!com.bytedance.adsdk.Lxb.LD.JXs.Lxb.LD(cLxb) && !com.bytedance.adsdk.Lxb.LD.JXs.Lxb.lk(cLxb)) {
                break;
            }
            i2++;
        }
        if (cLxb != '(') {
            return lxb.Lxb(str, i, deque);
        }
        deque.push(new com.bytedance.adsdk.Lxb.LD.LD.Lxb.nBu(str.substring(i, i2)));
        return i2 + 1;
    }
}
