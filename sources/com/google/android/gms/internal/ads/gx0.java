package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class gx0 extends ss1 {
    private static final gx0 zzf;
    private static volatile tt1 zzg;
    private long zza;
    private long zzb;
    private at1 zzc;
    private at1 zzd;
    private at1 zze;

    static {
        gx0 gx0Var = new gx0();
        zzf = gx0Var;
        ss1.t(gx0.class, gx0Var);
    }

    public gx0() {
        wt1 wt1Var = wt1.f21606e;
        this.zzc = wt1Var;
        this.zzd = wt1Var;
        this.zze = wt1Var;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzf, "\u0004\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0003\u0000\u0001\u0002\u0002\u0002\u0003Ț\u0004Ț\u0005Ț", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iC == 3) {
            return new gx0();
        }
        if (iC == 4) {
            return new uk(zzf);
        }
        if (iC == 5) {
            return zzf;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzg;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (gx0.class) {
            try {
                rs1Var = zzg;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzf);
                    zzg = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }
}
