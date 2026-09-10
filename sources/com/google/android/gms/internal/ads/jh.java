package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class jh extends ss1 {
    private static final jh zze;
    private static volatile tt1 zzf;
    private int zza;
    private nh zzb;
    private cs1 zzc;
    private cs1 zzd;

    static {
        jh jhVar = new jh();
        zze = jhVar;
        ss1.t(jh.class, jhVar);
    }

    public jh() {
        as1 as1Var = cs1.f13248b;
        this.zzc = as1Var;
        this.zzd = as1Var;
    }

    public static jh C(as1 as1Var, ks1 ks1Var) {
        return (jh) ss1.m(zze, as1Var, ks1Var);
    }

    public static jh D(byte[] bArr, ks1 ks1Var) throws et1 {
        ss1 ss1VarX = ss1.x(zze, bArr, bArr.length, ks1Var);
        ss1.y(ss1VarX);
        return (jh) ss1VarX;
    }

    public final cs1 A() {
        return this.zzc;
    }

    public final cs1 B() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zze, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iC == 3) {
            return new jh();
        }
        if (iC == 4) {
            return new qd(zze);
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
        synchronized (jh.class) {
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

    public final nh z() {
        nh nhVar = this.zzb;
        return nhVar == null ? nh.H() : nhVar;
    }
}
