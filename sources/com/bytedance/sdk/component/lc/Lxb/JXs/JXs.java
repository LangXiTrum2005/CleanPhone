package com.bytedance.sdk.component.lc.Lxb.JXs;

import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public abstract class JXs implements Comparable<JXs>, Runnable {
    private String lk;
    private int Lxb = 5;
    private String LD = UUID.randomUUID().toString() + "-" + String.valueOf(System.nanoTime());

    public JXs(String str) {
        this.lk = str;
    }

    public void Lxb(int i) {
        this.Lxb = i;
    }

    public int Lxb() {
        return this.Lxb;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
    public int compareTo(JXs jXs) {
        if (Lxb() < jXs.Lxb()) {
            return 1;
        }
        return Lxb() >= jXs.Lxb() ? -1 : 0;
    }
}
