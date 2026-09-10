package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class se extends ss1 {
    private static final se zze;
    private static volatile tt1 zzf;
    private int zza;
    private long zzb;
    private String zzc = "";
    private cs1 zzd = cs1.f13248b;

    static {
        se seVar = new se();
        zze = seVar;
        ss1.t(se.class, seVar);
    }

    public static se D() {
        return zze;
    }

    public final long A() {
        return this.zzb;
    }

    public final String B() {
        return this.zzc;
    }

    public final cs1 C() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zze, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iC == 3) {
            return new se();
        }
        if (iC == 4) {
            return new qd(zze);
        }
        if (iC == 5) {
            return zze;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzf;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (se.class) {
            try {
                rs1Var = zzf;
                if (rs1Var == null) {
                    rs1Var = new rs1(zze);
                    zzf = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }

    public final boolean z() {
        return (this.zza & 1) != 0;
    }
}
