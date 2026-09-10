package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i31 extends ss1 {
    private static final i31 zzf;
    private static volatile tt1 zzg;
    private int zza;
    private l31 zzb;
    private cs1 zzc;
    private cs1 zzd;
    private int zze;

    static {
        i31 i31Var = new i31();
        zzf = i31Var;
        ss1.t(i31.class, i31Var);
    }

    public i31() {
        as1 as1Var = cs1.f13248b;
        this.zzc = as1Var;
        this.zzd = as1Var;
    }

    public static h31 C() {
        return (h31) zzf.q();
    }

    public final cs1 A() {
        return this.zzc;
    }

    public final cs1 B() {
        return this.zzd;
    }

    public final /* synthetic */ void D(l31 l31Var) {
        this.zzb = l31Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void E(cs1 cs1Var) {
        cs1Var.getClass();
        this.zza |= 2;
        this.zzc = cs1Var;
    }

    public final /* synthetic */ void F(cs1 cs1Var) {
        cs1Var.getClass();
        this.zza |= 4;
        this.zzd = cs1Var;
    }

    public final int G() {
        int iA = dv.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final /* synthetic */ void H(int i10) {
        this.zze = i10 - 1;
        this.zza |= 8;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002\u0004᠌\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", nd.B});
        }
        if (iC == 3) {
            return new i31();
        }
        if (iC == 4) {
            return new h31(zzf);
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
        synchronized (i31.class) {
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

    public final l31 z() {
        l31 l31Var = this.zzb;
        return l31Var == null ? l31.F() : l31Var;
    }
}
