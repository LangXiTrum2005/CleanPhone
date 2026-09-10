package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class rn1 extends ss1 {
    private static final rn1 zze;
    private static volatile tt1 zzf;
    private int zza;
    private tn1 zzb;
    private int zzc;
    private cs1 zzd = cs1.f13248b;

    static {
        rn1 rn1Var = new rn1();
        zze = rn1Var;
        ss1.t(rn1.class, rn1Var);
    }

    public static rn1 C(cs1 cs1Var, ks1 ks1Var) {
        return (rn1) ss1.m(zze, cs1Var, ks1Var);
    }

    public static qn1 D() {
        return (qn1) zze.q();
    }

    public final int A() {
        return this.zzc;
    }

    public final cs1 B() {
        return this.zzd;
    }

    public final /* synthetic */ void E(tn1 tn1Var) {
        this.zzb = tn1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void F(int i10) {
        this.zzc = i10;
    }

    public final /* synthetic */ void G(cs1 cs1Var) {
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
            return new xt1(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iC == 3) {
            return new rn1();
        }
        if (iC == 4) {
            return new qn1(zze);
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
        synchronized (rn1.class) {
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

    public final tn1 z() {
        tn1 tn1Var = this.zzb;
        return tn1Var == null ? tn1.B() : tn1Var;
    }
}
