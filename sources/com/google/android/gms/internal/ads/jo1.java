package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class jo1 extends ss1 {
    private static final jo1 zzd;
    private static volatile tt1 zze;
    private int zza;
    private int zzb;
    private lo1 zzc;

    static {
        jo1 jo1Var = new jo1();
        zzd = jo1Var;
        ss1.t(jo1.class, jo1Var);
    }

    public static jo1 B(cs1 cs1Var, ks1 ks1Var) {
        return (jo1) ss1.m(zzd, cs1Var, ks1Var);
    }

    public static io1 C() {
        return (io1) zzd.q();
    }

    public final lo1 A() {
        lo1 lo1Var = this.zzc;
        return lo1Var == null ? lo1.B() : lo1Var;
    }

    public final /* synthetic */ void D(lo1 lo1Var) {
        this.zzc = lo1Var;
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
            return new xt1(zzd, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new jo1();
        }
        if (iC == 4) {
            return new io1(zzd);
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
        synchronized (jo1.class) {
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

    public final int z() {
        return this.zzb;
    }
}
