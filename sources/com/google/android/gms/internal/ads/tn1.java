package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class tn1 extends ss1 {
    private static final tn1 zzb;
    private static volatile tt1 zzc;
    private int zza;

    static {
        tn1 tn1Var = new tn1();
        zzb = tn1Var;
        ss1.t(tn1.class, tn1Var);
    }

    public static sn1 A() {
        return (sn1) zzb.q();
    }

    public static tn1 B() {
        return zzb;
    }

    public final /* synthetic */ void C(mm1 mm1Var) {
        this.zza = mm1Var.zza();
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zza"});
        }
        if (iC == 3) {
            return new tn1();
        }
        if (iC == 4) {
            return new sn1(zzb);
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
        synchronized (tn1.class) {
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

    public final mm1 z() {
        mm1 mm1VarA = mm1.a(this.zza);
        return mm1VarA == null ? mm1.UNRECOGNIZED : mm1VarA;
    }
}
