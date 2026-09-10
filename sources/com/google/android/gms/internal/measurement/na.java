package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class na extends i1 {
    private static final na zze;
    private static volatile j2 zzf;
    private s1 zzb = m2.f23723e;

    static {
        na naVar = new na();
        zze = naVar;
        i1.p(na.class, naVar);
    }

    public static na w() {
        return zze;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", oa.class});
        }
        if (i11 == 3) {
            return new na();
        }
        if (i11 == 4) {
            return new m8(zze);
        }
        if (i11 == 5) {
            return zze;
        }
        if (i11 != 6) {
            throw null;
        }
        j2 j2Var = zzf;
        if (j2Var != null) {
            return j2Var;
        }
        synchronized (na.class) {
            try {
                h1Var = zzf;
                if (h1Var == null) {
                    h1Var = new h1(zze);
                    zzf = h1Var;
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
}
