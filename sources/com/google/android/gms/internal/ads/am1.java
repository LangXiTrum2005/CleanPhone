package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class am1 extends ss1 {
    private static final am1 zzd;
    private static volatile tt1 zze;
    private int zza;
    private cm1 zzb;
    private int zzc;

    static {
        am1 am1Var = new am1();
        zzd = am1Var;
        ss1.t(am1.class, am1Var);
    }

    public static am1 A(cs1 cs1Var, ks1 ks1Var) {
        return (am1) ss1.m(zzd, cs1Var, ks1Var);
    }

    public static zl1 B() {
        return (zl1) zzd.q();
    }

    public final /* synthetic */ void C(cm1 cm1Var) {
        this.zzb = cm1Var;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzd, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new am1();
        }
        if (iC == 4) {
            return new zl1(zzd);
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
        synchronized (am1.class) {
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

    public final cm1 z() {
        cm1 cm1Var = this.zzb;
        return cm1Var == null ? cm1.B() : cm1Var;
    }
}
