package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class hn1 extends ss1 {
    private static final hn1 zzd;
    private static volatile tt1 zze;
    private int zza;
    private int zzb;
    private jn1 zzc;

    static {
        hn1 hn1Var = new hn1();
        zzd = hn1Var;
        ss1.t(hn1.class, hn1Var);
    }

    public static hn1 B(cs1 cs1Var, ks1 ks1Var) {
        return (hn1) ss1.m(zzd, cs1Var, ks1Var);
    }

    public static gn1 C() {
        return (gn1) zzd.q();
    }

    public static tt1 D() {
        return zzd.o();
    }

    public final jn1 A() {
        jn1 jn1Var = this.zzc;
        return jn1Var == null ? jn1.C() : jn1Var;
    }

    public final /* synthetic */ void E(jn1 jn1Var) {
        this.zzc = jn1Var;
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
            return new hn1();
        }
        if (iC == 4) {
            return new gn1(zzd);
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
        synchronized (hn1.class) {
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
