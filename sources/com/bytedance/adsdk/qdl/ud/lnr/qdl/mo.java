package com.bytedance.adsdk.qdl.ud.lnr.qdl;

import java.util.Deque;

/* JADX INFO: loaded from: classes.dex */
public abstract class mo {
    public char qdl(int i2, String str) {
        if (i2 >= str.length()) {
            return (char) 26;
        }
        return str.charAt(i2);
    }

    public abstract int qdl(String str, int i2, Deque<com.bytedance.adsdk.qdl.ud.ud.qdl> deque, com.bytedance.adsdk.qdl.ud.lnr.qdl qdlVar);

    public int ud(int i2, String str) {
        while (com.bytedance.adsdk.qdl.ud.mzz.qdl.qdl(qdl(i2, str))) {
            i2++;
        }
        return i2;
    }
}
