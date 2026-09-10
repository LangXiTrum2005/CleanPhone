package y1;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import com.google.android.gms.internal.ads.qx1;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import l1.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f54110g = new ArrayDeque();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f54111h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f54112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f54113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.localbroadcastmanager.content.a f54114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f54115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l1.f f54116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f54117f;

    public d(MediaCodec mediaCodec, HandlerThread handlerThread) {
        l1.f fVar = new l1.f();
        this.f54112a = mediaCodec;
        this.f54113b = handlerThread;
        this.f54116e = fVar;
        this.f54115d = new AtomicReference();
    }

    public static c e() {
        ArrayDeque arrayDeque = f54110g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new c();
                }
                return (c) arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // y1.k
    public final void a() {
        RuntimeException runtimeException = (RuntimeException) this.f54115d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // y1.k
    public final void b(Bundle bundle) {
        a();
        androidx.localbroadcastmanager.content.a aVar = this.f54114c;
        String str = y.f44830a;
        aVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // y1.k
    public final void c(int i10, qx1 qx1Var, long j10, int i11) {
        a();
        c cVarE = e();
        cVarE.f54105a = i10;
        cVarE.f54106b = 0;
        cVarE.f54108d = j10;
        cVarE.f54109e = i11;
        MediaCodec.CryptoInfo cryptoInfo = cVarE.f54107c;
        cryptoInfo.numSubSamples = qx1Var.f19235f;
        int[] iArr = qx1Var.f19233d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = qx1Var.f19234e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = qx1Var.f19231b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = qx1Var.f19230a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = qx1Var.f19232c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(qx1Var.f19236g, qx1Var.f19237h));
        androidx.localbroadcastmanager.content.a aVar = this.f54114c;
        String str = y.f44830a;
        aVar.obtainMessage(2, cVarE).sendToTarget();
    }

    @Override // y1.k
    public final void d(int i10, int i11, int i12, long j10) {
        a();
        c cVarE = e();
        cVarE.f54105a = i10;
        cVarE.f54106b = i11;
        cVarE.f54108d = j10;
        cVarE.f54109e = i12;
        androidx.localbroadcastmanager.content.a aVar = this.f54114c;
        String str = y.f44830a;
        aVar.obtainMessage(1, cVarE).sendToTarget();
    }

    @Override // y1.k
    public final void flush() {
        if (this.f54117f) {
            try {
                androidx.localbroadcastmanager.content.a aVar = this.f54114c;
                aVar.getClass();
                aVar.removeCallbacksAndMessages(null);
                l1.f fVar = this.f54116e;
                synchronized (fVar) {
                    fVar.f44786b = false;
                }
                androidx.localbroadcastmanager.content.a aVar2 = this.f54114c;
                aVar2.getClass();
                aVar2.obtainMessage(3).sendToTarget();
                synchronized (fVar) {
                    while (!fVar.f44786b) {
                        fVar.f44785a.getClass();
                        fVar.wait();
                    }
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // y1.k
    public final void shutdown() {
        if (this.f54117f) {
            flush();
            this.f54113b.quit();
        }
        this.f54117f = false;
    }

    @Override // y1.k
    public final void start() {
        if (this.f54117f) {
            return;
        }
        HandlerThread handlerThread = this.f54113b;
        handlerThread.start();
        this.f54114c = new androidx.localbroadcastmanager.content.a(this, handlerThread.getLooper(), 4);
        this.f54117f = true;
    }
}
