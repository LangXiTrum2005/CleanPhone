package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class hk extends ss1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final hk zzh;
    private static volatile tt1 zzi;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        hk hkVar = new hk();
        zzh = hkVar;
        ss1.t(hk.class, hkVar);
    }

    public static gk A() {
        return (gk) zzh.q();
    }

    public final void B(int i10) {
        this.zzd |= 1;
        this.zze = i10;
    }

    public final void C(int i10) {
        this.zzd |= 2;
        this.zzf = i10;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (iC == 3) {
            return new hk();
        }
        if (iC == 4) {
            return new gk(zzh);
        }
        if (iC == 5) {
            return zzh;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzi;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (hk.class) {
            try {
                rs1Var = zzi;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzh);
                    zzi = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }

    public final void z(int i10) {
        this.zzd |= 4;
        this.zzg = i10;
    }
}
