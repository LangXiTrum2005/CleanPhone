package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhns extends zziar implements zzicd {
    private static final zzhns zzc;
    private static volatile zzick zzd;
    private int zza;
    private int zzb;

    static {
        zzhns zzhnsVar = new zzhns();
        zzc = zzhnsVar;
        zziar.zzbu(zzhns.class, zzhnsVar);
    }

    private zzhns() {
    }

    public static zzhns zzc(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        return (zzhns) zziar.zzbT(zzc, zzhzlVar, zziabVar);
    }

    public static zzhnr zzd() {
        return (zzhnr) zzc.zzbn();
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
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
            return zziar.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzhns();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhnr(bArr);
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
        synchronized (zzhns.class) {
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

    public final /* synthetic */ void zze(int i2) {
        this.zza = i2;
    }
}
