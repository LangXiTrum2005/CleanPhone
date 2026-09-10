package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Segment;

/* JADX INFO: loaded from: classes4.dex */
public final class zzawm extends zziar implements zzicd {
    private static final zzawm zzA;
    private static volatile zzick zzB;
    private int zza;
    private long zzu;
    private long zzv;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private int zzh = 1000;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private int zzl = 1000;
    private long zzm = -1;
    private long zzn = -1;
    private long zzo = -1;
    private long zzp = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;
    private long zzz = -1;

    static {
        zzawm zzawmVar = new zzawm();
        zzA = zzawmVar;
        zziar.zzbu(zzawm.class, zzawmVar);
    }

    private zzawm() {
    }

    public static zzawl zza() {
        return (zzawl) zzA.zzbn();
    }

    public final /* synthetic */ void zzb(long j) {
        this.zza |= 1;
        this.zzb = j;
    }

    public final /* synthetic */ void zzc(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    public final /* synthetic */ void zzd(long j) {
        this.zza |= 4;
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            zziax zziaxVar = zzawx.zza;
            return zziar.zzbv(zzA, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", zziaxVar, "zzi", "zzj", "zzk", "zzl", zziaxVar, "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        }
        if (iOrdinal == 3) {
            return new zzawm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzawl(bArr);
        }
        if (iOrdinal == 5) {
            return zzA;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzick zzickVar = zzB;
        if (zzickVar != null) {
            return zzickVar;
        }
        synchronized (zzawm.class) {
            try {
                zziamVar = zzB;
                if (zziamVar == null) {
                    zziamVar = new zziam(zzA);
                    zzB = zziamVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziamVar;
    }

    public final /* synthetic */ void zze(long j) {
        this.zza |= 8;
        this.zze = j;
    }

    public final /* synthetic */ void zzg() {
        this.zza &= -9;
        this.zze = -1L;
    }

    public final /* synthetic */ void zzh(long j) {
        this.zza |= 16;
        this.zzf = j;
    }

    public final /* synthetic */ void zzi(long j) {
        this.zza |= 32;
        this.zzg = j;
    }

    public final /* synthetic */ void zzj(long j) {
        this.zza |= 128;
        this.zzi = j;
    }

    public final /* synthetic */ void zzk(long j) {
        this.zza |= 256;
        this.zzj = j;
    }

    public final /* synthetic */ void zzl(long j) {
        this.zza |= 512;
        this.zzk = j;
    }

    public final /* synthetic */ void zzm(long j) {
        this.zza |= com.p004ironsource.mediationsdk.metadata.a.f25965n;
        this.zzm = j;
    }

    public final /* synthetic */ void zzn(long j) {
        this.zza |= 4096;
        this.zzn = j;
    }

    public final /* synthetic */ void zzo(long j) {
        this.zza |= Segment.SIZE;
        this.zzo = j;
    }

    public final /* synthetic */ void zzp(long j) {
        this.zza |= 16384;
        this.zzp = j;
    }

    public final /* synthetic */ void zzq(long j) {
        this.zza |= 32768;
        this.zzu = j;
    }

    public final /* synthetic */ void zzr(long j) {
        this.zza |= 65536;
        this.zzv = j;
    }

    public final /* synthetic */ void zzs(long j) {
        this.zza |= 131072;
        this.zzw = j;
    }

    public final /* synthetic */ void zzt(long j) {
        this.zza |= 262144;
        this.zzx = j;
    }

    public final /* synthetic */ void zzv(int i2) {
        this.zzh = i2 - 1;
        this.zza |= 64;
    }

    public final /* synthetic */ void zzw(int i2) {
        this.zzl = i2 - 1;
        this.zza |= 1024;
    }
}
