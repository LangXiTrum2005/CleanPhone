package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoInfo;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
class AsynchronousMediaCodecBufferEnqueuer implements MediaCodecBufferEnqueuer {
    public static final ArrayDeque g = new ArrayDeque();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f6269h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f6270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f6271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f6272c;
    public final AtomicReference d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConditionVariable f6273e;
    public boolean f;

    public static class MessageParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f6276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f6277c = new MediaCodec.CryptoInfo();
        public long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f6278e;
    }

    public AsynchronousMediaCodecBufferEnqueuer(MediaCodec mediaCodec, HandlerThread handlerThread) {
        ConditionVariable conditionVariable = new ConditionVariable(0);
        this.f6270a = mediaCodec;
        this.f6271b = handlerThread;
        this.f6273e = conditionVariable;
        this.d = new AtomicReference();
    }

    public static MessageParams e() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new MessageParams();
                }
                return (MessageParams) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public final void a(Bundle bundle) {
        c();
        Handler handler = this.f6272c;
        int i2 = Util.f5683a;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public final void b(int i2, int i3, int i4, long j) {
        c();
        MessageParams messageParamsE = e();
        messageParamsE.f6275a = i2;
        messageParamsE.f6276b = i3;
        messageParamsE.d = j;
        messageParamsE.f6278e = i4;
        Handler handler = this.f6272c;
        int i5 = Util.f5683a;
        handler.obtainMessage(1, messageParamsE).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public final void c() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public final void d(int i2, CryptoInfo cryptoInfo, long j, int i3) {
        c();
        MessageParams messageParamsE = e();
        messageParamsE.f6275a = i2;
        messageParamsE.f6276b = 0;
        messageParamsE.d = j;
        messageParamsE.f6278e = i3;
        int i4 = cryptoInfo.f;
        MediaCodec.CryptoInfo cryptoInfo2 = messageParamsE.f6277c;
        cryptoInfo2.numSubSamples = i4;
        int[] iArr = cryptoInfo.d;
        int[] iArrCopyOf = cryptoInfo2.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo2.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = cryptoInfo.f5796e;
        int[] iArrCopyOf2 = cryptoInfo2.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo2.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = cryptoInfo.f5794b;
        byte[] bArrCopyOf = cryptoInfo2.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo2.key = bArrCopyOf;
        byte[] bArr2 = cryptoInfo.f5793a;
        byte[] bArrCopyOf2 = cryptoInfo2.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo2.iv = bArrCopyOf2;
        cryptoInfo2.mode = cryptoInfo.f5795c;
        if (Util.f5683a >= 24) {
            cryptoInfo2.setPattern(new MediaCodec.CryptoInfo.Pattern(cryptoInfo.g, cryptoInfo.f5797h));
        }
        this.f6272c.obtainMessage(2, messageParamsE).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public final void flush() {
        if (this.f) {
            try {
                Handler handler = this.f6272c;
                handler.getClass();
                handler.removeCallbacksAndMessages(null);
                ConditionVariable conditionVariable = this.f6273e;
                conditionVariable.c();
                Handler handler2 = this.f6272c;
                handler2.getClass();
                handler2.obtainMessage(3).sendToTarget();
                conditionVariable.a();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public final void shutdown() {
        if (this.f) {
            flush();
            this.f6271b.quit();
        }
        this.f = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public final void start() {
        if (this.f) {
            return;
        }
        HandlerThread handlerThread = this.f6271b;
        handlerThread.start();
        this.f6272c = new Handler(handlerThread.getLooper()) { // from class: androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                AsynchronousMediaCodecBufferEnqueuer asynchronousMediaCodecBufferEnqueuer = AsynchronousMediaCodecBufferEnqueuer.this;
                ArrayDeque arrayDeque = AsynchronousMediaCodecBufferEnqueuer.g;
                asynchronousMediaCodecBufferEnqueuer.getClass();
                int i2 = message.what;
                MessageParams messageParams = null;
                if (i2 == 1) {
                    MessageParams messageParams2 = (MessageParams) message.obj;
                    try {
                        asynchronousMediaCodecBufferEnqueuer.f6270a.queueInputBuffer(messageParams2.f6275a, 0, messageParams2.f6276b, messageParams2.d, messageParams2.f6278e);
                    } catch (RuntimeException e2) {
                        AtomicReference atomicReference = asynchronousMediaCodecBufferEnqueuer.d;
                        while (!atomicReference.compareAndSet(null, e2) && atomicReference.get() == null) {
                        }
                    }
                    messageParams = messageParams2;
                } else if (i2 == 2) {
                    MessageParams messageParams3 = (MessageParams) message.obj;
                    int i3 = messageParams3.f6275a;
                    MediaCodec.CryptoInfo cryptoInfo = messageParams3.f6277c;
                    long j = messageParams3.d;
                    int i4 = messageParams3.f6278e;
                    try {
                        synchronized (AsynchronousMediaCodecBufferEnqueuer.f6269h) {
                            asynchronousMediaCodecBufferEnqueuer.f6270a.queueSecureInputBuffer(i3, 0, cryptoInfo, j, i4);
                        }
                    } catch (RuntimeException e3) {
                        AtomicReference atomicReference2 = asynchronousMediaCodecBufferEnqueuer.d;
                        while (!atomicReference2.compareAndSet(null, e3) && atomicReference2.get() == null) {
                        }
                    }
                    messageParams = messageParams3;
                } else if (i2 == 3) {
                    asynchronousMediaCodecBufferEnqueuer.f6273e.d();
                } else if (i2 != 4) {
                    AtomicReference atomicReference3 = asynchronousMediaCodecBufferEnqueuer.d;
                    IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                    while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
                    }
                } else {
                    try {
                        asynchronousMediaCodecBufferEnqueuer.f6270a.setParameters((Bundle) message.obj);
                    } catch (RuntimeException e4) {
                        AtomicReference atomicReference4 = asynchronousMediaCodecBufferEnqueuer.d;
                        while (!atomicReference4.compareAndSet(null, e4) && atomicReference4.get() == null) {
                        }
                    }
                }
                if (messageParams != null) {
                    ArrayDeque arrayDeque2 = AsynchronousMediaCodecBufferEnqueuer.g;
                    synchronized (arrayDeque2) {
                        arrayDeque2.add(messageParams);
                    }
                }
            }
        };
        this.f = true;
    }
}
