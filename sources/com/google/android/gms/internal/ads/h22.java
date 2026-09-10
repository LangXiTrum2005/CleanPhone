package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h22 implements n22 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f15078g = new ArrayDeque();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f15079h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f15080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f15081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.localbroadcastmanager.content.a f15082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f15083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qf0 f15084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15085f;

    public h22(MediaCodec mediaCodec, HandlerThread handlerThread) {
        qf0 qf0Var = new qf0();
        this.f15080a = mediaCodec;
        this.f15081b = handlerThread;
        this.f15084e = qf0Var;
        this.f15083d = new AtomicReference();
    }

    public static f22 b() {
        ArrayDeque arrayDeque = f15078g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new f22();
                }
                return (f22) arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.n22
    public final void a(Bundle bundle) {
        zzg();
        androidx.localbroadcastmanager.content.a aVar = this.f15082c;
        String str = uu0.f20901a;
        aVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.n22
    public final void d(int i10, qx1 qx1Var, long j10, int i11) {
        int length;
        int length2;
        int length3;
        int length4;
        zzg();
        f22 f22VarB = b();
        f22VarB.f14190a = i10;
        f22VarB.f14191b = 0;
        f22VarB.f14193d = j10;
        f22VarB.f14194e = i11;
        MediaCodec.CryptoInfo cryptoInfo = f22VarB.f14192c;
        cryptoInfo.numSubSamples = qx1Var.f19235f;
        int[] iArr = qx1Var.f19233d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < (length4 = iArr.length)) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, length4);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = qx1Var.f19234e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < (length3 = iArr2.length)) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, length3);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = qx1Var.f19231b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < (length2 = bArr.length)) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, length2);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = qx1Var.f19230a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < (length = bArr2.length)) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = qx1Var.f19232c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(qx1Var.f19236g, qx1Var.f19237h));
        androidx.localbroadcastmanager.content.a aVar = this.f15082c;
        String str = uu0.f20901a;
        aVar.obtainMessage(2, f22VarB).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.n22
    public final void e(int i10, int i11, int i12, long j10) {
        zzg();
        f22 f22VarB = b();
        f22VarB.f14190a = i10;
        f22VarB.f14191b = i11;
        f22VarB.f14193d = j10;
        f22VarB.f14194e = i12;
        androidx.localbroadcastmanager.content.a aVar = this.f15082c;
        String str = uu0.f20901a;
        aVar.obtainMessage(1, f22VarB).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.n22
    public final void zza() {
        if (this.f15085f) {
            return;
        }
        HandlerThread handlerThread = this.f15081b;
        handlerThread.start();
        this.f15082c = new androidx.localbroadcastmanager.content.a(this, handlerThread.getLooper(), 1);
        this.f15085f = true;
    }

    @Override // com.google.android.gms.internal.ads.n22
    public final void zze() {
        if (this.f15085f) {
            try {
                androidx.localbroadcastmanager.content.a aVar = this.f15082c;
                if (aVar == null) {
                    throw null;
                }
                aVar.removeCallbacksAndMessages(null);
                qf0 qf0Var = this.f15084e;
                synchronized (qf0Var) {
                    qf0Var.f19045a = false;
                }
                androidx.localbroadcastmanager.content.a aVar2 = this.f15082c;
                if (aVar2 == null) {
                    throw null;
                }
                aVar2.obtainMessage(3).sendToTarget();
                synchronized (qf0Var) {
                    while (!qf0Var.f19045a) {
                        qf0Var.wait();
                    }
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.n22
    public final void zzf() {
        if (this.f15085f) {
            zze();
            this.f15081b.quit();
        }
        this.f15085f = false;
    }

    @Override // com.google.android.gms.internal.ads.n22
    public final void zzg() {
        RuntimeException runtimeException = (RuntimeException) this.f15083d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }
}
