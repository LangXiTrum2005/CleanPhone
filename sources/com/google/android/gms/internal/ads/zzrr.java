package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.F6;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(23)
final class zzrr implements zzse {

    @GuardedBy("MESSAGE_PARAMS_INSTANCE_POOL")
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzda zzg;
    private boolean zzh;

    public zzrr(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzda zzdaVar = new zzda(zzcx.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzdaVar;
        this.zzf = new AtomicReference();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static /* bridge */ /* synthetic */ void zza(zzrr zzrrVar, Message message) {
        zzrq zzrqVar;
        ArrayDeque arrayDeque;
        int i = message.what;
        zzrq zzrqVar2 = null;
        if (i != 1) {
            if (i == 2) {
                zzrqVar = (zzrq) message.obj;
                int i2 = zzrqVar.zza;
                MediaCodec.CryptoInfo cryptoInfo = zzrqVar.zzd;
                long j = zzrqVar.zze;
                int i3 = zzrqVar.zzf;
                try {
                    synchronized (zzb) {
                        zzrrVar.zzc.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                    }
                } catch (RuntimeException e) {
                    zzro.zza(zzrrVar.zzf, null, e);
                }
            } else if (i == 3) {
                zzrrVar.zzg.zze();
            } else if (i != 4) {
                zzro.zza(zzrrVar.zzf, null, new IllegalStateException(String.valueOf(message.what)));
            } else {
                try {
                    zzrrVar.zzc.setParameters((Bundle) message.obj);
                } catch (RuntimeException e2) {
                    zzro.zza(zzrrVar.zzf, null, e2);
                }
            }
            if (zzrqVar2 != null) {
                arrayDeque = zza;
                synchronized (arrayDeque) {
                    arrayDeque.add(zzrqVar2);
                }
            }
        }
        zzrqVar = (zzrq) message.obj;
        try {
            zzrrVar.zzc.queueInputBuffer(zzrqVar.zza, 0, zzrqVar.zzc, zzrqVar.zze, zzrqVar.zzf);
        } catch (RuntimeException e3) {
            zzro.zza(zzrrVar.zzf, null, e3);
        }
        zzrqVar2 = zzrqVar;
        if (zzrqVar2 != null) {
            arrayDeque = zza;
            synchronized (arrayDeque) {
                arrayDeque.add(zzrqVar2);
            }
        }
    }

    private static zzrq zzi() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new zzrq();
                }
                return (zzrq) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    private static byte[] zzj(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
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

    @Nullable
    private static int[] zzk(@Nullable int[] iArr, @Nullable int[] iArr2) {
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

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzb() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                handler.getClass();
                handler.removeCallbacksAndMessages(null);
                this.zzg.zzc();
                Handler handler2 = this.zze;
                handler2.getClass();
                handler2.obtainMessage(3).sendToTarget();
                this.zzg.zza();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzc() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzd(int i, int i2, int i3, long j, int i4) {
        zzc();
        zzrq zzrqVarZzi = zzi();
        zzrqVarZzi.zza(i, 0, i3, j, i4);
        Handler handler = this.zze;
        int i5 = zzei.zza;
        handler.obtainMessage(1, zzrqVarZzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zze(int i, int i2, zzhe zzheVar, long j, int i3) {
        zzc();
        zzrq zzrqVarZzi = zzi();
        zzrqVarZzi.zza(i, 0, 0, j, 0);
        MediaCodec.CryptoInfo cryptoInfo = zzrqVarZzi.zzd;
        cryptoInfo.numSubSamples = zzheVar.zzf;
        cryptoInfo.numBytesOfClearData = zzk(zzheVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzk(zzheVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrZzj = zzj(zzheVar.zzb, cryptoInfo.key);
        bArrZzj.getClass();
        cryptoInfo.key = bArrZzj;
        byte[] bArrZzj2 = zzj(zzheVar.zza, cryptoInfo.iv);
        bArrZzj2.getClass();
        cryptoInfo.iv = bArrZzj2;
        cryptoInfo.mode = zzheVar.zzc;
        if (zzei.zza >= 24) {
            F6.q();
            cryptoInfo.setPattern(F6.j(zzheVar.zzg, zzheVar.zzh));
        }
        this.zze.obtainMessage(2, zzrqVarZzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzf(Bundle bundle) {
        zzc();
        Handler handler = this.zze;
        int i = zzei.zza;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzg() {
        if (this.zzh) {
            zzb();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzh() {
        if (this.zzh) {
            return;
        }
        this.zzd.start();
        this.zze = new zzrp(this, this.zzd.getLooper());
        this.zzh = true;
    }
}
