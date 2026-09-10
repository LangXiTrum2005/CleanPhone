package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class gm1 extends ss1 {
    private static final gm1 zzf;
    private static volatile tt1 zzg;
    private int zza;
    private int zzb;
    private cm1 zzc;
    private cs1 zzd;
    private cs1 zze;

    static {
        gm1 gm1Var = new gm1();
        zzf = gm1Var;
        ss1.t(gm1.class, gm1Var);
    }

    public gm1() {
        as1 as1Var = cs1.f13248b;
        this.zzd = as1Var;
        this.zze = as1Var;
    }

    public static gm1 D(cs1 cs1Var, ks1 ks1Var) {
        return (gm1) ss1.m(zzf, cs1Var, ks1Var);
    }

    public static fm1 E() {
        return (fm1) zzf.q();
    }

    public static gm1 F() {
        return zzf;
    }

    public static tt1 G() {
        return zzf.o();
    }

    public final cm1 A() {
        cm1 cm1Var = this.zzc;
        return cm1Var == null ? cm1.B() : cm1Var;
    }

    public final cs1 B() {
        return this.zzd;
    }

    public final cs1 C() {
        return this.zze;
    }

    public final /* synthetic */ void H(cm1 cm1Var) {
        this.zzc = cm1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void I(cs1 cs1Var) {
        cs1Var.getClass();
        this.zzd = cs1Var;
    }

    public final /* synthetic */ void J(as1 as1Var) {
        as1Var.getClass();
        this.zze = as1Var;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iC == 3) {
            return new gm1();
        }
        if (iC == 4) {
            return new fm1(zzf);
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
        synchronized (gm1.class) {
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

    public final int z() {
        return this.zzb;
    }
}
