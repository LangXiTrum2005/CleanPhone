package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ln1 extends ss1 {
    private static final ln1 zzd;
    private static volatile tt1 zze;
    private int zza;
    private int zzb;
    private nn1 zzc;

    static {
        ln1 ln1Var = new ln1();
        zzd = ln1Var;
        ss1.t(ln1.class, ln1Var);
    }

    public static ln1 B(cs1 cs1Var, ks1 ks1Var) {
        return (ln1) ss1.m(zzd, cs1Var, ks1Var);
    }

    public static kn1 C() {
        return (kn1) zzd.q();
    }

    public static tt1 D() {
        return zzd.o();
    }

    public final nn1 A() {
        nn1 nn1Var = this.zzc;
        return nn1Var == null ? nn1.D() : nn1Var;
    }

    public final /* synthetic */ void E(nn1 nn1Var) {
        this.zzc = nn1Var;
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
            return new xt1(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new ln1();
        }
        if (iC == 4) {
            return new kn1(zzd);
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
        synchronized (ln1.class) {
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

    public final int z() {
        return this.zzb;
    }
}
