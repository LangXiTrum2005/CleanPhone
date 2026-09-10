package b2;

import android.os.Handler;
import android.os.HandlerThread;
import java.io.Closeable;
import java.io.OutputStream;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f5263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f5264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f5265c;

    public f0(g0 g0Var, OutputStream outputStream) {
        this.f5263a = outputStream;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
        this.f5264b = handlerThread;
        handlerThread.start();
        this.f5265c = new Handler(handlerThread.getLooper());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HandlerThread handlerThread = this.f5264b;
        Objects.requireNonNull(handlerThread);
        this.f5265c.post(new androidx.fragment.app.n(handlerThread, 4));
        try {
            handlerThread.join();
        } catch (InterruptedException unused) {
            handlerThread.interrupt();
        }
    }
}
