package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhqk extends zziar implements zzicd {
    private static final zzhqk zzd;
    private static volatile zzick zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzhqk zzhqkVar = new zzhqk();
        zzd = zzhqkVar;
        zziar.zzbu(zzhqk.class, zzhqkVar);
    }

    private zzhqk() {
    }

    public static zzhqj zzd() {
        return (zzhqj) zzd.zzbn();
    }

    public static zzhqk zze() {
        return zzd;
    }

    public final zzhor zza() {
        zzhor zzhorVarZzb = zzhor.zzb(this.zza);
        return zzhorVarZzb == null ? zzhor.UNRECOGNIZED : zzhorVarZzb;
    }

    public final zzhor zzb() {
        zzhor zzhorVarZzb = zzhor.zzb(this.zzb);
        return zzhorVarZzb == null ? zzhor.UNRECOGNIZED : zzhorVarZzb;
    }

    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhqk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhqj(bArr);
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
        synchronized (zzhqk.class) {
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

    public final /* synthetic */ void zzg(zzhor zzhorVar) {
        this.zza = zzhorVar.zza();
    }

    public final /* synthetic */ void zzh(zzhor zzhorVar) {
        this.zzb = zzhorVar.zza();
    }

    public final /* synthetic */ void zzi(int i2) {
        this.zzc = i2;
    }
}
