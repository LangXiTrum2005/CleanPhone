package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.collection.CircularIntArray;
import androidx.media3.exoplayer.Renderer;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
final class AsynchronousMediaCodecCallback extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f6280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f6281c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MediaFormat f6283h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MediaFormat f6284i;
    public MediaCodec.CodecException j;
    public MediaCodec.CryptoException k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f6285l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IllegalStateException f6286n;
    public MediaCodecAdapter.OnBufferAvailableListener o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6279a = new Object();
    public final CircularIntArray d = new CircularIntArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CircularIntArray f6282e = new CircularIntArray();
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();

    public AsynchronousMediaCodecCallback(HandlerThread handlerThread) {
        this.f6280b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.g;
        if (!arrayDeque.isEmpty()) {
            this.f6284i = (MediaFormat) arrayDeque.getLast();
        }
        CircularIntArray circularIntArray = this.d;
        circularIntArray.f3738c = circularIntArray.f3737b;
        CircularIntArray circularIntArray2 = this.f6282e;
        circularIntArray2.f3738c = circularIntArray2.f3737b;
        this.f.clear();
        arrayDeque.clear();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f6279a) {
            this.k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f6279a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i2) {
        Renderer.WakeupListener wakeupListener;
        synchronized (this.f6279a) {
            this.d.a(i2);
            MediaCodecAdapter.OnBufferAvailableListener onBufferAvailableListener = this.o;
            if (onBufferAvailableListener != null && (wakeupListener = MediaCodecRenderer.this.G0) != null) {
                wakeupListener.b();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i2, MediaCodec.BufferInfo bufferInfo) {
        Renderer.WakeupListener wakeupListener;
        synchronized (this.f6279a) {
            try {
                MediaFormat mediaFormat = this.f6284i;
                if (mediaFormat != null) {
                    this.f6282e.a(-2);
                    this.g.add(mediaFormat);
                    this.f6284i = null;
                }
                this.f6282e.a(i2);
                this.f.add(bufferInfo);
                MediaCodecAdapter.OnBufferAvailableListener onBufferAvailableListener = this.o;
                if (onBufferAvailableListener != null && (wakeupListener = MediaCodecRenderer.this.G0) != null) {
                    wakeupListener.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f6279a) {
            this.f6282e.a(-2);
            this.g.add(mediaFormat);
            this.f6284i = null;
        }
    }
}
