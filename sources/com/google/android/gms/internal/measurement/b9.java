package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b9 extends i1 {
    private static final b9 zzj;
    private static volatile j2 zzk;
    private int zzb;
    private int zze = 14;
    private int zzf = 11;
    private int zzg = 60;
    private int zzh = 13;
    private int zzi = 11;

    static {
        b9 b9Var = new b9();
        zzj = b9Var;
        i1.p(b9.class, b9Var);
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new b9();
        }
        if (i11 == 4) {
            return new m8(zzj);
        }
        if (i11 == 5) {
            return zzj;
        }
        if (i11 != 6) {
            throw null;
        }
        j2 j2Var = zzk;
        if (j2Var != null) {
            return j2Var;
        }
        synchronized (b9.class) {
            try {
                h1Var = zzk;
                if (h1Var == null) {
                    h1Var = new h1(zzj);
                    zzk = h1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return h1Var;
    }
}
