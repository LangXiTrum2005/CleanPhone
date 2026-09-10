package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ga extends i1 {
    private static final ga zzh;
    private static volatile j2 zzi;
    private r1 zzb;
    private r1 zze;
    private s1 zzf;
    private s1 zzg;

    static {
        ga gaVar = new ga();
        zzh = gaVar;
        i1.p(ga.class, gaVar);
    }

    public ga() {
        y1 y1Var = y1.f24163e;
        this.zzb = y1Var;
        this.zze = y1Var;
        m2 m2Var = m2.f23723e;
        this.zzf = m2Var;
        this.zzg = m2Var;
    }

    public static fa C() {
        return (fa) zzh.k();
    }

    public static ga D() {
        return zzh;
    }

    public final s1 A() {
        return this.zzg;
    }

    public final int B() {
        return this.zzg.size();
    }

    public final void E(Iterable iterable) {
        s1 s1Var = this.zzb;
        if (!((m0) s1Var).f23719a) {
            int size = s1Var.size();
            this.zzb = ((y1) s1Var).g(size + size);
        }
        l0.d(iterable, this.zzb);
    }

    public final void F() {
        this.zzb = y1.f24163e;
    }

    public final void G(List list) {
        s1 s1Var = this.zze;
        if (!((m0) s1Var).f23719a) {
            int size = s1Var.size();
            this.zze = ((y1) s1Var).g(size + size);
        }
        l0.d(list, this.zze);
    }

    public final void H() {
        this.zze = y1.f24163e;
    }

    public final void I(ArrayList arrayList) {
        s1 s1Var = this.zzf;
        if (!((m0) s1Var).f23719a) {
            this.zzf = f2.f(s1Var);
        }
        l0.d(arrayList, this.zzf);
    }

    public final void J() {
        this.zzf = m2.f23723e;
    }

    public final void K(Iterable iterable) {
        s1 s1Var = this.zzg;
        if (!((m0) s1Var).f23719a) {
            this.zzg = f2.f(s1Var);
        }
        l0.d(iterable, this.zzg);
    }

    public final void L() {
        this.zzg = m2.f23723e;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zzh, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zze", "zzf", t9.class, "zzg", ia.class});
        }
        if (i11 == 3) {
            return new ga();
        }
        if (i11 == 4) {
            return new fa(zzh);
        }
        if (i11 == 5) {
            return zzh;
        }
        if (i11 != 6) {
            throw null;
        }
        j2 j2Var = zzi;
        if (j2Var != null) {
            return j2Var;
        }
        synchronized (ga.class) {
            try {
                h1Var = zzi;
                if (h1Var == null) {
                    h1Var = new h1(zzh);
                    zzi = h1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return h1Var;
    }

    public final List u() {
        return this.zzb;
    }

    public final int v() {
        return this.zzb.size();
    }

    public final List w() {
        return this.zze;
    }

    public final int x() {
        return this.zze.size();
    }

    public final s1 y() {
        return this.zzf;
    }

    public final int z() {
        return this.zzf.size();
    }
}
