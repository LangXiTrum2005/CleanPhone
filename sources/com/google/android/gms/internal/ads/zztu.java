package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
final class zztu implements zzuh {
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzdq zzg;
    private boolean zzh;

    public zztu(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzdq zzdqVar = new zzdq(zzdn.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzdqVar;
        this.zzf = new AtomicReference();
    }

    private static zztt zzi() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new zztt();
                }
                return (zztt) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static int[] zzj(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    private static byte[] zzk(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzuh
    public final void zza() {
        if (this.zzh) {
            return;
        }
        HandlerThread handlerThread = this.zzd;
        handlerThread.start();
        this.zze = new zzts(this, handlerThread.getLooper());
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzuh
    public final void zzb(int i2, int i3, int i4, long j, int i5) {
        zzg();
        zztt zzttVarZzi = zzi();
        zzttVarZzi.zza(i2, 0, i4, j, i5);
        Handler handler = this.zze;
        String str = zzfj.zza;
        handler.obtainMessage(1, zzttVarZzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzuh
    public final void zzc(int i2, int i3, zzie zzieVar, long j, int i4) {
        zzg();
        zztt zzttVarZzi = zzi();
        zzttVarZzi.zza(i2, 0, 0, j, i4);
        MediaCodec.CryptoInfo cryptoInfo = zzttVarZzi.zzd;
        cryptoInfo.numSubSamples = zzieVar.zzf;
        cryptoInfo.numBytesOfClearData = zzj(zzieVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzj(zzieVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrZzk = zzk(zzieVar.zzb, cryptoInfo.key);
        bArrZzk.getClass();
        cryptoInfo.key = bArrZzk;
        byte[] bArrZzk2 = zzk(zzieVar.zza, cryptoInfo.iv);
        bArrZzk2.getClass();
        cryptoInfo.iv = bArrZzk2;
        cryptoInfo.mode = zzieVar.zzc;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zzieVar.zzg, zzieVar.zzh));
        Handler handler = this.zze;
        String str = zzfj.zza;
        handler.obtainMessage(2, zzttVarZzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzuh
    public final void zzd(Bundle bundle) {
        zzg();
        Handler handler = this.zze;
        String str = zzfj.zza;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzuh
    public final void zze() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                if (handler == null) {
                    throw null;
                }
                handler.removeCallbacksAndMessages(null);
                zzdq zzdqVar = this.zzg;
                zzdqVar.zzb();
                Handler handler2 = this.zze;
                if (handler2 == null) {
                    throw null;
                }
                handler2.obtainMessage(3).sendToTarget();
                zzdqVar.zzc();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzuh
    public final void zzf() {
        if (this.zzh) {
            zze();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzuh
    public final void zzg() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    public final /* synthetic */ void zzh(Message message) {
        int i2 = message.what;
        zztt zzttVar = null;
        if (i2 == 1) {
            zztt zzttVar2 = (zztt) message.obj;
            try {
                this.zzc.queueInputBuffer(zzttVar2.zza, 0, zzttVar2.zzc, zzttVar2.zze, zzttVar2.zzf);
            } catch (RuntimeException e2) {
                AtomicReference atomicReference = this.zzf;
                while (!atomicReference.compareAndSet(null, e2) && atomicReference.get() == null) {
                }
            }
            zzttVar = zzttVar2;
        } else if (i2 == 2) {
            zztt zzttVar3 = (zztt) message.obj;
            int i3 = zzttVar3.zza;
            MediaCodec.CryptoInfo cryptoInfo = zzttVar3.zzd;
            long j = zzttVar3.zze;
            int i4 = zzttVar3.zzf;
            try {
                synchronized (zzb) {
                    try {
                        this.zzc.queueSecureInputBuffer(i3, 0, cryptoInfo, j, i4);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (RuntimeException e3) {
                AtomicReference atomicReference2 = this.zzf;
                while (!atomicReference2.compareAndSet(null, e3) && atomicReference2.get() == null) {
                }
            }
            zzttVar = zzttVar3;
        } else if (i2 == 3) {
            this.zzg.zza();
        } else if (i2 != 4) {
            AtomicReference atomicReference3 = this.zzf;
            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
            while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
            }
        } else {
            try {
                this.zzc.setParameters((Bundle) message.obj);
            } catch (RuntimeException e4) {
                AtomicReference atomicReference4 = this.zzf;
                while (!atomicReference4.compareAndSet(null, e4) && atomicReference4.get() == null) {
                }
            }
        }
        if (zzttVar != null) {
            ArrayDeque arrayDeque = zza;
            synchronized (arrayDeque) {
                arrayDeque.add(zzttVar);
            }
        }
    }
}
