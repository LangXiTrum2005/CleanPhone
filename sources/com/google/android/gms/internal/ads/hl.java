package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class hl extends ss1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final hl zzn;
    private static volatile tt1 zzo;
    private int zzg;
    private int zzh;
    private fk zzi;
    private fk zzj;
    private fk zzk;
    private at1 zzl = wt1.f21606e;
    private int zzm;

    static {
        hl hlVar = new hl();
        zzn = hlVar;
        ss1.t(hl.class, hlVar);
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzn, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzg", "zzh", "zzi", "zzj", "zzk", "zzl", fk.class, "zzm"});
        }
        if (iC == 3) {
            return new hl();
        }
        if (iC == 4) {
            return new uk(zzn);
        }
        if (iC == 5) {
            return zzn;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzo;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (hl.class) {
            try {
                rs1Var = zzo;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzn);
                    zzo = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }
}
