package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhna extends zziar implements zzicd {
    private static final zzhna zze;
    private static volatile zzick zzf;
    private int zza;
    private int zzb;
    private zzhne zzc;
    private zzhot zzd;

    static {
        zzhna zzhnaVar = new zzhna();
        zze = zzhnaVar;
        zziar.zzbu(zzhna.class, zzhnaVar);
    }

    private zzhna() {
    }

    public static zzhna zzd(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        return (zzhna) zziar.zzbT(zze, zzhzlVar, zziabVar);
    }

    public static zzhmz zze() {
        return (zzhmz) zze.zzbn();
    }

    public static zzick zzg() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhne zzb() {
        zzhne zzhneVar = this.zzc;
        return zzhneVar == null ? zzhne.zze() : zzhneVar;
    }

    public final zzhot zzc() {
        zzhot zzhotVar = this.zzd;
        return zzhotVar == null ? zzhot.zzg() : zzhotVar;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhna();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhmz(bArr);
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
        synchronized (zzhna.class) {
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

    public final /* synthetic */ void zzh(zzhne zzhneVar) {
        zzhneVar.getClass();
        this.zzc = zzhneVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzi(zzhot zzhotVar) {
        zzhotVar.getClass();
        this.zzd = zzhotVar;
        this.zza |= 2;
    }
}
