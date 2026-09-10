package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class sm1 extends ss1 {
    private static final sm1 zzc;
    private static volatile tt1 zzd;
    private int zza;
    private int zzb;

    static {
        sm1 sm1Var = new sm1();
        zzc = sm1Var;
        ss1.t(sm1.class, sm1Var);
    }

    public static rm1 B() {
        return (rm1) zzc.q();
    }

    public static sm1 C() {
        return zzc;
    }

    public final int A() {
        return this.zzb;
    }

    public final /* synthetic */ void D(mm1 mm1Var) {
        this.zza = mm1Var.zza();
    }

    public final /* synthetic */ void E(int i10) {
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zza", "zzb"});
        }
        if (iC == 3) {
            return new sm1();
        }
        if (iC == 4) {
            return new rm1(zzc);
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
        synchronized (sm1.class) {
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

    public final mm1 z() {
        mm1 mm1VarA = mm1.a(this.zza);
        return mm1VarA == null ? mm1.UNRECOGNIZED : mm1VarA;
    }
}
