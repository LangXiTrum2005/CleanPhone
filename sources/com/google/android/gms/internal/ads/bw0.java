package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bw0 extends ss1 {
    private static final bw0 zzg;
    private static volatile tt1 zzh;
    private long zza;
    private ws1 zzb = ts1.f20489e;
    private at1 zzc;
    private at1 zzd;
    private at1 zze;
    private at1 zzf;

    static {
        bw0 bw0Var = new bw0();
        zzg = bw0Var;
        ss1.t(bw0.class, bw0Var);
    }

    public bw0() {
        wt1 wt1Var = wt1.f21606e;
        this.zzc = wt1Var;
        this.zzd = wt1Var;
        this.zze = wt1Var;
        this.zzf = wt1Var;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzg, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0005\u0000\u0001\u0002\u0002,\u0003Ț\u0004Ț\u0005Ț\u0006Ț", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iC == 3) {
            return new bw0();
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
        synchronized (bw0.class) {
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
