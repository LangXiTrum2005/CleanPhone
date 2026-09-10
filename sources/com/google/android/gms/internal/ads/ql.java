package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ql extends ss1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final ql zzj;
    private static volatile tt1 zzk;
    private int zze;
    private ol zzf;
    private at1 zzg = wt1.f21606e;
    private int zzh;
    private fk zzi;

    static {
        ql qlVar = new ql();
        zzj = qlVar;
        ss1.t(ql.class, qlVar);
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzj, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", ek.class, "zzh", nd.f17775x, "zzi"});
        }
        if (iC == 3) {
            return new ql();
        }
        if (iC == 4) {
            return new uk(zzj);
        }
        if (iC == 5) {
            return zzj;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzk;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (ql.class) {
            try {
                rs1Var = zzk;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzj);
                    zzk = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }
}
