package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bx0 extends ss1 {
    private static final bx0 zzg;
    private static volatile tt1 zzh;
    private int zzb;
    private int zzc;
    private boolean zzd;
    private boolean zzf;
    private String zza = "";
    private String zze = "";

    static {
        bx0 bx0Var = new bx0();
        zzg = bx0Var;
        ss1.t(bx0.class, bx0Var);
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzg, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0007\u0005Ȉ\u0006\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iC == 3) {
            return new bx0();
        }
        if (iC == 4) {
            return new uk(zzg);
        }
        if (iC == 5) {
            return zzg;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzh;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (bx0.class) {
            try {
                rs1Var = zzh;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzg);
                    zzh = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }
}
