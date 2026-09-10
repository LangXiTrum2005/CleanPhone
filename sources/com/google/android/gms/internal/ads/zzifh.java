package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzifh extends zziar implements zzicd {
    private static final zzifh zze;
    private static volatile zzick zzf;
    private int zza;
    private zzhzl zzb;
    private zzhzl zzc;
    private byte zzd = 2;

    static {
        zzifh zzifhVar = new zzifh();
        zze = zzifhVar;
        zziar.zzbu(zzifh.class, zzifhVar);
    }

    private zzifh() {
        zzhzl zzhzlVar = zzhzl.zzb;
        this.zzb = zzhzlVar;
        this.zzc = zzhzlVar;
    }

    public static zzifg zzc() {
        return (zzifg) zze.zzbn();
    }

    public final /* synthetic */ void zzd(zzhzl zzhzlVar) {
        this.zza |= 1;
        this.zzb = zzhzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        byte[] bArr = null;
        switch (zziaqVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzd);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzd = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zziar.zzbv(zze, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new zzifh();
            case NEW_BUILDER:
                return new zzifg(bArr);
            case GET_DEFAULT_INSTANCE:
                return zze;
            case GET_PARSER:
                zzick zzickVar = zzf;
                if (zzickVar != null) {
                    return zzickVar;
                }
                synchronized (zzifh.class) {
                    try {
                        zziamVar = zzf;
                        if (zziamVar == null) {
                            zziamVar = new zziam(zze);
                            zzf = zziamVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return zziamVar;
            default:
                throw null;
        }
    }

    public final /* synthetic */ void zze(zzhzl zzhzlVar) {
        this.zza |= 2;
        this.zzc = zzhzlVar;
    }
}
