package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class il1 extends ss1 {
    private static final il1 zze;
    private static volatile tt1 zzf;
    private int zza;
    private int zzb;
    private ml1 zzc;
    private cs1 zzd = cs1.f13248b;

    static {
        il1 il1Var = new il1();
        zze = il1Var;
        ss1.t(il1.class, il1Var);
    }

    public static il1 C(cs1 cs1Var, ks1 ks1Var) {
        return (il1) ss1.m(zze, cs1Var, ks1Var);
    }

    public static hl1 D() {
        return (hl1) zze.q();
    }

    public static tt1 E() {
        return zze.o();
    }

    public final ml1 A() {
        ml1 ml1Var = this.zzc;
        return ml1Var == null ? ml1.B() : ml1Var;
    }

    public final cs1 B() {
        return this.zzd;
    }

    public final /* synthetic */ void F(ml1 ml1Var) {
        this.zzc = ml1Var;
        this.zza |= 1;
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
            return new xt1(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iC == 3) {
            return new il1();
        }
        if (iC == 4) {
            return new hl1(zze);
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
        synchronized (il1.class) {
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
