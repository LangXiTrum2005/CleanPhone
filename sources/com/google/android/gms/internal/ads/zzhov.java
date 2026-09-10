package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhov extends zziar implements zzicd {
    private static final zzhov zze;
    private static volatile zzick zzf;
    private int zza;
    private zzhox zzb;
    private int zzc;
    private int zzd;

    static {
        zzhov zzhovVar = new zzhov();
        zze = zzhovVar;
        zziar.zzbu(zzhov.class, zzhovVar);
    }

    private zzhov() {
    }

    public static zzhov zzd(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        return (zzhov) zziar.zzbT(zze, zzhzlVar, zziabVar);
    }

    public static zzhou zze() {
        return (zzhou) zze.zzbn();
    }

    public static zzhov zzg() {
        return zze;
    }

    public final zzhox zza() {
        zzhox zzhoxVar = this.zzb;
        return zzhoxVar == null ? zzhox.zzd() : zzhoxVar;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final int zzc() {
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
            return zziar.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhov();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhou(bArr);
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
        synchronized (zzhov.class) {
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

    public final /* synthetic */ void zzh(zzhox zzhoxVar) {
        zzhoxVar.getClass();
        this.zzb = zzhoxVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzi(int i2) {
        this.zzc = i2;
    }
}
