package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class kl1 extends ss1 {
    private static final kl1 zzd;
    private static volatile tt1 zze;
    private int zza;
    private ml1 zzb;
    private int zzc;

    static {
        kl1 kl1Var = new kl1();
        zzd = kl1Var;
        ss1.t(kl1.class, kl1Var);
    }

    public static kl1 B(cs1 cs1Var, ks1 ks1Var) {
        return (kl1) ss1.m(zzd, cs1Var, ks1Var);
    }

    public static jl1 C() {
        return (jl1) zzd.q();
    }

    public final int A() {
        return this.zzc;
    }

    public final /* synthetic */ void D(ml1 ml1Var) {
        this.zzb = ml1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void E(int i10) {
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
            return new xt1(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new kl1();
        }
        if (iC == 4) {
            return new jl1(zzd);
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
        synchronized (kl1.class) {
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

    public final ml1 z() {
        ml1 ml1Var = this.zzb;
        return ml1Var == null ? ml1.B() : ml1Var;
    }
}
