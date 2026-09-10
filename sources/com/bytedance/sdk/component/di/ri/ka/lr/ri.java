package com.bytedance.sdk.component.di.ri.ka.lr;

/* JADX INFO: loaded from: classes2.dex */
public class ri {
    private int lr;
    private int ri;

    public ri(int i, int i2, long j) {
        if (i2 < i) {
            throw new IllegalStateException("atMostBatchSendCount should meet a condition (atMostBatchSendCount >= maxCacheCount)");
        }
        this.ri = i;
        this.lr = i2;
    }

    public static ri fi() {
        return new ri(3, 100, 172800000L);
    }

    public static ri ik() {
        return new ri(1, 100, 172800000L);
    }

    public static ri ka() {
        return new ri(1, 100, -1L);
    }

    public int lr() {
        return this.lr;
    }

    public int ri() {
        return this.ri;
    }
}
