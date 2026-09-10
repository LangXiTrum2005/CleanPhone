package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(23)
final class zzrn implements zzsd {
    private final MediaCodec zza;
    private final zzrt zzb;
    private final zzse zzc;

    @Nullable
    private final zzrz zzd;
    private boolean zze;
    private int zzf = 0;

    public /* synthetic */ zzrn(MediaCodec mediaCodec, HandlerThread handlerThread, zzse zzseVar, zzrz zzrzVar, zzrm zzrmVar) {
        this.zza = mediaCodec;
        this.zzb = new zzrt(handlerThread);
        this.zzc = zzseVar;
        this.zzd = zzrzVar;
    }

    public static /* bridge */ /* synthetic */ void zzh(zzrn zzrnVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        zzrz zzrzVar;
        zzrnVar.zzb.zzf(zzrnVar.zza);
        Trace.beginSection("configureCodec");
        zzrnVar.zza.configure(mediaFormat, surface, (MediaCrypto) null, i);
        Trace.endSection();
        zzrnVar.zzc.zzh();
        Trace.beginSection("startCodec");
        zzrnVar.zza.start();
        Trace.endSection();
        if (zzei.zza >= 35 && (zzrzVar = zzrnVar.zzd) != null) {
            zzrzVar.zza(zzrnVar.zza);
        }
        zzrnVar.zzf = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzt(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final int zza() {
        this.zzc.zzc();
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        this.zzc.zzc();
        return this.zzb.zzb(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final MediaFormat zzc() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    @Nullable
    public final ByteBuffer zzf(int i) {
        return this.zza.getInputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    @Nullable
    public final ByteBuffer zzg(int i) {
        return this.zza.getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    @RequiresApi(35)
    public final void zzi() {
        this.zza.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzj() {
        this.zzc.zzb();
        this.zza.flush();
        this.zzb.zze();
        this.zza.start();
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzk(int i, int i2, int i3, long j, int i4) {
        this.zzc.zzd(i, 0, i3, j, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzl(int i, int i2, zzhe zzheVar, long j, int i3) {
        this.zzc.zze(i, 0, zzheVar, j, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzm() {
        zzrz zzrzVar;
        zzrz zzrzVar2;
        try {
            try {
                if (this.zzf == 1) {
                    this.zzc.zzg();
                    this.zzb.zzh();
                }
                this.zzf = 2;
            } finally {
                if (!this.zze) {
                    int i = zzei.zza;
                    if (i >= 30 && i < 33) {
                        this.zza.stop();
                    }
                    if (i >= 35 && (zzrzVar2 = this.zzd) != null) {
                        zzrzVar2.zzc(this.zza);
                    }
                    this.zza.release();
                    this.zze = true;
                }
            }
        } catch (Throwable th) {
            if (zzei.zza >= 35 && (zzrzVar = this.zzd) != null) {
                zzrzVar.zzc(this.zza);
            }
            this.zza.release();
            this.zze = true;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzn(int i, long j) {
        this.zza.releaseOutputBuffer(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzo(int i, boolean z) {
        this.zza.releaseOutputBuffer(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzp(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzq(Bundle bundle) {
        this.zzc.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzr(int i) {
        this.zza.setVideoScalingMode(i);
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final boolean zzs(zzsc zzscVar) {
        this.zzb.zzg(zzscVar);
        return true;
    }
}
