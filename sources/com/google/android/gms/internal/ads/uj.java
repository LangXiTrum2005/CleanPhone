package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class uj extends ss1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final uj zzf;
    private static volatile tt1 zzg;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        uj ujVar = new uj();
        zzf = ujVar;
        ss1.t(uj.class, ujVar);
    }

    public static tj z() {
        return (tj) zzf.q();
    }

    public final void A(int i10) {
        this.zzd = v0.i.c(i10);
        this.zzc |= 1;
    }

    public final void B(int i10) {
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            if (i10 != 3) {
                i11 = 4;
                if (i10 != 4) {
                    throw null;
                }
            } else {
                i11 = 2;
            }
        }
        this.zze = i11;
        this.zzc |= 2;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzc", "zzd", nd.f17769r, "zze", nd.f17768q});
        }
        if (iC == 3) {
            return new uj();
        }
        if (iC == 4) {
            return new tj(zzf);
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
        synchronized (uj.class) {
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
}
