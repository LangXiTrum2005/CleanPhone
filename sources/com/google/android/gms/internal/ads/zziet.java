package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zziet extends zziar implements zzicd {
    private static final zziet zzy;
    private static volatile zzick zzz;
    private int zza;
    private int zzb;
    private boolean zzc;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzp;
    private long zzu;
    private boolean zzw;
    private String zzd = "";
    private zzibd zze = zziar.zzbM();
    private String zzj = "";
    private zzibd zzo = zziar.zzbM();
    private zziaz zzv = zziar.zzbC();
    private zziaz zzx = zziar.zzbC();

    static {
        zziet zzietVar = new zziet();
        zzy = zzietVar;
        zziar.zzbu(zziet.class, zzietVar);
    }

    private zziet() {
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzy, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zza", "zzb", zzies.zza, "zzc", "zzd", "zze", "zzf", zzieq.zza, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zziep.class, "zzp", "zzu", "zzv", zzieh.zza(), "zzw", "zzx", zzier.zza});
        }
        if (iOrdinal == 3) {
            return new zziet();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zziem(bArr);
        }
        if (iOrdinal == 5) {
            return zzy;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzick zzickVar = zzz;
        if (zzickVar != null) {
            return zzickVar;
        }
        synchronized (zziet.class) {
            try {
                zziamVar = zzz;
                if (zziamVar == null) {
                    zziamVar = new zziam(zzy);
                    zzz = zziamVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziamVar;
    }
}
