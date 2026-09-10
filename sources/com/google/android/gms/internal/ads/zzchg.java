package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzchg extends zzcgx implements zzcfa {
    public static final /* synthetic */ int zzd = 0;
    private zzcfb zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzcgp zzi;
    private long zzj;
    private long zzk;

    public zzchg(zzcfk zzcfkVar, zzcfj zzcfjVar) {
        super(zzcfkVar);
        zzchz zzchzVar = new zzchz(zzcfkVar.getContext(), zzcfjVar, (zzcfk) this.zzc.get(), null);
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("ExoPlayerAdapter initialized.");
        this.zze = zzchzVar;
        zzchzVar.zzs(this);
    }

    public static final String zzc(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
    }

    private final void zzd(long j) {
        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzche
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzb();
            }
        }, j);
    }

    private static String zzx(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        androidx.media3.extractor.text.ttml.a.C(sb, str, "/", canonicalName, ":");
        sb.append(message);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzcgx, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzcfb zzcfbVar = this.zze;
        if (zzcfbVar != null) {
            zzcfbVar.zzs(null);
            this.zze.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfa
    public final void zzD() {
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache onRenderedFirstFrame");
    }

    public final zzcfb zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzs(null);
        zzcfb zzcfbVar = this.zze;
        this.zze = null;
        return zzcfbVar;
    }

    public final /* synthetic */ void zzb() {
        long j;
        long j2;
        long j3;
        String strZzc = zzc(this.zzf);
        try {
            long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzaf)).longValue() * 1000;
            long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzw)).intValue();
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcu)).booleanValue();
            synchronized (this) {
                try {
                    if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj > jLongValue) {
                        StringBuilder sb = new StringBuilder(String.valueOf(jLongValue).length() + 27);
                        sb.append("Timeout reached. Limit: ");
                        sb.append(jLongValue);
                        sb.append(" ms");
                        throw new IOException(sb.toString());
                    }
                    if (this.zzg) {
                        throw new IOException("Abort requested before buffering finished. ");
                    }
                    if (!this.zzh) {
                        if (!this.zze.zzB()) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long jZzH = this.zze.zzH();
                        if (jZzH > 0) {
                            long jZzN = this.zze.zzN();
                            if (jZzN != this.zzk) {
                                boolean z2 = jZzN > 0;
                                j2 = jZzH;
                                j3 = jZzN;
                                j = jIntValue;
                                zzm(this.zzf, strZzc, j3, j2, z2, zBooleanValue ? this.zze.zzI() : -1L, zBooleanValue ? this.zze.zzJ() : -1L, zBooleanValue ? this.zze.zzK() : -1L, zzcfb.zzP(), zzcfb.zzQ());
                                this.zzk = j3;
                            } else {
                                j = jIntValue;
                                j2 = jZzH;
                                j3 = jZzN;
                            }
                            if (j3 >= j2) {
                                zzp(this.zzf, strZzc, j2);
                            } else if (this.zze.zzO() >= j && j3 > 0) {
                            }
                        }
                        zzd(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzag)).longValue());
                        return;
                    }
                    com.google.android.gms.ads.internal.zzt.zzB().zzd(this.zzi);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e2) {
            String str = this.zzf;
            String message = e2.getMessage();
            String strQ = androidx.media3.extractor.text.ttml.a.q(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str, " Exception: ", message);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strQ);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e2, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(this.zzf, strZzc, "error", zzx("error", e2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final boolean zze(String str) {
        return zzf(str, new String[]{str});
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final boolean zzf(String str, String[] strArr) {
        long j;
        long j2;
        long j3;
        long j4;
        this.zzf = str;
        String strZzc = zzc(str);
        String str2 = " ms";
        String str3 = "Timeout reached. Limit: ";
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i2 = 0; i2 < strArr.length; i2++) {
                uriArr[i2] = Uri.parse(strArr[i2]);
            }
            this.zze.zzq(uriArr, this.zzb);
            zzcfk zzcfkVar = (zzcfk) this.zzc.get();
            if (zzcfkVar != null) {
                zzcfkVar.zzt(strZzc, this);
            }
            Clock clockZzk = com.google.android.gms.ads.internal.zzt.zzk();
            long jCurrentTimeMillis = clockZzk.currentTimeMillis();
            long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzag)).longValue();
            long jLongValue2 = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzaf)).longValue() * 1000;
            long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzw)).intValue();
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcu)).booleanValue();
            long j5 = -1;
            while (true) {
                synchronized (this) {
                    try {
                        if (clockZzk.currentTimeMillis() - jCurrentTimeMillis > jLongValue2) {
                            long j6 = jLongValue2;
                            StringBuilder sb = new StringBuilder(String.valueOf(j6).length() + 27);
                            sb.append(str3);
                            sb.append(j6);
                            sb.append(str2);
                            throw new IOException(sb.toString());
                        }
                        if (this.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (!this.zzh) {
                            if (!this.zze.zzB()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            long jZzH = this.zze.zzH();
                            if (jZzH > 0) {
                                long jZzN = this.zze.zzN();
                                if (jZzN != j5) {
                                    long j7 = jLongValue;
                                    j3 = jZzH;
                                    j2 = j7;
                                    j4 = jZzN;
                                    zzm(str, strZzc, j4, j3, jZzN > 0, zBooleanValue ? this.zze.zzI() : -1L, zBooleanValue ? this.zze.zzJ() : -1L, zBooleanValue ? this.zze.zzK() : -1L, zzcfb.zzP(), zzcfb.zzQ());
                                    j5 = j4;
                                } else {
                                    j2 = jLongValue;
                                    j3 = jZzH;
                                    j4 = jZzN;
                                }
                                if (j4 >= j3) {
                                    zzp(str, strZzc, j3);
                                } else if (this.zze.zzO() < jIntValue || j4 <= 0) {
                                    j = j2;
                                }
                            } else {
                                str2 = str2;
                                str3 = str3;
                                jLongValue2 = jLongValue2;
                                jIntValue = jIntValue;
                                j = jLongValue;
                            }
                            try {
                                wait(j);
                            } catch (InterruptedException unused) {
                                throw new IOException("Wait interrupted.");
                            }
                        }
                        return true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
                jLongValue = j;
                str2 = str2;
                jLongValue2 = jLongValue2;
                jIntValue = jIntValue;
                str3 = str3;
                clockZzk = clockZzk;
            }
        } catch (Exception e2) {
            String message = e2.getMessage();
            String strQ = androidx.media3.extractor.text.ttml.a.q(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str, " Exception: ", message);
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strQ);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e2, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(str, strZzc, "error", zzx("error", e2));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final boolean zzg(String str, String[] strArr, zzcgp zzcgpVar) {
        this.zzf = str;
        this.zzi = zzcgpVar;
        String strZzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i2 = 0; i2 < strArr.length; i2++) {
                uriArr[i2] = Uri.parse(strArr[i2]);
            }
            this.zze.zzq(uriArr, this.zzb);
            zzcfk zzcfkVar = (zzcfk) this.zzc.get();
            if (zzcfkVar != null) {
                zzcfkVar.zzt(strZzc, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            this.zzk = -1L;
            zzd(0L);
            return true;
        } catch (Exception e2) {
            String message = e2.getMessage();
            String strQ = androidx.media3.extractor.text.ttml.a.q(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str, " Exception: ", message);
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strQ);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e2, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(str, strZzc, "error", zzx("error", e2));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void zzh(int i2) {
        this.zze.zzG(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void zzi(int i2) {
        this.zze.zzF(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void zzj(int i2) {
        this.zze.zzy(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void zzk(int i2) {
        this.zze.zzz(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void zzl() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzq(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfa
    public final void zzr(final boolean z2, final long j) {
        final zzcfk zzcfkVar = (zzcfk) this.zzc.get();
        if (zzcfkVar != null) {
            zzcdo.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcfkVar.zzu(z2, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfa
    public final void zzs(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcfa
    public final void zzt(int i2, int i3) {
    }

    @Override // com.google.android.gms.internal.ads.zzcfa
    public final void zzu(String str, Exception exc) {
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache error", exc);
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcfa
    public final void zzv(String str, Exception exc) {
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache exception", exc);
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "VideoStreamExoPlayerCache.onException");
    }
}
