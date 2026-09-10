package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class td extends ss1 {
    private static final td zzg;
    private static volatile tt1 zzh;
    private int zza;
    private boolean zzb;
    private int zzc = 5000;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    static {
        td tdVar = new td();
        zzg = tdVar;
        ss1.t(td.class, tdVar);
    }

    public static td C() {
        return zzg;
    }

    public final int A() {
        return this.zzc;
    }

    public final boolean B() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzg, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iC == 3) {
            return new td();
        }
        if (iC == 4) {
            return new qd(zzg);
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
        synchronized (td.class) {
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

    public final boolean z() {
        return this.zzb;
    }
}
