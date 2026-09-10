package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class re extends ss1 {
    private static final re zzi;
    private static volatile tt1 zzj;
    private int zza;
    private long zzd;
    private long zzf;
    private long zzg;
    private String zzb = "";
    private String zzc = "";
    private String zze = "D";
    private String zzh = "";

    static {
        re reVar = new re();
        zzi = reVar;
        ss1.t(re.class, reVar);
    }

    public static qe z() {
        return (qe) zzi.q();
    }

    public final /* synthetic */ void A(String str) {
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void C(long j10) {
        this.zza |= 4;
        this.zzd = j10;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void E(long j10) {
        this.zza |= 16;
        this.zzf = j10;
    }

    public final /* synthetic */ void F(long j10) {
        this.zza |= 32;
        this.zzg = j10;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zza |= 64;
        this.zzh = str;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzi, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (iC == 3) {
            return new re();
        }
        if (iC == 4) {
            return new qe(zzi);
        }
        if (iC == 5) {
            return zzi;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzj;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (re.class) {
            try {
                rs1Var = zzj;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzi);
                    zzj = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }
}
