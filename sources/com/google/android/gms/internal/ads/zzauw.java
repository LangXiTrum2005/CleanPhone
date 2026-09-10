package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzauw extends zziar implements zzicd {
    private static final zzauw zzn;
    private static volatile zzick zzo;
    private int zza;
    private long zzc;
    private int zzg;
    private long zzi;
    private long zzl;
    private long zzm;
    private zzibd zzb = zziar.zzbM();
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";

    static {
        zzauw zzauwVar = new zzauw();
        zzn = zzauwVar;
        zziar.zzbu(zzauw.class, zzauwVar);
    }

    private zzauw() {
    }

    public static zzauv zza() {
        return (zzauv) zzn.zzbn();
    }

    public final /* synthetic */ void zzb(zzavo zzavoVar) {
        zzavoVar.getClass();
        zzibd zzibdVar = this.zzb;
        if (!zzibdVar.zza()) {
            this.zzb = zziar.zzbN(zzibdVar);
        }
        this.zzb.add(zzavoVar);
    }

    public final /* synthetic */ void zzc() {
        this.zzb = zziar.zzbM();
    }

    public final /* synthetic */ void zzd(long j) {
        this.zza |= 1;
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzn, "\u0004\f\u0000\u0001\b?\f\u0000\u0001\u0000\b\u001b\u0015ဂ\u0000\u0016ဈ\u0001\u0017ဈ\u0002\u0018ဈ\u0003\u0019᠌\u0004(ဈ\u0005)ဂ\u0006<ဈ\u0007=ဈ\b>ဂ\t?ဂ\n", new Object[]{"zza", "zzb", zzavo.class, "zzc", "zzd", "zze", "zzf", "zzg", zzavm.zza, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (iOrdinal == 3) {
            return new zzauw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzauv(bArr);
        }
        if (iOrdinal == 5) {
            return zzn;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzick zzickVar = zzo;
        if (zzickVar != null) {
            return zzickVar;
        }
        synchronized (zzauw.class) {
            try {
                zziamVar = zzo;
                if (zziamVar == null) {
                    zziamVar = new zziam(zzn);
                    zzo = zziamVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziamVar;
    }

    public final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzd = str;
    }

    public final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zza |= 4;
        this.zze = str;
    }

    public final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zza |= 8;
        this.zzf = str;
    }

    public final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzh = str;
    }

    public final /* synthetic */ void zzj(long j) {
        this.zza |= 64;
        this.zzi = j;
    }

    public final /* synthetic */ void zzk(String str) {
        str.getClass();
        this.zza |= 128;
        this.zzj = str;
    }

    public final /* synthetic */ void zzl(String str) {
        str.getClass();
        this.zza |= 256;
        this.zzk = str;
    }

    public final /* synthetic */ void zzm(long j) {
        this.zza |= 512;
        this.zzl = j;
    }

    public final /* synthetic */ void zzn(long j) {
        this.zza |= 1024;
        this.zzm = j;
    }

    public final /* synthetic */ void zzp(int i2) {
        this.zzg = i2 - 1;
        this.zza |= 16;
    }
}
