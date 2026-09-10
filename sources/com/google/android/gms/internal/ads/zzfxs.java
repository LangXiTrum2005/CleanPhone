package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfxs extends zziar implements zzicd {
    private static final zzfxs zzn;
    private static volatile zzick zzo;
    private int zza;
    private long zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private String zzb = "";
    private zzibc zzk = zziar.zzbE();
    private zzibc zzl = zziar.zzbE();
    private zzibc zzm = zziar.zzbE();

    static {
        zzfxs zzfxsVar = new zzfxs();
        zzn = zzfxsVar;
        zziar.zzbu(zzfxs.class, zzfxsVar);
    }

    private zzfxs() {
    }

    public static zzfxs zzp() {
        return zzn;
    }

    public final /* synthetic */ void zzA(long j) {
        zzibc zzibcVar = this.zzl;
        if (!zzibcVar.zza()) {
            this.zzl = zziar.zzbF(zzibcVar);
        }
        this.zzl.zzd(j);
    }

    public final /* synthetic */ void zzB(long j) {
        zzibc zzibcVar = this.zzm;
        if (!zzibcVar.zza()) {
            this.zzm = zziar.zzbF(zzibcVar);
        }
        this.zzm.zzd(j);
    }

    public final /* synthetic */ void zzC() {
        this.zzm = zziar.zzbE();
    }

    public final String zza() {
        return this.zzb;
    }

    public final long zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final boolean zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzn, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001Ȉ\u0002ဂ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဂ\u0004\u0007\u0002\bဂ\u0005\tဂ\u0006\n%\u000b%\f%", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (iOrdinal == 3) {
            return new zzfxs();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfxr(bArr);
        }
        if (iOrdinal == 5) {
            return zzn;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzick zzickVar = zzo;
        if (zzickVar != null) {
            return zzickVar;
        }
        synchronized (zzfxs.class) {
            try {
                zziamVar = zzo;
                if (zziamVar == null) {
                    zziamVar = new zziam(zzn);
                    zzo = zziamVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziamVar;
    }

    public final boolean zze() {
        return this.zzf;
    }

    public final long zzg() {
        return this.zzg;
    }

    public final long zzh() {
        return this.zzh;
    }

    public final long zzi() {
        return this.zzi;
    }

    public final boolean zzj() {
        return (this.zza & 64) != 0;
    }

    public final List zzk() {
        return this.zzk;
    }

    public final int zzl() {
        return this.zzk.size();
    }

    public final int zzm() {
        return this.zzl.size();
    }

    public final List zzn() {
        return this.zzm;
    }

    public final int zzo() {
        return this.zzm.size();
    }

    public final /* synthetic */ void zzq(String str) {
        str.getClass();
        this.zzb = str;
    }

    public final /* synthetic */ void zzr(long j) {
        this.zza |= 1;
        this.zzc = j;
    }

    public final /* synthetic */ void zzs(int i2) {
        this.zza |= 2;
        this.zzd = i2;
    }

    public final /* synthetic */ void zzt(boolean z2) {
        this.zza |= 4;
        this.zze = true;
    }

    public final /* synthetic */ void zzu(boolean z2) {
        this.zza |= 8;
        this.zzf = true;
    }

    public final /* synthetic */ void zzv(long j) {
        this.zza |= 16;
        this.zzg = j;
    }

    public final /* synthetic */ void zzw(long j) {
        this.zzh = j;
    }

    public final /* synthetic */ void zzx(long j) {
        this.zza |= 32;
        this.zzi = j;
    }

    public final /* synthetic */ void zzy(long j) {
        this.zza |= 64;
        this.zzj = j;
    }

    public final /* synthetic */ void zzz(long j) {
        zzibc zzibcVar = this.zzk;
        if (!zzibcVar.zza()) {
            this.zzk = zziar.zzbF(zzibcVar);
        }
        this.zzk.zzd(j);
    }
}
