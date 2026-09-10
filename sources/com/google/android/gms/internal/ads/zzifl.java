package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzifl extends zziar implements zzicd {
    private static final zzifl zzh;
    private static volatile zzick zzi;
    private int zza;
    private zzifk zzb;
    private zzhzl zzd;
    private zzhzl zze;
    private int zzf;
    private byte zzg = 2;
    private zzibd zzc = zziar.zzbM();

    static {
        zzifl zziflVar = new zzifl();
        zzh = zziflVar;
        zziar.zzbu(zzifl.class, zziflVar);
    }

    private zzifl() {
        zzhzl zzhzlVar = zzhzl.zzb;
        this.zzd = zzhzlVar;
        this.zze = zzhzlVar;
    }

    public static zzifi zzc() {
        return (zzifi) zzh.zzbn();
    }

    public final /* synthetic */ void zzd(zzifh zzifhVar) {
        zzifhVar.getClass();
        zzibd zzibdVar = this.zzc;
        if (!zzibdVar.zza()) {
            this.zzc = zziar.zzbN(zzibdVar);
        }
        this.zzc.add(zzifhVar);
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        byte[] bArr = null;
        switch (zziaqVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzg);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzg = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zziar.zzbv(zzh, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zza", "zzb", "zzc", zzifh.class, "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzifl();
            case NEW_BUILDER:
                return new zzifi(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzh;
            case GET_PARSER:
                zzick zzickVar = zzi;
                if (zzickVar != null) {
                    return zzickVar;
                }
                synchronized (zzifl.class) {
                    try {
                        zziamVar = zzi;
                        if (zziamVar == null) {
                            zziamVar = new zziam(zzh);
                            zzi = zziamVar;
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
