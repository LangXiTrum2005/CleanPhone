package androidx.media3.exoplayer;

import android.os.Looper;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class PlayerMessage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Target f5971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Sender f5972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SystemClock f5973c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f5974e;
    public final Looper f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5975h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5976i;

    public interface Sender {
        void a(PlayerMessage playerMessage);
    }

    public interface Target {
        void handleMessage(int i2, Object obj);
    }

    public PlayerMessage(Sender sender, Target target, Timeline timeline, int i2, SystemClock systemClock, Looper looper) {
        this.f5972b = sender;
        this.f5971a = target;
        this.f = looper;
        this.f5973c = systemClock;
    }

    public final synchronized void a(long j) {
        boolean z2;
        Assertions.e(this.g);
        Assertions.e(this.f.getThread() != Thread.currentThread());
        this.f5973c.getClass();
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() + j;
        while (true) {
            z2 = this.f5976i;
            if (z2 || j <= 0) {
                break;
            }
            this.f5973c.getClass();
            wait(j);
            this.f5973c.getClass();
            j = jElapsedRealtime - android.os.SystemClock.elapsedRealtime();
        }
        if (!z2) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z2) {
        this.f5975h = z2 | this.f5975h;
        this.f5976i = true;
        notifyAll();
    }

    public final void c() {
        Assertions.e(!this.g);
        this.g = true;
        this.f5972b.a(this);
    }
}
