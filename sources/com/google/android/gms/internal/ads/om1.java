package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class om1 extends ss1 {
    private static final om1 zze;
    private static volatile tt1 zzf;
    private int zza;
    private int zzb;
    private sm1 zzc;
    private cs1 zzd = cs1.f13248b;

    static {
        om1 om1Var = new om1();
        zze = om1Var;
        ss1.t(om1.class, om1Var);
    }

    public static om1 C(cs1 cs1Var, ks1 ks1Var) {
        return (om1) ss1.m(zze, cs1Var, ks1Var);
    }

    public static nm1 D() {
        return (nm1) zze.q();
    }

    public static om1 E() {
        return zze;
    }

    public static tt1 F() {
        return zze.o();
    }

    public final sm1 A() {
        sm1 sm1Var = this.zzc;
        return sm1Var == null ? sm1.C() : sm1Var;
    }

    public final cs1 B() {
        return this.zzd;
    }

    public final /* synthetic */ void G(sm1 sm1Var) {
        this.zzc = sm1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void H(cs1 cs1Var) {
        cs1Var.getClass();
        this.zzd = cs1Var;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iC == 3) {
            return new om1();
        }
        if (iC == 4) {
            return new nm1(zze);
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
        synchronized (om1.class) {
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
