package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhpa extends zziar implements zzicd {
    private static final zzhpa zzd;
    private static volatile zzick zze;
    private String zza = "";
    private zzhzl zzb = zzhzl.zzb;
    private int zzc;

    static {
        zzhpa zzhpaVar = new zzhpa();
        zzd = zzhpaVar;
        zziar.zzbu(zzhpa.class, zzhpaVar);
    }

    private zzhpa() {
    }

    public static zzhoy zzd() {
        return (zzhoy) zzd.zzbn();
    }

    public static zzhpa zze() {
        return zzd;
    }

    public final String zza() {
        return this.zza;
    }

    public final zzhzl zzb() {
        return this.zzb;
    }

    public final zzhoz zzc() {
        zzhoz zzhozVar;
        int i2 = this.zzc;
        if (i2 == 0) {
            zzhozVar = zzhoz.UNKNOWN_KEYMATERIAL;
        } else if (i2 == 1) {
            zzhozVar = zzhoz.SYMMETRIC;
        } else if (i2 == 2) {
            zzhozVar = zzhoz.ASYMMETRIC_PRIVATE;
        } else if (i2 != 3) {
            zzhozVar = i2 != 4 ? null : zzhoz.REMOTE;
        } else {
            zzhozVar = zzhoz.ASYMMETRIC_PUBLIC;
        }
        return zzhozVar == null ? zzhoz.UNRECOGNIZED : zzhozVar;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhpa();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhoy(bArr);
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
        synchronized (zzhpa.class) {
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

    public final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void zzh(zzhzl zzhzlVar) {
        zzhzlVar.getClass();
        this.zzb = zzhzlVar;
    }

    public final /* synthetic */ void zzi(zzhoz zzhozVar) {
        this.zzc = zzhozVar.zza();
    }
}
