package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhog extends zziar implements zzicd {
    private static final zzhog zze;
    private static volatile zzick zzf;
    private int zza;
    private int zzb;
    private zzhoi zzc;
    private zzhzl zzd = zzhzl.zzb;

    static {
        zzhog zzhogVar = new zzhog();
        zze = zzhogVar;
        zziar.zzbu(zzhog.class, zzhogVar);
    }

    private zzhog() {
    }

    public static zzhog zzd(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        return (zzhog) zziar.zzbT(zze, zzhzlVar, zziabVar);
    }

    public static zzhof zze() {
        return (zzhof) zze.zzbn();
    }

    public static zzick zzg() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhoi zzb() {
        zzhoi zzhoiVar = this.zzc;
        return zzhoiVar == null ? zzhoi.zzh() : zzhoiVar;
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
            return new zzhog();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhof(bArr);
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
        synchronized (zzhog.class) {
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

    public final /* synthetic */ void zzh(zzhoi zzhoiVar) {
        zzhoiVar.getClass();
        this.zzc = zzhoiVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzi(zzhzl zzhzlVar) {
        this.zzd = zzhzlVar;
    }
}
