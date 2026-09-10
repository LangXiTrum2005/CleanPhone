package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class zzvd implements zzug {
    private final MediaCodec zza;
    private final zzuc zzb;

    public /* synthetic */ zzvd(MediaCodec mediaCodec, zzuc zzucVar, byte[] bArr) {
        this.zza = mediaCodec;
        this.zzb = zzucVar;
        if (Build.VERSION.SDK_INT < 35 || zzucVar == null) {
            return;
        }
        zzucVar.zzb(mediaCodec);
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zza(int i2, int i3, int i4, long j, int i5) {
        this.zza.queueInputBuffer(i2, 0, i4, j, i5);
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzb(int i2, int i3, zzie zzieVar, long j, int i4) {
        this.zza.queueSecureInputBuffer(i2, 0, zzieVar.zzb(), j, i4);
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
        return this.zza.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final int zzf(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.zza.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final MediaFormat zzg() {
        return this.zza.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final ByteBuffer zzh(int i2) {
        return this.zza.getInputBuffer(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final ByteBuffer zzj(int i2) {
        return this.zza.getOutputBuffer(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzk() {
        this.zza.flush();
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzl() {
        zzuc zzucVar;
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && i2 < 33) {
                this.zza.stop();
            }
            if (i2 >= 35 && this.zzb != null) {
            }
        } finally {
            if (Build.VERSION.SDK_INT >= 35 && (zzucVar = this.zzb) != null) {
                zzucVar.zzc(this.zza);
            }
            this.zza.release();
        }
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
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzug
    public final void zzq(int i2) {
        this.zza.setVideoScalingMode(i2);
    }
}
