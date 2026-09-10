package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class J6 extends MediaCodec.Callback {
    public final HandlerThread b;
    public Handler c;
    public MediaFormat h;
    public MediaFormat i;
    public MediaCodec.CodecException j;
    public long k;
    public boolean l;
    public IllegalStateException m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3254a = new Object();
    public final C4633t40 d = new C4633t40();
    public final C4633t40 e = new C4633t40();
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();

    public J6(HandlerThread handlerThread) {
        this.b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.g;
        if (!arrayDeque.isEmpty()) {
            this.i = (MediaFormat) arrayDeque.getLast();
        }
        C4633t40 c4633t40 = this.d;
        c4633t40.f5014a = 0;
        c4633t40.b = -1;
        c4633t40.c = 0;
        C4633t40 c4633t41 = this.e;
        c4633t41.f5014a = 0;
        c4633t41.b = -1;
        c4633t41.c = 0;
        this.f.clear();
        arrayDeque.clear();
    }

    public final void b(IllegalStateException illegalStateException) {
        synchronized (this.f3254a) {
            this.m = illegalStateException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f3254a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f3254a) {
            this.d.b(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f3254a) {
            try {
                MediaFormat mediaFormat = this.i;
                if (mediaFormat != null) {
                    this.e.b(-2);
                    this.g.add(mediaFormat);
                    this.i = null;
                }
                this.e.b(i);
                this.f.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f3254a) {
            this.e.b(-2);
            this.g.add(mediaFormat);
            this.i = null;
        }
    }
}
