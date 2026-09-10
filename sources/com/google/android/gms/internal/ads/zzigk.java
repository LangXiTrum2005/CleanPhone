package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzigk extends zziar implements zzicd {
    private static final zzigk zzl;
    private static volatile zzick zzm;
    private int zza;
    private int zzb;
    private zzifl zzd;
    private zzifp zze;
    private int zzf;
    private int zzi;
    private byte zzk = 2;
    private String zzc = "";
    private zziaz zzg = zziar.zzbC();
    private String zzh = "";
    private zzibd zzj = zziar.zzbM();

    static {
        zzigk zzigkVar = new zzigk();
        zzl = zzigkVar;
        zziar.zzbu(zzigk.class, zzigkVar);
    }

    private zzigk() {
    }

    public static zzigj zze() {
        return (zzigj) zzl.zzbn();
    }

    public final String zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzj.size();
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        byte[] bArr = null;
        switch (zziaqVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzk);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzk = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zziar.zzbv(zzl, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzigh.zza, "zzj"});
            case NEW_MUTABLE_INSTANCE:
                return new zzigk();
            case NEW_BUILDER:
                return new zzigj(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzl;
            case GET_PARSER:
                zzick zzickVar = zzm;
                if (zzickVar != null) {
                    return zzickVar;
                }
                synchronized (zzigk.class) {
                    try {
                        zziamVar = zzm;
                        if (zziamVar == null) {
                            zziamVar = new zziam(zzl);
                            zzm = zziamVar;
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

    public final /* synthetic */ void zzg(int i2) {
        this.zza |= 1;
        this.zzb = i2;
    }

    public final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void zzi(zzifl zziflVar) {
        zziflVar.getClass();
        this.zzd = zziflVar;
        this.zza |= 4;
    }

    public final /* synthetic */ void zzj(String str) {
        str.getClass();
        zzibd zzibdVar = this.zzj;
        if (!zzibdVar.zza()) {
            this.zzj = zziar.zzbN(zzibdVar);
        }
        this.zzj.add(str);
    }

    public final /* synthetic */ void zzl(int i2) {
        this.zzi = i2 - 1;
        this.zza |= 64;
    }
}
