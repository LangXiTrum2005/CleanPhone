package com.bytedance.sdk.component.mo.qdl.mml.ud;

/* JADX INFO: loaded from: classes.dex */
public class qdl {
    private int qdl;
    private int ud;

    public qdl(int i2, int i3, long j) {
        if (i3 < i2) {
            throw new IllegalStateException("atMostBatchSendCount should meet a condition (atMostBatchSendCount >= maxCacheCount)");
        }
        this.qdl = i2;
        this.ud = i3;
    }

    public static qdl lnr() {
        return new qdl(1, 100, 172800000L);
    }

    public static qdl mml() {
        return new qdl(1, 100, -1L);
    }

    public static qdl mzz() {
        return new qdl(3, 100, 172800000L);
    }

    public int qdl() {
        return this.qdl;
    }

    public int ud() {
        return this.ud;
    }
}
