package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhne extends zziar implements zzicd {
    private static final zzhne zze;
    private static volatile zzick zzf;
    private int zza;
    private int zzb;
    private zzhni zzc;
    private zzhzl zzd = zzhzl.zzb;

    static {
        zzhne zzhneVar = new zzhne();
        zze = zzhneVar;
        zziar.zzbu(zzhne.class, zzhneVar);
    }

    private zzhne() {
    }

    public static zzhnd zzd() {
        return (zzhnd) zze.zzbn();
    }

    public static zzhne zze() {
        return zze;
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhni zzb() {
        zzhni zzhniVar = this.zzc;
        return zzhniVar == null ? zzhni.zzc() : zzhniVar;
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
            return zziar.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhne();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhnd(bArr);
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
        synchronized (zzhne.class) {
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

    public final /* synthetic */ void zzg(zzhni zzhniVar) {
        zzhniVar.getClass();
        this.zzc = zzhniVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzh(zzhzl zzhzlVar) {
        this.zzd = zzhzlVar;
    }
}
