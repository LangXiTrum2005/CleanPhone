package com.google.crypto.tink.shaded.protobuf;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c1 f24543f = new c1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f24545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f24546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24547d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f24548e;

    public c1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f24544a = i10;
        this.f24545b = iArr;
        this.f24546c = objArr;
        this.f24548e = z10;
    }

    public static c1 c() {
        return new c1(0, new int[8], new Object[8], true);
    }

    public final void a(int i10) {
        int[] iArr = this.f24545b;
        if (i10 > iArr.length) {
            int i11 = this.f24544a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f24545b = Arrays.copyOf(iArr, i10);
            this.f24546c = Arrays.copyOf(this.f24546c, i10);
        }
    }

    public final int b() {
        int iE0;
        int iG0;
        int iE1;
        int i10 = this.f24547d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f24544a; i12++) {
            int i13 = this.f24545b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f24546c[i12]).getClass();
                    iE1 = l.e0(i14) + 8;
                } else if (i15 == 2) {
                    iE1 = l.a0(i14, (i) this.f24546c[i12]);
                } else if (i15 == 3) {
                    iE0 = l.e0(i14) * 2;
                    iG0 = ((c1) this.f24546c[i12]).b();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(d0.h());
                    }
                    ((Integer) this.f24546c[i12]).getClass();
                    iE1 = l.e0(i14) + 4;
                }
                i11 = iE1 + i11;
            } else {
                long jLongValue = ((Long) this.f24546c[i12]).longValue();
                iE0 = l.e0(i14);
                iG0 = l.g0(jLongValue);
            }
            i11 = iG0 + iE0 + i11;
        }
        this.f24547d = i11;
        return i11;
    }

    public final void d(int i10, Object obj) {
        if (!this.f24548e) {
            throw new UnsupportedOperationException();
        }
        a(this.f24544a + 1);
        int[] iArr = this.f24545b;
        int i11 = this.f24544a;
        iArr[i11] = i10;
        this.f24546c[i11] = obj;
        this.f24544a = i11 + 1;
    }

    public final void e(k0 k0Var) {
        if (this.f24544a == 0) {
            return;
        }
        k0Var.getClass();
        l lVar = (l) k0Var.f24598a;
        for (int i10 = 0; i10 < this.f24544a; i10++) {
            int i11 = this.f24545b[i10];
            Object obj = this.f24546c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 == 0) {
                lVar.s0(i12, ((Long) obj).longValue());
            } else if (i13 == 1) {
                lVar.l0(i12, ((Long) obj).longValue());
            } else if (i13 == 2) {
                i iVar = (i) obj;
                lVar.p0(i12, 2);
                lVar.r0(iVar.size());
                h hVar = (h) iVar;
                lVar.i0(hVar.f24565d, hVar.r(), hVar.size());
            } else if (i13 == 3) {
                lVar.p0(i12, 3);
                ((c1) obj).e(k0Var);
                lVar.p0(i12, 4);
            } else {
                if (i13 != 5) {
                    throw new RuntimeException(d0.h());
                }
                lVar.j0(i12, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        int i10 = this.f24544a;
        if (i10 == c1Var.f24544a) {
            int[] iArr = this.f24545b;
            int[] iArr2 = c1Var.f24545b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f24546c;
            Object[] objArr2 = c1Var.f24546c;
            int i12 = this.f24544a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f24544a;
        int i11 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + i10) * 31;
        int[] iArr = this.f24545b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f24546c;
        int i15 = this.f24544a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }
}
