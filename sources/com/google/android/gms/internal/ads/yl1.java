package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yl1 extends ss1 {
    private static final yl1 zza;
    private static volatile tt1 zzb;

    static {
        yl1 yl1Var = new yl1();
        zza = yl1Var;
        ss1.t(yl1.class, yl1Var);
    }

    public static yl1 A() {
        return zza;
    }

    public static void z(cs1 cs1Var, ks1 ks1Var) {
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zza, "\u0000\u0000", null);
        }
        if (iC == 3) {
            return new yl1();
        }
        if (iC == 4) {
            return new uk(zza);
        }
        if (iC == 5) {
            return zza;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzb;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (yl1.class) {
            try {
                rs1Var = zzb;
                if (rs1Var == null) {
                    rs1Var = new rs1(zza);
                    zzb = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }
}
