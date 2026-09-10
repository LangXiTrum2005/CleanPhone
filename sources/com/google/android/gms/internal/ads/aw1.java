package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class aw1 extends ss1 {
    private static final aw1 zzf;
    private static volatile tt1 zzg;
    private int zza;
    private String zzb = "";
    private at1 zzc;
    private at1 zzd;
    private String zze;

    static {
        aw1 aw1Var = new aw1();
        zzf = aw1Var;
        ss1.t(aw1.class, aw1Var);
    }

    public aw1() {
        wt1 wt1Var = wt1.f21606e;
        this.zzc = wt1Var;
        this.zzd = wt1Var;
        this.zze = "";
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001a\u0004ဈ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iC == 3) {
            return new aw1();
        }
        if (iC == 4) {
            return new fu1(zzf);
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
        synchronized (aw1.class) {
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
