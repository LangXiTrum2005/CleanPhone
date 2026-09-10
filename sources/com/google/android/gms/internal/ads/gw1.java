package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class gw1 extends ss1 {
    private static final gw1 zzh;
    private static volatile tt1 zzi;
    private int zza;
    private int zzb;
    private int zze;
    private String zzc = "";
    private ws1 zzd = ts1.f20489e;
    private at1 zzf = wt1.f21606e;
    private cs1 zzg = cs1.f13248b;

    static {
        gw1 gw1Var = new gw1();
        zzh = gw1Var;
        ss1.t(gw1.class, gw1Var);
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzh, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", fw1.class, "zzg"});
        }
        if (iC == 3) {
            return new gw1();
        }
        if (iC == 4) {
            return new fu1(zzh);
        }
        if (iC == 5) {
            return zzh;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzi;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (gw1.class) {
            try {
                rs1Var = zzi;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzh);
                    zzi = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }
}
