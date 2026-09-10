package com.google.android.gms.internal.ads;

import com.smartdigimkt.u2.m;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgad extends zziar implements zzicd {
    private static volatile zzick zzA;
    private static final zzgad zzz;
    private int zza;
    private int zzb;
    private boolean zze;
    private zzgav zzf;
    private boolean zzg;
    private zzgax zzj;
    private boolean zzv;
    private boolean zzw;
    private boolean zzy;
    private boolean zzc = true;
    private String zzd = "unknown_host";
    private long zzh = 100;
    private long zzi = 2000;
    private long zzk = 200;
    private long zzl = 200;
    private long zzm = 20000;
    private String zzn = "";
    private String zzo = "";
    private long zzp = 500;
    private long zzu = m.D0;
    private boolean zzx = true;

    static {
        zzgad zzgadVar = new zzgad();
        zzz = zzgadVar;
        zziar.zzbu(zzgad.class, zzgadVar);
    }

    private zzgad() {
    }

    public static zzgac zzu() {
        return (zzgac) zzz.zzbn();
    }

    public final /* synthetic */ void zzA(zzgax zzgaxVar) {
        zzgaxVar.getClass();
        this.zzj = zzgaxVar;
        this.zza |= 256;
    }

    public final /* synthetic */ void zzB(long j) {
        this.zza |= 32768;
        this.zzu = j;
    }

    public final /* synthetic */ void zzC(boolean z2) {
        this.zza |= 65536;
        this.zzv = z2;
    }

    public final int zzE() {
        int iZza = zzgaf.zza(this.zzb);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    public final /* synthetic */ void zzF(int i2) {
        this.zzb = i2 - 1;
        this.zza |= 1;
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final boolean zzc() {
        return this.zze;
    }

    public final zzgav zzd() {
        zzgav zzgavVar = this.zzf;
        return zzgavVar == null ? zzgav.zzg() : zzgavVar;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzz, "\u0004\u0014\u0000\u0001\u0001\u0015\u0014\u0000\u0000\u0000\u0001᠌\u0000\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဉ\u0004\u0006ဇ\u0005\u0007ဂ\u0007\bဉ\b\tဇ\u0001\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဈ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဇ\u0010\u0012ဂ\u0006\u0013ဇ\u0011\u0014ဇ\u0012\u0015ဇ\u0013", new Object[]{"zza", "zzb", zzgae.zza, "zzd", "zze", "zzf", "zzg", "zzi", "zzj", "zzc", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzh", "zzw", "zzx", "zzy"});
        }
        if (iOrdinal == 3) {
            return new zzgad();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzgac(bArr);
        }
        if (iOrdinal == 5) {
            return zzz;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzick zzickVar = zzA;
        if (zzickVar != null) {
            return zzickVar;
        }
        synchronized (zzgad.class) {
            try {
                zziamVar = zzA;
                if (zziamVar == null) {
                    zziamVar = new zziam(zzz);
                    zzA = zziamVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziamVar;
    }

    public final boolean zze() {
        return this.zzg;
    }

    public final long zzg() {
        return this.zzh;
    }

    public final long zzh() {
        return this.zzi;
    }

    public final zzgax zzi() {
        zzgax zzgaxVar = this.zzj;
        return zzgaxVar == null ? zzgax.zzj() : zzgaxVar;
    }

    public final long zzj() {
        return this.zzk;
    }

    public final long zzk() {
        return this.zzl;
    }

    public final long zzl() {
        return this.zzm;
    }

    public final String zzm() {
        return this.zzn;
    }

    public final String zzn() {
        return this.zzo;
    }

    public final long zzo() {
        return this.zzp;
    }

    public final long zzp() {
        return this.zzu;
    }

    public final boolean zzq() {
        return this.zzv;
    }

    public final boolean zzr() {
        return this.zzw;
    }

    public final boolean zzs() {
        return this.zzx;
    }

    public final boolean zzt() {
        return this.zzy;
    }

    public final /* synthetic */ void zzv(boolean z2) {
        this.zza |= 2;
        this.zzc = z2;
    }

    public final /* synthetic */ void zzw(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void zzx(zzgav zzgavVar) {
        zzgavVar.getClass();
        this.zzf = zzgavVar;
        this.zza |= 16;
    }

    public final /* synthetic */ void zzy(long j) {
        this.zza |= 64;
        this.zzh = j;
    }

    public final /* synthetic */ void zzz(long j) {
        this.zza |= 128;
        this.zzi = j;
    }
}
