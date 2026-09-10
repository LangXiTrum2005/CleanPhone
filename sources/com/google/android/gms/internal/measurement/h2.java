package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.ur1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 implements o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f23534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1 f23535b;

    public h2(f1 f1Var, l0 l0Var) {
        f1 f1Var2 = a1.f23289a;
        this.f23535b = f1Var;
        this.f23534a = l0Var;
    }

    @Override // com.google.android.gms.internal.measurement.o2
    public final void a(Object obj) {
        this.f23535b.getClass();
        u2 u2Var = ((i1) obj).zzc;
        if (u2Var.f24018e) {
            u2Var.f24018e = false;
        }
        f1 f1Var = a1.f23289a;
        throw q4.a.h(obj);
    }

    @Override // com.google.android.gms.internal.measurement.o2
    public final void b(Object obj, Object obj2) {
        p2.b(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.o2
    public final boolean c(Object obj) {
        throw q4.a.h(obj);
    }

    @Override // com.google.android.gms.internal.measurement.o2
    public final void d(Object obj, q6 q6Var) {
        throw q4.a.h(obj);
    }

    @Override // com.google.android.gms.internal.measurement.o2
    public final void e(Object obj, androidx.datastore.preferences.protobuf.n nVar, z0 z0Var) {
        this.f23535b.getClass();
        f1.f(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.measurement.o2
    public final void f(Object obj, byte[] bArr, int i10, int i11, ur1 ur1Var) {
        i1 i1Var = (i1) obj;
        if (i1Var.zzc == u2.f24013f) {
            i1Var.zzc = u2.a();
        }
        throw q4.a.h(obj);
    }

    @Override // com.google.android.gms.internal.measurement.o2
    public final int g(i1 i1Var) {
        return i1Var.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.o2
    public final int h(l0 l0Var) {
        u2 u2Var = ((i1) l0Var).zzc;
        int i10 = u2Var.f24017d;
        if (i10 != -1) {
            return i10;
        }
        int iR = 0;
        for (int i11 = 0; i11 < u2Var.f24014a; i11++) {
            int i12 = u2Var.f24015b[i11] >>> 3;
            s0 s0Var = (s0) u2Var.f24016c[i11];
            int iP = x0.p(8);
            int iP2 = x0.p(i12) + x0.p(16);
            int iP3 = x0.p(24);
            int iH = s0Var.h();
            iR = l1.d.r(iP + iP, iP2, com.applovin.impl.ca.y(iH, iH, iP3), iR);
        }
        u2Var.f24017d = iR;
        return iR;
    }

    @Override // com.google.android.gms.internal.measurement.o2
    public final boolean i(i1 i1Var, i1 i1Var2) {
        return i1Var.zzc.equals(i1Var2.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.o2
    public final i1 zza() {
        l0 l0Var = this.f23534a;
        return l0Var instanceof i1 ? ((i1) l0Var).i() : ((g1) ((i1) l0Var).t(5)).e();
    }
}
