package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes3.dex */
final class AsynchronousMediaCodecCallback extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f18153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f18154c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MediaFormat f18156h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MediaFormat f18157i;
    public MediaCodec.CodecException j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f18158l;
    public IllegalStateException m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18152a = new Object();
    public final IntArrayQueue d = new IntArrayQueue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IntArrayQueue f18155e = new IntArrayQueue();
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();

    public AsynchronousMediaCodecCallback(HandlerThread handlerThread) {
        this.f18153b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.g;
        if (!arrayDeque.isEmpty()) {
            this.f18157i = (MediaFormat) arrayDeque.getLast();
        }
        IntArrayQueue intArrayQueue = this.d;
        intArrayQueue.f18162a = 0;
        intArrayQueue.f18163b = -1;
        intArrayQueue.f18164c = 0;
        IntArrayQueue intArrayQueue2 = this.f18155e;
        intArrayQueue2.f18162a = 0;
        intArrayQueue2.f18163b = -1;
        intArrayQueue2.f18164c = 0;
        this.f.clear();
        arrayDeque.clear();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f18152a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i2) {
        synchronized (this.f18152a) {
            this.d.a(i2);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i2, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f18152a) {
            try {
                MediaFormat mediaFormat = this.f18157i;
                if (mediaFormat != null) {
                    this.f18155e.a(-2);
                    this.g.add(mediaFormat);
                    this.f18157i = null;
                }
                this.f18155e.a(i2);
                this.f.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f18152a) {
            this.f18155e.a(-2);
            this.g.add(mediaFormat);
            this.f18157i = null;
        }
    }
}
