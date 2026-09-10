package com.efs.sdk.memleaksdk.monitor.internal;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class dd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f680a;
    private int b;
    private int c;
    private int d;
    private boolean e;
    private final double f;

    public dd() {
        this(0, 1);
    }

    public final boolean a(long j) {
        if (j == 0) {
            boolean z = !this.e;
            this.e = true;
            return z;
        }
        long[] jArr = this.f680a;
        int i = this.c;
        int iA = cx.f670a.a(j) & i;
        long j2 = jArr[iA];
        while (j2 != 0) {
            if (j2 == j) {
                return false;
            }
            iA = (iA + 1) & i;
            j2 = jArr[iA];
        }
        if (this.b == this.d) {
            a(iA, j);
        } else {
            jArr[iA] = j;
        }
        this.b++;
        return true;
    }

    public final boolean b(long j) {
        if (j == 0) {
            return this.e;
        }
        long[] jArr = this.f680a;
        int i = this.c;
        int iA = cx.f670a.a(j) & i;
        long j2 = jArr[iA];
        while (j2 != 0) {
            if (j2 == j) {
                return true;
            }
            iA = (iA + 1) & i;
            j2 = jArr[iA];
        }
        return false;
    }

    public final boolean c(long j) {
        if (j == 0) {
            boolean z = this.e;
            this.e = false;
            return z;
        }
        long[] jArr = this.f680a;
        int i = this.c;
        int iA = cx.f670a.a(j) & i;
        long j2 = jArr[iA];
        while (j2 != 0) {
            if (j2 == j) {
                b(iA);
                return true;
            }
            iA = (iA + 1) & i;
            j2 = jArr[iA];
        }
        return false;
    }

    public dd(int i) {
        this.f680a = new long[0];
        this.f = 0.75d;
        a(i);
    }

    public /* synthetic */ dd(int i, int i2) {
        this((i2 & 1) != 0 ? 4 : i);
    }

    private final void b(int i) {
        int i2;
        long j;
        long[] jArr = this.f680a;
        int i3 = this.c;
        while (true) {
            int i4 = 0;
            do {
                i4++;
                i2 = (i + i4) & i3;
                j = jArr[i2];
                if (j == 0) {
                    jArr[i] = 0;
                    this.b--;
                    return;
                }
            } while (((i2 - cx.f670a.a(j)) & i3) < i4);
            jArr[i] = j;
            i = i2;
        }
    }

    private final void c(int i) {
        long[] jArr = this.f680a;
        try {
            this.f680a = new long[i + 1];
            this.d = cx.f670a.b(i, this.f);
            this.c = i - 1;
        } catch (OutOfMemoryError e) {
            this.f680a = jArr;
            throw new RuntimeException(String.format(Locale.ROOT, "Not enough memory to allocate buffers for rehashing: %,d -> %,d", Arrays.copyOf(new Object[]{Integer.valueOf(a()), Integer.valueOf(i)}, 2)), e);
        }
    }

    public final void a(int i) {
        if (i > this.d) {
            long[] jArr = this.f680a;
            c(cx.f670a.a(i, this.f));
            if (a() != 0) {
                a(jArr);
            }
        }
    }

    public final int a() {
        return this.b + (this.e ? 1 : 0);
    }

    private final void a(long[] jArr) {
        int i;
        long[] jArr2 = this.f680a;
        int i2 = this.c;
        int length = jArr.length - 1;
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            long j = jArr[length];
            if (j != 0) {
                int iA = cx.f670a.a(j);
                while (true) {
                    i = iA & i2;
                    if (jArr2[i] == 0) {
                        break;
                    } else {
                        iA = i + 1;
                    }
                }
                jArr2[i] = j;
            }
        }
    }

    private final void a(int i, long j) {
        long[] jArr = this.f680a;
        c(cx.f670a.a(this.c + 1, a(), this.f));
        jArr[i] = j;
        a(jArr);
    }
}
