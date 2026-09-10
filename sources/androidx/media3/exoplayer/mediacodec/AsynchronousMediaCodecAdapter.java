package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import androidx.collection.CircularIntArray;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoInfo;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class AsynchronousMediaCodecAdapter implements MediaCodecAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f6263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AsynchronousMediaCodecCallback f6264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaCodecBufferEnqueuer f6265c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6266e = 0;

    public static final class Factory implements MediaCodecAdapter.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f6267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f6268b;

        public Factory(int i2) {
            b bVar = new b(i2, 0);
            b bVar2 = new b(i2, 1);
            this.f6267a = bVar;
            this.f6268b = bVar2;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AsynchronousMediaCodecAdapter a(MediaCodecAdapter.Configuration configuration) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            MediaCodecBufferEnqueuer synchronousMediaCodecBufferEnqueuer;
            int i2;
            String str = configuration.f6288a.f6292a;
            AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter = null;
            try {
                Trace.beginSection("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    Format format = configuration.f6290c;
                    int i3 = Util.f5683a;
                    if (i3 >= 34 && (i3 >= 35 || MimeTypes.k(format.m))) {
                        synchronousMediaCodecBufferEnqueuer = new SynchronousMediaCodecBufferEnqueuer(mediaCodecCreateByCodecName);
                        i2 = 4;
                    } else {
                        synchronousMediaCodecBufferEnqueuer = new AsynchronousMediaCodecBufferEnqueuer(mediaCodecCreateByCodecName, (HandlerThread) this.f6268b.get());
                        i2 = 0;
                    }
                    AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter2 = new AsynchronousMediaCodecAdapter(mediaCodecCreateByCodecName, (HandlerThread) this.f6267a.get(), synchronousMediaCodecBufferEnqueuer);
                    try {
                        Trace.endSection();
                        AsynchronousMediaCodecAdapter.n(asynchronousMediaCodecAdapter2, configuration.f6289b, configuration.d, configuration.f6291e, i2);
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

    public AsynchronousMediaCodecAdapter(MediaCodec mediaCodec, HandlerThread handlerThread, MediaCodecBufferEnqueuer mediaCodecBufferEnqueuer) {
        this.f6263a = mediaCodec;
        this.f6264b = new AsynchronousMediaCodecCallback(handlerThread);
        this.f6265c = mediaCodecBufferEnqueuer;
    }

    public static void n(AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i2) {
        AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = asynchronousMediaCodecAdapter.f6264b;
        Assertions.e(asynchronousMediaCodecCallback.f6281c == null);
        HandlerThread handlerThread = asynchronousMediaCodecCallback.f6280b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = asynchronousMediaCodecAdapter.f6263a;
        mediaCodec.setCallback(asynchronousMediaCodecCallback, handler);
        asynchronousMediaCodecCallback.f6281c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i2);
        Trace.endSection();
        asynchronousMediaCodecAdapter.f6265c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        asynchronousMediaCodecAdapter.f6266e = 1;
    }

    public static String o(int i2, String str) {
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

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void a(Bundle bundle) {
        this.f6265c.a(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void b(int i2, int i3, int i4, long j) {
        this.f6265c.b(i2, i3, i4, j);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final MediaFormat c() {
        MediaFormat mediaFormat;
        AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.f6264b;
        synchronized (asynchronousMediaCodecCallback.f6279a) {
            try {
                mediaFormat = asynchronousMediaCodecCallback.f6283h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void d(int i2, CryptoInfo cryptoInfo, long j, int i3) {
        this.f6265c.d(i2, cryptoInfo, j, i3);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final ByteBuffer e(int i2) {
        return this.f6263a.getInputBuffer(i2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void f(Surface surface) {
        this.f6263a.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void flush() {
        this.f6265c.flush();
        this.f6263a.flush();
        final AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.f6264b;
        synchronized (asynchronousMediaCodecCallback.f6279a) {
            asynchronousMediaCodecCallback.f6285l++;
            Handler handler = asynchronousMediaCodecCallback.f6281c;
            int i2 = Util.f5683a;
            handler.post(new Runnable() { // from class: androidx.media3.exoplayer.mediacodec.c
                @Override // java.lang.Runnable
                public final void run() {
                    AsynchronousMediaCodecCallback asynchronousMediaCodecCallback2 = asynchronousMediaCodecCallback;
                    synchronized (asynchronousMediaCodecCallback2.f6279a) {
                        try {
                            if (asynchronousMediaCodecCallback2.m) {
                                return;
                            }
                            long j = asynchronousMediaCodecCallback2.f6285l - 1;
                            asynchronousMediaCodecCallback2.f6285l = j;
                            if (j > 0) {
                                return;
                            }
                            if (j >= 0) {
                                asynchronousMediaCodecCallback2.a();
                                return;
                            }
                            IllegalStateException illegalStateException = new IllegalStateException();
                            synchronized (asynchronousMediaCodecCallback2.f6279a) {
                                asynchronousMediaCodecCallback2.f6286n = illegalStateException;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
        }
        this.f6263a.start();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void g(int i2, long j) {
        this.f6263a.releaseOutputBuffer(i2, j);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final int h() {
        this.f6265c.c();
        AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.f6264b;
        synchronized (asynchronousMediaCodecCallback.f6279a) {
            try {
                IllegalStateException illegalStateException = asynchronousMediaCodecCallback.f6286n;
                if (illegalStateException != null) {
                    asynchronousMediaCodecCallback.f6286n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = asynchronousMediaCodecCallback.j;
                if (codecException != null) {
                    asynchronousMediaCodecCallback.j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = asynchronousMediaCodecCallback.k;
                if (cryptoException != null) {
                    asynchronousMediaCodecCallback.k = null;
                    throw cryptoException;
                }
                boolean z2 = true;
                int iB = -1;
                if (asynchronousMediaCodecCallback.f6285l > 0 || asynchronousMediaCodecCallback.m) {
                    return -1;
                }
                CircularIntArray circularIntArray = asynchronousMediaCodecCallback.d;
                if (circularIntArray.f3737b != circularIntArray.f3738c) {
                    z2 = false;
                }
                if (!z2) {
                    iB = circularIntArray.b();
                }
                return iB;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final int i(MediaCodec.BufferInfo bufferInfo) {
        this.f6265c.c();
        AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.f6264b;
        synchronized (asynchronousMediaCodecCallback.f6279a) {
            try {
                IllegalStateException illegalStateException = asynchronousMediaCodecCallback.f6286n;
                if (illegalStateException != null) {
                    asynchronousMediaCodecCallback.f6286n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = asynchronousMediaCodecCallback.j;
                if (codecException != null) {
                    asynchronousMediaCodecCallback.j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = asynchronousMediaCodecCallback.k;
                if (cryptoException != null) {
                    asynchronousMediaCodecCallback.k = null;
                    throw cryptoException;
                }
                boolean z2 = true;
                if (asynchronousMediaCodecCallback.f6285l > 0 || asynchronousMediaCodecCallback.m) {
                    return -1;
                }
                CircularIntArray circularIntArray = asynchronousMediaCodecCallback.f6282e;
                if (circularIntArray.f3737b != circularIntArray.f3738c) {
                    z2 = false;
                }
                if (z2) {
                    return -1;
                }
                int iB = circularIntArray.b();
                if (iB >= 0) {
                    Assertions.f(asynchronousMediaCodecCallback.f6283h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) asynchronousMediaCodecCallback.f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iB == -2) {
                    asynchronousMediaCodecCallback.f6283h = (MediaFormat) asynchronousMediaCodecCallback.g.remove();
                }
                return iB;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void j(int i2, boolean z2) {
        this.f6263a.releaseOutputBuffer(i2, z2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final ByteBuffer k(int i2) {
        return this.f6263a.getOutputBuffer(i2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final boolean l(MediaCodecAdapter.OnBufferAvailableListener onBufferAvailableListener) {
        AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.f6264b;
        synchronized (asynchronousMediaCodecCallback.f6279a) {
            asynchronousMediaCodecCallback.o = onBufferAvailableListener;
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void m(MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        this.f6263a.setOnFrameRenderedListener(new a(this, onFrameRenderedListener, 0), handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void release() {
        try {
            if (this.f6266e == 1) {
                this.f6265c.shutdown();
                AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.f6264b;
                synchronized (asynchronousMediaCodecCallback.f6279a) {
                    asynchronousMediaCodecCallback.m = true;
                    asynchronousMediaCodecCallback.f6280b.quit();
                    asynchronousMediaCodecCallback.a();
                }
            }
            this.f6266e = 2;
            if (this.d) {
                return;
            }
            try {
                int i2 = Util.f5683a;
                if (i2 >= 30 && i2 < 33) {
                    this.f6263a.stop();
                }
            } finally {
                this.f6263a.release();
                this.d = true;
            }
        } catch (Throwable th) {
            if (!this.d) {
                try {
                    int i3 = Util.f5683a;
                    if (i3 >= 30 && i3 < 33) {
                        this.f6263a.stop();
                    }
                } finally {
                    this.f6263a.release();
                    this.d = true;
                }
            }
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void setVideoScalingMode(int i2) {
        this.f6263a.setVideoScalingMode(i2);
    }
}
