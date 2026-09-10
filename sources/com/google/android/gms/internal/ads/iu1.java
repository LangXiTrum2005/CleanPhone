package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class iu1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final iu1 f15848f = new iu1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f15850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f15851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15852d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15853e;

    public iu1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f15849a = i10;
        this.f15850b = iArr;
        this.f15851c = objArr;
        this.f15853e = z10;
    }

    public static iu1 a() {
        return new iu1(0, new int[8], new Object[8], true);
    }

    public final void b(z61 z61Var) {
        is1 is1Var = (is1) z61Var.f22523a;
        if (this.f15849a != 0) {
            for (int i10 = 0; i10 < this.f15849a; i10++) {
                int i11 = this.f15850b[i10];
                Object obj = this.f15851c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    is1Var.w(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    is1Var.x(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    is1Var.A(i13, (cs1) obj);
                } else if (i12 == 3) {
                    is1Var.s(i13, 3);
                    ((iu1) obj).b(z61Var);
                    is1Var.s(i13, 4);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new dt1());
                    }
                    is1Var.v(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int c() {
        int iP;
        int iQ;
        int iP2;
        int i10 = this.f15852d;
        if (i10 != -1) {
            return i10;
        }
        int iU = 0;
        for (int i11 = 0; i11 < this.f15849a; i11++) {
            int i12 = this.f15850b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 == 2) {
                        int i15 = i13 << 3;
                        cs1 cs1Var = (cs1) this.f15851c[i11];
                        int iP3 = is1.p(i15);
                        int iQ2 = cs1Var.q();
                        iU = com.applovin.impl.ca.u(iQ2, iQ2, iP3, iU);
                    } else if (i14 == 3) {
                        int iP4 = is1.p(i13 << 3);
                        iP = iP4 + iP4;
                        iQ = ((iu1) this.f15851c[i11]).c();
                    } else {
                        if (i14 != 5) {
                            throw new IllegalStateException(new dt1());
                        }
                        ((Integer) this.f15851c[i11]).getClass();
                        iP2 = is1.p(i13 << 3) + 4;
                    }
                } else {
                    ((Long) this.f15851c[i11]).getClass();
                    iP2 = is1.p(i13 << 3) + 8;
                }
                iU = iP2 + iU;
            } else {
                int i16 = i13 << 3;
                long jLongValue = ((Long) this.f15851c[i11]).longValue();
                iP = is1.p(i16);
                iQ = is1.q(jLongValue);
            }
            iU = iQ + iP + iU;
        }
        this.f15852d = iU;
        return iU;
    }

    public final void d(int i10, Object obj) {
        if (!this.f15853e) {
            throw new UnsupportedOperationException();
        }
        e(this.f15849a + 1);
        int[] iArr = this.f15850b;
        int i11 = this.f15849a;
        iArr[i11] = i10;
        this.f15851c[i11] = obj;
        this.f15849a = i11 + 1;
    }

    public final void e(int i10) {
        int[] iArr = this.f15850b;
        if (i10 > iArr.length) {
            int i11 = this.f15849a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f15850b = Arrays.copyOf(iArr, i10);
            this.f15851c = Arrays.copyOf(this.f15851c, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof iu1)) {
            return false;
        }
        iu1 iu1Var = (iu1) obj;
        int i10 = this.f15849a;
        if (i10 == iu1Var.f15849a) {
            int[] iArr = this.f15850b;
            int[] iArr2 = iu1Var.f15850b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f15851c;
            Object[] objArr2 = iu1Var.f15851c;
            int i12 = this.f15849a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f15849a;
        int i11 = i10 + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        int[] iArr = this.f15850b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f15851c;
        int i15 = this.f15849a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }
}
