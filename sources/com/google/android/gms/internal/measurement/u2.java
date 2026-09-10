package com.google.android.gms.internal.measurement;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u2 f24013f = new u2(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f24015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f24016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24017d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f24018e;

    public u2(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f24014a = i10;
        this.f24015b = iArr;
        this.f24016c = objArr;
        this.f24018e = z10;
    }

    public static u2 a() {
        return new u2(0, new int[8], new Object[8], true);
    }

    public final void b(q6 q6Var) {
        x0 x0Var = (x0) q6Var.f23891b;
        if (this.f24014a != 0) {
            for (int i10 = 0; i10 < this.f24014a; i10++) {
                int i11 = this.f24015b[i10];
                Object obj = this.f24016c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    x0Var.v(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    x0Var.w(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    x0Var.z(i13, (s0) obj);
                } else if (i12 == 3) {
                    x0Var.r(i13, 3);
                    ((u2) obj).b(q6Var);
                    x0Var.r(i13, 4);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new t1());
                    }
                    x0Var.u(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int c() {
        int iP;
        int iQ;
        int iP2;
        int i10 = this.f24017d;
        if (i10 != -1) {
            return i10;
        }
        int iE = 0;
        for (int i11 = 0; i11 < this.f24014a; i11++) {
            int i12 = this.f24015b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 == 2) {
                        int i15 = i13 << 3;
                        s0 s0Var = (s0) this.f24016c[i11];
                        int iP3 = x0.p(i15);
                        int iH = s0Var.h();
                        iE = f2.e(iH, iH, iP3, iE);
                    } else if (i14 == 3) {
                        int iP4 = x0.p(i13 << 3);
                        iP = iP4 + iP4;
                        iQ = ((u2) this.f24016c[i11]).c();
                    } else {
                        if (i14 != 5) {
                            throw new IllegalStateException(new t1());
                        }
                        ((Integer) this.f24016c[i11]).getClass();
                        iP2 = x0.p(i13 << 3) + 4;
                    }
                } else {
                    ((Long) this.f24016c[i11]).getClass();
                    iP2 = x0.p(i13 << 3) + 8;
                }
                iE = iP2 + iE;
            } else {
                int i16 = i13 << 3;
                long jLongValue = ((Long) this.f24016c[i11]).longValue();
                iP = x0.p(i16);
                iQ = x0.q(jLongValue);
            }
            iE = iQ + iP + iE;
        }
        this.f24017d = iE;
        return iE;
    }

    public final void d(int i10, Object obj) {
        if (!this.f24018e) {
            throw new UnsupportedOperationException();
        }
        e(this.f24014a + 1);
        int[] iArr = this.f24015b;
        int i11 = this.f24014a;
        iArr[i11] = i10;
        this.f24016c[i11] = obj;
        this.f24014a = i11 + 1;
    }

    public final void e(int i10) {
        int[] iArr = this.f24015b;
        if (i10 > iArr.length) {
            int i11 = this.f24014a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f24015b = Arrays.copyOf(iArr, i10);
            this.f24016c = Arrays.copyOf(this.f24016c, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof u2)) {
            return false;
        }
        u2 u2Var = (u2) obj;
        int i10 = this.f24014a;
        if (i10 == u2Var.f24014a) {
            int[] iArr = this.f24015b;
            int[] iArr2 = u2Var.f24015b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f24016c;
            Object[] objArr2 = u2Var.f24016c;
            int i12 = this.f24014a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f24014a;
        int i11 = i10 + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        int[] iArr = this.f24015b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f24016c;
        int i15 = this.f24014a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }
}
