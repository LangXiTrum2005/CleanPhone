package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fs1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f14525c;

    public static ds1 q(byte[] bArr, int i10, int i11) {
        ds1 ds1Var = new ds1(bArr, i10, i11);
        try {
            ds1Var.h(i11);
            return ds1Var;
        } catch (et1 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int u(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }

    public static fs1 v(InputStream inputStream, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("bufferSize must be > 0");
        }
        if (inputStream != null) {
            return new com.google.android.gms.internal.measurement.u0(inputStream, i10);
        }
        com.google.android.gms.internal.measurement.t0 t0Var = new com.google.android.gms.internal.measurement.t0(com.google.android.gms.internal.measurement.q1.f23877a);
        try {
            t0Var.j(0);
            return t0Var;
        } catch (com.google.android.gms.internal.measurement.u1 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static long w(long j10) {
        return (j10 >>> 1) ^ (-(1 & j10));
    }

    public static int y(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }

    public static long z(long j10) {
        return (j10 >>> 1) ^ (-(1 & j10));
    }

    public abstract int A();

    public abstract void B(int i10);

    public abstract boolean C(int i10);

    public abstract double D();

    public abstract float E();

    public abstract long F();

    public abstract long G();

    public abstract int H();

    public abstract long I();

    public abstract int J();

    public abstract boolean K();

    public abstract String L();

    public abstract String M();

    public abstract as1 N();

    public abstract com.google.android.gms.internal.measurement.r0 O();

    public abstract int P();

    public abstract byte[] Q();

    public abstract int R();

    public abstract int S();

    public abstract int T();

    public abstract long U();

    public abstract int V();

    public abstract long W();

    public abstract int X();

    public abstract long Y();

    public abstract long Z();

    public abstract int a0();

    public abstract long b0();

    public gn.c d() {
        gn.c cVarE;
        synchronized (this) {
            try {
                gn.c[] cVarArrF = (gn.c[]) this.f14525c;
                if (cVarArrF == null) {
                    cVarArrF = f();
                    this.f14525c = cVarArrF;
                } else if (this.f14523a >= cVarArrF.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(cVarArrF, cVarArrF.length * 2);
                    kotlin.jvm.internal.n.e(objArrCopyOf, "copyOf(...)");
                    this.f14525c = (gn.c[]) objArrCopyOf;
                    cVarArrF = (gn.c[]) objArrCopyOf;
                }
                int i10 = this.f14524b;
                do {
                    cVarE = cVarArrF[i10];
                    if (cVarE == null) {
                        cVarE = e();
                        cVarArrF[i10] = cVarE;
                    }
                    i10++;
                    if (i10 >= cVarArrF.length) {
                        i10 = 0;
                    }
                } while (!cVarE.a(this));
                this.f14524b = i10;
                this.f14523a++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVarE;
    }

    public abstract gn.c e();

    public abstract gn.c[] f();

    public void g(gn.c cVar) {
        int i10;
        ak.f[] fVarArrB;
        synchronized (this) {
            try {
                int i11 = this.f14523a - 1;
                this.f14523a = i11;
                if (i11 == 0) {
                    this.f14524b = 0;
                }
                kotlin.jvm.internal.n.d(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                fVarArrB = cVar.b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (ak.f fVar : fVarArrB) {
            if (fVar != null) {
                fVar.resumeWith(wj.r.f53297a);
            }
        }
    }

    public abstract int h(int i10);

    public abstract void i(int i10);

    public abstract int j(int i10);

    public abstract boolean k();

    public abstract int l();

    public abstract void m(int i10);

    public abstract int n();

    public abstract boolean o();

    public abstract int p();

    public abstract int r(byte[] bArr, int i10, int i11);

    public void s() {
        boolean zC;
        do {
            int iA = A();
            if (iA == 0) {
                return;
            }
            int i10 = this.f14523a;
            int i11 = this.f14524b;
            if (i10 + i11 >= 100) {
                throw new et1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f14524b = i11 + 1;
            zC = C(iA);
            this.f14524b--;
        } while (zC);
    }

    public abstract void t(int i10);

    public void x() throws com.google.android.gms.internal.measurement.u1 {
        boolean zC;
        do {
            int iA = A();
            if (iA == 0) {
                return;
            }
            int i10 = this.f14523a;
            int i11 = this.f14524b;
            if (i10 + i11 >= 100) {
                throw new com.google.android.gms.internal.measurement.u1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f14524b = i11 + 1;
            zC = C(iA);
            this.f14524b--;
        } while (zC);
    }
}
