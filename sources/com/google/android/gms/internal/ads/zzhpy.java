package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class zzhpy extends zziar implements zzicd {
    public static final /* synthetic */ int zza = 0;
    private static final zzhpy zzd;
    private static volatile zzick zze;
    private String zzb = "";
    private zzibd zzc = zziar.zzbM();

    static {
        zzhpy zzhpyVar = new zzhpy();
        zzd = zzhpyVar;
        zziar.zzbu(zzhpy.class, zzhpyVar);
    }

    private zzhpy() {
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzd, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzb", "zzc", zzhpf.class});
        }
        if (iOrdinal == 3) {
            return new zzhpy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhpx(bArr);
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
        synchronized (zzhpy.class) {
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
