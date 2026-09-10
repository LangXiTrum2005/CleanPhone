package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhqc extends zziar implements zzicd {
    private static final zzhqc zzb;
    private static volatile zzick zzc;
    private int zza;

    static {
        zzhqc zzhqcVar = new zzhqc();
        zzb = zzhqcVar;
        zziar.zzbu(zzhqc.class, zzhqcVar);
    }

    private zzhqc() {
    }

    public static zzhqb zzb() {
        return (zzhqb) zzb.zzbn();
    }

    public static zzhqc zzc() {
        return zzb;
    }

    public final zzhor zza() {
        zzhor zzhorVarZzb = zzhor.zzb(this.zza);
        return zzhorVarZzb == null ? zzhor.UNRECOGNIZED : zzhorVarZzb;
    }

    public final /* synthetic */ void zzd(zzhor zzhorVar) {
        this.zza = zzhorVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzhqc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhqb(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzick zzickVar = zzc;
        if (zzickVar != null) {
            return zzickVar;
        }
        synchronized (zzhqc.class) {
            try {
                zziamVar = zzc;
                if (zziamVar == null) {
                    zziamVar = new zziam(zzb);
                    zzc = zziamVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziamVar;
    }
}
