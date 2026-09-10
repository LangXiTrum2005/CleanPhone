package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhqi extends zziar implements zzicd {
    private static final zzhqi zze;
    private static volatile zzick zzf;
    private int zza;
    private zzhqk zzb;
    private int zzc;
    private zzhzl zzd = zzhzl.zzb;

    static {
        zzhqi zzhqiVar = new zzhqi();
        zze = zzhqiVar;
        zziar.zzbu(zzhqi.class, zzhqiVar);
    }

    private zzhqi() {
    }

    public static zzhqi zzd(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        return (zzhqi) zziar.zzbT(zze, zzhzlVar, zziabVar);
    }

    public static zzhqh zze() {
        return (zzhqh) zze.zzbn();
    }

    public final zzhqk zza() {
        zzhqk zzhqkVar = this.zzb;
        return zzhqkVar == null ? zzhqk.zze() : zzhqkVar;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final zzhzl zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhqi();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhqh(bArr);
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzick zzickVar = zzf;
        if (zzickVar != null) {
            return zzickVar;
        }
        synchronized (zzhqi.class) {
            try {
                zziamVar = zzf;
                if (zziamVar == null) {
                    zziamVar = new zziam(zze);
                    zzf = zziamVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziamVar;
    }

    public final /* synthetic */ void zzg(zzhqk zzhqkVar) {
        zzhqkVar.getClass();
        this.zzb = zzhqkVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzh(int i2) {
        this.zzc = i2;
    }

    public final /* synthetic */ void zzi(zzhzl zzhzlVar) {
        this.zzd = zzhzlVar;
    }
}
