package com.google.android.exoplayer2.util;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class TimedValueQueue<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f18973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f18974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18975c;
    public int d;

    public final synchronized void a(long j, Object obj) {
        int i2 = this.d;
        if (i2 > 0) {
            if (j <= this.f18973a[((this.f18975c + i2) - 1) % this.f18974b.length]) {
                synchronized (this) {
                    this.f18975c = 0;
                    this.d = 0;
                    Arrays.fill(this.f18974b, (Object) null);
                }
            }
        }
        b();
        int i3 = this.f18975c;
        int i4 = this.d;
        Object[] objArr = this.f18974b;
        int length = (i3 + i4) % objArr.length;
        this.f18973a[length] = j;
        objArr[length] = obj;
        this.d = i4 + 1;
    }

    public final void b() {
        int length = this.f18974b.length;
        if (this.d < length) {
            return;
        }
        int i2 = length * 2;
        long[] jArr = new long[i2];
        Object[] objArr = new Object[i2];
        int i3 = this.f18975c;
        int i4 = length - i3;
        System.arraycopy(this.f18973a, i3, jArr, 0, i4);
        System.arraycopy(this.f18974b, this.f18975c, objArr, 0, i4);
        int i5 = this.f18975c;
        if (i5 > 0) {
            System.arraycopy(this.f18973a, 0, jArr, i4, i5);
            System.arraycopy(this.f18974b, 0, objArr, i4, this.f18975c);
        }
        this.f18973a = jArr;
        this.f18974b = objArr;
        this.f18975c = 0;
    }

    public final Object c() {
        Assertions.d(this.d > 0);
        Object[] objArr = this.f18974b;
        int i2 = this.f18975c;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f18975c = (i2 + 1) % objArr.length;
        this.d--;
        return obj;
    }
}
