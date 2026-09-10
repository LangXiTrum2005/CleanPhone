package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.fs1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class oc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final oc f23803b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oa.x0 f23804a;

    static {
        int i10 = oa.x0.f47342f;
        f23803b = new oc(oa.v1.f47336h);
    }

    public oc(oa.x0 x0Var) {
        this.f23804a = x0Var;
    }

    public static oc a(fs1 fs1Var) throws u1 {
        long j10;
        String strL;
        nc ncVar;
        int iA0 = fs1Var.a0();
        if (iA0 < 0) {
            throw new u1("Negative number of flags");
        }
        int i10 = oa.x0.f47342f;
        oa.v0 v0Var = new oa.v0(oa.l1.f47272a);
        long j11 = 0;
        for (int i11 = 0; i11 < iA0; i11++) {
            long jB0 = fs1Var.b0();
            int i12 = (int) jB0;
            long j12 = jB0 >>> 3;
            if (j12 == 0) {
                j10 = 0;
                strL = fs1Var.L();
            } else {
                long j13 = j12 + j11;
                if (j13 > 2305843009213693951L) {
                    throw new u1("Flag name larger than max size");
                }
                j10 = j13;
                strL = null;
            }
            int i13 = i12 & 7;
            if (i13 == 0 || i13 == 1) {
                ncVar = new nc(j10, strL, i13, 0L, null);
            } else if (i13 == 2) {
                ncVar = new nc(j10, strL, i13, fs1Var.b0(), null);
            } else if (i13 == 3) {
                ncVar = new nc(j10, strL, i13, Double.doubleToRawLongBits(fs1Var.D()), null);
            } else if (i13 == 4) {
                ncVar = new nc(j10, strL, i13, 0L, fs1Var.L());
            } else {
                if (i13 != 5) {
                    throw new u1(l1.d.k(new StringBuilder(String.valueOf(i13).length() + 23), "Unrecognized flag type ", i13));
                }
                ncVar = new nc(j10, strL, i13, 0L, fs1Var.Q());
            }
            long j14 = ncVar.f23774a;
            if (j14 != 0) {
                j11 = j14;
            }
            v0Var.b(ncVar);
        }
        return new oc(v0Var.i());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oc)) {
            return false;
        }
        return this.f23804a.equals(((oc) obj).f23804a);
    }

    public final int hashCode() {
        oa.x0 x0Var = this.f23804a;
        x0Var.getClass();
        return oa.q.o(x0Var);
    }
}
