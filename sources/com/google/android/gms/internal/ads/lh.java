package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class lh extends ss1 {
    private static final lh zzf;
    private static volatile tt1 zzg;
    private int zza;
    private oh zzb;
    private cs1 zzc = cs1.f13248b;
    private long zzd;
    private long zze;

    static {
        lh lhVar = new lh();
        zzf = lhVar;
        ss1.t(lh.class, lhVar);
    }

    public static lh C() {
        return zzf;
    }

    public final cs1 A() {
        return this.zzc;
    }

    public final long B() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iC == 3) {
            return new lh();
        }
        if (iC == 4) {
            return new qd(zzf);
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
        synchronized (lh.class) {
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

    public final oh z() {
        oh ohVar = this.zzb;
        return ohVar == null ? oh.B() : ohVar;
    }
}
