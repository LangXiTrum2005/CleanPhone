package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ke extends ss1 {
    private static final ke zzn;
    private static volatile tt1 zzo;
    private int zza;
    private long zzb;
    private int zzc;
    private boolean zzd;
    private long zzf;
    private boolean zzg;
    private long zzi;
    private long zzj;
    private long zzk;
    private le zzl;
    private ws1 zze = ts1.f20489e;
    private at1 zzh = wt1.f21606e;
    private zs1 zzm = jt1.f16181e;

    static {
        ke keVar = new ke();
        zzn = keVar;
        ss1.t(ke.class, keVar);
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzn, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003\u0006ဇ\u0004\u0007\u001b\bဂ\u0005\tဂ\u0006\nဂ\u0007\u000bဉ\b\f\u0014", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", pe.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (iC == 3) {
            return new ke();
        }
        if (iC == 4) {
            return new qd(zzn);
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
        synchronized (ke.class) {
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
