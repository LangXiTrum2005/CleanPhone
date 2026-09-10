package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class kh extends ss1 {
    private static final kh zzd;
    private static volatile tt1 zze;
    private int zza;
    private lh zzb;
    private cs1 zzc = cs1.f13248b;

    static {
        kh khVar = new kh();
        zzd = khVar;
        ss1.t(kh.class, khVar);
    }

    public static kh D() {
        return zzd;
    }

    public final lh A() {
        lh lhVar = this.zzb;
        return lhVar == null ? lh.C() : lhVar;
    }

    public final boolean B() {
        return (this.zza & 2) != 0;
    }

    public final cs1 C() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new kh();
        }
        if (iC == 4) {
            return new qd(zzd);
        }
        if (iC == 5) {
            return zzd;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zze;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (kh.class) {
            try {
                rs1Var = zze;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzd);
                    zze = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }

    public final boolean z() {
        return (this.zza & 1) != 0;
    }
}
