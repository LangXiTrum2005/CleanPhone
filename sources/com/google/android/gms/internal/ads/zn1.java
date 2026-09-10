package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zn1 extends ss1 {
    private static final zn1 zze;
    private static volatile tt1 zzf;
    private int zza;
    private bo1 zzb;
    private int zzc;
    private cs1 zzd = cs1.f13248b;

    static {
        zn1 zn1Var = new zn1();
        zze = zn1Var;
        ss1.t(zn1.class, zn1Var);
    }

    public static zn1 C(cs1 cs1Var, ks1 ks1Var) {
        return (zn1) ss1.m(zze, cs1Var, ks1Var);
    }

    public static yn1 D() {
        return (yn1) zze.q();
    }

    public final int A() {
        return this.zzc;
    }

    public final cs1 B() {
        return this.zzd;
    }

    public final /* synthetic */ void E(bo1 bo1Var) {
        this.zzb = bo1Var;
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
            return new zn1();
        }
        if (iC == 4) {
            return new yn1(zze);
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
        synchronized (zn1.class) {
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

    public final bo1 z() {
        bo1 bo1Var = this.zzb;
        return bo1Var == null ? bo1.D() : bo1Var;
    }
}
