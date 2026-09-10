package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbby extends zziar implements zzicd {
    private static final zzbby zzg;
    private static volatile zzick zzh;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private long zzd;
    private long zze;
    private long zzf;

    static {
        zzbby zzbbyVar = new zzbby();
        zzg = zzbbyVar;
        zziar.zzbu(zzbby.class, zzbbyVar);
    }

    private zzbby() {
    }

    public static zzbby zzg(zzhzl zzhzlVar) throws zzibg {
        return (zzbby) zziar.zzbS(zzg, zzhzlVar);
    }

    public static zzbby zzh(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        return (zzbby) zziar.zzbT(zzg, zzhzlVar, zziabVar);
    }

    public static zzbbx zzi() {
        return (zzbbx) zzg.zzbn();
    }

    public static zzbby zzj() {
        return zzg;
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }

    public final long zzc() {
        return this.zzd;
    }

    public final long zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzbby();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzbbx(bArr);
        }
        if (iOrdinal == 5) {
            return zzg;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzick zzickVar = zzh;
        if (zzickVar != null) {
            return zzickVar;
        }
        synchronized (zzbby.class) {
            try {
                zziamVar = zzh;
                if (zziamVar == null) {
                    zziamVar = new zziam(zzg);
                    zzh = zziamVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziamVar;
    }

    public final long zze() {
        return this.zzf;
    }

    public final /* synthetic */ void zzk(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void zzl(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void zzm(long j) {
        this.zza |= 4;
        this.zzd = j;
    }

    public final /* synthetic */ void zzn(long j) {
        this.zza |= 8;
        this.zze = j;
    }

    public final /* synthetic */ void zzo(long j) {
        this.zza |= 16;
        this.zzf = j;
    }
}
