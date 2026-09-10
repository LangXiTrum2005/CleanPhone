package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhpp extends zziar implements zzicd {
    private static final zzhpp zzd;
    private static volatile zzick zze;
    private int zza;
    private int zzb;
    private zzhpr zzc;

    static {
        zzhpp zzhppVar = new zzhpp();
        zzd = zzhppVar;
        zziar.zzbu(zzhpp.class, zzhppVar);
    }

    private zzhpp() {
    }

    public static zzhpp zzc(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        return (zzhpp) zziar.zzbT(zzd, zzhzlVar, zziabVar);
    }

    public static zzhpo zzd() {
        return (zzhpo) zzd.zzbn();
    }

    public static zzick zze() {
        return zzd.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhpr zzb() {
        zzhpr zzhprVar = this.zzc;
        return zzhprVar == null ? zzhpr.zzd() : zzhprVar;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhpp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhpo(bArr);
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
        synchronized (zzhpp.class) {
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

    public final /* synthetic */ void zzg(zzhpr zzhprVar) {
        zzhprVar.getClass();
        this.zzc = zzhprVar;
        this.zza |= 1;
    }
}
