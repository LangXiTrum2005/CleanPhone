package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xk extends ss1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final xk zzn;
    private static volatile tt1 zzo;
    private int zzg;
    private int zzh = 1000;
    private kk zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;

    static {
        xk xkVar = new xk();
        zzn = xkVar;
        ss1.t(xk.class, xkVar);
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzn, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzg", "zzh", nd.f17775x, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (iC == 3) {
            return new xk();
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
        synchronized (xk.class) {
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
