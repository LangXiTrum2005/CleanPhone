package com.bytedance.adsdk.Lxb.LD.lk.Lxb;

import com.bytedance.adsdk.Lxb.LD.LD.Lxb.Sfi;
import java.util.Deque;

/* JADX INFO: loaded from: classes.dex */
public class ZU extends lc {
    @Override // com.bytedance.adsdk.Lxb.LD.lk.Lxb.lc
    public int Lxb(String str, int i, Deque<com.bytedance.adsdk.Lxb.LD.LD.Lxb> deque, com.bytedance.adsdk.Lxb.LD.lk.Lxb lxb) {
        if ('(' != Lxb(i, str)) {
            return lxb.Lxb(str, i, deque);
        }
        deque.push(new Sfi(com.bytedance.adsdk.Lxb.LD.ZU.ZU.LEFT_PAREN));
        return i + 1;
    }
}
