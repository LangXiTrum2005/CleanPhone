package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzifp extends zziar implements zzicd {
    private static final zzifp zzi;
    private static volatile zzick zzj;
    private int zza;
    private zzifo zzb;
    private zzhzl zzd;
    private zzhzl zze;
    private int zzf;
    private zzhzl zzg;
    private byte zzh = 2;
    private zzibd zzc = zziar.zzbM();

    static {
        zzifp zzifpVar = new zzifp();
        zzi = zzifpVar;
        zziar.zzbu(zzifp.class, zzifpVar);
    }

    private zzifp() {
        zzhzl zzhzlVar = zzhzl.zzb;
        this.zzd = zzhzlVar;
        this.zze = zzhzlVar;
        this.zzg = zzhzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        byte[] bArr = null;
        switch (zziaqVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzh);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzh = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zziar.zzbv(zzi, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zza", "zzb", "zzc", zzifh.class, "zzd", "zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new zzifp();
            case NEW_BUILDER:
                return new zzifm(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzi;
            case GET_PARSER:
                zzick zzickVar = zzj;
                if (zzickVar != null) {
                    return zzickVar;
                }
                synchronized (zzifp.class) {
                    try {
                        zziamVar = zzj;
                        if (zziamVar == null) {
                            zziamVar = new zziam(zzi);
                            zzj = zziamVar;
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
}
