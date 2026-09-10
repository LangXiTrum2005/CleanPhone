package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ne extends ss1 {
    private static final ne zzf;
    private static volatile tt1 zzg;
    private int zza;
    private cs1 zzb;
    private cs1 zzc;
    private cs1 zzd;
    private cs1 zze;

    static {
        ne neVar = new ne();
        zzf = neVar;
        ss1.t(ne.class, neVar);
    }

    public ne() {
        as1 as1Var = cs1.f13248b;
        this.zzb = as1Var;
        this.zzc = as1Var;
        this.zzd = as1Var;
        this.zze = as1Var;
    }

    public static ne D(byte[] bArr, ks1 ks1Var) throws et1 {
        ss1 ss1VarX = ss1.x(zzf, bArr, bArr.length, ks1Var);
        ss1.y(ss1VarX);
        return (ne) ss1VarX;
    }

    public static me E() {
        return (me) zzf.q();
    }

    public final cs1 A() {
        return this.zzc;
    }

    public final cs1 B() {
        return this.zzd;
    }

    public final cs1 C() {
        return this.zze;
    }

    public final /* synthetic */ void F(cs1 cs1Var) {
        cs1Var.getClass();
        this.zza |= 1;
        this.zzb = cs1Var;
    }

    public final /* synthetic */ void G(cs1 cs1Var) {
        cs1Var.getClass();
        this.zza |= 2;
        this.zzc = cs1Var;
    }

    public final /* synthetic */ void H(cs1 cs1Var) {
        cs1Var.getClass();
        this.zza |= 4;
        this.zzd = cs1Var;
    }

    public final /* synthetic */ void I(cs1 cs1Var) {
        cs1Var.getClass();
        this.zza |= 8;
        this.zze = cs1Var;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iC == 3) {
            return new ne();
        }
        if (iC == 4) {
            return new me(zzf);
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
        synchronized (ne.class) {
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

    public final cs1 z() {
        return this.zzb;
    }
}
