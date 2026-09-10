package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.thinkup.core.common.om.n;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgax extends zziar implements zzicd {
    private static final zzgax zzl;
    private static volatile zzick zzm;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzh;
    private boolean zzi;
    private boolean zzb = true;
    private long zze = TTAdConstant.AD_MAX_EVENT_TIME;
    private long zzf = n.m;
    private String zzg = "https://pagead2.googlesyndication.com/mads/asp";
    private long zzj = 5;
    private long zzk = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;

    static {
        zzgax zzgaxVar = new zzgax();
        zzl = zzgaxVar;
        zziar.zzbu(zzgax.class, zzgaxVar);
    }

    private zzgax() {
    }

    public static zzgaw zzi() {
        return (zzgaw) zzl.zzbn();
    }

    public static zzgax zzj() {
        return zzl;
    }

    public final boolean zza() {
        return this.zzd;
    }

    public final long zzb() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final long zzd() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzl, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဂ\u0006\bဇ\u0007\tဂ\b\nဂ\t", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (iOrdinal == 3) {
            return new zzgax();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzgaw(bArr);
        }
        if (iOrdinal == 5) {
            return zzl;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzick zzickVar = zzm;
        if (zzickVar != null) {
            return zzickVar;
        }
        synchronized (zzgax.class) {
            try {
                zziamVar = zzm;
                if (zziamVar == null) {
                    zziamVar = new zziam(zzl);
                    zzm = zziamVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziamVar;
    }

    public final boolean zze() {
        return this.zzi;
    }

    public final long zzg() {
        return this.zzj;
    }

    public final long zzh() {
        return this.zzk;
    }

    public final /* synthetic */ void zzk(boolean z2) {
        this.zza |= 4;
        this.zzd = z2;
    }

    public final /* synthetic */ void zzl(long j) {
        this.zza |= 64;
        this.zzh = j;
    }
}
