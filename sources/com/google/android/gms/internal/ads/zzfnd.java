package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfnd extends zziar implements zzicd {
    private static final zzfnd zzc;
    private static volatile zzick zzd;
    private int zza;
    private long zzb;

    static {
        zzfnd zzfndVar = new zzfnd();
        zzc = zzfndVar;
        zziar.zzbu(zzfnd.class, zzfndVar);
    }

    private zzfnd() {
    }

    public static zzfnc zza() {
        return (zzfnc) zzc.zzbn();
    }

    public final /* synthetic */ void zzb(long j) {
        this.zzb = j;
    }

    public final /* synthetic */ void zzd(int i2) {
        this.zza = i2 - 2;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzfnd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfnc(bArr);
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
        synchronized (zzfnd.class) {
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
}
