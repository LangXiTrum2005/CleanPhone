package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class sd extends ss1 {
    private static final sd zzo;
    private static volatile tt1 zzp;
    private int zza;
    private long zzc;
    private long zzg;
    private long zzh;
    private long zzj;
    private int zzn;
    private String zzb = "";
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzi = "";
    private String zzk = "";
    private String zzl = "";
    private at1 zzm = wt1.f21606e;

    static {
        sd sdVar = new sd();
        zzo = sdVar;
        ss1.t(sd.class, sdVar);
    }

    public static od z() {
        return (od) zzo.q();
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void B(long j10) {
        this.zza |= 2;
        this.zzc = j10;
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void D(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void E(String str) {
        this.zza |= 16;
        this.zzf = str;
    }

    public final /* synthetic */ void F(String str) {
        this.zza |= 1024;
        this.zzl = str;
    }

    public final /* synthetic */ void G(int i10) {
        this.zzn = i10 - 1;
        this.zza |= com.ironsource.mediationsdk.metadata.a.f29616n;
    }

    @Override // com.google.android.gms.internal.ads.ss1
    public final Object v(int i10, ss1 ss1Var) {
        tt1 rs1Var;
        int iC = v0.i.c(i10);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new xt1(zzo, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", rd.class, "zzn", nd.f17755c});
        }
        if (iC == 3) {
            return new sd();
        }
        if (iC == 4) {
            return new od(zzo);
        }
        if (iC == 5) {
            return zzo;
        }
        if (iC != 6) {
            throw null;
        }
        tt1 tt1Var = zzp;
        if (tt1Var != null) {
            return tt1Var;
        }
        synchronized (sd.class) {
            try {
                rs1Var = zzp;
                if (rs1Var == null) {
                    rs1Var = new rs1(zzo);
                    zzp = rs1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rs1Var;
    }
}
