package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ad extends i1 {
    private static final ad zzg;
    private static volatile j2 zzh;
    private int zzb;
    private s1 zze = m2.f23723e;
    private String zzf = "";

    static {
        ad adVar = new ad();
        zzg = adVar;
        i1.p(ad.class, adVar);
    }

    public static ad v() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new ad();
        }
        if (i11 == 4) {
            return new zc(zzg);
        }
        if (i11 == 5) {
            return zzg;
        }
        if (i11 != 6) {
            throw null;
        }
        j2 j2Var = zzh;
        if (j2Var != null) {
            return j2Var;
        }
        synchronized (ad.class) {
            try {
                h1Var = zzh;
                if (h1Var == null) {
                    h1Var = new h1(zzg);
                    zzh = h1Var;
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

    public final void w(String str) {
        s1 s1Var = this.zze;
        if (!((m0) s1Var).f23719a) {
            this.zze = f2.f(s1Var);
        }
        this.zze.add("");
    }

    public final /* synthetic */ void x(String str) {
        this.zzb |= 1;
        this.zzf = "";
    }
}
