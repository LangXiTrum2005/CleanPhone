package com.bytedance.adsdk.ri.lr.ik.ri;

import java.util.Deque;

/* JADX INFO: loaded from: classes2.dex */
public abstract class di {
    public int lr(int i, String str) {
        while (com.bytedance.adsdk.ri.lr.fi.ri.ri(ri(i, str))) {
            i++;
        }
        return i;
    }

    public char ri(int i, String str) {
        if (i >= str.length()) {
            return (char) 26;
        }
        return str.charAt(i);
    }

    public abstract int ri(String str, int i, Deque<com.bytedance.adsdk.ri.lr.lr.ri> deque, com.bytedance.adsdk.ri.lr.ik.ri riVar);
}
