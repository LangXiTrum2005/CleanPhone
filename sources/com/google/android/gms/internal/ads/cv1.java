package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class cv1 extends ss1 {
    private static final cv1 zzy;
    private static volatile tt1 zzz;
    private int zza;
    private int zzb;
    private boolean zzc;
    private String zzd = "";
    private at1 zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private String zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private at1 zzo;
    private boolean zzp;
    private long zzu;
    private ws1 zzv;
    private boolean zzw;
    private ws1 zzx;

    static {
        cv1 cv1Var = new cv1();
        zzy = cv1Var;
        ss1.t(cv1.class, cv1Var);
    }

    public cv1() {
        wt1 wt1Var = wt1.f21606e;
        this.zze = wt1Var;
        this.zzj = "";
        this.zzo = wt1Var;
        ts1 ts1Var = ts1.f20489e;
        this.zzv = ts1Var;
        this.zzx = ts1Var;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzy, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zza", "zzb", bv1.f12899d, "zzc", "zzd", "zze", "zzf", bv1.f12897b, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", av1.class, "zzp", "zzu", "zzv", nd.D, "zzw", "zzx", bv1.f12898c});
        }
        if (iC == 3) {
            return new cv1();
        }
        if (iC == 4) {
            return new fu1(zzy);
        }
        if (iC == 5) {
            return zzy;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzz;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (cv1.class) {
            try {
                rs1Var = zzz;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzy);
                    zzz = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }
}
