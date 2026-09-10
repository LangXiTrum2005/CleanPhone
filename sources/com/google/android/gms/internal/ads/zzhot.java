package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhot extends zziar implements zzicd {
    private static final zzhot zze;
    private static volatile zzick zzf;
    private int zza;
    private int zzb;
    private zzhox zzc;
    private zzhzl zzd = zzhzl.zzb;

    static {
        zzhot zzhotVar = new zzhot();
        zze = zzhotVar;
        zziar.zzbu(zzhot.class, zzhotVar);
    }

    private zzhot() {
    }

    public static zzhot zzd(zzhzl zzhzlVar, zziab zziabVar) throws zzibg {
        return (zzhot) zziar.zzbT(zze, zzhzlVar, zziabVar);
    }

    public static zzhos zze() {
        return (zzhos) zze.zzbn();
    }

    public static zzhot zzg() {
        return zze;
    }

    public static zzick zzh() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhox zzb() {
        zzhox zzhoxVar = this.zzc;
        return zzhoxVar == null ? zzhox.zzd() : zzhoxVar;
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
            return new zzhot();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhos(bArr);
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
        synchronized (zzhot.class) {
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

    public final /* synthetic */ void zzi(zzhox zzhoxVar) {
        zzhoxVar.getClass();
        this.zzc = zzhoxVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzj(zzhzl zzhzlVar) {
        this.zzd = zzhzlVar;
    }
}
