package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vn1 extends ss1 {
    private static final vn1 zzj;
    private static volatile tt1 zzk;
    private int zza;
    private int zzb;
    private xn1 zzc;
    private cs1 zzd;
    private cs1 zze;
    private cs1 zzf;
    private cs1 zzg;
    private cs1 zzh;
    private cs1 zzi;

    static {
        vn1 vn1Var = new vn1();
        zzj = vn1Var;
        ss1.t(vn1.class, vn1Var);
    }

    public vn1() {
        as1 as1Var = cs1.f13248b;
        this.zzd = as1Var;
        this.zze = as1Var;
        this.zzf = as1Var;
        this.zzg = as1Var;
        this.zzh = as1Var;
        this.zzi = as1Var;
    }

    public static vn1 H(cs1 cs1Var, ks1 ks1Var) {
        return (vn1) ss1.m(zzj, cs1Var, ks1Var);
    }

    public static un1 I() {
        return (un1) zzj.q();
    }

    public static tt1 J() {
        return zzj.o();
    }

    public final xn1 A() {
        xn1 xn1Var = this.zzc;
        return xn1Var == null ? xn1.F() : xn1Var;
    }

    public final cs1 B() {
        return this.zzd;
    }

    public final cs1 C() {
        return this.zze;
    }

    public final cs1 D() {
        return this.zzf;
    }

    public final cs1 E() {
        return this.zzg;
    }

    public final cs1 F() {
        return this.zzh;
    }

    public final cs1 G() {
        return this.zzi;
    }

    public final /* synthetic */ void K() {
        this.zzb = 0;
    }

    public final /* synthetic */ void L(xn1 xn1Var) {
        this.zzc = xn1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void M(as1 as1Var) {
        as1Var.getClass();
        this.zzd = as1Var;
    }

    public final /* synthetic */ void N(as1 as1Var) {
        as1Var.getClass();
        this.zze = as1Var;
    }

    public final /* synthetic */ void O(as1 as1Var) {
        as1Var.getClass();
        this.zzf = as1Var;
    }

    public final /* synthetic */ void P(as1 as1Var) {
        as1Var.getClass();
        this.zzg = as1Var;
    }

    public final /* synthetic */ void Q(as1 as1Var) {
        as1Var.getClass();
        this.zzh = as1Var;
    }

    public final /* synthetic */ void R(as1 as1Var) {
        as1Var.getClass();
        this.zzi = as1Var;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzj, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iC == 3) {
            return new vn1();
        }
        if (iC == 4) {
            return new un1(zzj);
        }
        if (iC == 5) {
            return zzj;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzk;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (vn1.class) {
            try {
                rs1Var = zzk;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzj);
                    zzk = rs1Var;
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
