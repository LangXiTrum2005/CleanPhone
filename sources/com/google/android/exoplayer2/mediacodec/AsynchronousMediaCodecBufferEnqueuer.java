package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.exoplayer2.util.ConditionVariable;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
class AsynchronousMediaCodecBufferEnqueuer {
    public static final ArrayDeque g = new ArrayDeque();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f18142h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f18143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f18144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f18145c;
    public final AtomicReference d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConditionVariable f18146e;
    public boolean f;

    public static class MessageParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f18148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f18149b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f18150c = new MediaCodec.CryptoInfo();
        public long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f18151e;
    }

    public AsynchronousMediaCodecBufferEnqueuer(MediaCodec mediaCodec, HandlerThread handlerThread) {
        ConditionVariable conditionVariable = new ConditionVariable(0);
        this.f18143a = mediaCodec;
        this.f18144b = handlerThread;
        this.f18146e = conditionVariable;
        this.d = new AtomicReference();
    }

    public static MessageParams b() {
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

    public final void a() {
        if (this.f) {
            try {
                Handler handler = this.f18145c;
                handler.getClass();
                handler.removeCallbacksAndMessages(null);
                ConditionVariable conditionVariable = this.f18146e;
                conditionVariable.c();
                Handler handler2 = this.f18145c;
                handler2.getClass();
                handler2.obtainMessage(2).sendToTarget();
                conditionVariable.a();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
    }
}
