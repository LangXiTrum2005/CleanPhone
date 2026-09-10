package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class an1 extends ss1 {
    private static final an1 zzf;
    private static volatile tt1 zzg;
    private int zza;
    private um1 zzb;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        an1 an1Var = new an1();
        zzf = an1Var;
        ss1.t(an1.class, an1Var);
    }

    public static zm1 D() {
        return (zm1) zzf.q();
    }

    public final um1 A() {
        um1 um1Var = this.zzb;
        return um1Var == null ? um1.D() : um1Var;
    }

    public final int B() {
        return this.zzd;
    }

    public final on1 C() {
        on1 on1VarA = on1.a(this.zze);
        return on1VarA == null ? on1.UNRECOGNIZED : on1VarA;
    }

    public final /* synthetic */ void E(um1 um1Var) {
        this.zzb = um1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void F(int i10) {
        this.zzd = i10;
    }

    public final /* synthetic */ void G(on1 on1Var) {
        this.zze = on1Var.zza();
    }

    public final int H() {
        int i10 = this.zzc;
        int i11 = 2;
        if (i10 != 0) {
            if (i10 == 1) {
                i11 = 3;
            } else if (i10 != 2) {
                i11 = i10 != 3 ? 0 : 5;
            } else {
                i11 = 4;
            }
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final void I(int i10) {
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
            return new xt1(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iC == 3) {
            return new an1();
        }
        if (iC == 4) {
            return new zm1(zzf);
        }
        if (iC == 5) {
            return zzf;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzg;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (an1.class) {
            try {
                rs1Var = zzg;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzf);
                    zzg = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }

    public final boolean z() {
        return (this.zza & 1) != 0;
    }
}
