package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhng extends zziar implements zzicd {
    private static final zzhng zzd;
    private static volatile zzick zze;
    private int zza;
    private zzhni zzb;
    private int zzc;

    static {
        zzhng zzhngVar = new zzhng();
        zzd = zzhngVar;
        zziar.zzbu(zzhng.class, zzhngVar);
    }

    private zzhng() {
    }

    public static zzhnf zzc() {
        return (zzhnf) zzd.zzbn();
    }

    public static zzhng zzd() {
        return zzd;
    }

    public final zzhni zza() {
        zzhni zzhniVar = this.zzb;
        return zzhniVar == null ? zzhni.zzc() : zzhniVar;
    }

    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhng();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhnf(bArr);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzick zzickVar = zze;
        if (zzickVar != null) {
            return zzickVar;
        }
        synchronized (zzhng.class) {
            try {
                zziamVar = zze;
                if (zziamVar == null) {
                    zziamVar = new zziam(zzd);
                    zze = zziamVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziamVar;
    }

    public final /* synthetic */ void zze(zzhni zzhniVar) {
        zzhniVar.getClass();
        this.zzb = zzhniVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzg(int i2) {
        this.zzc = i2;
    }
}
