package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class le extends ss1 {
    private static final le zzc;
    private static volatile tt1 zzd;
    private zs1 zza;
    private zs1 zzb;

    static {
        le leVar = new le();
        zzc = leVar;
        ss1.t(le.class, leVar);
    }

    public le() {
        jt1 jt1Var = jt1.f16181e;
        this.zza = jt1Var;
        this.zzb = jt1Var;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzc, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001%\u0002%", new Object[]{"zza", "zzb"});
        }
        if (iC == 3) {
            return new le();
        }
        if (iC == 4) {
            return new qd(zzc);
        }
        if (iC == 5) {
            return zzc;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzd;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (le.class) {
            try {
                rs1Var = zzd;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzc);
                    zzd = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }
}
