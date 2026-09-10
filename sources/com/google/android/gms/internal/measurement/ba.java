package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ba extends i1 {
    private static final ba zzi;
    private static volatile j2 zzj;
    private int zzb;
    private s1 zze = m2.f23723e;
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        ba baVar = new ba();
        zzi = baVar;
        i1.p(ba.class, baVar);
    }

    public static aa B() {
        return (aa) zzi.k();
    }

    public static aa C(ba baVar) {
        g1 g1VarK = zzi.k();
        g1VarK.g(baVar);
        return (aa) g1VarK;
    }

    public final String A() {
        return this.zzg;
    }

    public final /* synthetic */ void D(int i10, da daVar) {
        J();
        this.zze.set(i10, daVar);
    }

    public final /* synthetic */ void E(da daVar) {
        J();
        this.zze.add(daVar);
    }

    public final /* synthetic */ void F(ArrayList arrayList) {
        J();
        l0.d(arrayList, this.zze);
    }

    public final void G() {
        this.zze = m2.f23723e;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final /* synthetic */ void I(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzg = str;
    }

    public final void J() {
        s1 s1Var = this.zze;
        if (((m0) s1Var).f23719a) {
            return;
        }
        this.zze = f2.f(s1Var);
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zzi, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zze", da.class, "zzf", "zzg", "zzh", i0.f23564k});
        }
        if (i11 == 3) {
            return new ba();
        }
        if (i11 == 4) {
            return new aa(zzi);
        }
        if (i11 == 5) {
            return zzi;
        }
        if (i11 != 6) {
            throw null;
        }
        j2 j2Var = zzj;
        if (j2Var != null) {
            return j2Var;
        }
        synchronized (ba.class) {
            try {
                h1Var = zzj;
                if (h1Var == null) {
                    h1Var = new h1(zzi);
                    zzj = h1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return h1Var;
    }

    public final List u() {
        return this.zze;
    }

    public final int v() {
        return this.zze.size();
    }

    public final da w(int i10) {
        return (da) this.zze.get(i10);
    }

    public final boolean x() {
        return (this.zzb & 1) != 0;
    }

    public final String y() {
        return this.zzf;
    }

    public final boolean z() {
        return (this.zzb & 2) != 0;
    }
}
