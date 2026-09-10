package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhqs extends zziar implements zzicd {
    private static final zzhqs zzd;
    private static volatile zzick zze;
    private int zza;
    private int zzb;
    private zzhqu zzc;

    static {
        zzhqs zzhqsVar = new zzhqs();
        zzd = zzhqsVar;
        zziar.zzbu(zzhqs.class, zzhqsVar);
    }

    private zzhqs() {
    }

    public static zzhqs zzc(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        return (zzhqs) zziar.zzbT(zzd, zzhzlVar, zziabVar);
    }

    public static zzhqr zzd() {
        return (zzhqr) zzd.zzbn();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhqu zzb() {
        zzhqu zzhquVar = this.zzc;
        return zzhquVar == null ? zzhqu.zzc() : zzhquVar;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhqs();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhqr(bArr);
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
        synchronized (zzhqs.class) {
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

    public final /* synthetic */ void zze(zzhqu zzhquVar) {
        zzhquVar.getClass();
        this.zzc = zzhquVar;
        this.zza |= 1;
    }
}
