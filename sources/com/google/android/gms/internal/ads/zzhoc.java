package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhoc extends zziar implements zzicd {
    private static final zzhoc zzd;
    private static volatile zzick zze;
    private int zza;
    private zzhoe zzb;
    private int zzc;

    static {
        zzhoc zzhocVar = new zzhoc();
        zzd = zzhocVar;
        zziar.zzbu(zzhoc.class, zzhocVar);
    }

    private zzhoc() {
    }

    public static zzhoc zzb(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        return (zzhoc) zziar.zzbT(zzd, zzhzlVar, zziabVar);
    }

    public static zzhob zzc() {
        return (zzhob) zzd.zzbn();
    }

    public final zzhoe zza() {
        zzhoe zzhoeVar = this.zzb;
        return zzhoeVar == null ? zzhoe.zzc() : zzhoeVar;
    }

    public final /* synthetic */ void zzd(zzhoe zzhoeVar) {
        zzhoeVar.getClass();
        this.zzb = zzhoeVar;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhoc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhob(bArr);
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
        synchronized (zzhoc.class) {
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
}
