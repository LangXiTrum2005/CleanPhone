package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.ur1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n2 implements s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f24429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r1 f24430b;

    public n2(r1 r1Var, c1 c1Var) {
        r1 r1Var2 = m1.f24408a;
        this.f24430b = r1Var;
        this.f24429a = c1Var;
    }

    @Override // com.google.android.gms.internal.play_billing.s2
    public final boolean a(Object obj) {
        throw q4.a.h(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.s2
    public final void b(Object obj) {
        this.f24430b.getClass();
        w2 w2Var = ((t1) obj).zzc;
        if (w2Var.f24498e) {
            w2Var.f24498e = false;
        }
        r1 r1Var = m1.f24408a;
        throw q4.a.h(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.s2
    public final void c(Object obj, Object obj2) {
        t2.p(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.s2
    public final int d(c1 c1Var) {
        w2 w2Var = ((t1) c1Var).zzc;
        int i10 = w2Var.f24497d;
        if (i10 != -1) {
            return i10;
        }
        int iR = 0;
        for (int i11 = 0; i11 < w2Var.f24494a; i11++) {
            int i12 = w2Var.f24495b[i11] >>> 3;
            i1 i1Var = (i1) w2Var.f24496c[i11];
            int iR2 = j1.R(8);
            int iR3 = j1.R(i12) + j1.R(16);
            int iR4 = j1.R(24);
            int iM = i1Var.m();
            iR = l1.d.r(iR2 + iR2, iR3, com.google.android.gms.internal.measurement.f2.d(iM, iM, iR4), iR);
        }
        w2Var.f24497d = iR;
        return iR;
    }

    @Override // com.google.android.gms.internal.play_billing.s2
    public final int e(t1 t1Var) {
        return t1Var.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.play_billing.s2
    public final void f(Object obj, h2 h2Var) {
        throw q4.a.h(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.s2
    public final void g(Object obj, byte[] bArr, int i10, int i11, ur1 ur1Var) {
        t1 t1Var = (t1) obj;
        if (t1Var.zzc == w2.f24493f) {
            t1Var.zzc = w2.b();
        }
        throw q4.a.h(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.s2
    public final boolean h(t1 t1Var, t1 t1Var2) {
        return t1Var.zzc.equals(t1Var2.zzc);
    }

    @Override // com.google.android.gms.internal.play_billing.s2
    public final t1 zze() {
        c1 c1Var = this.f24429a;
        return c1Var instanceof t1 ? (t1) ((t1) c1Var).d(4) : ((s1) ((t1) c1Var).d(5)).b();
    }
}
