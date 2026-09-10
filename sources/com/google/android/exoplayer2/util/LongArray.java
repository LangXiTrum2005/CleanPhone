package com.google.android.exoplayer2.util;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class LongArray {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f18923b = new long[32];

    public final void a(long j) {
        int i2 = this.f18922a;
        long[] jArr = this.f18923b;
        if (i2 == jArr.length) {
            this.f18923b = Arrays.copyOf(jArr, i2 * 2);
        }
        long[] jArr2 = this.f18923b;
        int i3 = this.f18922a;
        this.f18922a = i3 + 1;
        jArr2[i3] = j;
    }

    public final long b(int i2) {
        if (i2 >= 0 && i2 < this.f18922a) {
            return this.f18923b[i2];
        }
        StringBuilder sbU = android.support.v4.media.a.u(i2, "Invalid index ", ", size is ");
        sbU.append(this.f18922a);
        throw new IndexOutOfBoundsException(sbU.toString());
    }
}
