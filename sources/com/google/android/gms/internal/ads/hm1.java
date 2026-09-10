package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class hm1 extends ss1 {
    private static final hm1 zzb;
    private static volatile tt1 zzc;
    private int zza;

    static {
        hm1 hm1Var = new hm1();
        zzb = hm1Var;
        ss1.t(hm1.class, hm1Var);
    }

    public static hm1 A(cs1 cs1Var, ks1 ks1Var) {
        return (hm1) ss1.m(zzb, cs1Var, ks1Var);
    }

    public static hm1 B() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (iC == 3) {
            return new hm1();
        }
        if (iC == 4) {
            return new uk(zzb);
        }
        if (iC == 5) {
            return zzb;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzc;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (hm1.class) {
            try {
                rs1Var = zzc;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzb);
                    zzc = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }

    public final int z() {
        return this.zza;
    }
}
