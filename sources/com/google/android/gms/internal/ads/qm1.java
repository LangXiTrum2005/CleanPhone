package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qm1 extends ss1 {
    private static final qm1 zze;
    private static volatile tt1 zzf;
    private int zza;
    private sm1 zzb;
    private int zzc;
    private int zzd;

    static {
        qm1 qm1Var = new qm1();
        zze = qm1Var;
        ss1.t(qm1.class, qm1Var);
    }

    public static qm1 C(cs1 cs1Var, ks1 ks1Var) {
        return (qm1) ss1.m(zze, cs1Var, ks1Var);
    }

    public static pm1 D() {
        return (pm1) zze.q();
    }

    public static qm1 E() {
        return zze;
    }

    public final int A() {
        return this.zzc;
    }

    public final int B() {
        return this.zzd;
    }

    public final /* synthetic */ void F(sm1 sm1Var) {
        this.zzb = sm1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void G(int i10) {
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iC == 3) {
            return new qm1();
        }
        if (iC == 4) {
            return new pm1(zze);
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
        synchronized (qm1.class) {
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

    public final sm1 z() {
        sm1 sm1Var = this.zzb;
        return sm1Var == null ? sm1.C() : sm1Var;
    }
}
