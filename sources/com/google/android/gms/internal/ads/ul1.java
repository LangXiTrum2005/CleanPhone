package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ul1 extends ss1 {
    private static final ul1 zzc;
    private static volatile tt1 zzd;
    private int zza;
    private int zzb;

    static {
        ul1 ul1Var = new ul1();
        zzc = ul1Var;
        ss1.t(ul1.class, ul1Var);
    }

    public static ul1 B(cs1 cs1Var, ks1 ks1Var) {
        return (ul1) ss1.m(zzc, cs1Var, ks1Var);
    }

    public static tl1 C() {
        return (tl1) zzc.q();
    }

    public final int A() {
        return this.zzb;
    }

    public final /* synthetic */ void D(int i10) {
        this.zza = i10;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzb", "zza"});
        }
        if (iC == 3) {
            return new ul1();
        }
        if (iC == 4) {
            return new tl1(zzc);
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
        synchronized (ul1.class) {
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

    public final int z() {
        return this.zza;
    }
}
