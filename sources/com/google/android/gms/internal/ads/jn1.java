package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class jn1 extends ss1 {
    private static final jn1 zzb;
    private static volatile tt1 zzc;
    private String zza = "";

    static {
        jn1 jn1Var = new jn1();
        zzb = jn1Var;
        ss1.t(jn1.class, jn1Var);
    }

    public static jn1 A(cs1 cs1Var, ks1 ks1Var) {
        return (jn1) ss1.m(zzb, cs1Var, ks1Var);
    }

    public static in1 B() {
        return (in1) zzb.q();
    }

    public static jn1 C() {
        return zzb;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        if (iC == 3) {
            return new jn1();
        }
        if (iC == 4) {
            return new in1(zzb);
        }
        if (iC == 5) {
            return zzb;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzc;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (jn1.class) {
            try {
                rs1Var = zzc;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzb);
                    zzc = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }

    public final String z() {
        return this.zza;
    }
}
