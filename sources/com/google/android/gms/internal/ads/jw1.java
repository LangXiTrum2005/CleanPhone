package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class jw1 extends ss1 {
    private static final jw1 zzp;
    private static volatile tt1 zzu;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private int zzd = 4;
    private at1 zze;
    private String zzf;
    private String zzg;
    private boolean zzh;
    private double zzi;
    private at1 zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;

    static {
        jw1 jw1Var = new jw1();
        zzp = jw1Var;
        ss1.t(jw1.class, jw1Var);
    }

    public jw1() {
        wt1 wt1Var = wt1.f21606e;
        this.zze = wt1Var;
        this.zzf = "";
        this.zzg = "";
        this.zzj = wt1Var;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzp, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zza", "zzb", "zzd", bv1.f12912r, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", iw1.class, "zzc", "zzk", bv1.f12911q, "zzl", "zzm", "zzn", "zzo"});
        }
        if (iC == 3) {
            return new jw1();
        }
        if (iC == 4) {
            return new fu1(zzp);
        }
        if (iC == 5) {
            return zzp;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzu;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (jw1.class) {
            try {
                rs1Var = zzu;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzp);
                    zzu = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }
}
