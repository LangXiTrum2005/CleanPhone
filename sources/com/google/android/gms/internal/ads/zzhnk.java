package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhnk extends zziar implements zzicd {
    private static final zzhnk zze;
    private static volatile zzick zzf;
    private int zza;
    private int zzb;
    private zzhno zzc;
    private zzhzl zzd = zzhzl.zzb;

    static {
        zzhnk zzhnkVar = new zzhnk();
        zze = zzhnkVar;
        zziar.zzbu(zzhnk.class, zzhnkVar);
    }

    private zzhnk() {
    }

    public static zzhnk zzd(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        return (zzhnk) zziar.zzbT(zze, zzhzlVar, zziabVar);
    }

    public static zzhnj zze() {
        return (zzhnj) zze.zzbn();
    }

    public static zzick zzg() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhno zzb() {
        zzhno zzhnoVar = this.zzc;
        return zzhnoVar == null ? zzhno.zzc() : zzhnoVar;
    }

    public final zzhzl zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhnk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhnj(bArr);
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzick zzickVar = zzf;
        if (zzickVar != null) {
            return zzickVar;
        }
        synchronized (zzhnk.class) {
            try {
                zziamVar = zzf;
                if (zziamVar == null) {
                    zziamVar = new zziam(zze);
                    zzf = zziamVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziamVar;
    }

    public final /* synthetic */ void zzh(zzhno zzhnoVar) {
        zzhnoVar.getClass();
        this.zzc = zzhnoVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzi(zzhzl zzhzlVar) {
        this.zzd = zzhzlVar;
    }
}
