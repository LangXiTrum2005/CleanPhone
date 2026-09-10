package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qw0 extends ss1 {
    private static final qw0 zzc;
    private static volatile tt1 zzd;
    private int zza;
    private nw0 zzb;

    static {
        qw0 qw0Var = new qw0();
        zzc = qw0Var;
        ss1.t(qw0.class, qw0Var);
    }

    public static pw0 z() {
        return (pw0) zzc.q();
    }

    public final /* synthetic */ void A(nw0 nw0Var) {
        this.zzb = nw0Var;
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
            return new xt1(zzc, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iC == 3) {
            return new qw0();
        }
        if (iC == 4) {
            return new pw0(zzc);
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
        synchronized (qw0.class) {
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
