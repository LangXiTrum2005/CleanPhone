package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class el extends ss1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final el zzh;
    private static volatile tt1 zzi;
    private int zzd;
    private String zze = "";
    private at1 zzf = wt1.f21606e;
    private int zzg;

    static {
        el elVar = new el();
        zzh = elVar;
        ss1.t(el.class, elVar);
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new Object[]{"zzd", "zze", "zzf", dl.class, "zzg", nd.f17775x});
        }
        if (iC == 3) {
            return new el();
        }
        if (iC == 4) {
            return new uk(zzh);
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
        synchronized (el.class) {
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
}
