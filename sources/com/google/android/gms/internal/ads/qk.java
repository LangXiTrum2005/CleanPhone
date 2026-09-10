package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qk extends ss1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final qk zzf;
    private static volatile tt1 zzg;
    private int zzc;
    private boolean zzd;
    private int zze;

    static {
        qk qkVar = new qk();
        zzf = qkVar;
        ss1.t(qk.class, qkVar);
    }

    public static qk A() {
        return zzf;
    }

    public static pk z() {
        return (pk) zzf.q();
    }

    public final void B(boolean z10) {
        this.zzc |= 1;
        this.zzd = z10;
    }

    public final void C(int i10) {
        this.zzc |= 2;
        this.zze = i10;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iC == 3) {
            return new qk();
        }
        if (iC == 4) {
            return new pk(zzf);
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
        synchronized (qk.class) {
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
