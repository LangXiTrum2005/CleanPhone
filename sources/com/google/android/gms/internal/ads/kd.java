package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class kd extends ss1 {
    private static final kd zzj;
    private static volatile tt1 zzk;
    private int zza;
    private int zzb;
    private boolean zze;
    private td zzg;
    private wd zzh;
    private boolean zzi;
    private boolean zzc = true;
    private String zzd = "unknown_host";
    private boolean zzf = true;

    static {
        kd kdVar = new kd();
        zzj = kdVar;
        ss1.t(kd.class, kdVar);
    }

    public static jd D() {
        return (jd) zzj.q();
    }

    public final boolean A() {
        return this.zze;
    }

    public final td B() {
        td tdVar = this.zzg;
        return tdVar == null ? td.C() : tdVar;
    }

    public final void C() {
        if (this.zzh == null) {
            int i10 = wd.f21492a;
        }
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void F(boolean z10) {
        this.zza |= 8;
        this.zze = z10;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzj, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zza", "zzb", nd.f17754b, "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iC == 3) {
            return new kd();
        }
        if (iC == 4) {
            return new jd(zzj);
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
        synchronized (kd.class) {
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

    public final String z() {
        return this.zzd;
    }
}
