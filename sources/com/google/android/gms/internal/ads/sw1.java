package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class sw1 extends ss1 {
    private static final sw1 zzj;
    private static volatile tt1 zzk;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private at1 zzd;
    private at1 zze;
    private at1 zzf;
    private int zzg;
    private lw1 zzh;
    private String zzi;

    static {
        sw1 sw1Var = new sw1();
        zzj = sw1Var;
        ss1.t(sw1.class, sw1Var);
    }

    public sw1() {
        wt1 wt1Var = wt1.f21606e;
        this.zzd = wt1Var;
        this.zze = wt1Var;
        this.zzf = wt1Var;
        this.zzg = -1;
        this.zzi = "";
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzj, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0003\u0000\u0001ဈ\u0001\u0002\u001b\u0003\u001b\u0004င\u0002\u0005ဈ\u0000\b\u001b\tဈ\u0004\nဉ\u0003", new Object[]{"zza", "zzc", "zzd", nw1.class, "zze", qw1.class, "zzg", "zzb", "zzf", ww1.class, "zzi", "zzh"});
        }
        if (iC == 3) {
            return new sw1();
        }
        if (iC == 4) {
            return new fu1(zzj);
        }
        if (iC == 5) {
            return zzj;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzk;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (sw1.class) {
            try {
                rs1Var = zzk;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzj);
                    zzk = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }
}
