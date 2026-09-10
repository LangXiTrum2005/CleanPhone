package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhmu extends zziar implements zzicd {
    private static final zzhmu zze;
    private static volatile zzick zzf;
    private int zza;
    private int zzb;
    private zzhzl zzc = zzhzl.zzb;
    private zzhmy zzd;

    static {
        zzhmu zzhmuVar = new zzhmu();
        zze = zzhmuVar;
        zziar.zzbu(zzhmu.class, zzhmuVar);
    }

    private zzhmu() {
    }

    public static zzhmu zzd(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        return (zzhmu) zziar.zzbT(zze, zzhzlVar, zziabVar);
    }

    public static zzhmt zze() {
        return (zzhmt) zze.zzbn();
    }

    public static zzick zzg() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhzl zzb() {
        return this.zzc;
    }

    public final zzhmy zzc() {
        zzhmy zzhmyVar = this.zzd;
        return zzhmyVar == null ? zzhmy.zzc() : zzhmyVar;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhmu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhmt(bArr);
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
        synchronized (zzhmu.class) {
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

    public final /* synthetic */ void zzh(zzhzl zzhzlVar) {
        this.zzc = zzhzlVar;
    }

    public final /* synthetic */ void zzi(zzhmy zzhmyVar) {
        zzhmyVar.getClass();
        this.zzd = zzhmyVar;
        this.zza |= 1;
    }
}
