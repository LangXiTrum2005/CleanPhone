package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class kk extends ss1 {
    public static final int zza = 1;
    private static final kk zzd;
    private static volatile tt1 zze;
    private int zzb;
    private int zzc;

    static {
        kk kkVar = new kk();
        zzd = kkVar;
        ss1.t(kk.class, kkVar);
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzd, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzb", "zzc", nd.f17771t});
        }
        if (iC == 3) {
            return new kk();
        }
        if (iC == 4) {
            return new qd(zzd);
        }
        if (iC == 5) {
            return zzd;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zze;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (kk.class) {
            try {
                rs1Var = zze;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzd);
                    zze = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }
}
