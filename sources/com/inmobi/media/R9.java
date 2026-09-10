package com.inmobi.media;

/* JADX INFO: loaded from: classes5.dex */
public final class R9 {
    private int maxBatchSize;
    private int minBatchSize;
    private long retryInterval;

    public final void a(long j) {
        this.retryInterval = j;
    }

    public final int b() {
        return this.minBatchSize;
    }

    public final long c() {
        return this.retryInterval;
    }

    public final int a() {
        return this.maxBatchSize;
    }

    public final void b(int i2) {
        this.maxBatchSize = i2;
    }

    public final void c(int i2) {
        this.minBatchSize = i2;
    }

    public final boolean a(int i2) {
        int i3;
        int i4 = this.maxBatchSize;
        return i4 <= i2 && this.retryInterval > 0 && i4 > 0 && (i3 = this.minBatchSize) > 0 && i3 <= i4;
    }
}
