package com.bytedance.adsdk.Lxb.LD.lk.Lxb;

import com.bytedance.adsdk.Lxb.LD.LD.Lxb.HD;
import java.util.Deque;

/* JADX INFO: loaded from: classes.dex */
public class lk extends lc {
    @Override // com.bytedance.adsdk.Lxb.LD.lk.Lxb.lc
    public int Lxb(String str, int i, Deque<com.bytedance.adsdk.Lxb.LD.LD.Lxb> deque, com.bytedance.adsdk.Lxb.LD.lk.Lxb lxb) {
        return !com.bytedance.adsdk.Lxb.LD.JXs.Lxb.LD(Lxb(i, str)) ? lxb.Lxb(str, i, deque) : Lxb(str, i, deque);
    }

    private int Lxb(String str, int i, Deque<com.bytedance.adsdk.Lxb.LD.LD.Lxb> deque) {
        int i2;
        int i3 = 0;
        while (true) {
            i2 = i3 + i;
            char cLxb = Lxb(i2, str);
            if (!com.bytedance.adsdk.Lxb.LD.JXs.Lxb.LD(cLxb) && !com.bytedance.adsdk.Lxb.LD.JXs.Lxb.lk(cLxb) && '.' != cLxb && '[' != cLxb && ']' != cLxb && '_' != cLxb && '-' != cLxb) {
                break;
            }
            i3++;
        }
        String strSubstring = str.substring(i, i2);
        if (com.bytedance.adsdk.Lxb.LD.ZU.Lxb.Lxb(strSubstring) != null) {
            deque.push(new com.bytedance.adsdk.Lxb.LD.LD.Lxb.ebl(strSubstring));
        } else {
            deque.push(new HD(strSubstring));
        }
        return i2;
    }
}
