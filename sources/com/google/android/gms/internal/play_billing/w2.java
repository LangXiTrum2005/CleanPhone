package com.google.android.gms.internal.play_billing;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final w2 f24493f = new w2(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f24495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f24496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24497d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f24498e;

    public w2(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f24494a = i10;
        this.f24495b = iArr;
        this.f24496c = objArr;
        this.f24498e = z10;
    }

    public static w2 b() {
        return new w2(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iR;
        int iS;
        int iR2;
        int i10 = this.f24497d;
        if (i10 != -1) {
            return i10;
        }
        int iY = 0;
        for (int i11 = 0; i11 < this.f24494a; i11++) {
            int i12 = this.f24495b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 == 2) {
                        int i15 = i13 << 3;
                        i1 i1Var = (i1) this.f24496c[i11];
                        int iR3 = j1.R(i15);
                        int iM = i1Var.m();
                        iY = com.google.android.gms.internal.measurement.f2.y(iM, iM, iR3, iY);
                    } else if (i14 == 3) {
                        int iR4 = j1.R(i13 << 3);
                        iR = iR4 + iR4;
                        iS = ((w2) this.f24496c[i11]).a();
                    } else {
                        if (i14 != 5) {
                            throw new IllegalStateException(new a2());
                        }
                        ((Integer) this.f24496c[i11]).getClass();
                        iR2 = j1.R(i13 << 3) + 4;
                    }
                } else {
                    ((Long) this.f24496c[i11]).getClass();
                    iR2 = j1.R(i13 << 3) + 8;
                }
                iY = iR2 + iY;
            } else {
                int i16 = i13 << 3;
                long jLongValue = ((Long) this.f24496c[i11]).longValue();
                iR = j1.R(i16);
                iS = j1.S(jLongValue);
            }
            iY = iS + iR + iY;
        }
        this.f24497d = iY;
        return iY;
    }

    public final void c(int i10, Object obj) {
        if (!this.f24498e) {
            throw new UnsupportedOperationException();
        }
        e(this.f24494a + 1);
        int[] iArr = this.f24495b;
        int i11 = this.f24494a;
        iArr[i11] = i10;
        this.f24496c[i11] = obj;
        this.f24494a = i11 + 1;
    }

    public final void d(h2 h2Var) {
        if (this.f24494a != 0) {
            for (int i10 = 0; i10 < this.f24494a; i10++) {
                int i11 = this.f24495b[i10];
                Object obj = this.f24496c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    ((j1) h2Var.f24280a).f0(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    ((j1) h2Var.f24280a).X(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    ((j1) h2Var.f24280a).U(i13, (i1) obj);
                } else if (i12 == 3) {
                    ((j1) h2Var.f24280a).c0(i13, 3);
                    ((w2) obj).d(h2Var);
                    ((j1) h2Var.f24280a).c0(i13, 4);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new a2());
                    }
                    ((j1) h2Var.f24280a).V(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void e(int i10) {
        int[] iArr = this.f24495b;
        if (i10 > iArr.length) {
            int i11 = this.f24494a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f24495b = Arrays.copyOf(iArr, i10);
            this.f24496c = Arrays.copyOf(this.f24496c, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof w2)) {
            return false;
        }
        w2 w2Var = (w2) obj;
        int i10 = this.f24494a;
        if (i10 == w2Var.f24494a) {
            int[] iArr = this.f24495b;
            int[] iArr2 = w2Var.f24495b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f24496c;
            Object[] objArr2 = w2Var.f24496c;
            int i12 = this.f24494a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f24494a;
        int i11 = i10 + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        int[] iArr = this.f24495b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f24496c;
        int i15 = this.f24494a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }
}
