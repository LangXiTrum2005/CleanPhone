package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfny extends zziar implements zzicd {
    private static final zzfny zzb;
    private static volatile zzick zzc;
    private zzibd zza = zziar.zzbM();

    static {
        zzfny zzfnyVar = new zzfny();
        zzb = zzfnyVar;
        zziar.zzbu(zzfny.class, zzfnyVar);
    }

    private zzfny() {
    }

    public static zzfnv zzb() {
        return (zzfnv) zzb.zzbn();
    }

    public final int zza() {
        return this.zza.size();
    }

    public final /* synthetic */ void zzc(zzfnx zzfnxVar) {
        zzfnxVar.getClass();
        zzibd zzibdVar = this.zza;
        if (!zzibdVar.zza()) {
            this.zza = zziar.zzbN(zzibdVar);
        }
        this.zza.add(zzfnxVar);
    }

    public final /* synthetic */ void zzd() {
        this.zza = zziar.zzbM();
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zzfnx.class});
        }
        if (iOrdinal == 3) {
            return new zzfny();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfnv(bArr);
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
        synchronized (zzfny.class) {
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
