package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.google.android.exoplayer2.decoder.CryptoInfo;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
final class AsynchronousMediaCodecAdapter implements MediaCodecAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f18136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AsynchronousMediaCodecCallback f18137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AsynchronousMediaCodecBufferEnqueuer f18138c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18139e = 0;

    public static final class Factory implements MediaCodecAdapter.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f18140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f18141b;

        public Factory(int i2) {
            b bVar = new b(i2, 0);
            b bVar2 = new b(i2, 1);
            this.f18140a = bVar;
            this.f18141b = bVar2;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AsynchronousMediaCodecAdapter a(MediaCodecAdapter.Configuration configuration) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            String str = configuration.f18166a.f18170a;
            AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter = null;
            try {
                TraceUtil.a("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter2 = new AsynchronousMediaCodecAdapter(mediaCodecCreateByCodecName, (HandlerThread) this.f18140a.get(), (HandlerThread) this.f18141b.get());
                    try {
                        TraceUtil.b();
                        AsynchronousMediaCodecAdapter.m(asynchronousMediaCodecAdapter2, configuration.f18167b, configuration.d, configuration.f18169e);
                        return asynchronousMediaCodecAdapter2;
                    } catch (Exception e2) {
                        e = e2;
                        asynchronousMediaCodecAdapter = asynchronousMediaCodecAdapter2;
                        if (asynchronousMediaCodecAdapter != null) {
                            asynchronousMediaCodecAdapter.release();
                        } else if (mediaCodecCreateByCodecName != null) {
                            mediaCodecCreateByCodecName.release();
                        }
                        throw e;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Exception e4) {
                e = e4;
                mediaCodecCreateByCodecName = null;
            }
        }
    }

    public AsynchronousMediaCodecAdapter(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2) {
        this.f18136a = mediaCodec;
        this.f18137b = new AsynchronousMediaCodecCallback(handlerThread);
        this.f18138c = new AsynchronousMediaCodecBufferEnqueuer(mediaCodec, handlerThread2);
    }

    public static void m(AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = asynchronousMediaCodecAdapter.f18137b;
        Assertions.d(asynchronousMediaCodecCallback.f18154c == null);
        HandlerThread handlerThread = asynchronousMediaCodecCallback.f18153b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = asynchronousMediaCodecAdapter.f18136a;
        mediaCodec.setCallback(asynchronousMediaCodecCallback, handler);
        asynchronousMediaCodecCallback.f18154c = handler;
        TraceUtil.a("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        TraceUtil.b();
        AsynchronousMediaCodecBufferEnqueuer asynchronousMediaCodecBufferEnqueuer = asynchronousMediaCodecAdapter.f18138c;
        if (!asynchronousMediaCodecBufferEnqueuer.f) {
            HandlerThread handlerThread2 = asynchronousMediaCodecBufferEnqueuer.f18144b;
            handlerThread2.start();
            asynchronousMediaCodecBufferEnqueuer.f18145c = new Handler(handlerThread2.getLooper()) { // from class: com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer.1
                public AnonymousClass1(Looper looper) {
                    super(looper);
                }

                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    AsynchronousMediaCodecBufferEnqueuer asynchronousMediaCodecBufferEnqueuer2 = AsynchronousMediaCodecBufferEnqueuer.this;
                    ArrayDeque arrayDeque = AsynchronousMediaCodecBufferEnqueuer.g;
                    asynchronousMediaCodecBufferEnqueuer2.getClass();
                    int i2 = message.what;
                    MessageParams messageParams = null;
                    if (i2 == 0) {
                        MessageParams messageParams2 = (MessageParams) message.obj;
                        try {
                            asynchronousMediaCodecBufferEnqueuer2.f18143a.queueInputBuffer(messageParams2.f18148a, 0, messageParams2.f18149b, messageParams2.d, messageParams2.f18151e);
                        } catch (RuntimeException e2) {
                            AtomicReference atomicReference = asynchronousMediaCodecBufferEnqueuer2.d;
                            while (!atomicReference.compareAndSet(null, e2) && atomicReference.get() == null) {
                            }
                        }
                        messageParams = messageParams2;
                    } else if (i2 == 1) {
                        MessageParams messageParams3 = (MessageParams) message.obj;
                        int i3 = messageParams3.f18148a;
                        MediaCodec.CryptoInfo cryptoInfo = messageParams3.f18150c;
                        long j = messageParams3.d;
                        int i4 = messageParams3.f18151e;
                        try {
                            synchronized (AsynchronousMediaCodecBufferEnqueuer.f18142h) {
                                asynchronousMediaCodecBufferEnqueuer2.f18143a.queueSecureInputBuffer(i3, 0, cryptoInfo, j, i4);
                            }
                        } catch (RuntimeException e3) {
                            AtomicReference atomicReference2 = asynchronousMediaCodecBufferEnqueuer2.d;
                            while (!atomicReference2.compareAndSet(null, e3) && atomicReference2.get() == null) {
                            }
                        }
                        messageParams = messageParams3;
                    } else if (i2 != 2) {
                        AtomicReference atomicReference3 = asynchronousMediaCodecBufferEnqueuer2.d;
                        IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                        while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
                        }
                    } else {
                        asynchronousMediaCodecBufferEnqueuer2.f18146e.d();
                    }
                    if (messageParams != null) {
                        ArrayDeque arrayDeque2 = AsynchronousMediaCodecBufferEnqueuer.g;
                        synchronized (arrayDeque2) {
                            arrayDeque2.add(messageParams);
                        }
                    }
                }
            };
            asynchronousMediaCodecBufferEnqueuer.f = true;
        }
        TraceUtil.a("startCodec");
        mediaCodec.start();
        TraceUtil.b();
        asynchronousMediaCodecAdapter.f18139e = 1;
    }

    public static String n(int i2, String str) {
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

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final void a(Bundle bundle) {
        this.f18136a.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final void b(int i2, int i3, int i4, long j) {
        AsynchronousMediaCodecBufferEnqueuer asynchronousMediaCodecBufferEnqueuer = this.f18138c;
        RuntimeException runtimeException = (RuntimeException) asynchronousMediaCodecBufferEnqueuer.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        AsynchronousMediaCodecBufferEnqueuer.MessageParams messageParamsB = AsynchronousMediaCodecBufferEnqueuer.b();
        messageParamsB.f18148a = i2;
        messageParamsB.f18149b = i3;
        messageParamsB.d = j;
        messageParamsB.f18151e = i4;
        Handler handler = asynchronousMediaCodecBufferEnqueuer.f18145c;
        int i5 = Util.f18979a;
        handler.obtainMessage(0, messageParamsB).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final MediaFormat c() {
        MediaFormat mediaFormat;
        AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.f18137b;
        synchronized (asynchronousMediaCodecCallback.f18152a) {
            try {
                mediaFormat = asynchronousMediaCodecCallback.f18156h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final void d(MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        this.f18136a.setOnFrameRenderedListener(new a(this, onFrameRenderedListener, 0), handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final ByteBuffer e(int i2) {
        return this.f18136a.getInputBuffer(i2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final void f(Surface surface) {
        this.f18136a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final void flush() {
        this.f18138c.a();
        this.f18136a.flush();
        final AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.f18137b;
        synchronized (asynchronousMediaCodecCallback.f18152a) {
            asynchronousMediaCodecCallback.k++;
            Handler handler = asynchronousMediaCodecCallback.f18154c;
            int i2 = Util.f18979a;
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.mediacodec.c
                @Override // java.lang.Runnable
                public final void run() {
                    AsynchronousMediaCodecCallback asynchronousMediaCodecCallback2 = asynchronousMediaCodecCallback;
                    synchronized (asynchronousMediaCodecCallback2.f18152a) {
                        try {
                            if (asynchronousMediaCodecCallback2.f18158l) {
                                return;
                            }
                            long j = asynchronousMediaCodecCallback2.k - 1;
                            asynchronousMediaCodecCallback2.k = j;
                            if (j > 0) {
                                return;
                            }
                            if (j >= 0) {
                                asynchronousMediaCodecCallback2.a();
                                return;
                            }
                            IllegalStateException illegalStateException = new IllegalStateException();
                            synchronized (asynchronousMediaCodecCallback2.f18152a) {
                                asynchronousMediaCodecCallback2.m = illegalStateException;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
        }
        this.f18136a.start();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final void g(int i2, long j) {
        this.f18136a.releaseOutputBuffer(i2, j);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final int h() {
        RuntimeException runtimeException = (RuntimeException) this.f18138c.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.f18137b;
        synchronized (asynchronousMediaCodecCallback.f18152a) {
            try {
                boolean z2 = true;
                int iB = -1;
                if (asynchronousMediaCodecCallback.k > 0 || asynchronousMediaCodecCallback.f18158l) {
                    return -1;
                }
                IllegalStateException illegalStateException = asynchronousMediaCodecCallback.m;
                if (illegalStateException != null) {
                    asynchronousMediaCodecCallback.m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = asynchronousMediaCodecCallback.j;
                if (codecException != null) {
                    asynchronousMediaCodecCallback.j = null;
                    throw codecException;
                }
                IntArrayQueue intArrayQueue = asynchronousMediaCodecCallback.d;
                if (intArrayQueue.f18164c != 0) {
                    z2 = false;
                }
                if (!z2) {
                    iB = intArrayQueue.b();
                }
                return iB;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final int i(MediaCodec.BufferInfo bufferInfo) {
        RuntimeException runtimeException = (RuntimeException) this.f18138c.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.f18137b;
        synchronized (asynchronousMediaCodecCallback.f18152a) {
            try {
                boolean z2 = true;
                if (asynchronousMediaCodecCallback.k > 0 || asynchronousMediaCodecCallback.f18158l) {
                    return -1;
                }
                IllegalStateException illegalStateException = asynchronousMediaCodecCallback.m;
                if (illegalStateException != null) {
                    asynchronousMediaCodecCallback.m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = asynchronousMediaCodecCallback.j;
                if (codecException != null) {
                    asynchronousMediaCodecCallback.j = null;
                    throw codecException;
                }
                IntArrayQueue intArrayQueue = asynchronousMediaCodecCallback.f18155e;
                if (intArrayQueue.f18164c != 0) {
                    z2 = false;
                }
                if (z2) {
                    return -1;
                }
                int iB = intArrayQueue.b();
                if (iB >= 0) {
                    Assertions.e(asynchronousMediaCodecCallback.f18156h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) asynchronousMediaCodecCallback.f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iB == -2) {
                    asynchronousMediaCodecCallback.f18156h = (MediaFormat) asynchronousMediaCodecCallback.g.remove();
                }
                return iB;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final void j(int i2, boolean z2) {
        this.f18136a.releaseOutputBuffer(i2, z2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final ByteBuffer k(int i2) {
        return this.f18136a.getOutputBuffer(i2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final void l(int i2, CryptoInfo cryptoInfo, long j) {
        AsynchronousMediaCodecBufferEnqueuer asynchronousMediaCodecBufferEnqueuer = this.f18138c;
        RuntimeException runtimeException = (RuntimeException) asynchronousMediaCodecBufferEnqueuer.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        AsynchronousMediaCodecBufferEnqueuer.MessageParams messageParamsB = AsynchronousMediaCodecBufferEnqueuer.b();
        messageParamsB.f18148a = i2;
        messageParamsB.f18149b = 0;
        messageParamsB.d = j;
        messageParamsB.f18151e = 0;
        int i3 = cryptoInfo.f;
        MediaCodec.CryptoInfo cryptoInfo2 = messageParamsB.f18150c;
        cryptoInfo2.numSubSamples = i3;
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
        int[] iArr2 = cryptoInfo.f17421e;
        int[] iArrCopyOf2 = cryptoInfo2.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo2.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = cryptoInfo.f17419b;
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
        byte[] bArr2 = cryptoInfo.f17418a;
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
        cryptoInfo2.mode = cryptoInfo.f17420c;
        if (Util.f18979a >= 24) {
            cryptoInfo2.setPattern(new MediaCodec.CryptoInfo.Pattern(cryptoInfo.g, cryptoInfo.f17422h));
        }
        asynchronousMediaCodecBufferEnqueuer.f18145c.obtainMessage(1, messageParamsB).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final void release() {
        try {
            if (this.f18139e == 1) {
                AsynchronousMediaCodecBufferEnqueuer asynchronousMediaCodecBufferEnqueuer = this.f18138c;
                if (asynchronousMediaCodecBufferEnqueuer.f) {
                    asynchronousMediaCodecBufferEnqueuer.a();
                    asynchronousMediaCodecBufferEnqueuer.f18144b.quit();
                }
                asynchronousMediaCodecBufferEnqueuer.f = false;
                AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.f18137b;
                synchronized (asynchronousMediaCodecCallback.f18152a) {
                    asynchronousMediaCodecCallback.f18158l = true;
                    asynchronousMediaCodecCallback.f18153b.quit();
                    asynchronousMediaCodecCallback.a();
                }
            }
            this.f18139e = 2;
            if (this.d) {
                return;
            }
            this.f18136a.release();
            this.d = true;
        } catch (Throwable th) {
            if (!this.d) {
                this.f18136a.release();
                this.d = true;
            }
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public final void setVideoScalingMode(int i2) {
        this.f18136a.setVideoScalingMode(i2);
    }
}
