package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class cm1 extends ss1 {
    private static final cm1 zzd;
    private static volatile tt1 zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        cm1 cm1Var = new cm1();
        zzd = cm1Var;
        ss1.t(cm1.class, cm1Var);
    }

    public static bm1 A() {
        return (bm1) zzd.q();
    }

    public static cm1 B() {
        return zzd;
    }

    public final /* synthetic */ void C(mm1 mm1Var) {
        this.zza = mm1Var.zza();
    }

    public final int D() {
        int i10 = this.zzb;
        int i11 = 2;
        if (i10 != 0) {
            if (i10 == 2) {
                i11 = 4;
            } else if (i10 == 3) {
                i11 = 5;
            } else if (i10 != 4) {
                i11 = i10 != 5 ? 0 : 7;
            } else {
                i11 = 6;
            }
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final int E() {
        int i10 = this.zzc;
        int i11 = 2;
        if (i10 != 0) {
            if (i10 != 1) {
                i11 = i10 != 2 ? 0 : 4;
            } else {
                i11 = 3;
            }
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final void F(int i10) {
        if (i10 != 1) {
            this.zzb = i10 - 2;
        } else {
            bt1.a();
            throw null;
        }
    }

    public final void G(int i10) {
        if (i10 != 1) {
            this.zzc = i10 - 2;
        } else {
            bt1.a();
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iC == 3) {
            return new cm1();
        }
        if (iC == 4) {
            return new bm1(zzd);
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
        synchronized (cm1.class) {
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
