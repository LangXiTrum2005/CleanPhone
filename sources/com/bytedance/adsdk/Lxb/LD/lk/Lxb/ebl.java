package com.bytedance.adsdk.Lxb.LD.lk.Lxb;

import com.bytedance.adsdk.Lxb.LD.LD.Lxb.IeN;
import java.util.Deque;

/* JADX INFO: loaded from: classes.dex */
public class ebl extends lc {
    private boolean Lxb(String str, int i, Deque<com.bytedance.adsdk.Lxb.LD.LD.Lxb> deque) {
        if ('-' != Lxb(i, str)) {
            return com.bytedance.adsdk.Lxb.LD.JXs.Lxb.lk(Lxb(i, str));
        }
        if (deque.peek() != null && !com.bytedance.adsdk.Lxb.LD.ZU.lk.Lxb(deque.peek().Lxb())) {
            return false;
        }
        if (com.bytedance.adsdk.Lxb.LD.JXs.Lxb.lk(Lxb(i + 1, str))) {
            return true;
        }
        throw new IllegalArgumentException("Unrecognized - symbol, not a negative number or operator, problem range:" + str.substring(0, i));
    }

    @Override // com.bytedance.adsdk.Lxb.LD.lk.Lxb.lc
    public int Lxb(String str, int i, Deque<com.bytedance.adsdk.Lxb.LD.LD.Lxb> deque, com.bytedance.adsdk.Lxb.LD.lk.Lxb lxb) {
        char cLxb;
        if (!Lxb(str, i, deque)) {
            return lxb.Lxb(str, i, deque);
        }
        int i2 = Lxb(i, str) == '-' ? i + 1 : i;
        boolean z = false;
        while (true) {
            cLxb = Lxb(i2, str);
            if (!com.bytedance.adsdk.Lxb.LD.JXs.Lxb.lk(cLxb) && (z || cLxb != '.')) {
                break;
            }
            i2++;
            if (cLxb == '.') {
                z = true;
            }
        }
        if (cLxb != '.') {
            deque.push(new IeN(str.substring(i, i2)));
            return i2;
        }
        throw new IllegalArgumentException("Illegal negative number format, problem interval:" + str.substring(i, i2));
    }
}
