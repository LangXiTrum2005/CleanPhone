package com.bytedance.sdk.component.lc.Lxb.ZU.LD;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    private int LD;
    private int Lxb;

    public Lxb(int i, int i2, long j) {
        if (i2 < i) {
            throw new IllegalStateException("atMostBatchSendCount should meet a condition (atMostBatchSendCount >= maxCacheCount)");
        }
        this.Lxb = i;
        this.LD = i2;
    }

    public static Lxb JXs() {
        return new Lxb(3, 100, 172800000L);
    }

    public static Lxb ZU() {
        return new Lxb(1, 100, -1L);
    }

    public static Lxb lk() {
        return new Lxb(1, 100, 172800000L);
    }

    public int LD() {
        return this.LD;
    }

    public int Lxb() {
        return this.Lxb;
    }
}
