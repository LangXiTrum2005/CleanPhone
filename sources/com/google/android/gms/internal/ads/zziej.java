package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zziej extends zziar implements zzicd {
    private static final zziej zzd;
    private static volatile zzick zze;
    private int zza;
    private long zzb;
    private long zzc;

    static {
        zziej zziejVar = new zziej();
        zzd = zziejVar;
        zziar.zzbu(zziej.class, zziejVar);
    }

    private zziej() {
    }

    public static zziei zzc() {
        return (zziei) zzd.zzbn();
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
            return zziar.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zziej();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zziei(bArr);
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
        synchronized (zziej.class) {
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

    public final /* synthetic */ void zze(long j) {
        this.zzb = j;
    }

    public final /* synthetic */ void zzg(long j) {
        this.zzc = j;
    }
}
