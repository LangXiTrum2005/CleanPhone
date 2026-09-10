package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z9 extends i1 {
    private static final z9 zzh;
    private static volatile j2 zzi;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private j9 zzg;

    static {
        z9 z9Var = new z9();
        zzh = z9Var;
        i1.p(z9.class, z9Var);
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i10) {
        j2 h1Var;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new n2(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new z9();
        }
        if (i11 == 4) {
            return new m8(zzh);
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
        synchronized (z9.class) {
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
}
