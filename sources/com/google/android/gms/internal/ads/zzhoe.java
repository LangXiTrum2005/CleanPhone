package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhoe extends zziar implements zzicd {
    private static final zzhoe zzd;
    private static volatile zzick zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzhoe zzhoeVar = new zzhoe();
        zzd = zzhoeVar;
        zziar.zzbu(zzhoe.class, zzhoeVar);
    }

    private zzhoe() {
    }

    public static zzhod zzb() {
        return (zzhod) zzd.zzbn();
    }

    public static zzhoe zzc() {
        return zzd;
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
            return zziar.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhoe();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhod(bArr);
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
        synchronized (zzhoe.class) {
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

    public final int zzg() {
        int i2 = this.zzb;
        int i3 = 2;
        if (i2 != 0) {
            if (i2 == 2) {
                i3 = 4;
            } else if (i2 == 3) {
                i3 = 5;
            } else if (i2 != 4) {
                i3 = i2 != 5 ? 0 : 7;
            } else {
                i3 = 6;
            }
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    public final int zzh() {
        int i2 = this.zzc;
        int i3 = 2;
        if (i2 != 0) {
            if (i2 != 1) {
                i3 = i2 != 2 ? 0 : 4;
            } else {
                i3 = 3;
            }
        }
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    public final /* synthetic */ void zzi(int i2) {
        this.zzb = zzhoq.zza(i2);
    }

    public final /* synthetic */ void zzj(int i2) {
        this.zzc = zzhoj.zza(i2);
    }
}
