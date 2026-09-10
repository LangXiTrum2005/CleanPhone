package androidx.datastore.preferences.protobuf;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k1 f4116f = new k1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f4118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f4119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4120d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4121e;

    public k1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f4117a = i10;
        this.f4118b = iArr;
        this.f4119c = objArr;
        this.f4121e = z10;
    }

    public final void a(int i10) {
        int[] iArr = this.f4118b;
        if (i10 > iArr.length) {
            int i11 = this.f4117a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f4118b = Arrays.copyOf(iArr, i10);
            this.f4119c = Arrays.copyOf(this.f4119c, i10);
        }
    }

    public final int b() {
        int iT;
        int iV;
        int iT2;
        int i10 = this.f4120d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f4117a; i12++) {
            int i13 = this.f4118b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f4119c[i12]).getClass();
                    iT2 = p.T(i14) + 8;
                } else if (i15 == 2) {
                    iT2 = p.R(i14, (j) this.f4119c[i12]);
                } else if (i15 == 3) {
                    iT = p.T(i14) * 2;
                    iV = ((k1) this.f4119c[i12]).b();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(g0.g());
                    }
                    ((Integer) this.f4119c[i12]).getClass();
                    iT2 = p.T(i14) + 4;
                }
                i11 = iT2 + i11;
            } else {
                long jLongValue = ((Long) this.f4119c[i12]).longValue();
                iT = p.T(i14);
                iV = p.V(jLongValue);
            }
            i11 = iV + iT + i11;
        }
        this.f4120d = i11;
        return i11;
    }

    public final void c(int i10, Object obj) {
        if (!this.f4121e) {
            throw new UnsupportedOperationException();
        }
        a(this.f4117a + 1);
        int[] iArr = this.f4118b;
        int i11 = this.f4117a;
        iArr[i11] = i10;
        this.f4119c[i11] = obj;
        this.f4117a = i11 + 1;
    }

    public final void d(n0 n0Var) {
        if (this.f4117a == 0) {
            return;
        }
        n0Var.getClass();
        p pVar = (p) n0Var.f4139a;
        for (int i10 = 0; i10 < this.f4117a; i10++) {
            int i11 = this.f4118b[i10];
            Object obj = this.f4119c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 == 0) {
                pVar.p0(i12, ((Long) obj).longValue());
            } else if (i13 == 1) {
                pVar.f0(i12, ((Long) obj).longValue());
            } else if (i13 == 2) {
                pVar.b0(i12, (j) obj);
            } else if (i13 == 3) {
                pVar.m0(i12, 3);
                ((k1) obj).d(n0Var);
                pVar.m0(i12, 4);
            } else {
                if (i13 != 5) {
                    throw new RuntimeException(g0.g());
                }
                pVar.d0(i12, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        int i10 = this.f4117a;
        if (i10 == k1Var.f4117a) {
            int[] iArr = this.f4118b;
            int[] iArr2 = k1Var.f4118b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f4119c;
            Object[] objArr2 = k1Var.f4119c;
            int i12 = this.f4117a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f4117a;
        int i11 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + i10) * 31;
        int[] iArr = this.f4118b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f4119c;
        int i15 = this.f4117a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }
}
