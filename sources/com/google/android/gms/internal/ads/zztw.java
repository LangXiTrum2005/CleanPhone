package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.collection.CircularIntArray;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes4.dex */
final class zztw extends MediaCodec.Callback {
    private final HandlerThread zzb;
    private Handler zzc;
    private MediaFormat zzh;
    private MediaFormat zzi;
    private MediaCodec.CodecException zzj;
    private MediaCodec.CryptoException zzk;
    private long zzl;
    private boolean zzm;
    private IllegalStateException zzn;
    private zzuf zzo;
    private final Object zza = new Object();
    private final CircularIntArray zzd = new CircularIntArray();
    private final CircularIntArray zze = new CircularIntArray();
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();

    public zztw(HandlerThread handlerThread) {
        this.zzb = handlerThread;
    }

    private final void zzj() {
        ArrayDeque arrayDeque = this.zzg;
        if (!arrayDeque.isEmpty()) {
            this.zzi = (MediaFormat) arrayDeque.getLast();
        }
        CircularIntArray circularIntArray = this.zzd;
        circularIntArray.f3738c = circularIntArray.f3737b;
        CircularIntArray circularIntArray2 = this.zze;
        circularIntArray2.f3738c = circularIntArray2.f3737b;
        this.zzf.clear();
        arrayDeque.clear();
    }

    private final boolean zzk() {
        return this.zzl > 0 || this.zzm;
    }

    private final void zzl(MediaFormat mediaFormat) {
        this.zze.a(-2);
        this.zzg.add(mediaFormat);
    }

    private final void zzm() {
        IllegalStateException illegalStateException = this.zzn;
        if (illegalStateException != null) {
            this.zzn = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.zzj;
        if (codecException != null) {
            this.zzj = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.zzk;
        if (cryptoException == null) {
            return;
        }
        this.zzk = null;
        throw cryptoException;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.zza) {
            this.zzk = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.zza) {
            this.zzj = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i2) {
        synchronized (this.zza) {
            try {
                this.zzd.a(i2);
                zzuf zzufVar = this.zzo;
                if (zzufVar != null) {
                    zzuq zzuqVar = ((zzuo) zzufVar).zza;
                    if (zzuqVar.zzbf() != null) {
                        zzuqVar.zzbf().zza();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i2, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            try {
                MediaFormat mediaFormat = this.zzi;
                if (mediaFormat != null) {
                    zzl(mediaFormat);
                    this.zzi = null;
                }
                this.zze.a(i2);
                this.zzf.add(bufferInfo);
                zzuf zzufVar = this.zzo;
                if (zzufVar != null) {
                    zzuq zzuqVar = ((zzuo) zzufVar).zza;
                    if (zzuqVar.zzbf() != null) {
                        zzuqVar.zzbf().zza();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.zza) {
            zzl(mediaFormat);
            this.zzi = null;
        }
    }

    public final void zza(MediaCodec mediaCodec) {
        zzgqa.zzi(this.zzc == null);
        HandlerThread handlerThread = this.zzb;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.zzc = handler;
    }

    public final void zzb() {
        synchronized (this.zza) {
            this.zzm = true;
            this.zzb.quit();
            zzj();
        }
    }

    public final void zzc(Runnable runnable) {
        synchronized (this.zza) {
            zzm();
            runnable.run();
        }
    }

    public final int zzd() {
        synchronized (this.zza) {
            try {
                zzm();
                int iB = -1;
                if (zzk()) {
                    return -1;
                }
                CircularIntArray circularIntArray = this.zzd;
                if (!(circularIntArray.f3737b == circularIntArray.f3738c)) {
                    iB = circularIntArray.b();
                }
                return iB;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int zze(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            try {
                zzm();
                if (zzk()) {
                    return -1;
                }
                CircularIntArray circularIntArray = this.zze;
                if (circularIntArray.f3737b == circularIntArray.f3738c) {
                    return -1;
                }
                int iB = circularIntArray.b();
                if (iB >= 0) {
                    if (this.zzh == null) {
                        throw null;
                    }
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.zzf.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iB == -2) {
                    this.zzh = (MediaFormat) this.zzg.remove();
                    iB = -2;
                }
                return iB;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final MediaFormat zzf() {
        MediaFormat mediaFormat;
        synchronized (this.zza) {
            try {
                mediaFormat = this.zzh;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public final void zzg() {
        synchronized (this.zza) {
            this.zzl++;
            Handler handler = this.zzc;
            String str = zzfj.zza;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zztv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzi();
                }
            });
        }
    }

    public final void zzh(zzuf zzufVar) {
        synchronized (this.zza) {
            this.zzo = zzufVar;
        }
    }

    public final /* synthetic */ void zzi() {
        Object obj = this.zza;
        synchronized (obj) {
            try {
                if (this.zzm) {
                    return;
                }
                long j = this.zzl - 1;
                this.zzl = j;
                if (j > 0) {
                    return;
                }
                if (j >= 0) {
                    zzj();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (obj) {
                    this.zzn = illegalStateException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
