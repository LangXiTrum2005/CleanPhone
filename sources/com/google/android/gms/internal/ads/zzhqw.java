package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhqw extends zziar implements zzicd {
    private static final zzhqw zzc;
    private static volatile zzick zzd;
    private int zza;
    private zzhzl zzb = zzhzl.zzb;

    static {
        zzhqw zzhqwVar = new zzhqw();
        zzc = zzhqwVar;
        zziar.zzbu(zzhqw.class, zzhqwVar);
    }

    private zzhqw() {
    }

    public static zzhqw zzc(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        return (zzhqw) zziar.zzbT(zzc, zzhzlVar, zziabVar);
    }

    public static zzhqv zzd() {
        return (zzhqv) zzc.zzbn();
    }

    public static zzick zze() {
        return zzc.zzbd();
    }

    public final int zza() {
        return this.zza;
    }

    public final zzhzl zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzhqw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhqv(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzick zzickVar = zzd;
        if (zzickVar != null) {
            return zzickVar;
        }
        synchronized (zzhqw.class) {
            try {
                zziamVar = zzd;
                if (zziamVar == null) {
                    zziamVar = new zziam(zzc);
                    zzd = zziamVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziamVar;
    }

    public final /* synthetic */ void zzg(zzhzl zzhzlVar) {
        this.zzb = zzhzlVar;
    }
}
