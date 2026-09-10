package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yk1 extends ss1 {
    private static final yk1 zze;
    private static volatile tt1 zzf;
    private int zza;
    private int zzb;
    private cl1 zzc;
    private om1 zzd;

    static {
        yk1 yk1Var = new yk1();
        zze = yk1Var;
        ss1.t(yk1.class, yk1Var);
    }

    public static yk1 C(cs1 cs1Var, ks1 ks1Var) {
        return (yk1) ss1.m(zze, cs1Var, ks1Var);
    }

    public static xk1 D() {
        return (xk1) zze.q();
    }

    public static tt1 E() {
        return zze.o();
    }

    public final cl1 A() {
        cl1 cl1Var = this.zzc;
        return cl1Var == null ? cl1.D() : cl1Var;
    }

    public final om1 B() {
        om1 om1Var = this.zzd;
        return om1Var == null ? om1.E() : om1Var;
    }

    public final /* synthetic */ void F(cl1 cl1Var) {
        this.zzc = cl1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void G(om1 om1Var) {
        this.zzd = om1Var;
        this.zza |= 2;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iC == 3) {
            return new yk1();
        }
        if (iC == 4) {
            return new xk1(zze);
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
        synchronized (yk1.class) {
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

    public final int z() {
        return this.zzb;
    }
}
