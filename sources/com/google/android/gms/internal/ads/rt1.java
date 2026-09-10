package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class rt1 implements bu1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rr1 f19666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s6 f19667b;

    public rt1(s6 s6Var, rr1 rr1Var) {
        wp1 wp1Var = ls1.f17120a;
        this.f19667b = s6Var;
        this.f19666a = rr1Var;
    }

    @Override // com.google.android.gms.internal.ads.bu1
    public final void a(Object obj) {
        this.f19667b.getClass();
        iu1 iu1Var = ((ss1) obj).zzt;
        if (iu1Var.f15853e) {
            iu1Var.f15853e = false;
        }
        wp1 wp1Var = ls1.f17120a;
        throw q4.a.h(obj);
    }

    @Override // com.google.android.gms.internal.ads.bu1
    public final void b(Object obj, Object obj2) {
        cu1.d(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.bu1
    public final boolean c(Object obj) {
        throw q4.a.h(obj);
    }

    @Override // com.google.android.gms.internal.ads.bu1
    public final void d(Object obj, androidx.datastore.preferences.protobuf.n nVar, ks1 ks1Var) {
        this.f19667b.getClass();
        s6.v(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.ads.bu1
    public final boolean e(ss1 ss1Var, ss1 ss1Var2) {
        return ss1Var.zzt.equals(ss1Var2.zzt);
    }

    @Override // com.google.android.gms.internal.ads.bu1
    public final int f(ss1 ss1Var) {
        iu1 iu1Var = ss1Var.zzt;
        int i10 = iu1Var.f15852d;
        if (i10 != -1) {
            return i10;
        }
        int iR = 0;
        for (int i11 = 0; i11 < iu1Var.f15849a; i11++) {
            int i12 = iu1Var.f15850b[i11] >>> 3;
            cs1 cs1Var = (cs1) iu1Var.f15851c[i11];
            int iP = is1.p(8);
            int iP2 = is1.p(i12) + is1.p(16);
            int iP3 = is1.p(24);
            int iQ = cs1Var.q();
            iR = l1.d.r(iP + iP, iP2, com.applovin.impl.ca.t(iQ, iQ, iP3), iR);
        }
        iu1Var.f15852d = iR;
        return iR;
    }

    @Override // com.google.android.gms.internal.ads.bu1
    public final int g(ss1 ss1Var) {
        return ss1Var.zzt.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.bu1
    public final void h(Object obj, byte[] bArr, int i10, int i11, ur1 ur1Var) {
        ss1 ss1Var = (ss1) obj;
        if (ss1Var.zzt == iu1.f15848f) {
            ss1Var.zzt = iu1.a();
        }
        throw q4.a.h(obj);
    }

    @Override // com.google.android.gms.internal.ads.bu1
    public final void i(Object obj, z61 z61Var) {
        throw q4.a.h(obj);
    }

    @Override // com.google.android.gms.internal.ads.bu1
    public final ss1 zza() {
        rr1 rr1Var = this.f19666a;
        return rr1Var instanceof ss1 ? ((ss1) rr1Var).p() : ((qs1) ((ss1) rr1Var).v(5, null)).c();
    }
}
