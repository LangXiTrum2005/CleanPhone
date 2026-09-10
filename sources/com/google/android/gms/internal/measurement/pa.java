package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class pa extends i1 {
    private static final pa zzg;
    private static volatile j2 zzh;
    private int zzb;
    private s1 zze = m2.f23723e;
    private na zzf;

    static {
        pa paVar = new pa();
        zzg = paVar;
        i1.p(pa.class, paVar);
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zze", qa.class, "zzf"});
        }
        if (i11 == 3) {
            return new pa();
        }
        if (i11 == 4) {
            return new m8(zzg);
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
        synchronized (pa.class) {
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

    public final na v() {
        na naVar = this.zzf;
        return naVar == null ? na.w() : naVar;
    }
}
