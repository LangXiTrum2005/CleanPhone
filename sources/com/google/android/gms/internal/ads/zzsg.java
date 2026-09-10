package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Build;
import com.inmobi.commons.core.configs.CrashConfig;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
final class zzsg {
    private boolean zzA;
    private long zzB;
    private final zzsf zza;
    private final zzdn zzb;
    private final long[] zzc;
    private final AudioTrack zzd;
    private final int zze;
    private final long zzf;
    private final boolean zzg;
    private final zzrh zzh;
    private float zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private Method zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zzsg(zzsf zzsfVar, zzdn zzdnVar, AudioTrack audioTrack, int i2, int i3, int i4) {
        this.zza = zzsfVar;
        this.zzb = zzdnVar;
        this.zzd = audioTrack;
        try {
            this.zzm = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzc = new long[10];
        this.zzz = -9223372036854775807L;
        this.zzy = -9223372036854775807L;
        this.zzh = new zzrh(audioTrack, zzsfVar);
        int sampleRate = audioTrack.getSampleRate();
        this.zze = sampleRate;
        boolean zZzA = zzfj.zzA(i2);
        this.zzg = zZzA;
        this.zzf = zZzA ? zzfj.zzr(i4 / i3, sampleRate) : -9223372036854775807L;
        this.zzq = 0L;
        this.zzr = 0L;
        this.zzA = false;
        this.zzB = 0L;
        this.zzu = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzo = 0L;
        this.zzn = 0L;
        this.zzi = 1.0f;
        this.zzj = -9223372036854775807L;
    }

    private final void zzg(long j) {
        long j2 = this.zzj;
        if (j2 == -9223372036854775807L || j < j2) {
            return;
        }
        long jZzw = zzfj.zzw(j - j2, this.zzi);
        zzdn zzdnVar = this.zzb;
        long jZza = zzdnVar.zza() - zzfj.zzp(jZzw);
        this.zzj = -9223372036854775807L;
        this.zza.zzb(jZza);
    }

    private final long zzh(long j) {
        long jZzv;
        if (this.zzt == 0) {
            jZzv = this.zzu != -9223372036854775807L ? zzfj.zzr(zzl(), this.zze) : zzj();
        } else {
            jZzv = zzfj.zzv(j + this.zzk, this.zzi);
        }
        long jMax = Math.max(0L, jZzv - this.zzn);
        return this.zzu != -9223372036854775807L ? Math.min(zzfj.zzr(this.zzx, this.zze), jMax) : jMax;
    }

    private final void zzi() {
        this.zzk = 0L;
        this.zzt = 0;
        this.zzs = 0;
        this.zzl = 0L;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
    }

    private final long zzj() {
        return zzfj.zzr(zzk(), this.zze);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    private final long zzk() {
        if (this.zzu != -9223372036854775807L) {
            return Math.min(this.zzx, zzl());
        }
        long jZzb = this.zzb.zzb();
        if (jZzb - this.zzp >= 5) {
            AudioTrack audioTrack = this.zzd;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                if (Build.VERSION.SDK_INT > 29) {
                    if (this.zzq > playbackHeadPosition) {
                        this.zzr++;
                    }
                    this.zzq = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.zzq <= 0 || playState != 3) {
                    this.zzv = -9223372036854775807L;
                    if (this.zzq > playbackHeadPosition) {
                        this.zzr++;
                    }
                    this.zzq = playbackHeadPosition;
                } else if (this.zzv == -9223372036854775807L) {
                    this.zzv = jZzb;
                }
            }
            this.zzp = jZzb;
        }
        return this.zzq + this.zzB + (this.zzr << 32);
    }

    private final long zzl() {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.zzw;
        }
        return this.zzw + zzfj.zzs(zzfj.zzv(zzfj.zzq(this.zzb.zzb()) - this.zzu, this.zzi), this.zze);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002e  */
    public final long zza() {
        long j;
        Method method;
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        long j2 = 1000;
        if (audioTrack.getPlayState() == 3) {
            long jZzc = this.zzb.zzc() / 1000;
            if (jZzc - this.zzl >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                long jZzj = zzj();
                if (jZzj != 0) {
                    long[] jArr = this.zzc;
                    jArr[this.zzs] = zzfj.zzw(jZzj, this.zzi) - jZzc;
                    this.zzs = (this.zzs + 1) % 10;
                    int i2 = this.zzt;
                    if (i2 < 10) {
                        this.zzt = i2 + 1;
                    }
                    this.zzl = jZzc;
                    this.zzk = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.zzt;
                        if (i3 >= i4) {
                            break;
                        }
                        this.zzk = (jArr[i3] / ((long) i4)) + this.zzk;
                        i3++;
                        j2 = j2;
                    }
                } else {
                    j = 1000;
                }
            }
            j = j2;
            if (this.zzg && (method = this.zzm) != null && jZzc - this.zzo >= 500000) {
                try {
                    Integer num = (Integer) method.invoke(audioTrack, new Object[0]);
                    String str = zzfj.zza;
                    long jIntValue = (((long) num.intValue()) * j) - this.zzf;
                    this.zzn = jIntValue;
                    long jMax = Math.max(jIntValue, 0L);
                    this.zzn = jMax;
                    if (jMax > 5000000) {
                        this.zza.zza(jMax);
                        this.zzn = 0L;
                    }
                } catch (Exception unused) {
                    this.zzm = null;
                }
                this.zzo = jZzc;
            }
            this.zzh.zza(jZzc, this.zzi, zzh(jZzc));
        } else {
            j = 1000;
        }
        long jZzc2 = this.zzb.zzc() / j;
        zzrh zzrhVar = this.zzh;
        boolean zZzb = zzrhVar.zzb();
        long jZze = zZzb ? zzrhVar.zze(jZzc2, this.zzi) : zzh(jZzc2);
        int playState = audioTrack.getPlayState();
        if (playState == 3) {
            if (zZzb || !zzrhVar.zzc()) {
                zzg(jZze);
            }
            long j3 = this.zzz;
            if (j3 != -9223372036854775807L) {
                long j4 = jZze - this.zzy;
                long jZzv = zzfj.zzv(jZzc2 - j3, this.zzi);
                long j5 = this.zzy + jZzv;
                long jAbs = Math.abs(j5 - jZze);
                if (j4 != 0 && jAbs < 1000000) {
                    long j6 = (jZzv * 10) / 100;
                    jZze = Math.max(j5 - j6, Math.min(jZze, j5 + j6));
                }
            }
            this.zzz = jZzc2;
            this.zzy = jZze;
        } else if (playState == 1) {
            zzg(jZze);
            return jZze;
        }
        return jZze;
    }

    public final void zzb() {
        if (this.zzu != -9223372036854775807L) {
            this.zzu = zzfj.zzq(this.zzb.zzb());
        }
        this.zzj = zzj();
        this.zzh.zzd();
    }

    public final boolean zzc() {
        AudioTrack audioTrack = this.zzd;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzd(long j) {
        return this.zzv != -9223372036854775807L && j > 0 && this.zzb.zzb() - this.zzv >= 200;
    }

    public final void zze(long j) {
        this.zzw = zzk();
        this.zzu = zzfj.zzq(this.zzb.zzb());
        this.zzx = j;
    }

    public final void zzf() {
        zzi();
        if (this.zzu == -9223372036854775807L) {
            this.zzh.zzd();
        }
        this.zzw = zzk();
    }
}
