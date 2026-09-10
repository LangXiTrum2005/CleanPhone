package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhox extends zziar implements zzicd {
    private static final zzhox zzc;
    private static volatile zzick zzd;
    private int zza;
    private int zzb;

    static {
        zzhox zzhoxVar = new zzhox();
        zzc = zzhoxVar;
        zziar.zzbu(zzhox.class, zzhoxVar);
    }

    private zzhox() {
    }

    public static zzhow zzc() {
        return (zzhow) zzc.zzbn();
    }

    public static zzhox zzd() {
        return zzc;
    }

    public final zzhor zza() {
        zzhor zzhorVarZzb = zzhor.zzb(this.zza);
        return zzhorVarZzb == null ? zzhor.UNRECOGNIZED : zzhorVarZzb;
    }

    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzhox();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhow(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzick zzickVar = zzd;
        if (zzickVar != null) {
            return zzickVar;
        }
        synchronized (zzhox.class) {
            try {
                zziamVar = zzd;
                if (zziamVar == null) {
                    zziamVar = new zziam(zzc);
                    zzd = zziamVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziamVar;
    }

    public final /* synthetic */ void zze(zzhor zzhorVar) {
        this.zza = zzhorVar.zza();
    }

    public final /* synthetic */ void zzg(int i2) {
        this.zzb = i2;
    }
}
