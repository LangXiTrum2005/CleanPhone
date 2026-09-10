package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vu1 extends ss1 {
    private static final vu1 zzc;
    private static volatile tt1 zzd;
    private ws1 zza;
    private ws1 zzb;

    static {
        vu1 vu1Var = new vu1();
        zzc = vu1Var;
        ss1.t(vu1.class, vu1Var);
    }

    public vu1() {
        ts1 ts1Var = ts1.f20489e;
        this.zza = ts1Var;
        this.zzb = ts1Var;
    }

    public static vu1 z(byte[] bArr, ks1 ks1Var) {
        return (vu1) ss1.n(zzc, bArr, ks1Var);
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzc, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u0016\u0003\u0016", new Object[]{"zza", "zzb"});
        }
        if (iC == 3) {
            return new vu1();
        }
        if (iC == 4) {
            return new fu1(zzc);
        }
        if (iC == 5) {
            return zzc;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzd;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (vu1.class) {
            try {
                rs1Var = zzd;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzc);
                    zzd = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }
}
