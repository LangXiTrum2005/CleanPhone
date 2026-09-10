package com.smartdigimkt.p4;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f37560c = 32;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f37562b;

    public m() {
        this(32);
    }

    public void a(long j) {
        int i2 = this.f37561a;
        long[] jArr = this.f37562b;
        if (i2 == jArr.length) {
            this.f37562b = Arrays.copyOf(jArr, i2 * 2);
        }
        long[] jArr2 = this.f37562b;
        int i3 = this.f37561a;
        this.f37561a = i3 + 1;
        jArr2[i3] = j;
    }

    public long[] b() {
        return Arrays.copyOf(this.f37562b, this.f37561a);
    }

    public m(int i2) {
        this.f37562b = new long[i2];
    }

    public long a(int i2) {
        if (i2 >= 0 && i2 < this.f37561a) {
            return this.f37562b[i2];
        }
        StringBuilder sbU = android.support.v4.media.a.u(i2, "Invalid index ", ", size is ");
        sbU.append(this.f37561a);
        throw new IndexOutOfBoundsException(sbU.toString());
    }

    public int a() {
        return this.f37561a;
    }
}
