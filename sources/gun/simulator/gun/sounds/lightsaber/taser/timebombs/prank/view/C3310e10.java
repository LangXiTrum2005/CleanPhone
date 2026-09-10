package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Handler;
import android.os.HandlerThread;
import java.io.Closeable;
import java.io.OutputStream;
import java.util.Objects;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.e10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3310e10 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f4302a;
    public final HandlerThread b;
    public final Handler c;
    public final /* synthetic */ C3398f10 d;

    public C3310e10(C3398f10 c3398f10, OutputStream outputStream) {
        this.d = c3398f10;
        this.f4302a = outputStream;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
        this.b = handlerThread;
        handlerThread.start();
        this.c = new Handler(handlerThread.getLooper());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Handler handler = this.c;
        HandlerThread handlerThread = this.b;
        Objects.requireNonNull(handlerThread);
        handler.post(new RunnableC2928Zc(handlerThread, 11));
        try {
            handlerThread.join();
        } catch (InterruptedException unused) {
            handlerThread.interrupt();
        }
    }
}
