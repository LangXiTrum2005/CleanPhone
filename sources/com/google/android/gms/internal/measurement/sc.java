package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class sc extends i1 {
    private static final sc zzf;
    private static volatile j2 zzg;
    private int zzb;
    private boolean zze;

    static {
        sc scVar = new sc();
        zzf = scVar;
        i1.p(sc.class, scVar);
    }

    public static sc v() {
        return zzf;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zzf, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzb", "zze"});
        }
        if (i11 == 3) {
            return new sc();
        }
        if (i11 == 4) {
            return new m8(zzf);
        }
        if (i11 == 5) {
            return zzf;
        }
        if (i11 != 6) {
            throw null;
        }
        j2 j2Var = zzg;
        if (j2Var != null) {
            return j2Var;
        }
        synchronized (sc.class) {
            try {
                h1Var = zzg;
                if (h1Var == null) {
                    h1Var = new h1(zzf);
                    zzg = h1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return h1Var;
    }

    public final boolean u() {
        return this.zze;
    }
}
