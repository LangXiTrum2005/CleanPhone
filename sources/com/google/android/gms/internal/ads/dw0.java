package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class dw0 extends ss1 {
    private static final dw0 zzc;
    private static volatile tt1 zzd;
    private int zza;
    private long zzb;

    static {
        dw0 dw0Var = new dw0();
        zzc = dw0Var;
        ss1.t(dw0.class, dw0Var);
    }

    public static cw0 z() {
        return (cw0) zzc.q();
    }

    public final /* synthetic */ void A(long j10) {
        this.zzb = j10;
    }

    public final /* synthetic */ void B(int i10) {
        this.zza = i10 - 2;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"zza", "zzb"});
        }
        if (iC == 3) {
            return new dw0();
        }
        if (iC == 4) {
            return new cw0(zzc);
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
        synchronized (dw0.class) {
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
