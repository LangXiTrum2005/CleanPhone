package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f12819b;

    public bl0(int i10, int i11) {
        switch (i11) {
            case 1:
                this.f12819b = new long[i10];
                break;
            default:
                this.f12819b = new long[i10];
                break;
        }
    }

    public void a(long j10) {
        int i10 = this.f12818a;
        long[] jArr = this.f12819b;
        if (i10 == jArr.length) {
            this.f12819b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f12819b;
        int i11 = this.f12818a;
        this.f12818a = i11 + 1;
        jArr2[i11] = j10;
    }

    public void b(long[] jArr) {
        int length = this.f12818a + jArr.length;
        long[] jArr2 = this.f12819b;
        if (length > jArr2.length) {
            this.f12819b = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.f12819b, this.f12818a, jArr.length);
        this.f12818a = length;
    }

    public long c(int i10) {
        if (i10 >= 0 && i10 < this.f12818a) {
            return this.f12819b[i10];
        }
        StringBuilder sbU = defpackage.e.u(i10, "Invalid index ", ", size is ");
        sbU.append(this.f12818a);
        throw new IndexOutOfBoundsException(sbU.toString());
    }

    public void d() {
        int i10 = this.f12818a;
        long[] jArr = this.f12819b;
        if (i10 == jArr.length) {
            this.f12819b = Arrays.copyOf(jArr, i10 + i10);
        }
        long[] jArr2 = this.f12819b;
        int i11 = this.f12818a;
        this.f12818a = i11 + 1;
        jArr2[i11] = 0;
    }

    public void e(long[] jArr) {
        int i10 = this.f12818a;
        int length = jArr.length;
        int i11 = i10 + length;
        long[] jArr2 = this.f12819b;
        int length2 = jArr2.length;
        if (i11 > length2) {
            this.f12819b = Arrays.copyOf(jArr2, Math.max(length2 + length2, i11));
        }
        System.arraycopy(jArr, 0, this.f12819b, this.f12818a, length);
        this.f12818a = i11;
    }

    public long f(int i10) {
        if (i10 >= 0 && i10 < this.f12818a) {
            return this.f12819b[i10];
        }
        int i11 = this.f12818a;
        throw new IndexOutOfBoundsException(l1.d.j(new StringBuilder(String.valueOf(i10).length() + 24 + String.valueOf(i11).length()), i10, "Invalid index ", i11, ", size is "));
    }
}
