package com.bytedance.adsdk.Lxb.LD.lk.Lxb;

import java.util.Deque;

/* JADX INFO: loaded from: classes.dex */
public abstract class lc {
    public int LD(int i, String str) {
        while (com.bytedance.adsdk.Lxb.LD.JXs.Lxb.Lxb(Lxb(i, str))) {
            i++;
        }
        return i;
    }

    public char Lxb(int i, String str) {
        if (i >= str.length()) {
            return (char) 26;
        }
        return str.charAt(i);
    }

    public abstract int Lxb(String str, int i, Deque<com.bytedance.adsdk.Lxb.LD.LD.Lxb> deque, com.bytedance.adsdk.Lxb.LD.lk.Lxb lxb);
}
