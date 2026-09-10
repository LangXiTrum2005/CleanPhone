package androidx.media3.common.util;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class LongArray {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f5653b = new long[32];

    public final void a(long j) {
        int i2 = this.f5652a;
        long[] jArr = this.f5653b;
        if (i2 == jArr.length) {
            this.f5653b = Arrays.copyOf(jArr, i2 * 2);
        }
        long[] jArr2 = this.f5653b;
        int i3 = this.f5652a;
        this.f5652a = i3 + 1;
        jArr2[i3] = j;
    }

    public final long b(int i2) {
        if (i2 >= 0 && i2 < this.f5652a) {
            return this.f5653b[i2];
        }
        StringBuilder sbU = android.support.v4.media.a.u(i2, "Invalid index ", ", size is ");
        sbU.append(this.f5652a);
        throw new IndexOutOfBoundsException(sbU.toString());
    }
}
