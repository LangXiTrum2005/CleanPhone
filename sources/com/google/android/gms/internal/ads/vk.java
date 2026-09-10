package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vk extends ss1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final vk zzl;
    private static volatile tt1 zzm;
    private int zzf;
    private int zzg = 1000;
    private kk zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    static {
        vk vkVar = new vk();
        zzl = vkVar;
        ss1.t(vk.class, vkVar);
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzl, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzf", "zzg", nd.f17775x, "zzh", "zzi", "zzj", "zzk"});
        }
        if (iC == 3) {
            return new vk();
        }
        if (iC == 4) {
            return new uk(zzl);
        }
        if (iC == 5) {
            return zzl;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzm;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (vk.class) {
            try {
                rs1Var = zzm;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzl);
                    zzm = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }
}
