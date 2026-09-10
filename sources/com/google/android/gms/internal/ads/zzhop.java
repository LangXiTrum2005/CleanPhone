package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhop extends zziar implements zzicd {
    private static final zzhop zzc;
    private static volatile zzick zzd;
    private int zza;
    private zzhzl zzb = zzhzl.zzb;

    static {
        zzhop zzhopVar = new zzhop();
        zzc = zzhopVar;
        zziar.zzbu(zzhop.class, zzhopVar);
    }

    private zzhop() {
    }

    public static zzhop zzc(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        return (zzhop) zziar.zzbT(zzc, zzhzlVar, zziabVar);
    }

    public static zzhoo zzd() {
        return (zzhoo) zzc.zzbn();
    }

    public static zzhop zze() {
        return zzc;
    }

    public static zzick zzg() {
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
            return zziar.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzhop();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhoo(bArr);
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
        synchronized (zzhop.class) {
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

    public final /* synthetic */ void zzh(zzhzl zzhzlVar) {
        this.zzb = zzhzlVar;
    }
}
