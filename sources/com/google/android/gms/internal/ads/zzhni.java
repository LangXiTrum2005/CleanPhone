package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhni extends zziar implements zzicd {
    private static final zzhni zzb;
    private static volatile zzick zzc;
    private int zza;

    static {
        zzhni zzhniVar = new zzhni();
        zzb = zzhniVar;
        zziar.zzbu(zzhni.class, zzhniVar);
    }

    private zzhni() {
    }

    public static zzhnh zzb() {
        return (zzhnh) zzb.zzbn();
    }

    public static zzhni zzc() {
        return zzb;
    }

    public final int zza() {
        return this.zza;
    }

    public final /* synthetic */ void zzd(int i2) {
        this.zza = i2;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzhni();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhnh(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzick zzickVar = zzc;
        if (zzickVar != null) {
            return zzickVar;
        }
        synchronized (zzhni.class) {
            try {
                zziamVar = zzc;
                if (zziamVar == null) {
                    zziamVar = new zziam(zzb);
                    zzc = zziamVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziamVar;
    }
}
