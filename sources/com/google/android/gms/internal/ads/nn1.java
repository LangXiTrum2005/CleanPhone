package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class nn1 extends ss1 {
    private static final nn1 zzd;
    private static volatile tt1 zze;
    private int zza;
    private String zzb = "";
    private wm1 zzc;

    static {
        nn1 nn1Var = new nn1();
        zzd = nn1Var;
        ss1.t(nn1.class, nn1Var);
    }

    public static nn1 B(cs1 cs1Var, ks1 ks1Var) {
        return (nn1) ss1.m(zzd, cs1Var, ks1Var);
    }

    public static mn1 C() {
        return (mn1) zzd.q();
    }

    public static nn1 D() {
        return zzd;
    }

    public final wm1 A() {
        wm1 wm1Var = this.zzc;
        return wm1Var == null ? wm1.E() : wm1Var;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zzb = str;
    }

    public final /* synthetic */ void F(wm1 wm1Var) {
        wm1Var.getClass();
        this.zzc = wm1Var;
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
            return new xt1(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new nn1();
        }
        if (iC == 4) {
            return new mn1(zzd);
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
        synchronized (nn1.class) {
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

    public final String z() {
        return this.zzb;
    }
}
