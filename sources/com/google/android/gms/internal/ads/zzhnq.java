package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhnq extends zziar implements zzicd {
    private static final zzhnq zzc;
    private static volatile zzick zzd;
    private int zza;
    private zzhzl zzb = zzhzl.zzb;

    static {
        zzhnq zzhnqVar = new zzhnq();
        zzc = zzhnqVar;
        zziar.zzbu(zzhnq.class, zzhnqVar);
    }

    private zzhnq() {
    }

    public static zzhnq zzc(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        return (zzhnq) zziar.zzbT(zzc, zzhzlVar, zziabVar);
    }

    public static zzhnp zzd() {
        return (zzhnp) zzc.zzbn();
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
            return new zzhnq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhnp(bArr);
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
        synchronized (zzhnq.class) {
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
