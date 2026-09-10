package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhpv extends zziar implements zzicd {
    private static final zzhpv zzd;
    private static volatile zzick zze;
    private int zza;
    private String zzb = "";
    private zzhpd zzc;

    static {
        zzhpv zzhpvVar = new zzhpv();
        zzd = zzhpvVar;
        zziar.zzbu(zzhpv.class, zzhpvVar);
    }

    private zzhpv() {
    }

    public static zzhpv zzc(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        return (zzhpv) zziar.zzbT(zzd, zzhzlVar, zziabVar);
    }

    public static zzhpu zzd() {
        return (zzhpu) zzd.zzbn();
    }

    public static zzhpv zze() {
        return zzd;
    }

    public final String zza() {
        return this.zzb;
    }

    public final zzhpd zzb() {
        zzhpd zzhpdVar = this.zzc;
        return zzhpdVar == null ? zzhpd.zzh() : zzhpdVar;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhpv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhpu(bArr);
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
        synchronized (zzhpv.class) {
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

    public final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zzb = str;
    }

    public final /* synthetic */ void zzh(zzhpd zzhpdVar) {
        zzhpdVar.getClass();
        this.zzc = zzhpdVar;
        this.zza |= 1;
    }
}
