package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class zzrz implements zzpz {
    private static final Object zza = new Object();
    private static ScheduledExecutorService zzb;
    private static int zzc;
    private final AudioTrack zzd;
    private final zzqi zze;
    private zzrq zzf;
    private final zzsg zzg;
    private final boolean zzh;
    private final int zzi;
    private final zzry zzj;
    private final zzed zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private final zzsd zzr;

    public zzrz(AudioTrack audioTrack, zzqi zzqiVar, zzsd zzsdVar, zzdn zzdnVar) {
        this.zzd = audioTrack;
        this.zze = zzqiVar;
        this.zzr = zzsdVar;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        zzed zzedVar = new zzed(looperMyLooper, zzdnVar);
        this.zzk = zzedVar;
        zzedVar.zzg(false);
        boolean zZzA = zzfj.zzA(zzqiVar.zza);
        this.zzh = zZzA;
        if (zZzA) {
            this.zzi = zzfj.zzD(zzqiVar.zza) * Integer.bitCount(zzqiVar.zzc);
        } else {
            this.zzi = -1;
        }
        byte b2 = 0;
        byte b3 = 0;
        this.zzg = new zzsg(new zzrs(this, null), zzdnVar, audioTrack, zzqiVar.zza, this.zzi, zzqiVar.zze);
        if (zzsdVar != null) {
            this.zzf = new zzrq(audioTrack, zzsdVar, b3 == true ? 1 : 0);
        }
        this.zzj = zzg() ? new zzry(this, b2 == true ? 1 : 0) : null;
    }

    public static /* synthetic */ void zzp(AudioTrack audioTrack, Handler handler, final zzed zzedVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrk
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzri zzriVar = zzri.zza;
                        zzed zzedVar2 = zzedVar;
                        zzedVar2.zzd(-1, zzriVar);
                        zzedVar2.zze();
                    }
                });
            }
            synchronized (zza) {
                try {
                    int i2 = zzc - 1;
                    zzc = i2;
                    if (i2 == 0) {
                        ScheduledExecutorService scheduledExecutorService = zzb;
                        if (scheduledExecutorService == null) {
                            throw null;
                        }
                        scheduledExecutorService.shutdown();
                        zzb = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrl
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzri zzriVar = zzri.zza;
                        zzed zzedVar2 = zzedVar;
                        zzedVar2.zzd(-1, zzriVar);
                        zzedVar2.zze();
                    }
                });
            }
            synchronized (zza) {
                try {
                    int i3 = zzc - 1;
                    zzc = i3;
                    if (i3 == 0) {
                        ScheduledExecutorService scheduledExecutorService2 = zzb;
                        if (scheduledExecutorService2 == null) {
                            throw null;
                        }
                        scheduledExecutorService2.shutdown();
                        zzb = null;
                    }
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzt, reason: merged with bridge method [inline-methods] */
    public final long zzq() {
        if (!this.zzh) {
            return this.zzn;
        }
        long j = this.zzm;
        int i2 = this.zzi;
        String str = zzfj.zza;
        long j2 = i2;
        return ((j + j2) - 1) / j2;
    }

    @Override // com.google.android.gms.internal.ads.zzpz
    public final void zza() {
        this.zzg.zzb();
        if (!this.zzl || zzg()) {
            this.zzd.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpz
    public final void zzb() {
        this.zzg.zzf();
        if (!this.zzl || zzg()) {
            this.zzd.pause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpz
    public final boolean zzc(ByteBuffer byteBuffer, int i2, long j) throws zzpy {
        zzsd zzsdVar;
        boolean z2 = this.zzh;
        if (!z2 && this.zzo == 0) {
            this.zzo = zzss.zzD(this.zze.zza, byteBuffer);
        }
        zzq();
        int underrunCount = this.zzd.getUnderrunCount();
        int i3 = this.zzp;
        this.zzp = underrunCount;
        if (underrunCount > i3) {
            zzed zzedVar = this.zzk;
            zzedVar.zzd(-1, zzrj.zza);
            zzedVar.zze();
        }
        int iRemaining = byteBuffer.remaining();
        boolean z3 = true;
        int iWrite = this.zzd.write(byteBuffer, byteBuffer.remaining(), 1);
        if (iWrite >= 0) {
            z3 = iWrite == iRemaining;
            if (z2) {
                this.zzm += (long) iWrite;
                return z3;
            }
            if (z3) {
                this.zzn = (((long) this.zzo) * ((long) i2)) + this.zzn;
            }
            return z3;
        }
        if (iWrite != -6 && iWrite != -32) {
            z3 = false;
        }
        if (z3 && (zzsdVar = this.zzr) != null) {
            zzse zzseVar = zzsdVar.zza;
            if (zzseVar.zzi() != null) {
                zzpp zzppVar = zzpp.zza;
                zzseVar.zzh(zzppVar);
                zzseVar.zzi().zza(zzppVar);
            }
        }
        throw new zzpy(iWrite, z3);
    }

    @Override // com.google.android.gms.internal.ads.zzpz
    public final void zzd() {
        if (this.zzl) {
            return;
        }
        this.zzl = true;
        this.zzg.zze(zzq());
        this.zzd.stop();
    }

    @Override // com.google.android.gms.internal.ads.zzpz
    public final void zze() {
        if (this.zzg.zzc()) {
            this.zzd.pause();
        }
        if (Build.VERSION.SDK_INT >= 29 && zzg()) {
            zzry zzryVar = this.zzj;
            zzryVar.getClass();
            zzryVar.zza();
        }
        zzrq zzrqVar = this.zzf;
        if (zzrqVar != null) {
            zzrqVar.zzd();
            this.zzf = null;
        }
        final AudioTrack audioTrack = this.zzd;
        final zzed zzedVar = this.zzk;
        final Handler handlerZzc = zzfj.zzc(null);
        synchronized (zza) {
            try {
                if (zzb == null) {
                    zzb = zzfj.zzg("ExoPlayer:AudioTrackReleaseThread");
                }
                zzc++;
                zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrm
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzrz.zzp(audioTrack, handlerZzc, zzedVar);
                    }
                }, 20L, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpz
    public final void zzf(float f) {
        this.zzd.setVolume(f);
    }

    @Override // com.google.android.gms.internal.ads.zzpz
    public final boolean zzg() {
        return Build.VERSION.SDK_INT >= 29 && this.zzd.isOffloadedPlayback();
    }

    @Override // com.google.android.gms.internal.ads.zzpz
    public final int zzh() {
        return this.zzd.getAudioSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzpz
    public final int zzi() {
        return this.zzd.getSampleRate();
    }

    @Override // com.google.android.gms.internal.ads.zzpz
    public final long zzj() {
        return this.zzd.getBufferSizeInFrames();
    }

    @Override // com.google.android.gms.internal.ads.zzpz
    public final long zzk() {
        return this.zzg.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzpz
    public final boolean zzl() {
        return this.zzg.zzd(zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzpz
    public final void zzm(zzpx zzpxVar) {
        this.zzk.zzb(zzpxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpz
    public final void zzn(zzpn zzpnVar) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        LogSessionId logSessionIdZza = zzpnVar.zza();
        LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
        if (logSessionIdZza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        this.zzd.setLogSessionId(logSessionIdZza);
    }

    @Override // com.google.android.gms.internal.ads.zzpz
    public final void zzo(AudioDeviceInfo audioDeviceInfo) {
        this.zzd.setPreferredDevice(audioDeviceInfo);
    }

    public final /* synthetic */ AudioTrack zzr() {
        return this.zzd;
    }

    public final /* synthetic */ zzed zzs() {
        return this.zzk;
    }
}
