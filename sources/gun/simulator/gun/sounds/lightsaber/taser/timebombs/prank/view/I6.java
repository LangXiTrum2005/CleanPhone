package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.MediaCodec;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class I6 {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f3202a;
    public final HandlerThread b;
    public G6 c;
    public final AtomicReference d;
    public final C4581sZ e;
    public boolean f;

    public I6(MediaCodec mediaCodec, HandlerThread handlerThread) {
        C4581sZ c4581sZ = new C4581sZ(2);
        this.f3202a = mediaCodec;
        this.b = handlerThread;
        this.e = c4581sZ;
        this.d = new AtomicReference();
    }

    public static H6 b() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new H6();
                }
                return (H6) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c(H6 h6) {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            arrayDeque.add(h6);
        }
    }

    public final void a() {
        if (this.f) {
            try {
                G6 g6 = this.c;
                g6.getClass();
                g6.removeCallbacksAndMessages(null);
                C4581sZ c4581sZ = this.e;
                c4581sZ.c();
                G6 g7 = this.c;
                g7.getClass();
                g7.obtainMessage(2).sendToTarget();
                synchronized (c4581sZ) {
                    while (!c4581sZ.f4984a) {
                        c4581sZ.wait();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }
}
