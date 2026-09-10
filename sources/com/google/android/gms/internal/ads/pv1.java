package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class pv1 extends ss1 {
    private static final pv1 zzi;
    private static volatile tt1 zzj;
    private int zza;
    private ov1 zzb;
    private cs1 zzd;
    private cs1 zze;
    private int zzf;
    private cs1 zzg;
    private byte zzh = 2;
    private at1 zzc = wt1.f21606e;

    static {
        pv1 pv1Var = new pv1();
        zzi = pv1Var;
        ss1.t(pv1.class, pv1Var);
    }

    public pv1() {
        as1 as1Var = cs1.f13248b;
        this.zzd = as1Var;
        this.zze = as1Var;
        this.zzg = as1Var;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        switch (v0.i.c(i10)) {
            case 0:
                return Byte.valueOf(this.zzh);
            case 1:
                this.zzh = ss1Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new xt1(zzi, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zza", "zzb", "zzc", kv1.class, "zzd", "zze", "zzf", "zzg"});
            case 3:
                return new pv1();
            case 4:
                return new fu1(zzi);
            case 5:
                return zzi;
            case 6:
                tt1 tt1Var = zzj;
                if (tt1Var != null) {
                    return tt1Var;
                }
                synchronized (pv1.class) {
                    try {
                        rs1Var = zzj;
                        if (rs1Var == null) {
                            rs1Var = new rs1(zzi);
                            zzj = rs1Var;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return rs1Var;
            default:
                throw null;
        }
    }
}
