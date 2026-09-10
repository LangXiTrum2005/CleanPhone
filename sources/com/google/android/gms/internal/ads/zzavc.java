package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzavc extends zziar implements zzicd {
    private static final zzavc zzo;
    private static volatile zzick zzp;
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
    private zzibd zzm = zziar.zzbM();

    static {
        zzavc zzavcVar = new zzavc();
        zzo = zzavcVar;
        zziar.zzbu(zzavc.class, zzavcVar);
    }

    private zzavc() {
    }

    public static zzauy zza() {
        return (zzauy) zzo.zzbn();
    }

    public final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void zzc(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    public final /* synthetic */ void zzd(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzo, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzava.class, "zzn", zzavb.zza});
        }
        if (iOrdinal == 3) {
            return new zzavc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzauy(bArr);
        }
        if (iOrdinal == 5) {
            return zzo;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzick zzickVar = zzp;
        if (zzickVar != null) {
            return zzickVar;
        }
        synchronized (zzavc.class) {
            try {
                zziamVar = zzp;
                if (zziamVar == null) {
                    zziamVar = new zziam(zzo);
                    zzp = zziamVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziamVar;
    }

    public final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void zzg(String str) {
        this.zza |= 16;
        this.zzf = str;
    }

    public final /* synthetic */ void zzh(String str) {
        this.zza |= 1024;
        this.zzl = str;
    }

    public final /* synthetic */ void zzj(int i2) {
        this.zzn = i2 - 1;
        this.zza |= com.p004ironsource.mediationsdk.metadata.a.f25965n;
    }
}
