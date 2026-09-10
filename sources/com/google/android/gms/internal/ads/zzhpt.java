package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhpt extends zziar implements zzicd {
    private static final zzhpt zzd;
    private static volatile zzick zze;
    private int zza;
    private int zzb;
    private zzhpv zzc;

    static {
        zzhpt zzhptVar = new zzhpt();
        zzd = zzhptVar;
        zziar.zzbu(zzhpt.class, zzhptVar);
    }

    private zzhpt() {
    }

    public static zzhpt zzc(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        return (zzhpt) zziar.zzbT(zzd, zzhzlVar, zziabVar);
    }

    public static zzhps zzd() {
        return (zzhps) zzd.zzbn();
    }

    public static zzick zze() {
        return zzd.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhpv zzb() {
        zzhpv zzhpvVar = this.zzc;
        return zzhpvVar == null ? zzhpv.zze() : zzhpvVar;
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
            return new zzhpt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhps(bArr);
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
        synchronized (zzhpt.class) {
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

    public final /* synthetic */ void zzg(zzhpv zzhpvVar) {
        zzhpvVar.getClass();
        this.zzc = zzhpvVar;
        this.zza |= 1;
    }
}
