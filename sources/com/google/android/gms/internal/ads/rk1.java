package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class rk1 extends ss1 {
    private static final rk1 zze;
    private static volatile tt1 zzf;
    private int zza;
    private int zzb;
    private cs1 zzc = cs1.f13248b;
    private vk1 zzd;

    static {
        rk1 rk1Var = new rk1();
        zze = rk1Var;
        ss1.t(rk1.class, rk1Var);
    }

    public static rk1 C(cs1 cs1Var, ks1 ks1Var) {
        return (rk1) ss1.m(zze, cs1Var, ks1Var);
    }

    public static qk1 D() {
        return (qk1) zze.q();
    }

    public static tt1 E() {
        return zze.o();
    }

    public final cs1 A() {
        return this.zzc;
    }

    public final vk1 B() {
        vk1 vk1Var = this.zzd;
        return vk1Var == null ? vk1.B() : vk1Var;
    }

    public final /* synthetic */ void F(cs1 cs1Var) {
        cs1Var.getClass();
        this.zzc = cs1Var;
    }

    public final /* synthetic */ void G(vk1 vk1Var) {
        this.zzd = vk1Var;
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
            return new xt1(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iC == 3) {
            return new rk1();
        }
        if (iC == 4) {
            return new qk1(zze);
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
        synchronized (rk1.class) {
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
