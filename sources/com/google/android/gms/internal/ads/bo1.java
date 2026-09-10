package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bo1 extends ss1 {
    private static final bo1 zzd;
    private static volatile tt1 zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        bo1 bo1Var = new bo1();
        zzd = bo1Var;
        ss1.t(bo1.class, bo1Var);
    }

    public static ao1 C() {
        return (ao1) zzd.q();
    }

    public static bo1 D() {
        return zzd;
    }

    public final mm1 A() {
        mm1 mm1VarA = mm1.a(this.zzb);
        return mm1VarA == null ? mm1.UNRECOGNIZED : mm1VarA;
    }

    public final int B() {
        return this.zzc;
    }

    public final /* synthetic */ void E(mm1 mm1Var) {
        this.zza = mm1Var.zza();
    }

    public final /* synthetic */ void F(mm1 mm1Var) {
        this.zzb = mm1Var.zza();
    }

    public final /* synthetic */ void G(int i10) {
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
            return new xt1(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new bo1();
        }
        if (iC == 4) {
            return new ao1(zzd);
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
        synchronized (bo1.class) {
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

    public final mm1 z() {
        mm1 mm1VarA = mm1.a(this.zza);
        return mm1VarA == null ? mm1.UNRECOGNIZED : mm1VarA;
    }
}
