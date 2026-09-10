package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhqq extends zziar implements zzicd {
    private static final zzhqq zze;
    private static volatile zzick zzf;
    private int zza;
    private int zzb;
    private zzhqu zzc;
    private zzhzl zzd = zzhzl.zzb;

    static {
        zzhqq zzhqqVar = new zzhqq();
        zze = zzhqqVar;
        zziar.zzbu(zzhqq.class, zzhqqVar);
    }

    private zzhqq() {
    }

    public static zzhqq zzd(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        return (zzhqq) zziar.zzbT(zze, zzhzlVar, zziabVar);
    }

    public static zzhqp zze() {
        return (zzhqp) zze.zzbn();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhqu zzb() {
        zzhqu zzhquVar = this.zzc;
        return zzhquVar == null ? zzhqu.zzc() : zzhquVar;
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
            return new zzhqq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhqp(bArr);
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
        synchronized (zzhqq.class) {
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

    public final /* synthetic */ void zzg(zzhqu zzhquVar) {
        zzhquVar.getClass();
        this.zzc = zzhquVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzh(zzhzl zzhzlVar) {
        this.zzd = zzhzlVar;
    }
}
