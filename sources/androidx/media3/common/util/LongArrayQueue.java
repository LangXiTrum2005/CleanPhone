package androidx.media3.common.util;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class LongArrayQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f5656c;
    public int d;

    public final long a() {
        int i2 = this.f5655b;
        if (i2 == 0) {
            throw new NoSuchElementException();
        }
        int i3 = this.f5654a;
        long j = this.f5656c[i3];
        this.f5654a = (i3 + 1) & this.d;
        this.f5655b = i2 - 1;
        return j;
    }
}
