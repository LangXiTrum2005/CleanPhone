package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
final class zztr implements zzug {
    private final MediaCodec zza;
    private final zztw zzb;
    private final zzuh zzc;
    private final zzuc zzd;
    private boolean zze;
    private int zzf = 0;

    public /* synthetic */ zztr(MediaCodec mediaCodec, HandlerThread handlerThread, zzuh zzuhVar, zzuc zzucVar, byte[] bArr) {
        this.zza = mediaCodec;
        this.zzb = new zztw(handlerThread);
        this.zzc = zzuhVar;
        this.zzd = zzucVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzv(int i2, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i2 == 1) {
            sb.append("Audio");
        } else if (i2 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i2);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zza(int i2, int i3, int i4, long j, int i5) {
        this.zzc.zzb(i2, 0, i4, j, i5);
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzb(int i2, int i3, zzie zzieVar, long j, int i4) {
        this.zzc.zzc(i2, 0, zzieVar, j, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzc(int i2, boolean z2) {
        this.zza.releaseOutputBuffer(i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzd(int i2, long j) {
        this.zza.releaseOutputBuffer(i2, j);
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final int zze() {
        this.zzc.zzg();
        return this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final int zzf(MediaCodec.BufferInfo bufferInfo) {
        this.zzc.zzg();
        return this.zzb.zze(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final MediaFormat zzg() {
        return this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final ByteBuffer zzh(int i2) {
        return this.zza.getInputBuffer(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzi(final Runnable runnable) {
        this.zzb.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zztn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzr(runnable);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final ByteBuffer zzj(int i2) {
        return this.zza.getOutputBuffer(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzk() {
        this.zzc.zze();
        MediaCodec mediaCodec = this.zza;
        mediaCodec.flush();
        this.zzb.zzg();
        mediaCodec.start();
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzl() {
        zzuc zzucVar;
        zzuc zzucVar2;
        try {
            try {
                if (this.zzf == 1) {
                    this.zzc.zzf();
                    this.zzb.zzb();
                }
                this.zzf = 2;
            } finally {
                if (!this.zze) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        this.zza.stop();
                    }
                    if (i2 >= 35 && (zzucVar2 = this.zzd) != null) {
                        zzucVar2.zzc(this.zza);
                    }
                    this.zza.release();
                    this.zze = true;
                }
            }
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && (zzucVar = this.zzd) != null) {
                zzucVar.zzc(this.zza);
            }
            this.zza.release();
            this.zze = true;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final boolean zzm(zzuf zzufVar) {
        this.zzb.zzh(zzufVar);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzn(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzo() {
        this.zza.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzp(Bundle bundle) {
        this.zzc.zzd(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzq(int i2) {
        this.zza.setVideoScalingMode(i2);
    }

    public final /* synthetic */ void zzr(Runnable runnable) {
        this.zzc.zzg();
        this.zzb.zzc(runnable);
    }

    public final /* synthetic */ void zzs(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i2) {
        zzuc zzucVar;
        zztw zztwVar = this.zzb;
        MediaCodec mediaCodec = this.zza;
        zztwVar.zza(mediaCodec);
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, i2);
        Trace.endSection();
        this.zzc.zza();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (zzucVar = this.zzd) != null) {
            zzucVar.zzb(mediaCodec);
        }
        this.zzf = 1;
    }
}
