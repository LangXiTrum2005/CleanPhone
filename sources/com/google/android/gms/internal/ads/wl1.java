package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class wl1 extends ss1 {
    private static final wl1 zzc;
    private static volatile tt1 zzd;
    private int zza;
    private cs1 zzb = cs1.f13248b;

    static {
        wl1 wl1Var = new wl1();
        zzc = wl1Var;
        ss1.t(wl1.class, wl1Var);
    }

    public static wl1 B(cs1 cs1Var, ks1 ks1Var) {
        return (wl1) ss1.m(zzc, cs1Var, ks1Var);
    }

    public static vl1 C() {
        return (vl1) zzc.q();
    }

    public static tt1 D() {
        return zzc.o();
    }

    public final cs1 A() {
        return this.zzb;
    }

    public final /* synthetic */ void E(cs1 cs1Var) {
        cs1Var.getClass();
        this.zzb = cs1Var;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zza", "zzb"});
        }
        if (iC == 3) {
            return new wl1();
        }
        if (iC == 4) {
            return new vl1(zzc);
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
        synchronized (wl1.class) {
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
